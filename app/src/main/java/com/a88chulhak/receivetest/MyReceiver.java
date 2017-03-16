package com.a88chulhak.receivetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "문자메세지가 왔다 확인해라 ~~~", Toast.LENGTH_LONG).show();

    }
}
