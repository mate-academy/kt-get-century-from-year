package mate.academy

const val OFFSET = 100
fun getCentury(year: Int) : Int {

    return if (year % OFFSET > 0) {
        year / OFFSET + 1
    } else {
        year / OFFSET
    }
}
