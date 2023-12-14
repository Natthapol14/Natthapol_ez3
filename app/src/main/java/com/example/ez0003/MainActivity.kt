package com.example.ez0003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt1: EditText = findViewById(R.id.edt1)
        val edt2: EditText = findViewById(R.id.edt2)
        val res: TextView = findViewById(R.id.res)
        val tw0: TextView = findViewById(R.id.tw0)
        val bt1: Button = findViewById(R.id.bt1)
        val bt2: Button = findViewById(R.id.bt2)
        val bt3: Button = findViewById(R.id.bt3)
        val bt4: Button = findViewById(R.id.bt4)
        val bt5: Button = findViewById(R.id.bt5)
        val bt6: Button = findViewById(R.id.bt6)

        bt6.setOnClickListener {
            edt1.setText(" ")
            edt2.setText(" ")
            res.setText(" ")
            tw0.setText(" ")
        }
        bt1.setOnClickListener {
            var num1 = edt1.text.toString()
            var num2 = edt2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() + num2.toInt()
                res.text = result.toString()
                tw0.setText("+")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        bt2.setOnClickListener {
            var num1 = edt1.text.toString()
            var num2 = edt2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                res.text = result.toString()
                tw0.setText("-")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        bt3.setOnClickListener {
            var num1 = edt1.text.toString()
            var num2 = edt2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                res.text = result.toString()
                tw0.setText("*")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        bt4.setOnClickListener {
            var num1 = edt1.text.toString()
            var num2 = edt2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                res.text = result.toString()
                tw0.setText("/")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        bt5.setOnClickListener {
            var num1 = edt1.text.toString()
            var num2 = edt2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                res.text = result.toString()
                tw0.setText("%")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
    }

}