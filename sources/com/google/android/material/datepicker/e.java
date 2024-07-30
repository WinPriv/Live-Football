package com.google.android.material.datepicker;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f20688s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f20689t;

    public e(f fVar, int i10) {
        this.f20689t = fVar;
        this.f20688s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20689t.B.smoothScrollToPosition(this.f20688s);
    }
}
