package com.example.calculadora

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var Ope1:Int = 0
    var Operando:String = ""
    var Ope2:Int = 0
    var num:Int = 0
    var texto: String = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0: Button = findViewById<Button>(R.id.btn0)
        val btn1: Button = findViewById<Button>(R.id.btn1)
        val btn2: Button = findViewById<Button>(R.id.btn2)
        val btn3: Button = findViewById<Button>(R.id.btn3)
        val btn4: Button = findViewById<Button>(R.id.btn4)
        val btn5: Button = findViewById<Button>(R.id.btn5)
        val btn6: Button = findViewById<Button>(R.id.btn6)
        val btn7: Button = findViewById<Button>(R.id.btn7)
        val btn8: Button = findViewById<Button>(R.id.btn8)
        val btn9: Button = findViewById<Button>(R.id.btn9)
        val btnEqual: Button = findViewById<Button>(R.id.btnResul)
        val btnPlus: Button = findViewById<Button>(R.id.btnPlus)
        val btnMinus: Button = findViewById<Button>(R.id.btnMinus)
        val btnTimes: Button = findViewById<Button>(R.id.btnTimes)
        val btnDivide: Button = findViewById<Button>(R.id.btnDivide)
        val btnAC: Button = findViewById<Button>(R.id.btnAC)
        val btnCopy: Button = findViewById<Button>(R.id.btnCopy)
        val txt: TextView = findViewById<TextView>(R.id.txtResult)
        txt.setTextColor(Color.parseColor("#FFFFFF"));


        btnCopy.setOnClickListener {
            val textToCopy = txt.text
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", textToCopy)
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_LONG).show()
        }

        btnEqual.setOnClickListener {
            if (txt.text == ""){
                Ope2= 0
            }else {
                Ope2 = Integer.parseInt(txt.text.toString())
            }

            val operacionStr:String = Ope1.toString() + Operando + Ope2.toString()

            val operacion = Operador()
            txt.text = operacion.doOperation(operacionStr)
        }

        btnPlus.setOnClickListener {
            if(txt.text == ""){
                Ope1 = 0
            }else {
                Ope1 = Integer.parseInt(txt.text.toString())
            }
            btnMinus.setEnabled(false);
            btnTimes.setEnabled(false);
            btnDivide.setEnabled(false);
            btnPlus.setEnabled(false);
            Operando = btnPlus.text.toString()
            txt.text = ""
        }

        btnMinus.setOnClickListener {
            if(txt.text == ""){
                Ope1 = 0
            }else {
                Ope1 = Integer.parseInt(txt.text.toString())
            }
            btnMinus.setEnabled(false);
            btnTimes.setEnabled(false);
            btnDivide.setEnabled(false);
            btnPlus.setEnabled(false);
            Operando = btnMinus.text.toString()
            txt.text = ""
        }

        btnTimes.setOnClickListener {
            if(txt.text == ""){
                Ope1 = 0
            }else {
                Ope1 = Integer.parseInt(txt.text.toString())
            }
            btnMinus.setEnabled(false);
            btnTimes.setEnabled(false);
            btnDivide.setEnabled(false);
            btnPlus.setEnabled(false);
            Operando = "*"
            txt.text = ""
        }

        btnDivide.setOnClickListener {
            if(txt.text == ""){
                Ope1 = 0
            }else {
                Ope1 = Integer.parseInt(txt.text.toString())
            }
            btnMinus.setEnabled(false);
            btnTimes.setEnabled(false);
            btnDivide.setEnabled(false);
            btnPlus.setEnabled(false);
            Operando = btnDivide.text.toString()
            txt.text = ""
        }

        btn0.setOnClickListener {
            if(txt.text == "0") {
                txt.text  = ""
                txt.text = txt.text.toString() + btn0.text
            } else {
                txt.text = txt.text.toString() + btn0.text
            }
        }

        btn1.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn1.text
                txt.text = texto
            } else {
                texto = texto + btn1.text
                txt.text = texto
            }
        }

        btn2.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn2.text
                txt.text = texto
            } else {
                texto = texto + btn2.text
                txt.text = texto
            }
        }

        btn3.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn3.text
                txt.text = texto
            } else {
                texto = texto + btn3.text
                txt.text = texto
            }
        }

        btn4.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn4.text
                txt.text = texto
            } else {
                texto = texto + btn4.text
                txt.text = texto
            }
        }

        btn5.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn5.text
                txt.text = texto
            } else {
                texto = texto + btn5.text
                txt.text = texto
            }
        }

        btn6.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn6.text
                txt.text = texto
            } else {
                texto = texto + btn6.text
                txt.text = texto
            }
        }

        btn7.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn7.text
                txt.text = texto
            } else {
                texto = texto + btn7.text
                txt.text = texto
            }
        }

        btn8.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn8.text
                txt.text = texto
            } else {
                texto = texto + btn8.text
                txt.text = texto
            }
        }

        btn9.setOnClickListener {
            if(txt.text == "0") {
                texto = ""
                texto = texto + btn9.text
                txt.text = texto
            } else {
                texto = texto + btn9.text
                txt.text = texto
            }
        }

        btnAC.setOnClickListener {
            texto = ""
            txt.text = texto
            Ope1 = 0
            Ope2 = 0
            btnMinus.setEnabled(true);
            btnTimes.setEnabled(true);
            btnDivide.setEnabled(true);
            btnPlus.setEnabled(true);
        }


    }

    override fun onResume(){
        super.onResume()
        Log.d("Debug","onResume")
        val text:TextView = findViewById(R.id.txtResult)
        text.text = texto
    }
    override fun onSaveInstanceState(outState: Bundle) {
// Save the user's current game state.
        outState?.run {
            putString("texto", texto)
        }
        Log.d("Debug",texto)
// Always call the superclass so it can save the view hierarchy.
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
// Always call the superclass so it can restore the view hierarchy.
        super.onRestoreInstanceState(savedInstanceState)
// Restore state members from saved instance.
        savedInstanceState?.run {
           texto = savedInstanceState.getString("texto").toString()
        }
        Log.d("Debug",texto)


}

}