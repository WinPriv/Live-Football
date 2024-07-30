package com.anythink.expressad.exoplayer.j;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8813a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8814b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8815c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8816d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8817e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8818g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8819h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8820i;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public k(Uri uri) {
        this(uri, 0);
    }

    public final boolean a(int i10) {
        return (this.f8820i & i10) == i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(this.f8815c);
        sb2.append(", ");
        sb2.append(Arrays.toString(this.f8816d));
        sb2.append(", ");
        sb2.append(this.f8817e);
        sb2.append(", ");
        sb2.append(this.f);
        sb2.append(", ");
        sb2.append(this.f8818g);
        sb2.append(", ");
        sb2.append(this.f8819h);
        sb2.append(", ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f8820i, "]");
    }

    public k(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public final k a(long j10) {
        long j11 = this.f8818g;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        return (j10 == 0 && j11 == j12) ? this : new k(this.f8815c, this.f8816d, this.f8817e + j10, this.f + j10, j12, this.f8819h, this.f8820i);
    }

    public k(Uri uri, long j10, String str) {
        this(uri, j10, j10, -1L, str, 0);
    }

    public k(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    private k a(long j10, long j11) {
        return (j10 == 0 && this.f8818g == j11) ? this : new k(this.f8815c, this.f8816d, this.f8817e + j10, this.f + j10, j11, this.f8819h, this.f8820i);
    }

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public k(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = true;
        com.anythink.expressad.exoplayer.k.a.a(j10 >= 0);
        com.anythink.expressad.exoplayer.k.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.a(z10);
        this.f8815c = uri;
        this.f8816d = bArr;
        this.f8817e = j10;
        this.f = j11;
        this.f8818g = j12;
        this.f8819h = str;
        this.f8820i = i10;
    }

    private k a(Uri uri) {
        return new k(uri, this.f8816d, this.f8817e, this.f, this.f8818g, this.f8819h, this.f8820i);
    }
}
