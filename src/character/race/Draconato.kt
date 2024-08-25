package character.race

import character.Character

class Draconato: Race {
    override val raceName: String = "Draconato"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.forca += 2
        character.carisma += 1
    }
}