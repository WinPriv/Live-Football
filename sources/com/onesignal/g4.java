package com.onesignal;

import com.onesignal.e3;
import java.io.IOException;

/* compiled from: PushRegistratorAbstractGoogle.java */
/* loaded from: classes2.dex */
public final class g4 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f26836s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h4 f26837t;

    public g4(h4 h4Var, String str) {
        this.f26837t = h4Var;
        this.f26836s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = 0;
        while (i10 < 5) {
            String str = this.f26836s;
            h4 h4Var = this.f26837t;
            h4Var.getClass();
            boolean z11 = true;
            try {
                String b10 = h4Var.b(str);
                e3.b(5, "Device registered, push token = " + b10, null);
                ((e3.k) h4Var.f26850a).a(1, b10);
            } catch (IOException e10) {
                int c10 = h4.c(e10);
                Throwable th = e10;
                while (th.getCause() != null && th.getCause() != th) {
                    th = th.getCause();
                }
                String message = th.getMessage();
                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"AUTHENTICATION_FAILED".equals(message)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Exception exc = new Exception(e10);
                    if (i10 >= 4) {
                        e3.b(3, "Retry count of 5 exceed! Could not get a FCM Token.", exc);
                    } else {
                        e3.b(5, "'Google Play services' returned " + message + " error. Current retry count: " + i10, exc);
                        if (i10 == 2) {
                            ((e3.k) h4Var.f26850a).a(c10, null);
                            h4Var.f26852c = true;
                        }
                    }
                    z11 = false;
                } else {
                    e3.b(3, "Error Getting FCM Token", new Exception(e10));
                    if (!h4Var.f26852c) {
                        ((e3.k) h4Var.f26850a).a(c10, null);
                    }
                }
            } catch (Throwable th2) {
                Exception exc2 = new Exception(th2);
                int c11 = h4.c(th2);
                e3.b(3, "Unknown error getting FCM Token", exc2);
                ((e3.k) h4Var.f26850a).a(c11, null);
            }
            if (z11) {
                return;
            }
            i10++;
            try {
                Thread.sleep(i10 * 10000);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
    }
}
