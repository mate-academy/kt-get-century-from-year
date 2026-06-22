package mate.academy

const val CENTURY_AMOUNT = 100
const val ZERO_VALUE = 0
const val ONE_VALUE = 1

fun getCentury(year: Int) : Int {
    val rowCentury = year / CENTURY_AMOUNT
    if (year % CENTURY_AMOUNT == ZERO_VALUE) {
        return rowCentury
    } else {
        return rowCentury + ONE_VALUE
    }
}
