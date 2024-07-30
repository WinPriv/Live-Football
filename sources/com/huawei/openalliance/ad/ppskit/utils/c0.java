package com.huawei.openalliance.ad.ppskit.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import ka.n7;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22814a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22815b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final String f22816c;

    /* renamed from: d, reason: collision with root package name */
    public z f22817d;

    /* renamed from: e, reason: collision with root package name */
    public HandlerThread f22818e;
    public int f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22819a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f22820b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22821c;

        /* renamed from: d, reason: collision with root package name */
        public final long f22822d;

        public a(int i10, Runnable runnable, String str, long j10) {
            this.f22819a = i10;
            this.f22820b = runnable;
            this.f22821c = str;
            this.f22822d = j10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CacheTask{taskType=");
            sb2.append(this.f22819a);
            sb2.append(", id='");
            return a3.l.p(sb2, this.f22821c, "'}");
        }
    }

    public c0(String str) {
        this.f22816c = TextUtils.isEmpty(str) ? "PPS-handler_exec_thread" : str;
    }

    public final void a() {
        Handler handler;
        synchronized (this.f22814a) {
            this.f++;
            z g6 = g();
            if (g6 != null && (handler = g6.f23071a) != null) {
                handler.removeCallbacksAndMessages("handler_exec_release_task");
            }
            if (n7.d()) {
                n7.c("HandlerExecAgent", "acquire exec agent. ref count: %d", Integer.valueOf(this.f));
            }
        }
    }

    public final void b(Runnable runnable) {
        if (!f()) {
            return;
        }
        z g6 = g();
        if (g6 != null) {
            g6.a(runnable, null, 0L);
        } else {
            p2.a(new b0(this, new a(1, runnable, null, 0L)), 3);
        }
    }

    public final void c(Runnable runnable, String str, long j10) {
        if (!f()) {
            return;
        }
        z g6 = g();
        if (g6 != null) {
            g6.a(runnable, str, j10);
        } else {
            p2.a(new b0(this, new a(1, runnable, str, j10)), 3);
        }
    }

    public final void d(String str) {
        if (!f()) {
            return;
        }
        z g6 = g();
        if (g6 != null) {
            Handler handler = g6.f23071a;
            if (handler != null && str != null) {
                handler.removeCallbacksAndMessages(str);
                return;
            }
            return;
        }
        p2.a(new b0(this, new a(2, null, str, 0L)), 3);
    }

    public final void e() {
        synchronized (this.f22814a) {
            if (!f()) {
                n7.e("HandlerExecAgent", "release exec agent - not working");
                return;
            }
            int i10 = this.f - 1;
            this.f = i10;
            if (i10 <= 0) {
                this.f = 0;
                z g6 = g();
                if (g6 != null) {
                    n7.e("HandlerExecAgent", "delay quit thread");
                    g6.a(new a0(this), "handler_exec_release_task", 60000L);
                }
            }
            if (n7.d()) {
                n7.c("HandlerExecAgent", "release exec agent - ref count: %d", Integer.valueOf(this.f));
            }
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f22814a) {
            if (this.f > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final z g() {
        z zVar;
        synchronized (this.f22814a) {
            zVar = this.f22817d;
        }
        return zVar;
    }
}
