package com.daniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textView)
        texto.setText("Hola perros!")


        Toast.makeText(this, "OnCreate Function", Toast.LENGTH_LONG)
        Log.i("info", "Oncreate Function Executed")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart Function", Toast.LENGTH_LONG)
        Log.i("info", "OnStart Function Executed")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Function", Toast.LENGTH_LONG)
        Log.i("info", "onResume Function Executed")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Function", Toast.LENGTH_LONG)
        Log.i("info", "onPause Function Executed")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Function", Toast.LENGTH_LONG)
        Log.i("info", "onStop Function Executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy Function", Toast.LENGTH_LONG)
        Log.i("info", "onDestroy Function Executed")
    }

}