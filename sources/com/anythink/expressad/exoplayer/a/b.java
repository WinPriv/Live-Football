package com.anythink.expressad.exoplayer.a;

import android.net.NetworkInfo;
import android.view.Surface;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.g;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.m;
import com.anythink.expressad.exoplayer.v;
import java.io.IOException;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f7253a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f7254b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7255c;

        /* renamed from: d, reason: collision with root package name */
        public final s.a f7256d;

        /* renamed from: e, reason: collision with root package name */
        public final long f7257e;
        public final long f;

        /* renamed from: g, reason: collision with root package name */
        public final long f7258g;

        public a(long j10, ae aeVar, int i10, s.a aVar, long j11, long j12, long j13) {
            this.f7253a = j10;
            this.f7254b = aeVar;
            this.f7255c = i10;
            this.f7256d = aVar;
            this.f7257e = j11;
            this.f = j12;
            this.f7258g = j13;
        }
    }

    void a();

    void a(a aVar);

    void a(a aVar, int i10);

    void a(a aVar, int i10, int i11);

    void a(a aVar, int i10, long j10, long j11);

    void a(a aVar, int i10, m mVar);

    void a(a aVar, int i10, String str);

    void a(a aVar, NetworkInfo networkInfo);

    void a(a aVar, Surface surface);

    void a(a aVar, com.anythink.expressad.exoplayer.g.a aVar2);

    void a(a aVar, g gVar);

    void a(a aVar, t.c cVar);

    void a(a aVar, com.anythink.expressad.exoplayer.i.g gVar);

    void a(a aVar, v vVar);

    void a(a aVar, IOException iOException);

    void a(a aVar, Exception exc);

    void a(a aVar, boolean z10);

    void a(a aVar, boolean z10, int i10);

    void b();

    void b(a aVar);

    void b(a aVar, int i10);

    void b(a aVar, int i10, int i11);

    void b(a aVar, t.c cVar);

    void b(a aVar, boolean z10);

    void c();

    void c(a aVar);

    void c(a aVar, int i10);

    void d();

    void d(a aVar);

    void d(a aVar, int i10);

    void e(a aVar);

    void e(a aVar, int i10);

    void f(a aVar);

    void f(a aVar, int i10);

    void g(a aVar);

    void g(a aVar, int i10);

    void h(a aVar);
}
