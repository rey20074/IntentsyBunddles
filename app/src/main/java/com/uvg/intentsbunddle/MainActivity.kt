package com.uvg.intentsbunddle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btnOpen.setOnClickListener{
            val intent:Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Valor","Hola")
            intent.putExtra("Valor2","Prueba")
            //intent.putExtra("Valor3","Prueba2")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent,1)
        }*/

        suma.setOnClickListener(){
            val intent:Intent = Intent(this, Suma::class.java)
            startActivityForResult(intent,1)
        }

        resta.setOnClickListener(){
            val intent:Intent = Intent(this, Resta::class.java)
            startActivityForResult(intent,2)
        }

        mul.setOnClickListener(){
            val intent:Intent = Intent(this, Multiplicacion::class.java)
            startActivityForResult(intent,3)
        }

        div.setOnClickListener(){
            val intent:Intent = Intent(this, Division::class.java)
            startActivityForResult(intent,4)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode== RESULT_OK){
            if(requestCode==1){
                val bundle=data?.extras
                if(bundle!=null){
                    val resultado=bundle.getString("resultado1")
                    val txtRes=bundle.getString("resultado2")
                    resultadoOP.text=resultado
                    textRes.text=txtRes
                }
            }

            if(requestCode==2){
                val bundle=data?.extras
                if(bundle!=null){
                    val resultado=bundle.getString("resultado1")
                    val txtRes=bundle.getString("resultado2")
                    resultadoOP.text=resultado
                    textRes.text=txtRes
                }
            }

            if(requestCode==3){
                val bundle=data?.extras
                if(bundle!=null){
                    val resultado=bundle.getString("resultado1")
                    val txtRes=bundle.getString("resultado2")
                    resultadoOP.text=resultado
                    textRes.text=txtRes
                }
            }

            if(requestCode==4){
                val bundle=data?.extras
                if(bundle!=null){
                    val resultado=bundle.getString("resultado1")
                    val txtRes=bundle.getString("resultado2")
                    resultadoOP.text=resultado
                    textRes.text=txtRes
                }
            }
        }
    }
}