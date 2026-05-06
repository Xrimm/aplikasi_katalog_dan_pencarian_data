package com.example.uas_seluler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FabulaUltimaAdapter(
    private val list: List<FabulaUltima>,
    ) :
    RecyclerView.Adapter<FabulaUltimaAdapter.ViewHolder>() {

    var onItemClick: ((FabulaUltima) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNama: TextView = view.findViewById(R.id.tvNama)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_fabula_ultima, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Class = list[position]
        holder.tvNama.text = Class.nama

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Class)
        }
    }

    override fun getItemCount(): Int = list.size
}