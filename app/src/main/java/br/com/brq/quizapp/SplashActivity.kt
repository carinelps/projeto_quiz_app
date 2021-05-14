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

        Handler().postDelayed({
            Intent(this, FirstActivity::class.java).apply {
                startActivity(this)
            }
        }, 3000)
    }
}