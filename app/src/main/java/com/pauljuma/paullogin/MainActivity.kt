package com.pauljuma.paullogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customList = listOf("All countries", "A", "Australia", "China", "India", "UK", "USA")

        val adapter = ArrayAdapter(this, android.support.constraint.R.
        layout.support_simple_spinner_dropdown_item, customList)

        countries.adapter = adapter

        countries.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, "you selected ${adapterView?.
                getItemAtPosition(position).toString()}", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

}