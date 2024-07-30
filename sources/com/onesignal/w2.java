package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: OSTaskRemoteController.java */
/* loaded from: classes2.dex */
public final class w2 extends v2 {
    public static final HashSet<String> f = new HashSet<>(Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));

    /* renamed from: e, reason: collision with root package name */
    public final o2 f27182e;

    public w2(o2 o2Var, c3 c3Var) {
        super(c3Var);
        this.f27182e = o2Var;
    }

    public final boolean d(String str) {
        boolean z10;
        if (this.f27182e.f26958a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && f.contains(str)) {
            return true;
        }
        return false;
    }
}
