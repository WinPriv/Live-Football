package com.anythink.expressad.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.j.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ad extends com.anythink.expressad.exoplayer.h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8238a = 3;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.k f8239b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f8240c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.m f8241d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8242e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8243g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.ae f8244h;

    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public /* synthetic */ ad(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10, int i10, boolean z10, Object obj, byte b10) {
        this(uri, aVar, mVar, j10, i10, z10, obj);
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public final void a() {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f8247a;

        /* renamed from: b, reason: collision with root package name */
        private int f8248b = 3;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8249c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8250d;

        /* renamed from: e, reason: collision with root package name */
        private Object f8251e;

        private c(h.a aVar) {
            this.f8247a = (h.a) com.anythink.expressad.exoplayer.k.a.a(aVar);
        }

        private c a(Object obj) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8250d);
            this.f8251e = obj;
            return this;
        }

        private c a(int i10) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8250d);
            this.f8248b = i10;
            return this;
        }

        private c a(boolean z10) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8250d);
            this.f8249c = z10;
            return this;
        }

        private ad a(Uri uri, com.anythink.expressad.exoplayer.m mVar, long j10) {
            this.f8250d = true;
            return new ad(uri, this.f8247a, mVar, j10, this.f8248b, this.f8249c, this.f8251e, (byte) 0);
        }

        @Deprecated
        private ad a(Uri uri, com.anythink.expressad.exoplayer.m mVar, long j10, Handler handler, t tVar) {
            this.f8250d = true;
            ad adVar = new ad(uri, this.f8247a, mVar, j10, this.f8248b, this.f8249c, this.f8251e, (byte) 0);
            if (handler != null && tVar != null) {
                adVar.a(handler, tVar);
            }
            return adVar;
        }
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10) {
        this(uri, aVar, mVar, j10, (byte) 0);
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        a(this.f8244h, (Object) null);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10, byte b10) {
        this(uri, aVar, mVar, j10, 3, false, null);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        com.anythink.expressad.exoplayer.k.a.a(aVar.f8484a == 0);
        return new ac(this.f8239b, this.f8240c, this.f8241d, this.f8242e, this.f, a(aVar), this.f8243g);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10, int i10, Handler handler, a aVar2, int i11, boolean z10) {
        this(uri, aVar, mVar, j10, i10, z10, null);
        if (handler == null || aVar2 == null) {
            return;
        }
        a(handler, new b(aVar2, i11));
    }

    private ad(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.m mVar, long j10, int i10, boolean z10, Object obj) {
        this.f8240c = aVar;
        this.f8241d = mVar;
        this.f8242e = j10;
        this.f = i10;
        this.f8243g = z10;
        this.f8239b = new com.anythink.expressad.exoplayer.j.k(uri);
        this.f8244h = new ab(j10, true, false, obj);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        ((ac) rVar).f();
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void b() {
    }

    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f8245a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8246b;

        public b(a aVar, int i10) {
            this.f8245a = (a) com.anythink.expressad.exoplayer.k.a.a(aVar);
            this.f8246b = i10;
        }

        @Override // com.anythink.expressad.exoplayer.h.k, com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z10) {
        }
    }
}
