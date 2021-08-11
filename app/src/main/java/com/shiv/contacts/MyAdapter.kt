package com.shiv.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter( val userList: List<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.mycard,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.contactName.text = userList[position].Name
        holder.contactNum.text = userList[position].Mobile
        holder.contactMail.text = userList[position].mail
//        holder.contactName.text = userList[position]
//        holder.contactNum.text = userList[position]
//        holder.contactMail.text = userList[position]

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var contactName : TextView = itemView.findViewById(R.id.tvName)
        var contactNum : TextView = itemView.findViewById(R.id.tvNum)
        var contactMail : TextView = itemView.findViewById(R.id.tvMail)
    }
}
