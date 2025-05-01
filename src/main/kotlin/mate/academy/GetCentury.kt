package mate.academy

const val HUNDRED = 100
const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % HUNDRED == 0)
        return year/HUNDRED
    return  year/HUNDRED + ONE
}
