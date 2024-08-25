package character.dice

interface Dice {
    val name: String
    val lifePoints: Int

    fun playDice(dice: Dice): Int
}