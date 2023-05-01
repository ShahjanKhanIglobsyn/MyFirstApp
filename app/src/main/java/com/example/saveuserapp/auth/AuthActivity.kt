package com.example.saveuserapp.auth

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.saveuserapp.MainActivity
import com.example.saveuserapp.application.MyApp
import com.example.saveuserapp.databinding.ActivityAuthBinding
import com.example.saveuserapp.localdatabase.modal.UserDetails
import com.example.saveuserapp.networkcall.NetworkClass
import com.example.saveuserapp.viewmodal.AuthViewModalProvider
import com.example.saveuserapp.viewmodal.AuthViewModel
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    @Inject
    lateinit var viewModel: AuthViewModel

    @Inject
    lateinit var autFactory : AuthViewModalProvider
//    lateinit var appCom : AppComponent
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        appCom = DaggerAppComponent.factory().create(this)
//        appCom.inject(this)

        (application as MyApp).myAppCom.inject(this)


        binding.btnLogin.setOnClickListener {
           val user_type = binding.edtSide.text.toString().trim()
            val username = binding.edtEmail.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()
            viewModel.getLogin(user_type,username,password)
            viewModel.addUser(UserDetails(user_type,username,password))
        }

        viewModals()
    }

    private fun viewModals() {
        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Please Wait....")
        viewModel = ViewModelProvider(this, autFactory)[AuthViewModel::class.java]
        viewModel.isAthDone.observe(this, Observer {
            progressDialog.hide()
            when(it){

                is NetworkClass.IsLoading ->{
                    progressDialog.show()
                }

                is NetworkClass.OnSuccess ->{
                    if (it.data?.code == 1){
                        Toast.makeText(applicationContext, it.data.data.serverToken, Toast.LENGTH_SHORT).show()

                        startActivity(Intent(this, MainActivity::class.java))

                    } else if(it.data?.code == 0){

                        Toast.makeText(applicationContext, it.data.message, Toast.LENGTH_SHORT).show()
                    }
                }

                is NetworkClass.OnFailure ->{

                        Toast.makeText(applicationContext, "Not Working...", Toast.LENGTH_SHORT).show()

                }
            }
        })
    }
}