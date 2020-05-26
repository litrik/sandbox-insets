package be.norio.sandbox.insets

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.menu.*

class MenuFragment : Fragment(R.layout.menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().window.apply {
            statusBarColor = ContextCompat.getColor(context, R.color.colorPrimary)
            decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        lightButton.setOnClickListener { findNavController().navigate(R.id.lightFragment) }
        darkButton.setOnClickListener { findNavController().navigate(R.id.darkFragment) }
    }
}