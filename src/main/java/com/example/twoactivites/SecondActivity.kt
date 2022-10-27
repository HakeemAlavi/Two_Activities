package com.example.twoactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("SEND_KEY_VALUE")

        var textView: TextView = findViewById(R.id.text_message)

        textView.text = message

       val mMessageEditReply: EditText = findViewById(R.id.editText_reply)
       val button_reply: Button = findViewById(R.id.button_reply)
       button_reply.setOnClickListener {
           val f1activityIntent = Intent( this, MainActivity::class.java)
           val reply = mMessageEditReply.text.toString().trim()
           f1activityIntent.putExtra("SEND_KEY_VALUE", reply)
           startActivity(f1activityIntent)
       }

    }

}