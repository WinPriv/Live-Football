package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.huawei.openalliance.ad.constant.bj;
import com.onesignal.e3;

/* compiled from: OSFocusHandler.kt */
/* loaded from: classes2.dex */
public final class OSFocusHandler {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f26606b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26607c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f26608d;

    /* renamed from: a, reason: collision with root package name */
    public o0 f26609a;

    /* compiled from: OSFocusHandler.kt */
    /* loaded from: classes2.dex */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            zc.d.d(context, bj.f.o);
            zc.d.d(workerParameters, "workerParams");
        }

        @Override // androidx.work.Worker
        public final ListenableWorker.a g() {
            boolean z10;
            a aVar = c.f26699t;
            boolean z11 = false;
            if (aVar == null || aVar.f26635b == null) {
                e3.o = false;
            }
            e3.b(6, "OSFocusHandler running onAppLostFocus", null);
            OSFocusHandler.f26607c = true;
            e3.b(6, "Application lost focus initDone: " + e3.f26767n, null);
            e3.o = false;
            e3.f26768p = e3.m.APP_CLOSE;
            e3.f26775w.getClass();
            e3.Q(System.currentTimeMillis());
            synchronized (a0.f26644d) {
                new OSUtils();
                if (OSUtils.b() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && OSUtils.h()) {
                    z11 = true;
                }
                if (z11) {
                    o.k();
                } else if (a0.f()) {
                    r.k();
                }
            }
            if (!e3.f26767n) {
                w2 w2Var = e3.f26777z;
                if (w2Var.d("onAppLostFocus()")) {
                    e3.f26772t.d("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                    w2Var.a(new i3());
                }
            } else {
                e3.f();
            }
            OSFocusHandler.f26608d = true;
            return new ListenableWorker.a.c();
        }
    }
}
