package character

class Attributes {
    private val availableValues = mutableListOf(15, 14, 13, 12, 10, 8)

    fun Distribute(character: Character){
        println("\nEscolha os valores para as habilidades:")

        character.forca = ChooseValue("Força")
        character.destreza = ChooseValue("Destreza")
        character.constituicao = ChooseValue("Constituição")
        character.inteligencia = ChooseValue("Inteligência")
        character.sabedoria = ChooseValue("Sabedoria")
        character.carisma = ChooseValue("Carisma")
    }

    private fun ChooseValue(atributo: String): Int {
        println("Valores disponíveis: $availableValues")
        println("Escolha o valor para $atributo:")
        val valorEscolhido = readln().toInt()

        return if (valorEscolhido in availableValues) {
            availableValues.remove(valorEscolhido)
            valorEscolhido
        } else {
            println("Valor inválido ou já utilizado. Tente novamente.")
            ChooseValue(atributo)
        }
    }

    fun ShowAttributes(character: Character) {
        println("\nAtributos do personagem:")
        println("Força: ${character.forca}")
        println("Destreza: ${character.destreza}")
        println("Constituição: ${character.constituicao}")
        println("Inteligência: ${character.inteligencia}")
        println("Sabedoria: ${character.sabedoria}")
        println("Carisma: ${character.carisma}")
    }
}

