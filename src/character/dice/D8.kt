package character.dice

import kotlin.random.Random

class D8: Dice {
    override val name: String = "D8"
    override val lifePoints: Int = 8

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}