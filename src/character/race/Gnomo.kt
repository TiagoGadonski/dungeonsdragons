package character.race

import character.Character

class Gnomo: Race {
    override val raceName: String = "Gnomo"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.inteligencia += 2
    }
}