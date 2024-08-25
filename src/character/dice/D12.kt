package character.dice

import kotlin.random.Random

class D12: Dice {
    override val name: String = "D12"
    override val lifePoints: Int = 12

    override fun playDice(dice: Dice): Int {
        return Random.nextInt(1, lifePoints + 1)
    }
}