package character.race

import character.Character

class HalflingRobusto: Race {
    override val raceName: String = "Halfling Robusto"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.constituicao += 1
    }
}