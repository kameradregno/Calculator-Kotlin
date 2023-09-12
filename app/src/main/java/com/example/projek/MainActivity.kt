package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.projek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtlngth: EditText
    private lateinit var edtwdth: EditText
    private lateinit var edthgt: EditText
    private lateinit var btnresult: Button
    private lateinit var tvresult: TextView
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        edtlngth = binding.edtlngthLength
        edtwdth = binding.edtwdthLength
        edthgt = binding.edthgtLength
        btnresult = binding.btnResult
        tvresult = binding.tvResult

        btnresult.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btn_result) {
            val getLength = edtlngth.text.toString().trim()
            val getWidth = edtwdth.text.toString().trim()
            val getHeight = edthgt.text.toString().trim()
            val msg = "harap isi bidang ini."

            if (getLength.isEmpty()) {
                edtlngth.error = msg
                return
            }

            if (getWidth.isEmpty()) {
                edtwdth.error = msg
                return
            }

                if (getHeight.isEmpty()) {
                edthgt.error = msg
                return
            }

            val result = getLength.toDouble() * getWidth.toDouble() * getHeight.toDouble()
            tvresult.text = result.toString()
        }
    }
}