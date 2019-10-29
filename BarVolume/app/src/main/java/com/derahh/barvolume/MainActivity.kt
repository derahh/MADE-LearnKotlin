package com.derahh.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    private lateinit var edtWidth: EditText
    private lateinit var edtLength: EditText
    private lateinit var edtHeight: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    private lateinit var tilWidth: TextInputLayout
    private lateinit var tilLength: TextInputLayout
    private lateinit var tilHeight: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        edtWidth = findViewById(R.id.edt_width)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
        tilHeight = findViewById(R.id.til_height)
        tilLength = findViewById(R.id.til_length)
        tilWidth = findViewById(R.id.til_width)

        btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT) as String
            tvResult.text = result
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvResult.toString())
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_calculate){
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inPutHeight = edtHeight.text.toString().trim()

            var isEmptyFields = false

            if (inPutHeight.isEmpty()){
                isEmptyFields = true
                tilHeight.error = "Field ini tidak boleh kosong"
                tilHeight.isErrorEnabled = true
            } else {
                tilHeight.isErrorEnabled = false
            }

            if (inputLength.isEmpty()){
                isEmptyFields = true
                tilLength.error = "Field ini tidak boleh kosong"
                tilLength.isErrorEnabled = true
            } else {
                tilLength.isErrorEnabled = false
            }

            if (inputWidth.isEmpty()){
                isEmptyFields = true
                tilWidth.error = "Field ini tidak boleh kosong"
                tilWidth.isErrorEnabled = true
            } else {
                tilWidth.isErrorEnabled = false
            }

            if (!isEmptyFields){
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inPutHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }
}
