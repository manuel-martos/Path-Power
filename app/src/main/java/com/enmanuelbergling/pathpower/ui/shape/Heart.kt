package com.enmanuelbergling.pathpower.ui.shape

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

data object Heart : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline {
        val pathData =
            "m29.785,18.838c2.199,-3.074 2.215,-4.667 2.215,-7.16 0,-3.84 -3.504,-8.679 -8.432,-8.679s-7.568,2.901 -7.568,2.901 -2.641,-2.901 -7.568,-2.901c-4.928,0 -8.432,4.839 -8.432,8.679 0,3.84 1.832,7.627 5.127,10.442 3.295,2.815 5.498,4.498 7.873,5.951 2.375,1.453 2.95,1.935 3,1.929 0,0 1.819,-1.112 3,-1.929 1.181,-0.817 2.539,-1.768 2.539,-1.768s6.047,-4.391 8.245,-7.465z"
        val scaleX = size.width / 32f
        val scaleY = size.height / 32f

        return Outline.Generic(
            PathParser().parsePathString(
                resize(
                    pathData,
                    scaleX,
                    scaleY
                )
            ).toPath()
        )
    }
}