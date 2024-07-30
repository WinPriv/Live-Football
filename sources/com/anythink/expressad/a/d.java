package com.anythink.expressad.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    protected static final int f6664b = 1;

    /* renamed from: c, reason: collision with root package name */
    protected static final int f6665c = 2;

    /* renamed from: d, reason: collision with root package name */
    protected static final int f6666d = 4;

    /* renamed from: e, reason: collision with root package name */
    protected static final int f6667e = 8;
    protected static final int f = 16;

    /* renamed from: g, reason: collision with root package name */
    protected static final int f6668g = 32;

    /* renamed from: a, reason: collision with root package name */
    private int f6669a = 1;

    /* renamed from: h, reason: collision with root package name */
    protected e f6670h;

    private int a() {
        return this.f6669a;
    }

    private boolean c() {
        int i10 = this.f6669a;
        if (i10 != 8 && i10 != 16) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.f6669a == 2) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.f6669a == 32) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.f6669a == 4) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f6669a = 8;
    }

    private void a(int i10) {
        this.f6669a = i10;
    }

    private void a(e eVar) {
        this.f6670h = eVar;
    }
}
