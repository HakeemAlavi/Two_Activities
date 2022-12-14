package com.example.twoactivites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mMessageEditText:EditText = findViewById(R.id.editText_send)

        val buttonSend: Button = findViewById(R.id.button_send)

        buttonSend.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)

            var message = mMessageEditText.text.toString().trim()

            secondActivityIntent.putExtra("SEND_KEY_VALUE", message)

            startActivity(secondActivityIntent)
        }

        val messagereply = intent.getStringExtra("SEND_KEY_VALUE")
        var textView: TextView = findViewById(R.id.text_message_two)
        textView.text = messagereply
    }

}