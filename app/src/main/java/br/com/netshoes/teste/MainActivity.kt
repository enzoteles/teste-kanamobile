package br.com.netshoes.teste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_name.text = "Teste"
        bt_ok.setOnClickListener {

            tv_name.text = "Teste butão"
        }


    }
}
