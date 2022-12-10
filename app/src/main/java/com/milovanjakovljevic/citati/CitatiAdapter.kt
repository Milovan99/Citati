package com.milovanjakovljevic.citati

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class CitatiAdapter : RecyclerView.Adapter<CitatiAdapter.CitatiViewHolder>(){

    class CitatiViewHolder(v:View):RecyclerView.ViewHolder(v){
        var view:View=v
        var citat :String=""

        fun bindCitat(citat:String){
            this.citat=citat
            view.textView.text=citat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitatiViewHolder {
        return CitatiViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row,parent,false))
    }

    override fun onBindViewHolder(holder: CitatiViewHolder, position: Int) {
        holder.bindCitat("Sample quote")

    }

    override fun getItemCount(): Int {
        return 10
    }
}