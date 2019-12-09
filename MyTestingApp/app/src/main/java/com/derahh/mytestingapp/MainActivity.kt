package com.derahh.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue:Button
    private lateinit var tvText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.btn_set_value) {
            tvText.text = "19"
        }
    }
}
