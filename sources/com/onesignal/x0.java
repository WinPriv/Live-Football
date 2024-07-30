package com.onesignal;

import com.onesignal.q1;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class x0 implements q1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f27188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f27189b;

    public x0(v0 v0Var, b1 b1Var) {
        this.f27189b = v0Var;
        this.f27188a = b1Var;
    }

    @Override // com.onesignal.q1.a
    public final void onFailure(String str) {
        this.f27189b.f27115i.remove(this.f27188a.f26667a);
    }

    @Override // com.onesignal.q1.a
    public final void a(String str) {
    }
}
