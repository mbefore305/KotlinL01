package com.example.mbefore.kotlinl01

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity: AppCompatActivity () {

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView (R.layout.activity_main)

        val et1 = et1.text
        val et2 = et2.text
        val tv1 = tv1.text
        val button1 = button.button
        //val et1 = findViewById (R.id.et1) as EditText
        //val et2 = findViewById (R.id.et2) as EditText
        // val tv1 = findViewById (R.id.tv1) as TextView
        // val boton1 = findViewById (R.id.button) as Button

        button1.setOnClickListener {
            tv1.text = "Result: ${et1.text.toString().toInt() + et2.text.toString().toInt ()}"
        }
    }
}
