package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.aa;
import com.anythink.expressad.exoplayer.h.s;

/* loaded from: classes.dex */
public final class q extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f8477a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8478b;

    /* renamed from: c, reason: collision with root package name */
    private int f8479c;

    /* loaded from: classes.dex */
    public static final class a extends p {
        public a(com.anythink.expressad.exoplayer.ae aeVar) {
            super(aeVar);
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final int a(int i10, int i11, boolean z10) {
            int a10 = this.f8476b.a(i10, i11, z10);
            if (a10 == -1) {
                return b(z10);
            }
            return a10;
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final int b(int i10, int i11, boolean z10) {
            int b10 = this.f8476b.b(i10, i11, z10);
            if (b10 == -1) {
                return a(z10);
            }
            return b10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.anythink.expressad.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.ae f8480b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8481c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8482d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8483e;

        public b(com.anythink.expressad.exoplayer.ae aeVar, int i10) {
            super(false, new aa.b(i10));
            this.f8480b = aeVar;
            int c10 = aeVar.c();
            this.f8481c = c10;
            this.f8482d = aeVar.b();
            this.f8483e = i10;
            if (c10 > 0) {
                com.anythink.expressad.exoplayer.k.a.b(i10 <= Integer.MAX_VALUE / c10, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int a(int i10) {
            return i10 / this.f8481c;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int b() {
            return this.f8482d * this.f8483e;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int c() {
            return this.f8481c * this.f8483e;
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int d(int i10) {
            return i10 * this.f8481c;
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int e(int i10) {
            return i10 * this.f8482d;
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final Object f(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int b(int i10) {
            return i10 / this.f8482d;
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final com.anythink.expressad.exoplayer.ae c(int i10) {
            return this.f8480b;
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }
    }

    private q(s sVar) {
        this(sVar, (byte) 0);
    }

    private void b(com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        com.anythink.expressad.exoplayer.ae aVar;
        this.f8479c = aeVar.c();
        if (this.f8478b != Integer.MAX_VALUE) {
            aVar = new b(aeVar, this.f8478b);
        } else {
            aVar = new a(aeVar);
        }
        a(aVar, obj);
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        super.a(hVar, z10);
        a((q) null, this.f8477a);
    }

    private q(s sVar, byte b10) {
        com.anythink.expressad.exoplayer.k.a.a(true);
        this.f8477a = sVar;
        this.f8478b = Integer.MAX_VALUE;
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        if (this.f8478b != Integer.MAX_VALUE) {
            return this.f8477a.a(aVar.a(aVar.f8484a % this.f8479c), bVar);
        }
        return this.f8477a.a(aVar, bVar);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        this.f8477a.a(rVar);
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8479c = 0;
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ void a(Void r12, s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        com.anythink.expressad.exoplayer.ae aVar;
        this.f8479c = aeVar.c();
        if (this.f8478b != Integer.MAX_VALUE) {
            aVar = new b(aeVar, this.f8478b);
        } else {
            aVar = new a(aeVar);
        }
        a(aVar, obj);
    }
}
