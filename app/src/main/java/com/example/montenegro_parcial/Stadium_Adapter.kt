package com.example.montenegro_parcial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.montenegro_parcial.R
import com.example.montenegro_parcial.Stadium_Model


class estadioAdapter(private var lstEstadio: List<Stadium_Model>) :
    RecyclerView.Adapter<estadioAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivStadium: ImageView = itemView.findViewById(R.id.ivStadium)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvUbicacion: TextView = itemView.findViewById(R.id.tvUbicacion)
        val tvAforo: TextView = itemView.findViewById(R.id.tvAforo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            layoutInflater.inflate(R.layout.item_stadium, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemEstadios = lstEstadio[position]
        holder.tvNombre.text = itemEstadios.nombreEstadio.toString()
        holder.tvUbicacion.text = itemEstadios.ubicacion
        holder.tvAforo.text = itemEstadios.aforo
        holder.ivStadium.setImageResource(itemEstadios.image)
    }

    override fun getItemCount(): Int {
        return lstEstadio.size
    }
}