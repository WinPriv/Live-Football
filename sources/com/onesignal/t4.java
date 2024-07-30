package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStatePush.java */
/* loaded from: classes2.dex */
public final class t4 extends q4 {
    public t4(String str, boolean z10) {
        super(str, z10);
    }

    @Override // com.onesignal.q4
    public final void a() {
        try {
            int i10 = 1;
            int optInt = ((JSONObject) c().f27251t).optInt("subscribableStatus", 1);
            if (optInt < -2) {
                i10 = optInt;
            } else if (!((JSONObject) c().f27251t).optBoolean("androidPermission", true)) {
                i10 = 0;
            } else if (!((JSONObject) c().f27251t).optBoolean("userSubscribePref", true)) {
                i10 = -2;
            }
            Integer valueOf = Integer.valueOf(i10);
            synchronized (q4.f26990d) {
                this.f26994c.put("notification_types", valueOf);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.onesignal.q4
    public final q4 g() {
        return new t4("TOSYNC_STATE", false);
    }
}
