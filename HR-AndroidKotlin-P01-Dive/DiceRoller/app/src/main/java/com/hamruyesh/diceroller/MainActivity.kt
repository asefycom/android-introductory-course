package com.hamruyesh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var ivDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        ivDice = findViewById(R.id.iv_dice)
        btnRoll.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        //val tvDice: TextView = findViewById(R.id.tv_dice)
        val diceNumber = Random().nextInt(6) + 1
        //tvDice.text = diceNumber.toString()

        val imgResId = when(diceNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        ivDice.setImageResource(imgResId)
    }
}
