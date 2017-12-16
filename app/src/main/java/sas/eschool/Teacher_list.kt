package sas.eschool

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView

import kotlinx.android.synthetic.main.activity_teacher_list.*
import kotlinx.android.synthetic.main.content_teacher_list.*

class Teacher_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_list)
        setSupportActionBar(toolbar)


        findViewById<CardView>(R.id.first_teacher).setOnClickListener {
            startActivity(Intent(this@Teacher_list, Chat::class.java))

        }
    }

}
