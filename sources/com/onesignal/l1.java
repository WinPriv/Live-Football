package com.onesignal;

import com.onesignal.q1;
import com.onesignal.v3;
import java.util.Set;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class l1 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f26897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f26898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f26899c;

    public l1(q1 q1Var, Set set, z0 z0Var) {
        this.f26899c = q1Var;
        this.f26897a = set;
        this.f26898b = z0Var;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        q1.b(this.f26899c, "page impression", i10, str);
        this.f26898b.onFailure(str);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        q1 q1Var = this.f26899c;
        q1.a(q1Var, "page impression", str);
        String str2 = r3.f27010a;
        q1Var.f26986c.getClass();
        r3.h(this.f26897a, str2, "PREFS_OS_PAGE_IMPRESSIONED_IAMS");
    }
}
