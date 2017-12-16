package sas.eschool

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Button
import android.widget.TextView
import sas.eschool.pojo.currentuser

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val loginUser = findViewById<Button>(R.id.loginUser)


        loginUser.setOnClickListener {
            when(currentuser.usertype){
                "teacher"->startActivity(Intent(this@LoginActivity, ParentSideMenu::class.java))
                "parent"-> startActivity(Intent(this@LoginActivity, TeacherHome::class.java))
            }
             }

    }
}
