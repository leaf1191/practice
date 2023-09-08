package com.kotlin.section1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image1)
        val image2 = findViewById<ImageView>(R.id.image2)
        val image3 = findViewById<ImageView>(R.id.image3)
        val image4 = findViewById<ImageView>(R.id.image4)
        val image5 = findViewById<ImageView>(R.id.image5)
        val image6 = findViewById<ImageView>(R.id.image6)
        val image7 = findViewById<ImageView>(R.id.image7)

        image1.setOnClickListener(){
            Toast.makeText(this,"1번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener(){
            Toast.makeText(this,"2번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener(){
            Toast.makeText(this,"3번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener(){
            Toast.makeText(this,"4번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener(){
            Toast.makeText(this,"5번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener(){
            Toast.makeText(this,"6번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener(){
            Toast.makeText(this,"7번 클릭",Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }

    }
}