package com.example.atividadealunosnovos

import Itens
import MeuAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Criando uma lista de exemplo
        val listaDeItens = listOf(
            Itens("Produto1", 10.0),
            Itens("Produto2", 20.0),
            Itens("Produto3", 30.0)
            // Adicione mais itens conforme necessário
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        val adapter = MeuAdapter(listaDeItens)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
