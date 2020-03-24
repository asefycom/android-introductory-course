package com.hamruyesh.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewList: List<View> = listOf(actv_box1, actv_box2, actv_box3, actv_box4, actv_box5, cl_main,
            btn_blue, btn_green)

        for (view in viewList){
            view.setOnClickListener{
                when(view.id){
                    R.id.btn_blue -> actv_box1.setBackgroundColor(Color.BLUE)
                    R.id.btn_green -> actv_box2.setBackgroundColor(Color.GREEN)

                    R.id.actv_box1 -> actv_box1.setBackgroundColor(Color.RED)
                    R.id.actv_box2 -> actv_box2.setBackgroundColor(Color.BLUE)
                    R.id.actv_box3 -> actv_box3.setBackgroundResource(android.R.color.holo_green_light)
                    R.id.actv_box4 -> actv_box4.setBackgroundResource(android.R.color.holo_orange_dark)
                    R.id.actv_box5 -> actv_box5.setBackgroundResource(R.color.box_one)
                    else -> cl_main.setBackgroundColor(Color.LTGRAY)
                }
            }
        }

        //region Alternative Ways
        //        val actvBox1: AppCompatTextView = findViewById(R.id.actv_box1)
//        actvBox1.setOnClickListener{
//            actv_box1.setBackgroundColor(Color.RED)
//        }
        //OR
//        actv_box1.setOnClickListener{
//            actv_box1.setBackgroundColor(Color.RED)
//        }
        //And do the same for all views
        //endregion
    }

}
