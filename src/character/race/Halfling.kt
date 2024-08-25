package character.race

import character.Character

class Halfling : Race {
    override val raceName: String = "Halfling"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.destreza += 2
    }
}