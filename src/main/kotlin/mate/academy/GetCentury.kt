package mate.academy

const val YEARS_TO_DIVIDE = 100
const val ONE_CENTURY = 1
const val ZERO = 0
fun getCentury(year: Int) : Int {
    return if (year % YEARS_TO_DIVIDE == ZERO) {
        year / YEARS_TO_DIVIDE
    } else {
        (year / YEARS_TO_DIVIDE) + ONE_CENTURY
    }
}
