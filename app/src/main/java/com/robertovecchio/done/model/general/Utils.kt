package com.robertovecchio.done.model.general

import android.support.v4.app.Fragment
import android.view.View
import android.view.ViewGroup

fun <T> T?.or(default: T): T = this ?: default
fun <T> T?.or(compute: () -> T): T = this ?: compute()

fun Fragment.isSectionVisible(): Boolean = (((view?.parent as? ViewGroup)?.parent as? ViewGroup)?.visibility == View.VISIBLE)