package com.impression.savealife.dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment
import com.impression.savealife.R
import com.impression.savealife.activities.WelcomeActivity
import com.impression.savealife.models.Cst

class LogoutDialog() : AppCompatDialogFragment() {

    private var mContext: Context? = null

    constructor(context: Context) : this() {
        mContext = context
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialogBuilder = AlertDialog.Builder(activity!!)
        dialogBuilder.setTitle(getText(R.string.dialog_logout_title))
            .setMessage(getText(R.string.dialog_logout_message))
            .setNegativeButton(getText(R.string.cancel)) { dialog, which -> }
            .setPositiveButton(getText(R.string.yes)) { dialog, which ->
                Cst.logout(context!!.applicationContext)
                startActivity(Intent(context!!.applicationContext, WelcomeActivity::class.java))
                (mContext as Activity).finish()
            }

        return dialogBuilder.create()
    }

}
