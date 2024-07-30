package com.onesignal;

/* compiled from: WebViewManager.java */
/* loaded from: classes2.dex */
public final class g5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e5 f26838s;

    public g5(e5 e5Var) {
        this.f26838s = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f26838s;
        int[] c10 = b3.c(e5Var.f26808d);
        e5Var.f26806b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(c10[0]), Integer.valueOf(c10[1]), Integer.valueOf(c10[2]), Integer.valueOf(c10[3]))), null);
    }
}
