package com.example.android.sports

import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.slidingpanelayout.widget.SlidingPaneLayout

class SportsListOnBackPressedCallback(
    private val slidingPaneLayout: SlidingPaneLayout
): OnBackPressedCallback(slidingPaneLayout.isSlideable && slidingPaneLayout.isOpen),
SlidingPaneLayout.PanelSlideListener{

    override fun handleOnBackPressed() {
        slidingPaneLayout.closePane()
    }

    override fun onPanelSlide(panel: View, slideOffset: Float) {
    }

    override fun onPanelOpened(panel: View) {
        isEnabled = true
    }

    override fun onPanelClosed(panel: View) {
        isEnabled = false
    }

    init {
        slidingPaneLayout.addPanelSlideListener(this)
    }
}