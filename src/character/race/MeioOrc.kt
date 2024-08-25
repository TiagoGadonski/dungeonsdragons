package character.race

import character.Character

class MeioOrc: Race {
    override val raceName: String = "Meio-orc"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.forca += 2
        character.constituicao += 1
    }
}