package com.onesignal;

import com.onesignal.q1;
import com.onesignal.v3;
import java.util.Set;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class j1 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f26871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f26872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f26873c;

    public j1(q1 q1Var, Set set, s0 s0Var) {
        this.f26873c = q1Var;
        this.f26871a = set;
        this.f26872b = s0Var;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        q1.b(this.f26873c, "engagement", i10, str);
        this.f26872b.onFailure(str);
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        q1 q1Var = this.f26873c;
        q1.a(q1Var, "engagement", str);
        q1Var.getClass();
        String str2 = r3.f27010a;
        q1Var.f26986c.getClass();
        r3.h(this.f26871a, str2, "PREFS_OS_CLICKED_CLICK_IDS_IAMS");
    }
}
