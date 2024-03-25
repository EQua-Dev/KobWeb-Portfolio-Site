package com.awesomnessstudios.web.components

import androidx.compose.runtime.Composable
import com.awesomnessstudios.web.styles.SocialLinksStyle
import com.awesomnessstudios.web.util.Constants.FACE_BOOK
import com.awesomnessstudios.web.util.Constants.GITHUB
import com.awesomnessstudios.web.util.Constants.LINKED_IN
import com.awesomnessstudios.web.util.Constants.TWITTER
import com.awesomnessstudios.web.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.khronos.webgl.ArrayBuffer

@Composable
fun SocialBar() {
    Column(
        modifier = Modifier.margin(right = 25.px)
            .padding(topBottom = 25.px)
            .minWidth(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialLinks();
    }
}

@Composable
fun SocialLinks() {
    Link(
        path = FACE_BOOK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        Image(
            modifier = SocialLinksStyle.toModifier()
                .margin(bottom = 40.px)
                .size(24.px)
                .onClick {
                    //onMenuClicked()
                },
            src = Res.Image.facebook,
            description = "Facebook"
        )
    }
    Link(
        path = TWITTER,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        Image(
            modifier = SocialLinksStyle.toModifier()
                .margin(bottom = 40.px)
                .size(24.px)
                .onClick {
                    //onMenuClicked()
                },
            src = Res.Image.twitter,
            description = "Twitter"
        )
    }
    Link(
        path = LINKED_IN,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        Image(
            modifier = SocialLinksStyle.toModifier()
                .margin(bottom = 40.px)
                .size(24.px)
                .onClick {
                    //onMenuClicked()
                },
            src = Res.Image.linkedin,
            description = "LinkedIn"
        )
    }
    Link(
        path = GITHUB,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        Image(
            modifier = SocialLinksStyle.toModifier()
                .margin(bottom = 25.px)
                .size(24.px)
                .onClick {
                    //onMenuClicked()
                },
            src = Res.Image.github,
            description = "Github"
        )
    }
}