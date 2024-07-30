package com.onesignal;

import org.json.JSONException;

/* compiled from: OneSignal.java */
/* loaded from: classes2.dex */
public final class d3 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            e3.c();
        } catch (JSONException e10) {
            e3.b(2, "FATAL Error registering device!", e10);
        }
    }
}
