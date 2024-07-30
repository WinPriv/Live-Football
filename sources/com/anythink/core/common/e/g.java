package com.anythink.core.common.e;

/* loaded from: classes.dex */
public final class g extends aa {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5607a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5608b = 2;
    private String R;
    private String S;
    private int am = 1;

    public final String a() {
        return this.S;
    }

    public final String b() {
        return this.R;
    }

    public final int c() {
        return this.am;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        if (this.am == 1) {
            return 2;
        }
        return 4;
    }

    public final void a(String str) {
        this.S = str;
    }

    public final void b(String str) {
        this.R = str;
    }

    public final void a(int i10) {
        this.am = i10;
    }
}
