package com.mycalendar.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DayboxAdapter(val dayboxlist: ArrayList<Daybox>) : RecyclerView.Adapter<DayboxAdapter.CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayboxAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view).apply{
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val daybox : Daybox = dayboxlist.get(curPos)
                Toast.makeText(parent.context, "할 일: ${daybox.daycontent}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: DayboxAdapter.CustomViewHolder, position: Int) {
        holder.dayboxdate.text = dayboxlist.get(position).date
        holder.dayboxtext.text = dayboxlist.get(position).daycontent
    }

    override fun getItemCount(): Int {
        return dayboxlist.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val date = itemView.findViewById<TextView>(R.id.daycardview_todaydatet)   //날짜
        val daycontent = itemView.findViewById<TextView>(R.id.daycardview_textt)  //내용
    }
}