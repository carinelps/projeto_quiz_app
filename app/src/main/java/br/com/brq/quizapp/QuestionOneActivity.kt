package br.com.brq.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

        private var questaoLista: ArrayList<Question>? = null
        private var posicao : Int = 1
        private var selecao : Int = 0
        lateinit var txt_Questao : TextView
        lateinit var opcaoOne: TextView
        lateinit var opcaoTwo: TextView
        lateinit var opcaoThree: TextView
        lateinit var opcaoFour: TextView
        lateinit var btn_enviar: Button

class QuestionOneActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one)


        questaoLista = Question.pegarQuestao()

        carregarElemento()
        colocarQuestao()

        opcaoOne.setOnClickListener(this)
        opcaoTwo.setOnClickListener(this)
        opcaoThree.setOnClickListener(this)
        opcaoFour.setOnClickListener(this)

        btn_enviar.setOnClickListener({

        })
    }

    fun carregarElemento(){
        txt_Questao = findViewById(R.id.txt_Questao)
        opcaoOne = findViewById(R.id.opcaoOne)
        opcaoTwo = findViewById(R.id.opcaoTwo)
        opcaoThree = findViewById(R.id.opcaoThree)
        opcaoFour = findViewById(R.id.opcaoFour)
        btn_enviar = findViewById(R.id.btn_enviar)

    }

    fun colocarQuestao(){
        posicao = 1
        val question = questaoLista!!.get(posicao - 1)

        definirOpcoes()

        if(posicao == questaoLista!!.size){
            btn_enviar.text = "FINAL"
        }else{
            btn_enviar.text = "ENVIAR"
        }

        txt_Questao.text = question.textoQuestao
        opcaoOne.text = question.opcaoUm
        opcaoTwo.text = question.opcaoDois
        opcaoThree.text = question.opcaoTres
        opcaoFour.text = question.opcaoQuatro

    }

    fun definirOpcoes() {
        val opcoes = ArrayList<TextView>()
        opcoes.add(0, opcaoOne)
        opcoes.add(1, opcaoTwo)
        opcoes.add(2, opcaoThree)
        opcoes.add(3, opcaoFour)

        for (opcoes in opcoes) {
            opcoes.setTextColor(Color.parseColor("#808080"))
            opcoes.typeface = Typeface.DEFAULT
            opcoes.background = ContextCompat.getDrawable(this, R.drawable.opcao)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.opcaoOne ->{
                selecaoOpcao(opcaoOne, selecaoNumero = 1)
            }
            R.id.opcaoTwo ->{
                selecaoOpcao(opcaoTwo, selecaoNumero = 2)
            }
            R.id.opcaoThree ->{
                selecaoOpcao(opcaoThree, selecaoNumero = 3)
            }
            R.id.opcaoFour ->{
                selecaoOpcao(opcaoFour, selecaoNumero = 4)
            }
            R.id.btn_enviar ->{
                if(selecao == 0){
                    posicao++

                    when{
                        posicao <= questaoLista!!.size ->{
                            colocarQuestao()
                        }else ->{
                        Toast.makeText(this, "Você terminou o quiz", Toast.LENGTH_SHORT).show()
                         }
                    }
                }else{
                    val questoes = questaoLista?.get(posicao - 1)
                    if(questoes!!.resposta != selecao){
                        respostas(posicao, R.drawable.errado)
                    }
                    respostas(questoes.resposta, R.drawable.correta)

                    if (posicao == questaoLista!!.size){
                        btn_enviar.text = "Final"
                    }else{
                        btn_enviar.text = "PRÓXIMA"
                    }
                    selecao = 0
                }
            }
        }
    }

    fun respostas(resposta: Int, drawableView: Int){
        when(resposta){
            1 ->{
                opcaoOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                opcaoTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                opcaoThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                opcaoFour.background = ContextCompat.getDrawable(this, drawableView)
            }

        }

    }

    fun selecaoOpcao(tv: TextView, selecaoNumero: Int){
        definirOpcoes()
        selecao = selecaoNumero

        tv.setTextColor(Color.parseColor("#000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selecao)
    }

}