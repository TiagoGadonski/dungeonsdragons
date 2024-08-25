package character.kind

import character.dice.D10
import character.dice.Dice

class Guerreiro : Kind {
    override val className: String = "Guerreiro"
    override val life: Dice = D10()

    override var weaponAttack: Int = 0
    override var magicAttack: Int = 0
    override var expertise: Int = 0
    override var toolSkills: Int = 0
    override var resistance: Int = 0
    override var resistanceCD: Int = 0
}