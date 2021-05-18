package br.com.brq.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.quizapp.adapter.viewholder.AdapterQuestion
import br.com.brq.quizapp.Question
import kotlin.properties.Delegates

class QuestionActivity : AppCompatActivity() {
    lateinit var listaQuestao : RecyclerView
    lateinit var arrayQuestion : ArrayList<Question>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        arrayQuestion = Question.pegarQuestao()
        
        listaQuestao = findViewById(R.id.nossa_lista)
        listaQuestao.adapter = AdapterQuestion(arrayQuestion, this)
        listaQuestao.layoutManager = LinearLayoutManager(this)

        }
    }

