package com.example.elaza.primerproyectokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.view.ViewGroup



/**
 * Proyecto básico de kotlin
 * <ul>
 *     <li>Extendemos de AppCompatActivity</li>
 *     <li>No se utilizan ; para cierre</li>
 * </ul>
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSaludar.setOnClickListener {
            Toast.makeText(this,"Hola ${etNombre.text}",Toast.LENGTH_LONG).show()

        }
    }

}
