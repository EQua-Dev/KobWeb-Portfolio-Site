package com.awesomnessstudios.web.styles

import com.awesomnessstudios.web.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

//this is the component to handle the color change of the navigation menu items when hovered over
val NavigationItemStyle by ComponentStyle {
    base{
       Modifier.color(Theme.Secondary.rgb)
           .transition(CSSTransition(property = "color", duration = 200.ms))// handle the animation delay of the color change
    }
    anyLink{
        Modifier.color(Theme.Secondary.rgb)
    }
    hover{
        Modifier.color(Theme.Primary.rgb)
    }
}

val LogoStyle by ComponentStyle {
    base{
        Modifier.transform { rotate(0.deg) }
            .transition(CSSTransition(property = "transform", duration = 200.ms))// handle the animation delay of the color change
    }
    hover{
        Modifier.transform { rotate((-10).deg) }
    }
}