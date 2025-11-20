object Bob {
    fun hey(input: String): String {
        val msg = input.trim()
        val isYelling = msg.any { it.isLetter() } && msg.none { it.isLetter() && it.isLowerCase() }
        return when {
            msg.endsWith('?') && isYelling -> "Calm down, I know what I'm doing!"
            msg.endsWith('?') -> "Sure."
            isYelling -> "Whoa, chill out!"
            msg.isEmpty() -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}