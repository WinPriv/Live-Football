package com.applovin.exoplayer2.h;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.o;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    private final i.a f15329a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<r> f15330b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f15331c;

    /* renamed from: d, reason: collision with root package name */
    private long f15332d;

    /* renamed from: e, reason: collision with root package name */
    private long f15333e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private float f15334g;

    /* renamed from: h, reason: collision with root package name */
    private float f15335h;

    public f(Context context, com.applovin.exoplayer2.e.l lVar) {
        this(new o.a(context), lVar);
    }

    private static SparseArray<r> a(i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        SparseArray<r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(r.class).getConstructor(i.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new u.a(aVar, lVar));
        return sparseArray;
    }

    public f(i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        this.f15329a = aVar;
        SparseArray<r> a10 = a(aVar, lVar);
        this.f15330b = a10;
        this.f15331c = new int[a10.size()];
        for (int i10 = 0; i10 < this.f15330b.size(); i10++) {
            this.f15331c[i10] = this.f15330b.keyAt(i10);
        }
        this.f15332d = com.anythink.expressad.exoplayer.b.f7291b;
        this.f15333e = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = com.anythink.expressad.exoplayer.b.f7291b;
        this.f15334g = -3.4028235E38f;
        this.f15335h = -3.4028235E38f;
    }
}
