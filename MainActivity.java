package com.example.lesson1_hw;

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_hw.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_hw)
        val button = findViewById<Button>(R.id.button1)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)

        button.setOnClickListener {
            textView1.setText(getCountry(editText1, editText2))
            if (checkbox.isChecked()) {
                textView2.setText(Motherland.doAction())
            }
        }
    }


    private fun  getCountry(editText1: EditText, editText2: EditText) : String {
        val country = Country(
                editText1.getText().toString(),
                editText2.getText().toString())
        return "the capital of" + country.name + "is" + country.capital
    }
}
