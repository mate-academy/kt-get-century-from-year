package mate.academy

import kotlin.math.ceil

const val VEC = 100

fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / VEC).toInt()
}
