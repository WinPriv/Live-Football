package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.onesignal.d4;
import com.onesignal.e3;
import java.io.IOException;

/* compiled from: PushRegistratorAbstractGoogle.java */
/* loaded from: classes2.dex */
public abstract class h4 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    public d4.a f26850a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f26851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26852c;

    public static int c(Throwable th) {
        Throwable th2 = th;
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        String message = th2.getMessage();
        if (th instanceof IOException) {
            if ("SERVICE_NOT_AVAILABLE".equals(message)) {
                return -9;
            }
            if ("AUTHENTICATION_FAILED".equals(message)) {
                return -29;
            }
            return -11;
        }
        return -12;
    }

    @Override // com.onesignal.d4
    public final void a(Context context, String str, e3.k kVar) {
        boolean z10;
        this.f26850a = kVar;
        boolean z11 = false;
        boolean z12 = true;
        try {
            Float.parseFloat(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (!z10) {
            e3.b(3, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null);
            kVar.a(-6, null);
            z12 = false;
        }
        if (z12) {
            try {
                try {
                    z11 = e3.f26748b.getPackageManager().getPackageInfo("com.google.android.gms", 128).applicationInfo.enabled;
                } catch (Throwable th) {
                    e3.b(3, "Could not register with FCM due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                    ((e3.k) this.f26850a).a(-8, null);
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (z11) {
                synchronized (this) {
                    Thread thread = this.f26851b;
                    if (thread == null || !thread.isAlive()) {
                        Thread thread2 = new Thread(new g4(this, str));
                        this.f26851b = thread2;
                        thread2.start();
                        return;
                    }
                    return;
                }
            }
            q.a();
            e3.b(3, "'Google Play services' app not installed or disabled on the device.", null);
            ((e3.k) this.f26850a).a(-7, null);
        }
    }

    public abstract String b(String str) throws Throwable;
}
