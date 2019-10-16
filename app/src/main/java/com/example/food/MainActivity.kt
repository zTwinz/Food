package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val foodlist= arrayListOf<String>("Hamburger", "Pizza", "Hot Dog", "Do Nut", "Khmer Food")
            btndecide.setOnClickListener{
            val random = Random()
            val randomFood= random.nextInt(foodlist.count())
            selectedfoodtxt.text=foodlist[randomFood]
        }
        btnaddfood.setOnClickListener {
            val newFood=addfoodtext.text.toString()
            foodlist.add(newFood)
            addfoodtext.text.clear()
            println(foodlist)
        }
    }
}
