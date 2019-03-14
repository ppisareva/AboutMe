package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.nick_button)
        button.setOnClickListener(){
            changNick(it)
        }

    }


    fun changNick (v : View){
        var nickText = findViewById<TextView>(R.id.nick_edit)
        var editNick = findViewById<EditText>(R.id.nick_editText)
        nickText.text = editNick.text
        editNick.visibility = View.GONE
        nickText.visibility = View.VISIBLE
        v.visibility = View.GONE
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)
    }
}
