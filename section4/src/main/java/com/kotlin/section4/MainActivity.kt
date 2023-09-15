package com.kotlin.section4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kotlin.section4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var isDouble : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val stList = mutableListOf<String>()

        stList.add("가갸거겨고교구규그기")
        stList.add("나냐너녀노뇨누뉴느니")
        stList.add("다댜더뎌도됴두듀드디")
        stList.add("라랴러려로료루류르리")
        stList.add("마먀머며모묘무뮤므미")


        binding.button.setOnClickListener {
            val activity = Intent(this, STActivity::class.java)
            startActivity(activity)
        }

        binding.text.setText(stList.random())

    }

    override fun onBackPressed() {
        if(isDouble){
            finish()
        }
        isDouble = true
        Toast.makeText(this, "두번 누르면 종료", Toast.LENGTH_LONG).show()

        Handler().postDelayed({isDouble = false},2000)
    }

}