package com.onesignal;

/* loaded from: classes2.dex */
class OSEmailSubscriptionChangedInternalObserver {
    public void changed(n0 n0Var) {
        m4 m4Var = new m4(e3.f26751c0, (n0) n0Var.clone(), 2);
        if (e3.f26753d0 == null) {
            e3.f26753d0 = new d2<>("onOSEmailSubscriptionChanged", true);
        }
        if (e3.f26753d0.a(m4Var)) {
            n0 n0Var2 = (n0) n0Var.clone();
            e3.f26751c0 = n0Var2;
            n0Var2.getClass();
            String str = r3.f27010a;
            r3.h(n0Var2.f26934t, str, "PREFS_ONESIGNAL_EMAIL_ID_LAST");
            r3.h(n0Var2.f26935u, str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST");
        }
    }
}
