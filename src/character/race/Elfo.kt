package character.race

import character.Character

open class Elfo : Race {
    override val raceName: String = "Elfo"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.destreza += 2
    }
}