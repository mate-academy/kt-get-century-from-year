package mate.academy

private const val CENTURY_OFFSET = 99
private const val CENTURY_DIVISOR = 100

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / CENTURY_DIVISOR
}

