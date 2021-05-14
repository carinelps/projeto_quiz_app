package br.com.brq.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler;


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slpash)

        //Tirando a Action Bar
        supportActionBar?.hide()

        //Chamando a tela name dentro de 3000 segundos
        Handler().postDelayed({
            Intent(this, NameActivity::class.java).apply {
                startActivity(this)
            }
        }, 3000)
    }
}