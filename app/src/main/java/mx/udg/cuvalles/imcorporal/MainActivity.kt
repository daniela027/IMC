package mx.udg.cuvalles.imcorporal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad:Int=25
    var peso: Int=75
    var altura: Int=180
    var sexo:String = "hola"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekAltura.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (progress <= 100) {
                    seekAltura.setProgress(100)
                    tvpeso.text="100"
                    altura=100
                } else {
                    tvpeso.text = "$progress" //
                    altura=progress
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })


        btnEdadMas.setOnClickListener(this)
        btnPesoMas.setOnClickListener(this)
        btnPesoMenos.setOnClickListener(this)
        //imBtnMasculino.setOnClickListener(this)
        //imBtnFemenino.setOnClickListener(this)
        btnCalcular.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Log.wtf("click", msg"se dio click a algo")
    }
}