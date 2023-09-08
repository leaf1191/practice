package com.kotlin.section2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getData= intent.getIntExtra("data",0)
        val member = findViewById<ImageView>(R.id.memberImage)

        when(getData){
            1 -> member.setImageResource(R.drawable.member_1)
            2 -> member.setImageResource(R.drawable.member_2)
            3 -> member.setImageResource(R.drawable.member_3)
            4 -> member.setImageResource(R.drawable.member_4)
            5 -> member.setImageResource(R.drawable.member_5)
            6 -> member.setImageResource(R.drawable.member_6)
            7 -> member.setImageResource(R.drawable.member_7)
            8 -> member.setImageResource(R.drawable.member_8)
            9 -> member.setImageResource(R.drawable.member_9)
            else -> print("0")
        }

    }
}