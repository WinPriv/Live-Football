package com.onesignal;

import com.onesignal.e3;
import org.json.JSONObject;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class u0 implements e3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f27095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f27096c;

    public u0(v0 v0Var, boolean z10, b1 b1Var) {
        this.f27096c = v0Var;
        this.f27094a = z10;
        this.f27095b = b1Var;
    }

    @Override // com.onesignal.e3.q
    public final void a(JSONObject jSONObject) {
        v0 v0Var = this.f27096c;
        v0Var.f27123r = false;
        if (jSONObject != null) {
            v0Var.f27121p = jSONObject.toString();
        }
        if (v0Var.f27122q != null) {
            boolean z10 = this.f27094a;
            b1 b1Var = this.f27095b;
            if (!z10) {
                e3.D.c(b1Var.f26667a);
            }
            r0 r0Var = v0Var.f27122q;
            r0Var.f26998a = v0Var.J(r0Var.f26998a);
            e5.h(b1Var, v0Var.f27122q);
            v0Var.f27122q = null;
        }
    }
}
