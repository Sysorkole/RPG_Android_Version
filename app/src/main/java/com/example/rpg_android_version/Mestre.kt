package com.example.rpg_android_version

class Mestre(
    nome: String,
    nickname: String,
):Pessoa(nome, nickname) {
    private val players: MutableList<Jogador> = mutableListOf<Jogador>()
    fun addExperiencia(jogador: Jogador, valor: Int){
        println("Mestre ${this.nickname}: Adicionando $valor de Experiência ao jogador ${jogador.nome}")
        jogador.pontosDeExperiencia += valor
    }

    fun addOuro(jogador: Jogador, valor: Int){
        println("Mestre ${this.nickname}: Adicionando $valor Moedas de Ouro ao jogador ${jogador.nome}")
        jogador.moedasDeOuro += valor
    }
    fun addJogador(jogador: Jogador){ this.players.add(jogador) }

    fun showJogadores(){
        var count = 1
        this.players.forEach{
            println("---------- Jogador $count: ----------")
            it.printInfos()
            count++
        }
    }

}