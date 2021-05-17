package br.com.brq.quizapp.adapter.viewholder.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.quizapp.R

class ViewHolderQuestion(view: View) : RecyclerView.ViewHolder(view) {
    var numeroQuestao : TextView
    var textoQuestao : TextView
    var opcaoUm : TextView
    var opcaoDois : TextView
    var opcaoTres : TextView
    var opcaoQuatro : TextView

    init {
        numeroQuestao = view.findViewById(R.id.numeroQuestao)
        textoQuestao = view.findViewById(R.id.textoQuestao)
        opcaoUm = view.findViewById(R.id.opcaoUm)
        opcaoDois = view.findViewById(R.id.opcaoDois)
        opcaoTres = view.findViewById(R.id.opcaoTres)
        opcaoQuatro = view.findViewById(R.id.opcaoQuatro)
    }

}