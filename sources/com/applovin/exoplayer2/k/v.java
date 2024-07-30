package com.applovin.exoplayer2.k;

import java.io.IOException;

/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.j f16199a;

        /* renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.m f16200b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f16201c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16202d;

        public a(com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, int i10) {
            this.f16199a = jVar;
            this.f16200b = mVar;
            this.f16201c = iOException;
            this.f16202d = i10;
        }
    }

    int a(int i10);

    long a(a aVar);

    default void a(long j10) {
    }
}
