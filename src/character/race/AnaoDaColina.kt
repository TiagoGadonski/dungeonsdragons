package character.race

import character.Character

class AnaoDaColina: Race {
    override val raceName: String = "Anão da Colina"
    override var languages: List<String> = listOf("Comum", "Anao")
    override var baseOffset: Float = 7.5f

    override fun EnhanceAttributes(character: Character) {
        character.sabedoria += 1
    }
}