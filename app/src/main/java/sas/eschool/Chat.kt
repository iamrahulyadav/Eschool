package sas.eschool

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.View
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.content_chat.*
import sas.eschool.adapters.Parent_TeacherMessagesAdapter
import sas.eschool.pojo.NewMessage
import sas.eschool.pojo.currentuser


class Chat : AppCompatActivity() {

    var setAdapterOnce = true

    private var mRecyclerView: RecyclerView? = null

    var newMessages: Int?=0

    private val linearLayoutManager: LinearLayoutManager
        get() = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        mRecyclerView = findViewById(R.id.messages_recylerview)
        mRecyclerView!!.layoutManager = linearLayoutManager
        mRecyclerView!!.setHasFixedSize(true)

        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {


                send_btn.isEnabled = true

                println(dataSnapshot)
                var adapter = Parent_TeacherMessagesAdapter(this@Chat, dataSnapshot.children
                        .mapNotNull { it.getValue<NewMessage>(NewMessage::class.java) })



                mRecyclerView!!.adapter = adapter
                mRecyclerView!!.smoothScrollToPosition(mRecyclerView!!.adapter.itemCount)
                newMessages = mRecyclerView!!.adapter.itemCount


            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
               // Log.w(FragmentActivity.TAG, "loadPost:onCancelled", databaseError.toException())
                // ...
            }
        }

        FirebaseDatabase.getInstance()
                .getReference("chat/es12_pr12_chat")
             //   .orderByChild("msnum")
                .orderByKey()
                .addValueEventListener(postListener)


        send_btn.isEnabled = false



        send_btn.setOnClickListener({
            var ref_send = FirebaseDatabase.getInstance()
                    .getReference("chat/es12_pr12_chat/"+newMessages)
            if(currentuser.usertype.equals("parent")){
                ref_send.setValue(NewMessage("teacher", message_edittext.text.toString(), 12, 12, newMessages))

            }else{
                ref_send.setValue(NewMessage("parent", message_edittext.text.toString(), 12, 12, newMessages))

            }

        })

    }

}
