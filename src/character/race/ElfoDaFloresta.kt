package character.race

import character.Character

class ElfoDaFloresta : Elfo() {
    override val raceName: String = "Elfo da Floresta"
    override var languages: List<String> = listOf("Comum", "Anao")
    override var baseOffset: Float = 7.5f

    override fun EnhanceAttributes(character: Character) {
        character.sabedoria += 1
    }
}