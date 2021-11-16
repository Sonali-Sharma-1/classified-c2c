package com.example.winwinapp.ui.loginSignup

import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.winwinapp.R
import com.example.winwinapp.data.dataclasses.LoginResponse
import com.example.winwinapp.data.dataclasses.SignUpBody
import com.example.winwinapp.data.dataclasses.UserResponse
import com.example.winwinapp.databinding.FragmentSignupBinding
import com.example.winwinapp.network.ApiService
import com.example.winwinapp.network.RetrofitInstance
import com.squareup.okhttp.Callback
import com.squareup.okhttp.Response
import okhttp3.Call
import okhttp3.ResponseBody




class SignupFragment : LoginSignupBaseFragment<FragmentSignupBinding>() {

    override fun setViewBinding(): FragmentSignupBinding {
        return FragmentSignupBinding.inflate(layoutInflater)
    }

    override fun observeView() {
        super.observeView()
    }

    override fun setUpViews() {
        super.setUpViews()
        setUpClickableLoginText()

        binding.btnSignup.setOnClickListener {
            submitLogin()
        }
    }

    private fun setUpClickableLoginText() {
        val loginText = getString(R.string.signup_login_text)
        val ss = SpannableString(loginText)

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                findNavController().navigate(R.id.action_signup_to_login)
            }
        }

        ss.setSpan(clickableSpan, 25, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.signupLoginTextView.apply {
            text = ss
            movementMethod = LinkMovementMethod.getInstance()
        }
    }

    private fun submitLogin() {
        val email = binding.signupEmailEditText
        val pass = binding.signupPasswordEditText
        val confirmPass = binding.signupCnfPasswordEditText

        val retrofitInstance = RetrofitInstance.getRetrofitInstance().create(ApiService::class.java)
        val registerInfo = SignUpBody(email.toString(), pass.toString(), confirmPass.toString())

//        retrofitInstance.registerUser(registerInfo).enqueue(object : Callback<LoginResponse>{
//            onFail
//        })

    }



}