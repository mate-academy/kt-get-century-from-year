package mate.academy

private const val MAGIC_NUMBER = 100
private const val ZERO = 0
private const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % MAGIC_NUMBER == ZERO) {
        return year / MAGIC_NUMBER
    }
    return year / MAGIC_NUMBER + ONE
}
