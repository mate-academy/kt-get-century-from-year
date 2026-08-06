package mate.academy

private const val OFFSET = 99
private const val DIVISOR = 100

fun getCentury(year: Int): Int {
    return (year + OFFSET) / DIVISOR
}
