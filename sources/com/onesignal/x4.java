package com.onesignal;

import com.onesignal.b4;
import java.util.ArrayList;

/* compiled from: UserStateSMSSynchronizer.java */
/* loaded from: classes2.dex */
public final class x4 extends y4 {
    public x4() {
        super(b4.b.SMS);
    }

    @Override // com.onesignal.z4
    public final void C(String str) {
        p2 p2Var;
        boolean z10;
        e3.M(str);
        if (e3.f26748b == null) {
            p2Var = null;
        } else {
            if (e3.f26755e0 == null) {
                p2 p2Var2 = new p2();
                e3.f26755e0 = p2Var2;
                p2Var2.f26969s.f26728b.add(new OSSMSSubscriptionChangedInternalObserver());
            }
            p2Var = e3.f26755e0;
        }
        if (str != null ? !str.equals(p2Var.f26970t) : p2Var.f26970t != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p2Var.f26970t = str;
        if (z10) {
            p2Var.f26969s.a(p2Var);
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
        return "sms_auth_hash";
    }

    @Override // com.onesignal.y4
    public final String H() {
        return "sms_number";
    }

    @Override // com.onesignal.y4
    public final int I() {
        return 14;
    }

    @Override // com.onesignal.z4
    public final String k() {
        return e3.p();
    }

    @Override // com.onesignal.z4
    public final q4 s(String str) {
        return new w4(str, true);
    }
}
