package com.firsttimeinforever.intellij.pdf.viewer.ui.editor.panel.jcef.messages

import kotlinx.serialization.Serializable

@Serializable
data class PageChangeMessage(val pageNumber: Int)