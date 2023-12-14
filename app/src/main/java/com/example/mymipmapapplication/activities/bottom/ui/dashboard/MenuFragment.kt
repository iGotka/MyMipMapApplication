package com.example.mymipmapapplication.activities.bottom.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mymipmapapplication.R


class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_menu, container, false)
        val stran_recycler: RecyclerView = root.findViewById(R.id.stran_rec)
        stran_recycler.adapter
        return root
    }


}