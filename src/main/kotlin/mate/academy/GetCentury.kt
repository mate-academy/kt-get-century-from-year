package mate.academy

const val HUNDRED = 100
fun getCentury(year: Int) : Int {
    return if (year % HUNDRED == 0) {
        year / HUNDRED
    } else {
        (year / HUNDRED) + 1
    }
}
