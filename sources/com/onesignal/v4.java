package com.onesignal;

import com.google.android.gms.common.Scopes;
import com.onesignal.b4;
import com.onesignal.e3;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: UserStatePushSynchronizer.java */
/* loaded from: classes2.dex */
public final class v4 extends z4 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f27153m;

    public v4() {
        super(b4.b.PUSH);
    }

    @Override // com.onesignal.z4
    public final void C(String str) {
        boolean z10;
        e3.f26759h = str;
        if (e3.f26748b != null) {
            r3.h(e3.f26759h, r3.f27010a, "GT_PLAYER_ID");
        }
        e3.z();
        OSSubscriptionState k10 = e3.k(e3.f26748b);
        if (str != null ? !str.equals(k10.f26617t) : k10.f26617t != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k10.f26617t = str;
        if (z10) {
            k10.f26616s.a(k10);
        }
        e3.p pVar = e3.f26760h0;
        if (pVar != null) {
            e3.N(pVar.f26793a, pVar.f26794b, pVar.f26795c);
            e3.f26760h0 = null;
        }
        b4.a().x();
        b4.c().x();
    }

    @Override // com.onesignal.z4
    public final void h(JSONObject jSONObject) {
        if (jSONObject.has(Scopes.EMAIL)) {
            ArrayList arrayList = e3.f26746a;
        }
        if (jSONObject.has("sms_number")) {
            ArrayList arrayList2 = e3.f26746a;
        }
    }

    @Override // com.onesignal.z4
    public final String k() {
        return e3.s();
    }

    @Override // com.onesignal.z4
    public final int l() {
        return 3;
    }

    @Override // com.onesignal.z4
    public final q4 s(String str) {
        return new t4(str, true);
    }

    @Override // com.onesignal.z4
    public final void x() {
        m(0).a();
    }

    @Override // com.onesignal.z4
    public final void e(JSONObject jSONObject) {
    }

    @Override // com.onesignal.z4
    public final void t(JSONObject jSONObject) {
    }
}
