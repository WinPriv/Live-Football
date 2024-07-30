package com.anythink.expressad.exoplayer.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class ab implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8982a;

    public ab(Handler handler) {
        this.f8982a = handler;
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final Looper a() {
        return this.f8982a.getLooper();
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final boolean b(int i10) {
        return this.f8982a.sendEmptyMessage(i10);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final Message a(int i10) {
        return this.f8982a.obtainMessage(i10);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final void b() {
        this.f8982a.removeMessages(2);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final Message a(int i10, Object obj) {
        return this.f8982a.obtainMessage(i10, obj);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final Message a(int i10, int i11) {
        return this.f8982a.obtainMessage(i10, i11, 0);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final Message a(int i10, int i11, Object obj) {
        return this.f8982a.obtainMessage(0, i10, i11, obj);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final boolean a(long j10) {
        return this.f8982a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final void a(Object obj) {
        this.f8982a.removeCallbacksAndMessages(obj);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final boolean a(Runnable runnable) {
        return this.f8982a.post(runnable);
    }

    @Override // com.anythink.expressad.exoplayer.k.k
    public final boolean a(Runnable runnable, long j10) {
        return this.f8982a.postDelayed(runnable, j10);
    }
}
