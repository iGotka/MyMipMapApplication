package com.example.mymipmapapplication.activities.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymipmapapplication.R

data class stran(val image:Int, val name_stran:String)
class MyFeel{val list = arrayListOf(stran(R.drawable.image_shape,"faggot"),
    stran(R.drawable.image_shape,"Расслабленым"),
    stran(R.drawable.image_shape,"Сосредоточеным"),
    stran(R.drawable.image_shape,"Взволнованым"))
}
class StranRecycler(val context: Context, val list: ArrayList<stran>): RecyclerView.Adapter<StranRecycler.MyVH>() {
    class MyVH(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.stran_adapter,parent,false)
        return MyVH(root)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {

    }
}