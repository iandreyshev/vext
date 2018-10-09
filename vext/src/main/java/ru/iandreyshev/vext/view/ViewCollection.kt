package ru.iandreyshev.vext.view

import android.view.View

fun visibleAll(vararg views: View) =
        views.forEach { it.visible() }

fun List<View>.visibleAll() =
        forEach { it.visible() }

fun goneAll(vararg views: View) =
        views.forEach { it.gone() }

fun List<View>.goneAll() =
        forEach { it.gone() }

fun invisibleAll(vararg views: View) =
        views.forEach { it.invalidate() }

fun List<View>.invisibleAll() =
        forEach { it.invisible() }
