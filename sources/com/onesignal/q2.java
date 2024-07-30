package com.onesignal;

import com.onesignal.e3;
import com.onesignal.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OSSessionManager.java */
/* loaded from: classes2.dex */
public final class q2 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f26988s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r2 f26989t;

    public q2(r2 r2Var, ArrayList arrayList) {
        this.f26989t = r2Var;
        this.f26988s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Thread.currentThread().setPriority(10);
        ((e3.b) this.f26989t.f27008b).getClass();
        if (e3.E == null) {
            e3.b(4, "OneSignal onSessionEnding called before init!", null);
        }
        l2 l2Var = e3.E;
        if (l2Var != null) {
            e3.b(6, "OneSignal cleanOutcomes for session", null);
            l2Var.f26900a = OSUtils.p();
            l2Var.f26901b.d().d(l2Var.f26900a);
        }
        m m10 = e3.m();
        m.a aVar = m.a.END_SESSION;
        Long b10 = m10.b();
        List<bc.a> list = this.f26988s;
        p0 p0Var = m10.f26910b;
        if (b10 == null) {
            z10 = false;
        } else {
            m.c b11 = p0Var.b(list);
            b11.f(b10.longValue(), list);
            b11.k(aVar);
            z10 = true;
        }
        if (!z10) {
            p0Var.b(list).k(aVar);
        }
    }
}
