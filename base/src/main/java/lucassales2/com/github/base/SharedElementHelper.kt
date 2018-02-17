package lucassales2.com.github.base

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.app.FragmentTransaction
import android.support.v4.util.Pair
import android.view.View
import java.lang.ref.WeakReference

class SharedElementHelper {
    private val sharedElementViews = mutableMapOf<WeakReference<View>, String?>()

    fun addSharedElement(view: View, name: String? = null) {
        sharedElementViews.put(WeakReference(view), name ?: view.transitionName)
    }

    fun applyToTransaction(tx: FragmentTransaction) {
        for ((viewRef, customTransitionName) in sharedElementViews) {
            viewRef.get()?.apply {
                tx.addSharedElement(this, customTransitionName)
            }
        }
    }

    fun applyToIntent(activity: Activity): Bundle? {
        return ActivityOptionsCompat.makeSceneTransitionAnimation(
                activity,
                *sharedElementViews.map { Pair(it.key.get(), it.value) }.toList().toTypedArray()
        ).toBundle()
    }

    fun isEmpty(): Boolean = sharedElementViews.isEmpty()
}
