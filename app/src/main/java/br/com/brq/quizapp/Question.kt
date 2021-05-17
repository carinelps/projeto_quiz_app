package br.com.brq.quizapp

class Question (
    val numeroQuestao: Int,
    val textoQuestao: String,
    val opcaoUm: String,
    val opcaoDois: String,
    val opcaoTres: String,
    val opcaoQuatro: String

){
   companion object {
       fun pegarQuestao () : ArrayList<Question> {
           val listaQuestao = arrayListOf<Question>()
           val questaoUm = Question(1, "Quero", "free", "fire", "oi", "deus")
           listaQuestao.add(questaoUm)
           return listaQuestao

           val questaoDois = Question(2, "teste", "certa", "errada", "errada", "errada")
           listaQuestao.add(questaoDois)
           return listaQuestao

       }
   }
}



