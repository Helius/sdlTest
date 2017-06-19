package com.ghelius.sdl.test.sdltest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.smartdevicelink.transport.*;
import com.smartdevicelink.transport.SdlRouterService;

public class SdlReceiver extends SdlBroadcastReceiver {

    public SdlReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        //your code here
    }

    @Override
    public Class<? extends SdlRouterService> defineLocalSdlRouterClass() {
        return com.ghelius.sdl.test.sdltest.SdlRouterService.class;
    }

    @Override
    public void onSdlEnabled(Context context, Intent intent) {
        //Use the provided intent but set the class to the SdlService
        intent.setClass(context, SdlService.class);
        context.startService(intent);
    }
}
