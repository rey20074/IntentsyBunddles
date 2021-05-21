package com.uvg.intentsbunddle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multiplicacion.*
import kotlinx.android.synthetic.main.activity_suma.*
import java.lang.Exception

class Multiplicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplicacion)

        var operando1:Double=0.0
        var operando2:Double=0.0
        var resultado:String=""

        regresarM.setOnClickListener(){
            try{

                val op1:String = valor1m.text.toString()
                val op2:String = valor2m.text.toString()

                operando1= op1.toDouble()
                operando2= op2.toDouble()

                var res:Double=0.0
                res=operando1*operando2
                resultado=res.toString()

                val intent:Intent = Intent()
                intent.putExtra("resultado1",resultado)
                intent.putExtra("resultado2","El Resultado de la operación de multiplicación es:")
                setResult(RESULT_OK,intent)
                finish()
            }
            catch (e: Exception){
                val intent: Intent = Intent()
                intent.putExtra("resultado1","")
                intent.putExtra("resultado2","Hay letras en las cajas de texto")
                setResult(RESULT_OK,intent)
                finish()
            }


        }
    }
}