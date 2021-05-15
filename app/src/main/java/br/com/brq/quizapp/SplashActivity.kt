package br.com.brq.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler;

class SplashActivity : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Tirando a Action Bar
        supportActionBar?.hide()

        //Chamando a tela name dentro de 3 segundos para abrir outra tela
        handler = Handler()

        handler.postDelayed({
            val intent = Intent(this, GetNameActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}