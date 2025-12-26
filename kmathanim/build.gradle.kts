import com.jmathanim.Utils.Vec
import com.jmathanim.jmathanim.Scene2D
import com.jmathanim.mathobjects.Point
import com.jmathanim.mathobjects.Text.LaTeXMathObject

class MovingDot : Scene2D() {
    override fun setupSketch() {
        config.parseFile("#dark.xml")
        config.setCreateMovie(true)
        config.setLowQuality()
    }

    override fun runSketch() {
        val p = Point.at(0.0, 0.0)
        play.shift(2.0, Vec.to(1.0, 0.0), p)
        waitSeconds(3.0)

        val text = LaTeXMathObject.make("Look mom, I'm \\LaTeX!")
        add(text)
        waitSeconds(5.0)
    }
}

fun main() {
    MovingDot().execute()
}