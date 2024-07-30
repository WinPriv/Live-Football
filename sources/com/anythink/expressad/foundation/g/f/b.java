package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private int f9903a;

    /* renamed from: b, reason: collision with root package name */
    private int f9904b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9905c;

    /* renamed from: d, reason: collision with root package name */
    private int f9906d;

    /* renamed from: e, reason: collision with root package name */
    private int f9907e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f9908g;

    /* renamed from: h, reason: collision with root package name */
    private int f9909h;

    public b() {
        this((byte) 0);
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int a() {
        return this.f9905c;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int b() {
        return this.f9903a;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int c() {
        return this.f9904b;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final boolean d() {
        int i10 = this.f9904b + 1;
        this.f9904b = i10;
        if (i10 <= this.f9905c) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int e() {
        return this.f9907e;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int f() {
        return this.f;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int g() {
        return this.f9908g;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int h() {
        return this.f9909h;
    }

    @Override // com.anythink.expressad.foundation.g.f.l
    public final int i() {
        return this.f9906d;
    }

    private b(byte b10) {
        this.f9906d = 2;
        this.f9907e = 0;
        this.f = 0;
        this.f9908g = 0;
        this.f9909h = 0;
        this.f9903a = 30000;
        this.f9905c = 0;
    }

    private b(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f9906d = 2;
        this.f9907e = 0;
        this.f = 0;
        this.f9908g = 0;
        this.f9909h = 0;
        this.f9907e = Math.max(i10, 0);
        this.f = Math.max(i11, 0);
        this.f9908g = Math.max(i12, 0);
        this.f9909h = Math.max(i13, 0);
        this.f9905c = Math.max(i14, 0);
        this.f9906d = i15;
    }

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f9906d = 2;
        this.f9907e = 0;
        this.f = 0;
        this.f9908g = 0;
        this.f9909h = 0;
        this.f9907e = Math.max(i10, 0);
        this.f = Math.max(i11, 0);
        this.f9908g = Math.max(i12, 0);
        this.f9909h = Math.max(i13, 0);
        this.f9905c = Math.max(i14, 0);
    }
}
