package com.o7services.contactassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class Recycadap(var arrayList: ArrayList<contacts>, var recycInterface: MainActivity): RecyclerView.Adapter<Recycadap.AdapterHolder>() {
    class AdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView =view.findViewById(R.id.name)
        var phone: TextView =view.findViewById(R.id.number)


    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHolder {
         val listview= LayoutInflater.from(parent.context)
             .inflate(R.layout.contact,parent,false)
         return AdapterHolder(listview)



     }

     override fun onBindViewHolder(holder: AdapterHolder, position: Int) {
         holder.name.setText("${arrayList.get(position).name}")
         holder.phone.setText("${arrayList.get(position).contact}")

     }

     override fun getItemCount(): Int {
         return arrayList.size

     }

 }





