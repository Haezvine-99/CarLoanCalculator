package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener() {
            calLoan()
        }

        reset.setOnClickListener() {
            reset()
        }

    }
        public fun calLoan() {
            val carPrice: Double = txtPrice.text.toString().toDouble()
            val downPayment: Double = monthlyPayment.text.toString().toDouble()
            val loan: Double = loan.text.toString().toDouble()
            val interestRate: Double = interest.text.toString().toDouble()

            val carLoan: Double = carPrice - downPayment
            val interest: Double = loan * interestRate * loan
            val dwnPayment = (carLoan + interestRate) / loan / 12//..

            txtLoanperiod.text = "RM %.2f".format(carLoan)
            txtInterestRate.text = "RM %.2f".format(interest)
            txtMonthlyPayment.text = "RM %.2f".format(dwnPayment)
        }

    public fun reset(){
        txtPrice.setText("")
        monthlyPayment.setText("")
        loan.setText("")
        interest.setText("")

        txtLoanperiod.text = ""
        txtInterestRate.text = ""
        txtMonthlyPayment.text = ""
    }
}
