package character.race

import character.Character

class Drow: Race {
    override val raceName: String = "Drow"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.carisma += 1
    }
}