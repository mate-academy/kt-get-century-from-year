package mate.academy

import kotlin.math.ceil

fun getCentury(year: Int) : Int {
    return ceil(year / 100.0).toInt();
}
