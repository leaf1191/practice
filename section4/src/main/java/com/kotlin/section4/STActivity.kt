package com.kotlin.section4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class STActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stactivity)

        val stList = mutableListOf<String>()

        stList.add("가갸거겨고교구규그기")
        stList.add("나냐너녀노뇨누뉴느니")
        stList.add("다댜더뎌도됴두듀드디")
        stList.add("라랴러려로료루류르리")
        stList.add("마먀머며모묘무뮤므미")

        val listView = findViewById<ListView>(R.id.listView)

        listView.adapter = ListViewAdapter(stList)
    }
}