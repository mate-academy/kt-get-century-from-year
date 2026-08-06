package mate.academy

const val CENTURE = 100

fun getCentury(year: Int) : Int {
    val a = year / CENTURE
    val b = a + 1

    return if (year % CENTURE == 0) {
        a
    } else {
        b
    }
}
