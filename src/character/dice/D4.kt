package character.dice

import kotlin.random.Random

class D4 : Dice{
    override val name: String = "D4"
    override val lifePoints: Int = 4

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}