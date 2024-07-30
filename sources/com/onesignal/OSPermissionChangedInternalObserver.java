package com.onesignal;

import android.content.Context;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class OSPermissionChangedInternalObserver {
    public static void a(m2 m2Var) {
        if (!m2Var.f26924t) {
            Context context = e3.f26748b;
            if (h.a(context)) {
                try {
                    fc.c.a(0, context);
                } catch (fc.b unused) {
                }
            }
        }
        e3.f26776x.getClass();
        boolean z10 = true;
        if (r3.b(r3.f27010a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true)) {
            z10 = OSUtils.a();
        }
        v4 b10 = b4.b();
        b10.getClass();
        try {
            q4 p10 = b10.p();
            Boolean valueOf = Boolean.valueOf(z10);
            p10.getClass();
            synchronized (q4.f26990d) {
                p10.f26993b.put("androidPermission", valueOf);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void changed(m2 m2Var) {
        a(m2Var);
        a4.l lVar = new a4.l(3, e3.W, (m2) m2Var.clone());
        if (e3.X == null) {
            e3.X = new d2<>("onOSPermissionChanged", true);
        }
        if (e3.X.a(lVar)) {
            m2 m2Var2 = (m2) m2Var.clone();
            e3.W = m2Var2;
            m2Var2.getClass();
            r3.i(r3.f27010a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", m2Var2.f26924t);
        }
    }
}
