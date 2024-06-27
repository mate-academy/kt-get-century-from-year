package mate.academy

const val CENTRY = 100
fun getCentury(year: Int) : Int {
    return if (year % CENTRY == 0) {
        year / CENTRY
    } else {
        year / CENTRY + 1
    }
}
