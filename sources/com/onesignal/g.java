package com.onesignal;

/* compiled from: BackgroundRunnable.kt */
/* loaded from: classes2.dex */
public class g implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Thread currentThread = Thread.currentThread();
        zc.d.c(currentThread, "Thread.currentThread()");
        currentThread.setPriority(10);
    }
}
