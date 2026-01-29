package mate.academy

import kotlin.math.ceil

const val divider = 100.0f;
fun getCentury(year: Int) : Int {
    return ceil(year / divider).toInt();
}
