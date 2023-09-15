package com.kotlin.section5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val songList = mutableListOf<String>()

        songList.add("노래노래노래1")
        songList.add("노래노래노래2")
        songList.add("노래노래노래3")
        songList.add("노래노래노래4")
        songList.add("노래노래노래5")
        songList.add("노래노래노래6")
        songList.add("노래노래노래7")
        songList.add("노래노래노래8")
        songList.add("노래노래노래9")
        songList.add("노래노래노래10")

        val rv = view.findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(songList)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener{
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }

}