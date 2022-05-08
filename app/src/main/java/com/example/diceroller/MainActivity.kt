package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button= findViewById(R.id.button2)
        rollbutton.setOnClickListener {
//            val toast=Toast.makeText(this,"Dice Rolled! ",Toast.LENGTH_SHORT)
//            toast.show()
            rollDice()
            val toast=Toast.makeText(this,"Dice Rolled! ",Toast.LENGTH_SHORT)
          toast.show()
        }

    }

    private fun rollDice() {
        val dice=Dice(6)
        val diceroll=dice.Roll()
        val result:TextView=findViewById(R.id.textView2)
        result.text=diceroll.toString()
    }
}
class Dice(private val Numsides:Int){
    fun Roll():Int{
        return (1..Numsides).random()
    }
}