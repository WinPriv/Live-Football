package com.applovin.exoplayer2.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f13622a;

    public void a() {
        this.f13622a = 0;
    }

    public final void a_(int i10) {
        this.f13622a = i10;
    }

    public final boolean b() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return d(4);
    }

    public final boolean d() {
        return d(1);
    }

    public final boolean e() {
        return d(268435456);
    }

    public final void b(int i10) {
        this.f13622a = i10 | this.f13622a;
    }

    public final void c(int i10) {
        this.f13622a = (~i10) & this.f13622a;
    }

    public final boolean d(int i10) {
        return (this.f13622a & i10) == i10;
    }
}
