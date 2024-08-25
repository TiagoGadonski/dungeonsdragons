package character.dice

import kotlin.random.Random

class D10: Dice {
    override val name: String = "D10"
    override val lifePoints: Int = 10

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}