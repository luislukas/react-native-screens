package com.swmansion.rnscreens.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.facebook.react.ReactApplication
import com.facebook.react.ReactDelegate
import com.facebook.react.ReactNativeHost
import com.swmansion.rnscreens.example.R

class ReactFragment : Fragment(R.layout.splash_fragment) {

    private var mReactDelegate: ReactDelegate? = null

    private var isAppLoaded: Boolean = false
    private fun getReactNativeHost(): ReactNativeHost? {
        return (activity?.application as ReactApplication).reactNativeHost
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mReactDelegate = ReactDelegate(
            activity,
            getReactNativeHost(),
            "ScreensExample",
            requireActivity().intent.extras
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!isAppLoaded) {
            isAppLoaded = true
            mReactDelegate?.loadApp()
        }
        return mReactDelegate?.reactRootView
    }

    override fun onResume() {
        super.onResume()
        mReactDelegate?.onHostResume()
    }

    override fun onPause() {
        super.onPause()
        mReactDelegate?.onHostPause()
    }

    override fun onDestroy() {
        mReactDelegate?.onHostDestroy()
        mReactDelegate = null
        super.onDestroy()
    }

}
