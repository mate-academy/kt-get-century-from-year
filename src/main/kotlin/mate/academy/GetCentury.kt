package mate.academy

const val DIVISOR = 10
const val CENTURY_MULTIPLIER = 100

fun getCentury(year: Int) : Int {
    var result: Int
    if (year % DIVISOR == 0) {
        result = year / CENTURY_MULTIPLIER
    } else {
        result = year / CENTURY_MULTIPLIER + 1
    }
    return result
}
