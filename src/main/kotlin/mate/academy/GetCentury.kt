package mate.academy

const val CENTURY_DIVISION = 100
const val CENTURY_ADDITION = 99

fun getCentury(year: Int) : Int {
    return (year + CENTURY_ADDITION) / CENTURY_DIVISION
}
