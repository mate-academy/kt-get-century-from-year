package mate.academy

const val YEARS_IN_CENTURY = 100
const val CENTURY_INCREMENT = 1

fun getCentury(year: Int) : Int {
    return if (year % YEARS_IN_CENTURY == 0) {
        year / YEARS_IN_CENTURY
    } else {
        year / YEARS_IN_CENTURY + CENTURY_INCREMENT
    }
}
