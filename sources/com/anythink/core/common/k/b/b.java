package com.anythink.core.common.k.b;

/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6133d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6134e = 2;
    public static final int f = 3;

    /* renamed from: h, reason: collision with root package name */
    protected c f6138h;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f6137g = true;

    /* renamed from: i, reason: collision with root package name */
    protected int f6139i = 1;

    /* renamed from: a, reason: collision with root package name */
    private long f6135a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String f6136b = "topon-default-thread";

    private String c() {
        return this.f6136b;
    }

    public abstract void a();

    public final void a(long j10) {
        this.f6135a = j10;
    }

    public final long b() {
        return this.f6135a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f6136b);
        a();
    }

    private void a(c cVar) {
        this.f6138h = cVar;
    }

    public final void a(String str) {
        this.f6136b = str;
    }
}
