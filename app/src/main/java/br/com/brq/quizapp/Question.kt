package br.com.brq.quizapp


class Question (
    val numeroQuestao: Int,
    val textoQuestao: String,
    val opcaoUm: String,
    val opcaoDois: String,
    val opcaoTres: String,
    val opcaoQuatro: String,
    val resposta: Int

){
    companion object {
       fun pegarQuestao () : ArrayList<Question> {
           val listaQuestao = arrayListOf<Question>()

             Question(1, "De quem é a famosa frase “Penso, logo existo”?", "Platão", "Galileu Galilei",
               "Descartes", "Sócrates", 3
           ).let {
               listaQuestao.add(it)
           }

           Question(2, "De onde é a invenção do chuveiro elétrico?",
               "França", "Brasil", "Austrália", "Inglaterra", 2).let {
               listaQuestao.add(it)
           }


            Question(3, "Quantas casas decimais tem o número pi?",
               "Infinitas", "Milhares", "Centenas", "Vinte", 1).let {
                listaQuestao.add(it)
            }


           Question(4, "O que a palavra legend significa em português?",
               "Conto", " Legendário", "Legenda", "Lenda", 4).let{
              listaQuestao.add(it)
           }


           Question(5, "Quanto tempo a luz do Sol demora para chegar à Terra?",
               "7 minutos", " 12 minutos", "8 minutos", "9 minutos", 3).let {
               listaQuestao.add(it)
           }

           return listaQuestao
       }
   }
}



