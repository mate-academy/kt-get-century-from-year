package mate.academy

const val HUNDRED = 100
fun getCentury(year: Int): Int {
    if (year % HUNDRED == 0) {
        return year / HUNDRED
    } else {
        return year / HUNDRED + 1
    }
}