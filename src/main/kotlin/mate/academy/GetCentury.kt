package mate.academy

import kotlin.math.ceil

const val CENTURY = 100.0
fun getCentury(year: Int): Int {
    return ceil(year / CENTURY).toInt()
}
