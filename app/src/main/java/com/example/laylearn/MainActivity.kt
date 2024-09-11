package com.example.laylearn

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var username=findViewById<EditText>(R.id.user)
        var password=findViewById<EditText>(R.id.pass)

        var mybutton=findViewById<Button>(R.id.login_button)

        mybutton.setOnClickListener {
            if(username.text.toString()=="Admin" && password.text.toString()=="1234"){

                Toast.makeText(this,"Login Successfullly",LENGTH_LONG).show()


        }


        }
    }
}