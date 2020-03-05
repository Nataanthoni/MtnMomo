package com.killasites.mtnmomo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.pedant.SweetAlert.SweetAlertDialog
import java.util.*


class PayNow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_now)

        val uuid: UUID = UUID.randomUUID()
        val randomUUIDString: String = uuid.toString()

        SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
            .setTitleText(randomUUIDString)
                
            .show()
    }
}
