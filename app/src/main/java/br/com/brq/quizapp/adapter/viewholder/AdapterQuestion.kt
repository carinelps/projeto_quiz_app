package br.com.brq.quizapp.adapter.viewholder

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.quizapp.Question
import br.com.brq.quizapp.R
import br.com.brq.quizapp.adapter.viewholder.viewholder.ViewHolderQuestion

class AdapterQuestion (val arrayQuestion: ArrayList<Question>, val context: Context): RecyclerView.Adapter<ViewHolderQuestion>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderQuestion {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.question_one, parent, false)
        return ViewHolderQuestion(view)
    }

    override fun getItemCount(): Int {
        return arrayQuestion.size
    }

    override fun onBindViewHolder(holder: ViewHolderQuestion, position: Int) {
        arrayQuestion[position].apply {
            holder.numeroQuestao.text = this.numeroQuestao.toString()
            holder.textoQuestao.text = this.textoQuestao
            holder.opcaoUm.text = this.opcaoUm
            holder.opcaoDois.text = this.opcaoDois
            holder.opcaoTres.text = this.opcaoTres
            holder.opcaoQuatro.text = this.opcaoQuatro

        }

    }

}

