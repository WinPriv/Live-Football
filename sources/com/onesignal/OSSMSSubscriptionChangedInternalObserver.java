package com.onesignal;

/* loaded from: classes2.dex */
class OSSMSSubscriptionChangedInternalObserver {
    public void changed(p2 p2Var) {
        m4 m4Var = new m4(e3.f26756f0, (p2) p2Var.clone(), 3);
        if (e3.f26758g0 == null) {
            e3.f26758g0 = new d2<>("onSMSSubscriptionChanged", true);
        }
        if (e3.f26758g0.a(m4Var)) {
            p2 p2Var2 = (p2) p2Var.clone();
            e3.f26756f0 = p2Var2;
            p2Var2.getClass();
            String str = r3.f27010a;
            r3.h(p2Var2.f26970t, str, "PREFS_OS_SMS_ID_LAST");
            r3.h(p2Var2.f26971u, str, "PREFS_OS_SMS_NUMBER_LAST");
        }
    }
}
