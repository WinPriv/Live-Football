package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f15354h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f15355a;

    /* renamed from: b, reason: collision with root package name */
    public final com.applovin.exoplayer2.k.l f15356b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f15357c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f15358d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15359e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15360g;

    public j(long j10, com.applovin.exoplayer2.k.l lVar, long j11) {
        this(j10, lVar, lVar.f16095a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f15354h.getAndIncrement();
    }

    public j(long j10, com.applovin.exoplayer2.k.l lVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f15355a = j10;
        this.f15356b = lVar;
        this.f15357c = uri;
        this.f15358d = map;
        this.f15359e = j11;
        this.f = j12;
        this.f15360g = j13;
    }
}
