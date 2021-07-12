package com.jquiroga.movies.features.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.jquiroga.movies.BuildConfig
import com.jquiroga.movies.R
import com.jquiroga.movies.core.platform.BaseFragment
import com.jquiroga.movies.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment() {

    private var _viewBinding: FragmentLoginBinding? = null

    private val viewBinding get() = _viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentLoginBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun initListeners() {
        viewBinding.buttonLogin.setOnClickListener {
            val user = viewBinding.textInputEditTextUser.text.toString()
            val password = viewBinding.textInputEditTextPassword.text.toString()

            if (user == getString(R.string.test_user_id) && password == getString(R.string.test_user_password)) {
                findNavController().navigate(R.id.action_loginFragment_to_popularMoviesFragment)
            } else {
                showAlert()
            }
        }
    }

    private fun showAlert() {
        Snackbar.make(
            viewBinding.root,
            getString(R.string.incorrect_user_or_password),
            Snackbar.LENGTH_SHORT
        ).show()
    }

}