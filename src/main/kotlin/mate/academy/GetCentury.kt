package mate.academy
const val CENTURY_OFFSET = 99
const val CENTURY_LENGTH = 100

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / CENTURY_LENGTH
}
