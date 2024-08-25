package character.dice

import kotlin.random.Random

class D6 : Dice {
    override val name: String = "D6"
    override val lifePoints: Int = 6

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}