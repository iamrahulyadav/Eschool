package sas.eschool

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import kotlinx.android.synthetic.main.activity_student_list.*

class StudentList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        setSupportActionBar(toolbar)

        findViewById<CardView>(R.id.first_kid).setOnClickListener {
            startActivity(Intent(this@StudentList, Chat::class.java))

        }



    }

}
