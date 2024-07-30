package com.onesignal;

import com.google.android.gms.common.Scopes;
import com.onesignal.b4;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateEmailSynchronizer.java */
/* loaded from: classes2.dex */
public final class s4 extends y4 {
    public s4() {
        super(b4.b.EMAIL);
    }

    @Override // com.onesignal.z4
    public final void C(String str) {
        n0 n0Var;
        boolean z10;
        e3.L(str);
        if (e3.f26748b == null) {
            n0Var = null;
        } else {
            if (e3.f26749b0 == null) {
                n0 n0Var2 = new n0();
                e3.f26749b0 = n0Var2;
                n0Var2.f26933s.f26728b.add(new OSEmailSubscriptionChangedInternalObserver());
            }
            n0Var = e3.f26749b0;
        }
        if (str != null ? !str.equals(n0Var.f26934t) : n0Var.f26934t != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0Var.f26934t = str;
        if (z10) {
            n0Var.f26933s.a(n0Var);
        }
        try {
            b4.g(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.onesignal.y4
    public final void E() {
        ArrayList arrayList = e3.f26746a;
    }

    @Override // com.onesignal.y4
    public final void F() {
        ArrayList arrayList = e3.f26746a;
    }

    @Override // com.onesignal.y4
    public final String G() {
        return "email_auth_hash";
    }

    @Override // com.onesignal.y4
    public final String H() {
        return Scopes.EMAIL;
    }

    @Override // com.onesignal.y4
    public final int I() {
        return 11;
    }

    @Override // com.onesignal.z4
    public final String k() {
        return e3.l();
    }

    @Override // com.onesignal.z4
    public final q4 s(String str) {
        return new r4(str, true);
    }
}
