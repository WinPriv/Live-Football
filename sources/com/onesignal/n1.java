package com.onesignal;

import com.onesignal.q1;
import com.onesignal.v3;
import java.util.Set;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class n1 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f26936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f26937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f26938c;

    public n1(q1 q1Var, Set set, x0 x0Var) {
        this.f26938c = q1Var;
        this.f26936a = set;
        this.f26937b = x0Var;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        q1.b(this.f26938c, "impression", i10, str);
        this.f26937b.onFailure(str);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        q1 q1Var = this.f26938c;
        q1.a(q1Var, "impression", str);
        q1Var.getClass();
        String str2 = r3.f27010a;
        q1Var.f26986c.getClass();
        r3.h(this.f26936a, str2, "PREFS_OS_IMPRESSIONED_IAMS");
    }
}
