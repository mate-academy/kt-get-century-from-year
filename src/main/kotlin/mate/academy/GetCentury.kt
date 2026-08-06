package mate.academy

const val CENTURY_DURATION = 100
const val ADDITIONAL_CENTURY = 1
const val NULL_CHECK = 0

fun getCentury(year: Int) : Int {
    if (year % CENTURY_DURATION != NULL_CHECK) {
        return year / CENTURY_DURATION + ADDITIONAL_CENTURY
    }
    return year / CENTURY_DURATION
}
