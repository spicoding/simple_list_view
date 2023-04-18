package com.example.listviewmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview = findViewById<ListView>(R.id.listView1)
        val names = arrayOf("Ibanez", "Warwick", "ESP", "Fender", "Sadowsky", "Yamaha", "Fodera", "Specter", "Mayones", "Sire", "Squier", "Sterling by Music Man", "Kiesel")
        val myarrayadapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        mylistview.adapter = myarrayadapter

        mylistview.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"You have clicked "+names[position],Toast.LENGTH_LONG).show()
        }

    }
}