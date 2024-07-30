package com.anythink.expressad.exoplayer.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f7570a;

    public void a() {
        this.f7570a = 0;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    public final boolean d() {
        return c(1);
    }

    private void d(int i10) {
        this.f7570a = (~i10) & this.f7570a;
    }

    public final void a(int i10) {
        this.f7570a = i10;
    }

    public final void b(int i10) {
        this.f7570a = i10 | this.f7570a;
    }

    public final boolean c(int i10) {
        return (this.f7570a & i10) == i10;
    }
}
