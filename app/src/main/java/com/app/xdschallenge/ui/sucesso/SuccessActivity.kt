package com.app.xdschallenge.ui.sucesso

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.xdschallenge.databinding.ActivityChoiceFlavorBinding
import com.app.xdschallenge.databinding.ActivitySuccessBinding
import com.app.xdschallenge.ui.choiceflav.EscolhaActivity

class SuccessActivity : AppCompatActivity(), SuccessContrat.View {

    lateinit var binding: ActivitySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        binding.btnVoltar.setOnClickListener {
            onClickReturn()
        }
    }

    override fun onClickReturn() {
        startActivity(Intent(this, EscolhaActivity::class.java))
    }
}