package com.onesignal;

import com.onesignal.v3;

/* compiled from: OneSignalRestClientWrapper.java */
/* loaded from: classes2.dex */
public final class z3 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f27222a;

    public z3(l3 l3Var) {
        this.f27222a = l3Var;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        this.f27222a.a(i10, str);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        this.f27222a.onSuccess();
    }
}
