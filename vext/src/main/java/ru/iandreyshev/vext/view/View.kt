package ru.iandreyshev.vext.view

import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.visibleIf(isVisible: Boolean) {
    if (isVisible) {
        visible()
    }
}

fun View.goneIf(isGone: Boolean) {
    if (isGone) {
        gone()
    }
}

fun View.invisibleIf(isInvisible: Boolean) {
    if (isInvisible) {
        invisible()
    }
}

fun View.visibleIfOrGone(isVisible: Boolean) {
    if (isVisible) {
        visible()
    } else {
        gone()
    }
}

fun View.goneIfOrVisible(isGone: Boolean) {
    if (isGone) {
        gone()
    } else {
        visible()
    }
}
