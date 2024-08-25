package character.race

import character.Character

class Tiefling: Race {
    override val raceName: String = "Tiefling"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.inteligencia += 1
        character.carisma += 2
    }
}