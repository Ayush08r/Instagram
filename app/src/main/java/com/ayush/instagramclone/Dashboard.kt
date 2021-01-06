package com.ayush.instagramclone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ayush.instagramclone.adapter.FeedAdapter
import com.ayush.instagramclone.adapter.StoryAdapter
import com.ayush.instagramclone.model.Feed
import com.ayush.instagramclone.model.user
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Dashboard : AppCompatActivity() {
    private lateinit var story: RecyclerView
    private lateinit var feed: RecyclerView
    private lateinit var Upload: FloatingActionButton
    var Userdata = ArrayList<user>()
    var FeedData = ArrayList<Feed>()
    lateinit var profile:String
    lateinit var username:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        story = findViewById(R.id.recyclerStory)
        feed = findViewById(R.id.recyclerFeed)
        Upload = findViewById(R.id.Upload)
        loadStory()
        loadfeed()

        val intent = intent
        username = intent.getStringExtra("username").toString()
        profile = intent.getStringExtra("profile").toString()

        val storyAdapter = StoryAdapter(Userdata, this)
        val sLayoutManager = LinearLayoutManager(this)
        sLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        story.layoutManager = sLayoutManager
        story.adapter=storyAdapter

        val feedAdapter = FeedAdapter(FeedData, this)
        val fLayoutManager = LinearLayoutManager(this)
        fLayoutManager.orientation = LinearLayoutManager.VERTICAL
        feed.layoutManager = fLayoutManager
        feed.adapter=feedAdapter

        Upload.setOnClickListener {
            val intent = Intent(this, Upload::class.java)
            startActivityForResult(intent, 1)
        }



    }

    fun loadStory(){
        Userdata.add(user(4,"Ram","Deuba","Ram52","jsbhghld","24B","https://vignette3.wikia.nocookie.net/ssbb/images/c/cd/Toon_Link_Phantom_Hourglass.png/revision/latest?cb=20120827125123&path-prefix=es"))
        Userdata.add(user(55,"Sapang","rai","Sapang","ulhbwgja","24A","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbrzoqlisbIAziyU8QZMkepYG1SZ_a3-hniQ&usqp=CAU"))
        Userdata.add(user(44,"Mandy","kunwar","Mandy","jkbagljbd","25B","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5QhxpHJBek0WEVlXRl1dTScefMID0hr7-YA&usqp=CAU"))
        Userdata.add(user(2,"Pratik","magar","Pratik","hjsbgadjdks","25A","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxGh3XraZOwVvflJ-1mocL17v5C1X7NcR2PQ&usqp=CAU"))
        Userdata.add(user(2,"Sita","Shahi","Sita","wrageftewq","23A","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPvDVXbnMZ7bqHiW_MseDiJq-dsvO8TCGK2Q&usqp=CAU"))
        Userdata.add(user(2,"Ramesh","Shahi","Ramesh","vcxbvb","23B","https://static3.srcdn.com/wordpress/wp-content/uploads/2019/09/Sasuke-Feature.jpg"))
        Userdata.add(user(2,"Ayush","Rajbhandari","Ayush","rwegfqregrg","25A","https://wallpaperaccess.com/full/2502843.jpg"))
        Userdata.add(user(2,"Atish","Shrestha","Atish","wfawdfd","24A","https://cdna.artstation.com/p/assets/images/images/025/813/634/large/nurumayu-35-fav8p.jpg?1586996137"))
        Userdata.add(user(2,"Thilen","Lama","Thilen","wjbf","24B","https://static.wikia.nocookie.net/naruto/images/7/7d/Ch%C5%8Dji_Akimichi.png/revision/latest/scale-to-width-down/340?cb=20200426204415"))
        Userdata.add(user(2,"Asha","Sharma","Asha","rbjfbekf","23A","https://static.wikia.nocookie.net/legendsofthemultiuniverse/images/6/64/Sakura_Part_1.png/revision/latest?cb=20170316013236"))
    }

    fun loadfeed(){
        FeedData.add(Feed("Monika","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHtadwk6D0k08qbEo9SDq6rhd3ZCCc33anCw&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr6gR-in2R0cuhJ8pV4q1myC--dU89gJKjCw&usqp=CAU"))
        FeedData.add(Feed("Harry","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThoBw08Cdqkj_i0lfLtzm51IeLVtTYeAFrjg&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqXPcIR1hPmdi9Qsz4VB-I7DrJA6_xyEFXgw&usqp=CAU"))
        FeedData.add(Feed("Sunnyy","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQf4aTZUnGjDNXC0Lgeu61lX3Q4y0Gs5qu7dw&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaIQ6aGqalGXcHYXO90Q6qr89nT5FI1_FuIQ&usqp=CAU"))
        FeedData.add(Feed("Henry","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtWepLY2Z8ReQH_SJiVzO-TOQxHGVs3Y7h6A&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQeyr_U5jS_gEFL7kMWiwTKOWNA9qmfKyYDQ&usqp=CAU"))
        FeedData.add(Feed("Wilshere","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFJpGP2SO9XH74mdo2KVyR9fLzJ2DJnXPquw&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ__MtqDi9vI6qeWO6OORHKE7zxs7frlQG8Sw&usqp=CAU"))
        FeedData.add(Feed("Messi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTigntWaofKa2FHUx_IlzHk3fC6G2aPwjqUgA&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXh1TpAGzHxD-vNv6KmWXOcb9mZ_dO2LkTRg&usqp=CAU"))
        FeedData.add(Feed("Ronaldo","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ25NSfuHkueHgrxiQlvIDvt1APy-Ss7dcjnw&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqdpvTf5dH_s6nVpS7Nx5879X1oy0etHpCOQ&usqp=CAU"))
        FeedData.add(Feed("Buffon","https://upload.wikimedia.org/wikipedia/commons/5/54/Gianluigi_Buffon_%2831784615942%29_%28cropped%29.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSF1LycoE2hpXkQ52FJSsmNrycAM5X1jEn9mw&usqp=CAU"))
        FeedData.add(Feed("Neymar","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXyFEifzPRL65eiulLoj7qkUwoZipUdKEVUg&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQE9Gin2ZTo2kOKGcBZRS9OKGp15XlAfKqi4w&usqp=CAU"))
        FeedData.add(Feed("Bernadeschi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREhSjV8GAeJvoKKbuTO-2enwfP4cZlKRR8rg&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShQQGGmJUotcTez2454--e8vHiN7c93FKBRg&usqp=CAU"))
        FeedData.add(Feed("Astori","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT__gU_LkdKjTg-4ynnHEYAem0rtpb4YBJiZg&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQB61JLn3R3tK-KZ_I0omUM86alGVu95bRX5w&usqp=CAU"))
        FeedData.add(Feed("Rossi","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBwL6oakTW1ncRwhd2WC1jBhi98pj4Y5BqQw&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKnxvDfLeeQoOVZUkvFsE7lU8JxY_Xe8NYvw&usqp=CAU"))
        FeedData.add(Feed("Pique","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR16Qdvdrz6_lgho3sZ4KGlQ9Wi0LyoD03R3w&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhXBg_pRelaKK5R-vV7PA50zCb-W8I8yf9aw&usqp=CAU"))
        FeedData.add(Feed("Maradona","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrDYrnk5xOT152KYjAJLq0oqbmbyg-NvS-wQ&usqp=CAU","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIZbegjIpxSayP0_6pz_mwiacU3570Lu7H6w&usqp=CAU"))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                val link = data?.getStringExtra("link")
                FeedData.add(Feed(username, profile, link))
            }
        }
    }
}