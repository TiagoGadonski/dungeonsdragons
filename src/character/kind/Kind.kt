package character.kind

import character.dice.Dice

interface Kind {
    val className: String
    val life: Dice

    var weaponAttack: Int
    var magicAttack: Int
    var expertise: Int
    var toolSkills: Int
    var resistance: Int
    var resistanceCD: Int
}