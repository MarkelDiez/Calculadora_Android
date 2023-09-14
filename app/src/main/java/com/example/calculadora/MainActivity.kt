package com.example.calculadora

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var Ope1:Int = 0
    var Operando:String = ""
    var Ope2:Int = 0

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
            txt.text = txt.text.toString() + btn0.text
        }

        btn1.setOnClickListener {
            txt.text = txt.text.toString() + btn1.text
        }

        btn2.setOnClickListener {
            txt.text = txt.text.toString() + btn2.text
        }

        btn3.setOnClickListener {
            txt.text = txt.text.toString() + btn3.text
        }

        btn4.setOnClickListener {
            txt.text = txt.text.toString() + btn4.text
        }

        btn5.setOnClickListener {
            txt.text = txt.text.toString() + btn5.text
        }

        btn6.setOnClickListener {
            txt.text = txt.text.toString() + btn6.text
        }

        btn7.setOnClickListener {
            txt.text = txt.text.toString() + btn7.text
        }

        btn8.setOnClickListener {
            txt.text = txt.text.toString() + btn8.text
        }

        btn9.setOnClickListener {
            txt.text = txt.text.toString() + btn9.text
        }

        btnAC.setOnClickListener {
            txt.text = ""
            Ope1 = 0
            Ope2 = 0
            btnMinus.setEnabled(true);
            btnTimes.setEnabled(true);
            btnDivide.setEnabled(true);
            btnPlus.setEnabled(true);
        }

    }
}