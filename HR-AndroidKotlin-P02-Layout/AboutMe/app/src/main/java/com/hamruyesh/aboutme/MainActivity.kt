package com.hamruyesh.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.DataBindingUtil
import com.hamruyesh.aboutme.databinding.ActivyMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivyMainBinding
    private val samplePerson:Person = Person("Mostafa", "Vahab")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activy_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activy_main)

        binding.person = samplePerson

        binding.btnEnter.setOnClickListener{
            binding.apply {
                samplePerson.nickname = binding.etNickname.text.toString()
                invalidateAll()
                tvNickname.visibility = View.VISIBLE
                etNickname.visibility = View.GONE

                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(it.windowToken,0)

            }


        }

//        val etNickName: EditText = findViewById(R.id.et_nickname)
//        val tvNickNAme: AppCompatTextView = findViewById(R.id.tv_nickname)
//        val btnEnter: AppCompatButton = findViewById(R.id.btn_enter)

//        btnEnter.setOnClickListener{
//            tvNickNAme.visibility = View.VISIBLE
//            tvNickNAme.text = etNickName.text
//            etNickName.visibility = View.GONE
//
//            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow(it.windowToken,0)
//        }


    }
}
