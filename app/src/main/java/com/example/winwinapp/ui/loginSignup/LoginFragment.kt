package com.example.winwinapp.ui.loginSignup

import com.example.winwinapp.databinding.FragmentLoginBinding
import com.example.winwinapp.ui.launchHome

class LoginFragment : LoginSignupBaseFragment<FragmentLoginBinding>() {

    override fun setViewBinding(): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(layoutInflater)
    }

    override fun observeView() {
        super.observeView()
    }


    override fun setUpViews() {
        super.setUpViews()
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnLogin.setOnClickListener {
            context?.let { it1 -> launchHome(it1) }
        }
    }
}