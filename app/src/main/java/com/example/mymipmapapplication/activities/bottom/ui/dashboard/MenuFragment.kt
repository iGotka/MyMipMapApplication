package com.example.mymipmapapplication.activities.bottom.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.adapters.CountriesAdapter
import com.example.mymipmapapplication.interfaces.APIServiceInterface
import com.example.mymipmapapplication.model.counties.Countries


class MenuFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CountriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_menu, container, false)
        recyclerView = root.findViewById(R.id.countryRecycler)
        recyclerView.layoutManager = LinearLayoutManager(context)

        return root
    }




}