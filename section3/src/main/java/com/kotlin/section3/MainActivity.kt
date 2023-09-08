package com.kotlin.section3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kotlin.section3.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val dice1 = binding.dice1
        val dice2 = binding.dice2

        binding.btn.setOnClickListener {
            Toast.makeText(this,"주사위 Go",Toast.LENGTH_LONG).show()
            val num1 = Random.nextInt(1,6)
            val num2 = Random.nextInt(1,6)

            when(num1){
                1-> dice1.setImageResource(R.drawable.dice_1)
                2-> dice1.setImageResource(R.drawable.dice_2)
                3-> dice1.setImageResource(R.drawable.dice_3)
                4-> dice1.setImageResource(R.drawable.dice_4)
                5-> dice1.setImageResource(R.drawable.dice_5)
                else-> dice1.setImageResource(R.drawable.dice_6)
            }
            when(num2){
                1-> dice2.setImageResource(R.drawable.dice_1)
                2-> dice2.setImageResource(R.drawable.dice_2)
                3-> dice2.setImageResource(R.drawable.dice_3)
                4-> dice2.setImageResource(R.drawable.dice_4)
                5-> dice2.setImageResource(R.drawable.dice_5)
                else-> dice2.setImageResource(R.drawable.dice_6)
            }

        }

    }
}