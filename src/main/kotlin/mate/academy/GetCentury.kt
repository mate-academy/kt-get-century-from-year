package mate.academy

const val LAST_NUM_DIVIDER: Int = 10
const val CENT: Int = 100;
fun getCentury(year: Int): Int {
    return if (year % LAST_NUM_DIVIDER == 0) year / CENT else year / CENT + 1
}
