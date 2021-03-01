package com.example.rpg_android_version

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCreateJogador = createJogador
        val btCreateMestre = createMestre
        val btBoundJogador = boundJogador
        val btShowJogador = showJogador
        var msgMensagem = mensagem
        var newPlayer = Jogador("","","","")
        var newMestre = Mestre("","")

        btCreateJogador.setOnClickListener{ newPlayer = Jogador(nome.text.toString(),username.text.toString(),classe.text.toString(),raca.text.toString()) }
        btCreateMestre.setOnClickListener{ newMestre = Mestre(nome.text.toString(),username.text.toString()) }
        btShowJogador.setOnClickListener {
            if(newPlayer.nome == "" || newPlayer.nickname == "" || newPlayer.classe == "" || newPlayer.raça == ""){
                msgMensagem.text = "Você Precisa Criar um jogador para poder Mostra-lo..."
            } else{
                msgMensagem.text = newPlayer.printInfos()
            }
        }
        btBoundJogador.setOnClickListener{
            if(newPlayer.nome == "" || newPlayer.nickname == "" || newPlayer.classe == "" || newPlayer.raça == "" || newMestre.nome == "" || newMestre.nickname == ""){
                msgMensagem.text = "Você Precisa Criar um jogador e um mestre para poder Vincula-lo..."
            } else{
                    newMestre.addJogador(newPlayer)
                    msgMensagem.text = "Novo Jogador Adicionado..."
            }
        }
    }
}