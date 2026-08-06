package mate.academy

import kotlin.math.ceil

const val HUNDRED = 100

fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / HUNDRED).toInt()
}
