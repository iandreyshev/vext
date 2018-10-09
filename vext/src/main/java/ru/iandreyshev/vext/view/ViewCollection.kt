package ru.iandreyshev.vext.view

import android.view.View

fun visibleAll(vararg views: View) =
        views.forEach { it.visible() }

fun visibleAll(views: List<View>) =
        views.forEach { it.visible() }

fun goneAll(vararg views: View) =
        views.forEach { it.gone() }

fun goneAll(views: List<View>) =
        views.forEach { it.gone() }

fun invisibleAll(vararg views: View) =
        views.forEach { it.invalidate() }

fun invisibleAll(views: List<View>) =
        views.forEach { it.invisible() }
