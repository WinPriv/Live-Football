package com.applovin.impl.sdk.d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private long f18801a;

    /* renamed from: b, reason: collision with root package name */
    private long f18802b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18803c;

    /* renamed from: d, reason: collision with root package name */
    private long f18804d;

    /* renamed from: e, reason: collision with root package name */
    private long f18805e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f18806g;

    public void a(long j10) {
        this.f18801a += j10;
    }

    public void b(long j10) {
        this.f18802b += j10;
    }

    public void c() {
        this.f18805e++;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f18801a + ", totalCachedBytes=" + this.f18802b + ", isHTMLCachingCancelled=" + this.f18803c + ", htmlResourceCacheSuccessCount=" + this.f18804d + ", htmlResourceCacheFailureCount=" + this.f18805e + '}';
    }

    public void a() {
        this.f18803c = true;
    }

    public void b() {
        this.f18804d++;
    }

    public void a(Exception exc) {
        this.f18806g = exc;
    }

    public void a(int i10) {
        this.f = i10;
    }
}
