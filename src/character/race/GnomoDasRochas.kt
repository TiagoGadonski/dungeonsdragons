package character.race

import character.Character

class GnomoDasRochas: Race {
    override val raceName: String = "Gnomo das Rochas"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.constituicao += 1
    }
}