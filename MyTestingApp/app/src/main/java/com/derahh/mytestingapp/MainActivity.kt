package com.derahh.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvText:TextView

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btn_set_value.setOnClickListener(this)

        names.add("Dedi Rahmansah")
        names.add("Fadli")
        names.add("Haris")

        Glide.with(this).load(R.drawable.fronalpstock_big).into(img_preview)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.btn_set_value) {
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}
