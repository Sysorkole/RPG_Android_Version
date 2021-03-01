package com.example.rpg_android_version

class Jogador(
    nome: String,
    nickname: String,
    val classe: String,
    val raça: String
): Pessoa(nome, nickname) {
    var level = 1
    var moedasDeOuro = 10
    var pontosDeExperiencia = 0

    fun printInfos():String{
        return ("Dados do jogador:\n\n${this.nickname}\n${this.raça} ${this.classe} Level ${this.level.toString()}" +
                "\n\nMoedas de Ouro: ${this.moedasDeOuro.toString()}\nExperiência: ${this.pontosDeExperiencia.toString()}\n")

    }

    fun useSpell(){
        if(this.level in 1..2 && this.classe == "Mago") {
            println("${this.nickname}: Dispara Seta de Gelo!")
        }
        else if(this.level in 3..4 && this.classe == "Mago"){
            println("${this.nickname}: Dispara Bola de Fogo!")
        }
        else{
            print("Erro encontrado...")
        }
    }


}