package mate.academy

import kotlin.math.ceil

const val CENTER = 100.00
fun getCentury(year: Int) : Int {
    return ceil( year / CENTER).toInt();
}
