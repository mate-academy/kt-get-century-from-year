package mate.academy

import kotlin.math.ceil

const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / YEARS_IN_CENTURY).toInt()
}
