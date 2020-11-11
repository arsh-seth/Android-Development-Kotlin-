package com.example.newkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var btnAdd = findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Hello Arsh", Toast.LENGTH_SHORT).show()
            val result= etVar1.text.toString().toInt() + etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        })
    }
}