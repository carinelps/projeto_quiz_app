package br.com.brq.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class GetNameActivity : AppCompatActivity() {

    lateinit var txt_name: EditText
    lateinit var btn_comecar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_name)

        carregarElementos()

        //Tirando a Action Bar
        supportActionBar?.hide()

        btn_comecar.setOnClickListener {
            if(txt_name.text.toString().isEmpty()){
                Toast.makeText(this, "Por favor, digiter seu nome", Toast.LENGTH_LONG).show()
            }else{
                Intent(this, QuestionActivity::class.java).apply {
                    startActivity(this)
                }
            }
        }
    }

        fun carregarElementos() {
            txt_name = findViewById<EditText>(R.id.txt_name)
            btn_comecar = findViewById<Button>(R.id.btn_comecar)

        }
    }

