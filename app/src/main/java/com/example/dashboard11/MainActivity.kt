package com.example.dashboard11

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_main)
        addToCart()



    }

    private fun addToCart(){
        val ts1: View = findViewById(R.id.Blue_add)

        ts1.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts2: View = findViewById(R.id.Red_add)

        ts2.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts3: View = findViewById(R.id.Black_add)

        ts3.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })


        val ts5: View = findViewById(R.id.Cream_add)

        ts5.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts6: View = findViewById(R.id.Blue1_add)

        ts6.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts7: View = findViewById(R.id.Green_add)

        ts7.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts8: View = findViewById(R.id.Green1_add)

        ts8.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts9: View = findViewById(R.id.purple_add)

        ts9.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })

        val ts10: View = findViewById(R.id.BlackOversize_add)

        ts10.setOnClickListener({
            Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
        })
    }
}

