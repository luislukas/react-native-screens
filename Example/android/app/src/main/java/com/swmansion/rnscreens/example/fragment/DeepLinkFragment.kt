package com.swmansion.rnscreens.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.swmansion.rnscreens.example.R

class DeepLinkFragment : Fragment(R.layout.splash_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MainReactActivity", "onViewCreated()")
        view.postDelayed(
            {
                findNavController().popBackStack()
            },
            2000
        )
    }
}
