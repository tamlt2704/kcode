package anim.kotlincollection

import com.jmathanim.jmathanim.Scene2D

open class Abstractscene : Scene2D() {
    override fun setupSketch() {
        config.parseFile("#dark.xml")
        config.setCreateMovie(true)
        config.setLowQuality()
    }

    override fun runSketch() {
        TODO("Not yet implemented")
    }
}