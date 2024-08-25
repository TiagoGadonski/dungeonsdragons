package character

import character.kind.Kind
import character.dice.Dice
import character.race.Race
import kotlin.math.floor

class Character(
    val characterName: String,
    val race: Race,
    val kind: Kind,
    var characterLevel: Int = 1)
{
    private var pontosExperiencia: Int = 0 //TBD
    private var dadosDeVida: Int = 1
    private var pontosDeVida: Int = AtribuirPontosDeVidaInicial(kind.life)
    private var bonusProficiencia = AtribuirBonusDeProficiencia()

    val getPontosDeVida: Int
        get() = pontosDeVida

    var forca: Int = 0
    var destreza: Int = 0
    var constituicao: Int = 0
    var inteligencia: Int = 0
    var sabedoria: Int = 0
    var carisma: Int = 0

    private var modificadorDeConstituicao = CalcularModificador(constituicao)

    fun AtribuirPontosDeVidaInicial(tipoDiceDeVida: Dice) : Int{
        return tipoDiceDeVida.lifePoints + modificadorDeConstituicao
    }

    fun AtribuirBonusDeProficiencia(): Int{
        return if (characterLevel == 1)
            2
        else
            0
    }

    fun CalcularModificador(valorHabilidade: Int) : Int{
        return floor((valorHabilidade - 10) / 2.0).toInt()
    }

    fun AumentarXP(xp: Int){
        pontosExperiencia += xp
    }

    fun SubirNivel(xp: Int){
        characterLevel += 1
    }

    fun Descansar(tipoDiceDeVida: Dice){
        if(dadosDeVida > 0) {
            dadosDeVida -= 1
            pontosDeVida += tipoDiceDeVida.lifePoints
        }
        else
            print("Você não tem Dados de Vida suficiente.")
    }

    fun fichaDePersonagem(){
        println("\nFICHA DO PERSONAGEM:")
        println("\nNome da Raça: ${race.raceName}")
        println("Idiomas: ${race.languages.joinToString(", ")}")
        println("Deslocamento base: ${race.baseOffset} m")
        println("Nivel: $characterLevel")
        println("Pontos de Vida: $pontosDeVida")
        println("Tipo de Dado de Vida: ${kind.life.name}")
        println("Número de Dados de Vida: $dadosDeVida")

        println("\nProficiências do personagem: ")
        println("Ataque com armas: ${kind.weaponAttack}")
        println("Ataque com magias: ${kind.magicAttack}")
        println("Testes de Habilidade de Perícia: ${kind.expertise}")
        println("Testes de Habilidade de Ferramentas: ${kind.toolSkills}")
        println("Testes de Resistência: ${kind.resistance}")
        println("CD de magias de conjuração: ${kind.resistanceCD}")
        println("Bônus de Proficiência: $bonusProficiencia")


    }

}