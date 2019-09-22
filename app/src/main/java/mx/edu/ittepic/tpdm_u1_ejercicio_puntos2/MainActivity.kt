package mx.edu.ittepic.tpdm_u1_ejercicio_puntos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TextView
import androidx.core.view.get

class MainActivity : AppCompatActivity() {

    var eNum1 : EditText?=null
    var eNum2 : EditText?=null
    var btnCalc : Button?=null
    var result : TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eNum1=findViewById(R.id.num1)
        eNum2=findViewById(R.id.num2)
        btnCalc=findViewById(R.id.btncalc)
        result=findViewById(R.id.result)

        btnCalc?.setOnClickListener {
            var n1 = eNum2?.text.toString().toInt()
            var n2 = eNum2?.text.toString().toInt()
            var cad=""
            (1..n2).forEach{
                var r = n1*it
                 cad = cad +n1+"x"+it+"="+r+"\n"
            }
            result?.setText(cad)
        }


    }
}
