package character.race

import character.Character

class AnaoDaMontanha : Race {
    override val raceName: String = "Anão da Montanha"
    override var languages: List<String> = listOf("Comum", "Anao")
    override var baseOffset: Float = 7.5f

    override fun EnhanceAttributes(character: Character) {
        character.forca += 2
        character.constituicao += 2
    }
}