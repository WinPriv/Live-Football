package com.huawei.openalliance.ad.ppskit.utils;

import android.annotation.SuppressLint;
import android.os.HandlerThread;
import ka.n7;

/* loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f22804s;

    public a0(c0 c0Var) {
        this.f22804s = c0Var;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"NewApi"})
    public final void run() {
        synchronized (this.f22804s.f22815b) {
            HandlerThread handlerThread = this.f22804s.f22818e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f22804s.f22818e = null;
            }
            c0 c0Var = this.f22804s;
            synchronized (c0Var.f22814a) {
                c0Var.f22817d = null;
            }
            n7.e("HandlerExecAgent", "quit thread and release");
        }
    }
}
