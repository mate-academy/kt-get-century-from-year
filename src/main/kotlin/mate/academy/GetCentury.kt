package mate.academy

const val NINETY = 99
const val ONE_HUNDRED = 100

fun getCentury(year: Int) : Int {
    return (year + NINETY) / ONE_HUNDRED
}
