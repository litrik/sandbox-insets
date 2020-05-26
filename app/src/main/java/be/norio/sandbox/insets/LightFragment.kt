package be.norio.sandbox.insets

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class LightFragment : Fragment(R.layout.light) {

    override fun onResume() {
        super.onResume()
        requireActivity().window.apply {
            statusBarColor = Color.TRANSPARENT
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }

}
