package com.example.tetimer_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tetimer_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var teArrayList : ArrayList<Te>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())

        val imagenID = intArrayOf(
            R.drawable.verde,
            R.drawable.blanco,
            R.drawable.hibisco,
            R.drawable.matcha,
        )

        val nombre = arrayOf(
            "Te verde",
            "Te blanco",
            "Te hibisco",
            "Te matcha",
        )

        val precio = arrayOf(
            "9,99€",
            "8,99€",
            "13,99€",
            "12,99€",
        )

        val descripcion = arrayOf(
            "Te verde",
            "Te blanco",
            "Te hibisco",
            "Te matcha",
        )

        teArrayList = ArrayList()

        for (i in nombre.indices)
        {
            val te = Te(nombre[i], precio[i] ,descripcion[i], imagenID[i],)
            teArrayList.add(te)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, teArrayList)
        binding.listview.setOnItemClickListener {parent, view, position, id ->
            val nombre = nombre[position]
            val precio = precio[position]
            val descripcion = descripcion[position]
            val imagenID = imagenID[position]

            //TODO val i = Intent(this, ) minuto 16:56
        }

    }
}