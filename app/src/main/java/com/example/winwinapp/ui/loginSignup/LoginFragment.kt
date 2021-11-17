package com.example.winwinapp.ui.loginSignup

import androidx.navigation.fragment.findNavController
import com.example.winwinapp.R
import com.example.winwinapp.databinding.FragmentLoginBinding
import com.example.winwinapp.ui.launchHome

class LoginFragment : LoginSignupBaseFragment<FragmentLoginBinding>() {

    private val hashMap = HashMap<String, String>()

    override fun setViewBinding(): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(layoutInflater)
    }

    override fun observeView() {
        super.observeView()
    }


    override fun setUpViews() {
        super.setUpViews()
        setClickListener()
        mockDataForSignup()
    }

    private fun setClickListener() {
        binding.btnLogin.setOnClickListener {
            submitLogin()
        }
    }

    private fun submitLogin() {
        val email = binding.loginEmailEditText
        val pass = binding.loginPasswordEditText


        if (hashMap.containsKey(email.text.toString()) && hashMap.containsValue(pass.text.toString())) {
            context?.let { it1 -> launchHome(it1) }
        }
    }

    private fun mockDataForSignup() {
        hashMap["sonali@gmail.com"] = "lit"
        hashMap["james@gmail.com"] = "xyz@123"
        hashMap["akshay@gmail.com"] = "dummy@123"
        hashMap["samuel@gmail.com"] = "mock@123"
        println(hashMap)
    }
}