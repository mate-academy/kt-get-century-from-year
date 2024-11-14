package mate.academy
const val HUNDRED_ST = 100
const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % HUNDRED_ST == 0) {
        return year / HUNDRED_ST
    }
    return year / HUNDRED_ST + ONE
}
