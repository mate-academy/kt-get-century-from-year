package mate.academy

const val HUNDRED = 100
const val ONE = 1

fun getCentury(year: Int): Int {
    return (year - ONE) / HUNDRED + ONE
}
