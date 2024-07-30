package com.onesignal;

import com.onesignal.q1;
import com.onesignal.v0;
import com.onesignal.v3;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class o1 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.a f26956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f26957b;

    public o1(q1 q1Var, v0.b bVar) {
        this.f26957b = q1Var;
        this.f26956a = bVar;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        q1.b(this.f26957b, "html", i10, str);
        this.f26956a.onFailure(str);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        this.f26956a.a(str);
    }
}
