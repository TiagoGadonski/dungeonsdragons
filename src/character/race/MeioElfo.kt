package character.race

import character.Character

class MeioElfo: Race{
    override val raceName: String = "Meio-elfo"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.carisma += 2
    }
}