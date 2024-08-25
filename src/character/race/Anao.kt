package character.race

import character.Character

open class Anao : Race {
    override val raceName: String = "Anão"
    override var languages: List<String> = listOf("Comum", "Anão")
    override var baseOffset: Float = 7.5f

    override fun EnhanceAttributes(character: Character) {
        character.constituicao += 2
    }
}