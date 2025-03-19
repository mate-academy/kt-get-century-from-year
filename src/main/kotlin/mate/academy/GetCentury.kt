package mate.academy

fun getCentury(year: Int) : Int {
    val CENTURY_OFFSET = 99
    val CENTURY_SIZE = 100
    return (year + CENTURY_OFFSET) / CENTURY_SIZE
}
