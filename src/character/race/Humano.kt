package character.race

import character.Character

class Humano : Race {
    override val raceName: String = "Humano"
    override var languages: List<String> = listOf("Comum", "Anao")
    override var baseOffset: Float = 7.5f

    override fun EnhanceAttributes(character: Character) {
        character.forca += 1
        character.destreza += 1
        character.constituicao += 1
        character.inteligencia += 1
        character.sabedoria += 1
        character.carisma += 1
    }
}