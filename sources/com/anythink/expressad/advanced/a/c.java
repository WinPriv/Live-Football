package com.anythink.expressad.advanced.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6770a = "c";

    /* renamed from: b, reason: collision with root package name */
    private WebView f6771b;

    /* renamed from: c, reason: collision with root package name */
    private int f6772c;

    public c(WebView webView) {
        this.f6771b = webView;
    }

    public final void a() {
        this.f6771b = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f6771b, 0);
                return;
            }
            if (com.anythink.expressad.foundation.g.a.bW) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    a(this.f6771b, 0);
                    return;
                }
                if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                    if (activeNetworkInfo.getType() == 1) {
                        a(this.f6771b, 9);
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        a(this.f6771b, 0);
                        return;
                    }
                    int networkType = telephonyManager.getNetworkType();
                    this.f6772c = networkType;
                    int a10 = k.a(networkType);
                    this.f6772c = a10;
                    a(this.f6771b, a10);
                    return;
                }
                return;
            }
            a(this.f6771b, 0);
        } catch (Throwable th) {
            o.a(f6770a, th.getMessage());
        }
    }

    private static void a(WebView webView, int i10) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f6923m, i10);
                j.a();
                j.a(webView, NativeAdvancedJsUtils.f6922l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                o.a(f6770a, th.getMessage());
            }
        }
    }
}
