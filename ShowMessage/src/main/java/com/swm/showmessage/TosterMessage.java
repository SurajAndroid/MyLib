package com.swm.showmessage;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ankit Silhare on 18,September,2020
 */
class TosterMessage {

    public static void ShowMsg(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
