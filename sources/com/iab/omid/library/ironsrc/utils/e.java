package com.iab.omid.library.ironsrc.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static OutputDeviceStatus f24428a = OutputDeviceStatus.UNKNOWN;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    OutputDeviceStatus unused = e.f24428a = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    OutputDeviceStatus unused2 = e.f24428a = OutputDeviceStatus.UNKNOWN;
                }
            }
        }
    }

    public static OutputDeviceStatus a() {
        return com.iab.omid.library.ironsrc.utils.a.a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f24428a;
    }

    public static void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
