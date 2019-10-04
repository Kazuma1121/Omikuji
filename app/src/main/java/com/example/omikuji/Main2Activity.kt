package com.example.omikuji

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val randomInt = Random.nextInt(7)

        when (randomInt) {
            0 -> {
                imageView4.setImageResource(R.drawable.shokichi)
            }
            1 -> {
                imageView4.setImageResource(R.drawable.kichi)
            }
            2 -> {
                imageView4.setImageResource(R.drawable.daikyou)
            }
            3 -> {
                imageView4.setImageResource(R.drawable.daikichi)
            }
            4 -> {
                imageView4.setImageResource(R.drawable.suekichi)
            }
            5 -> {
                imageView4.setImageResource(R.drawable.kyou)
            }
            6 -> {
                imageView4.setImageResource(R.drawable.tyukichi)
            }
        }

    }
}
