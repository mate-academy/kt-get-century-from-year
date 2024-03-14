package mate.academy

import kotlin.math.ceil

const val NUM = 100
fun getCentury(year: Int) : Int {
    return ceil(year.toDouble() / NUM).toInt()
}
