package com.example.mymipmapapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymipmapapplication.R
import com.example.mymipmapapplication.model.counties.Countries

class CountriesAdapter (
    private val list: List<Countries>,
    private val onClick: (id:Int)->Unit
    ):RecyclerView.Adapter<CountriesAdapter.ViewHolder>()
    {
    inner class ViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView){
                val id_state = itemView.findViewById<TextView>(R.id.id_state)
                val countries = itemView.findViewById<TextView>(R.id.name_country_state)
                val fullname = itemView.findViewById<TextView>(R.id.full_name_country_state)
                val flag = itemView.findViewById<ImageView>(R.id.img_flag_state)
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
           val itemView = LayoutInflater.from(parent.context)
               .inflate(R.layout.country_list_item,parent,false)
            return ViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.id_state.text = list[position].id
            holder.countries.text = list[position].countries

            holder.fullname.text = list[position].fullname
            holder.flag.setImageResource(list[position].flag)
        }
    }