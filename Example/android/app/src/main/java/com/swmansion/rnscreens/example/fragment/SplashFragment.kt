package com.swmansion.rnscreens.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.swmansion.rnscreens.example.R

class SplashFragment : Fragment(R.layout.splash_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MainReactActivity", "onViewCreated()")
        view.postDelayed(
            { findNavController().navigate(R.id.action_splashFragment_to_reactFragment) },
            2000
        )
    }
}
