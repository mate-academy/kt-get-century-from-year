package mate.academy

import kotlin.math.ceil

const val DIVIDER = 100.0f;
fun getCentury(year: Int) : Int {
    return ceil(year / DIVIDER).toInt();
}
