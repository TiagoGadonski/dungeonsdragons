package character.dice

import kotlin.random.Random

class D20: Dice {
    override val name: String = "D20"
    override val lifePoints: Int = 20

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}