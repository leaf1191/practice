package com.kotlin.section2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val member1 = findViewById<ImageView>(R.id.member1)
        val member2 = findViewById<ImageView>(R.id.member2)
        val member3 = findViewById<ImageView>(R.id.member3)
        val member4 = findViewById<ImageView>(R.id.member4)
        val member5 = findViewById<ImageView>(R.id.member5)
        val member6 = findViewById<ImageView>(R.id.member6)
        val member7 = findViewById<ImageView>(R.id.member7)
        val member8 = findViewById<ImageView>(R.id.member8)
        val member9 = findViewById<ImageView>(R.id.member9)

        member1.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",1)
            startActivity(intent)
        }

        member2.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",2)
            startActivity(intent)
        }

        member3.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",3)
            startActivity(intent)
        }

        member4.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",4)
            startActivity(intent)
        }

        member5.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",5)
            startActivity(intent)
        }

        member6.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",6)
            startActivity(intent)
        }

        member7.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",7)
            startActivity(intent)
        }

        member8.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",8)
            startActivity(intent)
        }

        member9.setOnClickListener(){
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data",9)
            startActivity(intent)
        }
    }
}