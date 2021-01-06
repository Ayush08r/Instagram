package com.ayush.instagramclone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Upload : AppCompatActivity() {
    private lateinit var Link:EditText
    private lateinit var Submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        Link = findViewById(R.id.Link)
        Submit = findViewById(R.id.Submit)

        Submit.setOnClickListener {
            val link = Link.text.toString()
            val intent = Intent()
            intent.putExtra("link", link)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }


    }
}