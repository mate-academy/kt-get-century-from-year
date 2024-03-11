package mate.academy

const val YEAR_OF_17_CENTURY = 1601
const val YEAR_OF_20_CENTURY = 2000
const val CENTURY_YEARS_NUMBER = 100
const val ZERO = 0

fun main() {
    println(getCentury(YEAR_OF_17_CENTURY))
    println(getCentury(YEAR_OF_20_CENTURY))
}

fun getCentury(year: Int) : Int {
    var century = year / CENTURY_YEARS_NUMBER

    if (year % CENTURY_YEARS_NUMBER > ZERO) {
        century++
    }
    return century
}
