package mate.academy

import kotlin.math.ceil

fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / 100).toInt()
}
