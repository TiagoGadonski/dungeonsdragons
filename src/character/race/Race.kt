package character.race

import character.Character

interface Race {
    val raceName: String
    var languages : List<String>
    var baseOffset : Float

    fun EnhanceAttributes(character: Character)
}