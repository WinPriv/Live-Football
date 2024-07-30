package com.anythink.expressad.exoplayer.e.a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7889a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7890b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f7891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7892d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7893e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7894g;

    /* renamed from: h, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.m f7895h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7896i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f7897j;

    /* renamed from: k, reason: collision with root package name */
    public final long[] f7898k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7899l;

    /* renamed from: m, reason: collision with root package name */
    private final k[] f7900m;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public j(int i10, int i11, long j10, long j11, long j12, com.anythink.expressad.exoplayer.m mVar, int i12, k[] kVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f7891c = i10;
        this.f7892d = i11;
        this.f7893e = j10;
        this.f = j11;
        this.f7894g = j12;
        this.f7895h = mVar;
        this.f7896i = i12;
        this.f7900m = kVarArr;
        this.f7899l = i13;
        this.f7897j = jArr;
        this.f7898k = jArr2;
    }

    public final k a(int i10) {
        k[] kVarArr = this.f7900m;
        if (kVarArr == null) {
            return null;
        }
        return kVarArr[i10];
    }
}
