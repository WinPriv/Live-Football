package com.onesignal;

import com.onesignal.q1;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class z0 implements q1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f27211b;

    public z0(v0 v0Var, String str) {
        this.f27211b = v0Var;
        this.f27210a = str;
    }

    @Override // com.onesignal.q1.a
    public final void onFailure(String str) {
        this.f27211b.f27116j.remove(this.f27210a);
    }

    @Override // com.onesignal.q1.a
    public final void a(String str) {
    }
}
