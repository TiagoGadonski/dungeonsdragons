import character.Attributes
import character.AttributeDistribution
import character.Character
import character.kind.Guerreiro
import character.race.AnaoDaMontanha

fun main(args: Array<String>) {


    val anaoDaMontanha = AnaoDaMontanha()
    val guerreiro = Guerreiro()

    val character = Character(
        characterName = "Enzo",
        race = anaoDaMontanha,
        kind = guerreiro
    )


    character.AtribuirPontosDeVidaInicial(guerreiro.life)
    println("Pontos de Vida Inicial: ${character.getPontosDeVida}")

    val attributes = Attributes()
    attributes.Distribute(character)

    anaoDaMontanha.EnhanceAttributes(character)
    attributes.ShowAttributes(character)

    val attributeDistribution = AttributeDistribution()
    attributeDistribution.escolherValores(character)
    attributes.ShowAttributes(character)

    character.fichaDePersonagem()
}