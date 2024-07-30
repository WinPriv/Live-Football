package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static p f19577a;

    /* renamed from: b, reason: collision with root package name */
    private final p f19578b;

    public y(p pVar) {
        this.f19578b = pVar;
        if (!pVar.e()) {
            f19577a = pVar;
            a("SDK Session Begin");
            AppLovinBroadcastManager.registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.y.1
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Intent intent, Map<String, Object> map) {
                    y.this.a("SDK Session End");
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        c(str, str2, null);
    }

    public static void j(String str, String str2) {
        f(str, str2);
    }

    public void b(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void c(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
        lVar.a().a(str).a();
        f("AppLovinSdk", lVar.toString());
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void b(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void a(String str, String str2) {
        if (a(this.f19578b)) {
            a(str, str2, false);
        }
    }

    private void a(String str, String str2, boolean z10) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f19578b.a(com.applovin.impl.sdk.c.b.ar)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + intValue) - 1) / intValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * intValue;
                int min = Math.min(length, i12 + intValue);
                if (z10) {
                    Log.d(str, str2.substring(i12, min));
                } else {
                    b(str, str2.substring(i12, min));
                }
            }
        }
    }

    public void a(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static boolean a() {
        p pVar = f19577a;
        return pVar == null || a(pVar);
    }

    public static boolean a(p pVar) {
        return pVar != null && pVar.N().d();
    }
}
