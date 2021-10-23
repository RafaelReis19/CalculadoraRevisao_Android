package com.example.calculadorarevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calculadorarevisao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btCalcular.setOnClickListener{ calculo() }
    }
    fun calculo() {
        val n1 = binding.valor1.text.toString().toInt()
        val n2 = binding.valor2.text.toString().toInt()
        //val selectedId = binding.operacoes.checkedRadioButtonId
        val resultado1 = when (binding.operacoes.checkedRadioButtonId) {
            R.id.options_somar -> Calculadora().somar(n1, n2)
            R.id.options_subtrair -> Calculadora().subtrair(n1, n2)
            R.id.options_multiplicar -> Calculadora().multiplicar(n1, n2)
            else -> Calculadora().dividir(n1, n2)
        }
        binding.resultado.text = resultado1.toString()
    }
    /*fun subtrair() {
        val editTextN1 = findViewById<EditText>(R.id.valor1)
        val editTextN2 = findViewById<EditText>(R.id.valor2)
        val n1: Int = editTextN1.text.toString().toInt()
        val n2: Int = editTextN2.text.toString().toInt()
        val calculo2 = n1 - n2
    }
    fun multiplicar() {
        val editTextN1 = findViewById<EditText>(R.id.valor1)
        val editTextN2 = findViewById<EditText>(R.id.valor2)
        val n1: Int = editTextN1.text.toString().toInt()
        val n2: Int = editTextN2.text.toString().toInt()
        val calculo3 = n1 * n2
    }
    fun dividir() {
        val editTextN1 = findViewById<EditText>(R.id.valor1)
        val editTextN2 = findViewById<EditText>(R.id.valor2)
        val n1: Int = editTextN1.text.toString().toInt()
        val n2: Int = editTextN2.text.toString().toInt()
        val calculo4 = n1 / n2
    }*/
}
class Calculadora {
    fun somar(n1: Int, n2: Int): Int {
        val soma = n1 + n2
        return (soma)
    }

    fun subtrair(n1: Int, n2: Int): Int {
        val subtra = n1 - n2
        return (subtra)
    }

    fun dividir(n1: Int, n2: Int): Int {
        val div = n1 / n2
        return (div)
    }
    fun multiplicar(n1: Int, n2: Int): Int {
        val mult = n1 * n2
        return (mult)
    }
}