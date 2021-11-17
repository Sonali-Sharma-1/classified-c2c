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

    private val hashMap = HashMap<String, String>()

    override fun setViewBinding(): FragmentSignupBinding {
        return FragmentSignupBinding.inflate(layoutInflater)
    }

    override fun observeView() {
        super.observeView()
    }

    override fun setUpViews() {
        super.setUpViews()
        setUpClickableLoginText()
        mockDataForSignup()
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

        if (hashMap.containsKey(email.text.toString()) && hashMap.containsValue(pass.text.toString())) {
            findNavController().navigate(R.id.action_signup_to_login)
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