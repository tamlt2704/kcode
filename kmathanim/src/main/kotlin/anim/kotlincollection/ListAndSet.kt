package anim.kotlincollection

import com.jmathanim.Utils.Vec
import com.jmathanim.mathobjects.Point

class ListAndSet: Abstractscene() {
    override fun runSketch() {
        val p = Point.at(0.0, 0.0)
        play.shift(2.0, Vec.to(1.0, 0.0), p)
        waitSeconds(3.0)
    }
}