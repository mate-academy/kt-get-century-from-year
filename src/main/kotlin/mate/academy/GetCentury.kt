package mate.academy
const val CENTURE = 100
const val ONE = 1


fun getCentury(year: Int) : Int {
    if (year % CENTURE == 0) {
        return year / CENTURE
    }
    return year / CENTURE + ONE
}
