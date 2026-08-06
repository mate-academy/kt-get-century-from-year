package mate.academy

import kotlin.math.ceil

const val CENTURY = 100

fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / CENTURY).toInt()
}
