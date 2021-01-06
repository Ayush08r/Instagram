package com.ayush.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ayush.instagramclone.model.user

class Login : AppCompatActivity() {
    private var Userdata = arrayListOf<user>()

    private lateinit var Username : EditText
    private lateinit var Password : EditText
    private lateinit var Submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Username = findViewById(R.id.editUsername)
        Password = findViewById(R.id.editPassword)
        Submit = findViewById(R.id.btnSubmit)

        val intent = intent  // sano = intent linu lie
        Userdata = intent.getParcelableArrayListExtra<user>("Userdata") as ArrayList<user>

        Submit.setOnClickListener {
            for(i in Userdata.indices){
                if(Username.text.toString()==Userdata.get(i).Username && Password.text.toString()==Userdata.get(i).Password){
                    val username = Username.text.toString()
                    val profile = Userdata.get(i).profile
                    val intent = Intent(this, Dashboard::class.java)
                        .putExtra("username", username)
                        .putExtra("profile", profile)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
