package com.example.tetimer_kotlin

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<Te>):
                ArrayAdapter<Te>(context, R.layout.list_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.te_image)
        val nombreTe : TextView = view.findViewById(R.id.te_nombre)
        val descripcion : TextView = view.findViewById(R.id.descripcion)
        val precio : TextView = view.findViewById(R.id.precio)

        imageView.setImageResource(arrayList[position].imagenID)
        nombreTe.text = arrayList[position].nombre
        descripcion.text = arrayList[position].descripcion
        precio.text = arrayList[position].precio

        return view
    }
}