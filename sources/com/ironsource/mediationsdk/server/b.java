package com.ironsource.mediationsdk.server;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f25859a;

    /* renamed from: b, reason: collision with root package name */
    public long f25860b;

    public long a() {
        return Math.max(0L, this.f25859a - System.currentTimeMillis());
    }

    public void b() {
        this.f25859a = 0L;
        this.f25860b = 0L;
    }

    public void c(long j10) {
        this.f25859a = (j10 - this.f25860b) + this.f25859a;
    }

    public void a(long j10) {
        this.f25859a = System.currentTimeMillis() + j10;
    }

    public void b(long j10) {
        this.f25860b = j10;
    }
}
