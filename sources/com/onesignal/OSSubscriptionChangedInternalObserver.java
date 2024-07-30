package com.onesignal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        f1.f fVar = new f1.f(e3.Z, (OSSubscriptionState) oSSubscriptionState.clone());
        if (e3.f26747a0 == null) {
            e3.f26747a0 = new d2<>("onOSSubscriptionChanged", true);
        }
        if (e3.f26747a0.a(fVar)) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            e3.Z = oSSubscriptionState2;
            oSSubscriptionState2.getClass();
            String str = r3.f27010a;
            r3.i(str, "ONESIGNAL_SUBSCRIPTION_LAST", oSSubscriptionState2.f26620w);
            r3.h(oSSubscriptionState2.f26617t, str, "ONESIGNAL_PLAYER_ID_LAST");
            r3.h(oSSubscriptionState2.f26618u, str, "ONESIGNAL_PUSH_TOKEN_LAST");
            r3.i(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", oSSubscriptionState2.f26619v);
        }
    }
}
