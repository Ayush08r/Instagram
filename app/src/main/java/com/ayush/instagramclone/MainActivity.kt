package com.ayush.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.ayush.instagramclone.model.user

class MainActivity : AppCompatActivity() {
    private lateinit var Cid : EditText
    private lateinit var Fname : EditText
    private lateinit var Lname : EditText
    private lateinit var Username : EditText
    private lateinit var Password : EditText
    private lateinit var Batch : Spinner
    private lateinit var Submit : Button
    var Userdata = ArrayList<user>()
    var batch = arrayListOf("24B", "24A", "23B","23A", "25A", "25B")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cid = findViewById(R.id.editCid)
        Fname = findViewById(R.id.editFname)
        Lname = findViewById(R.id.editLname)
        Username = findViewById(R.id.editUsername)
        Password = findViewById(R.id.editPassword)
        Batch = findViewById(R.id.spinnerBatch)
        Submit = findViewById(R.id.btnSubmit)

        val adapter= ArrayAdapter(
            this, android.R.layout.simple_list_item_1, batch
        )
        Batch.adapter = adapter

        Submit.setOnClickListener {
            val user = user(Cid.text.toString().toInt(),Fname.text.toString(), Lname.text.toString(),
                Username.text.toString(), Password.text.toString(), Batch.toString())
            Userdata.add(user)
            val intent = Intent(this,Login::class.java)  //to go to login  ,   big = to give intent
                .putExtra("Userdata", Userdata) //send to loginactivity.kt
            startActivity(intent)
        }

    }
}