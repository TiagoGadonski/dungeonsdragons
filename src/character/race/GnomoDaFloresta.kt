package character.race

import character.Character

class GnomoDaFloresta: Race {
    override val raceName: String = "Gnomo da Floresta"
    override var languages: List<String> = listOf("Comum")
    override var baseOffset: Float = 0f

    override fun EnhanceAttributes(character: Character) {
        character.destreza += 1
    }
}