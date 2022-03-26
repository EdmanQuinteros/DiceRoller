package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //lateinit la variable se inicializará antes de que el código llame a cualquier operación en ella.
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val restablecerButton : Button = findViewById(R.id.retablecer_button)
        restablecerButton.setOnClickListener { restableRollDice() }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)



        /*val contarButton : Button = findViewById(R.id.contar_button)
        contarButton.setOnClickListener { countUp() }

        val establecerButton : Button = findViewById(R.id.establecer_button)
        establecerButton.setOnClickListener { restablecerText() }*/
    }

    private fun restableRollDice(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    private fun rollDice(){
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

        //Mostrar mensaje toast
        /*Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()*/

        /*val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()*/
    }

    private fun getRandomDiceImage(): Int{
        //muestra un numero aleatorio del 1 al 6
        val randomInt = (1..6).random()

        return when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()
            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/

    /*private fun restablecerText(){
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = "0"
    }*/
}