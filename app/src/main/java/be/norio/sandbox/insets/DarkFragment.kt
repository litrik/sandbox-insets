package be.norio.sandbox.insets

import android.graphics.Color
import android.view.View
import androidx.fragment.app.Fragment

class DarkFragment : Fragment(R.layout.dark) {

    override fun onResume() {
        super.onResume()
        requireActivity().window.apply {
            statusBarColor = Color.TRANSPARENT
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
    }

}