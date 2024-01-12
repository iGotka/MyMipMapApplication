package com.example.mymipmapapplication.activities.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.adapters.CountriesAdapter
import com.example.mymipmapapplication.datasource.ServiceBuilder
import com.example.mymipmapapplication.model.counties.ApiResponseCountries
import com.example.mymipmapapplication.model.counties.Countries
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CounriesActivity : AppCompatActivity() {
    private val apiService = ServiceBuilder.getService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countries)

        val list = mutableListOf<Countries>()
        val adapter = CountriesAdapter(list){}
        val recyclerView = findViewById<RecyclerView>(R.id.countryRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        lifecycleScope.launch(Dispatchers.IO){
            val countries = apiService.getCountries()
            list.addAll(countries)
            withContext(Dispatchers.Main){
                adapter.notifyDataSetChanged()
            }
        }
    }
}