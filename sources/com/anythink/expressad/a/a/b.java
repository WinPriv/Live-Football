package com.anythink.expressad.a.a;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f6618a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f6619b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f6620c;

    /* renamed from: d, reason: collision with root package name */
    private int f6621d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f6622e = new HashSet<>();
    private long f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.c f6623g;

    /* renamed from: h, reason: collision with root package name */
    private String f6624h;

    /* renamed from: i, reason: collision with root package name */
    private int f6625i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6626j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6627k;

    /* renamed from: l, reason: collision with root package name */
    private int f6628l;

    public b(String str, String str2) {
        this.f6620c = str;
        b(str2);
    }

    private String i() {
        return this.f6620c;
    }

    private HashSet<String> j() {
        return this.f6622e;
    }

    public final boolean a() {
        return this.f6626j;
    }

    public final boolean b() {
        return this.f6627k;
    }

    public final int c() {
        return this.f6628l;
    }

    public final int d() {
        return this.f6625i;
    }

    public final String e() {
        return this.f6624h;
    }

    public final com.anythink.expressad.foundation.d.c f() {
        return this.f6623g;
    }

    public final int g() {
        return this.f6621d;
    }

    public final long h() {
        return this.f;
    }

    public final void a(boolean z10) {
        this.f6626j = z10;
    }

    public final void b(boolean z10) {
        this.f6627k = z10;
    }

    public final void a(int i10) {
        this.f6628l = i10;
    }

    public final void b(int i10) {
        this.f6625i = i10;
    }

    public final void a(String str) {
        this.f6624h = str;
    }

    public final void b(String str) {
        this.f6621d++;
        this.f6622e.add(str);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.f6623g = cVar;
    }
}
