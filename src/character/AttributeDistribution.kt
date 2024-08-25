package character

class AttributeDistribution {
    private fun tabelaCustoPonto(valor: Int): Int{
        return when (valor) {
            8 -> 0
            9 -> 1
            10 -> 2
            11 -> 3
            12 -> 4
            13 -> 5
            14 -> 7
            15 -> 9
            else -> 0
        }
    }

    fun escolherValores(character: Character) {
        val valoresPossiveis = mutableListOf(8, 9, 10, 11, 12, 13, 14, 15)
        var pontosRestantes = 27

        println("\nDistribua os 27 pontos entre suas habilidades:")

        character.forca = escolherValor("Força", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }
        character.destreza = escolherValor("Destreza", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }
        character.constituicao = escolherValor("Constituição", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }
        character.inteligencia = escolherValor("Inteligência", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }
        character.sabedoria = escolherValor("Sabedoria", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }
        character.carisma = escolherValor("Carisma", valoresPossiveis, pontosRestantes).also { pontosRestantes -= tabelaCustoPonto(it) }

        if (pontosRestantes < 0) {
            println("Você excedeu o limite de pontos. Tente novamente.")
            return escolherValores(character)
        }

        println("Pontos restantes: $pontosRestantes")
    }

    fun escolherValor(atributo: String, valoresPossiveis: MutableList<Int>, pontosRestantes: Int): Int {
        println("Valores disponíveis: ${valoresPossiveis.filter { tabelaCustoPonto(it) <= pontosRestantes }}")
        println("Escolha o valor para $atributo (8-15):")
        val valorEscolhido = readln().toInt()

        if (valorEscolhido in valoresPossiveis && tabelaCustoPonto(valorEscolhido) <= pontosRestantes) {
            valoresPossiveis.remove(valorEscolhido)
            return valorEscolhido
        } else {
            println("Valor inválido ou pontos insuficientes. Tente novamente.")
            return escolherValor(atributo, valoresPossiveis, pontosRestantes)
        }
    }
}