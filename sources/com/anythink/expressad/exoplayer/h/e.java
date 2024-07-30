package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.s;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f8338a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8339b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8340c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8341d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8342e;
    private final boolean f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<d> f8343g;

    /* renamed from: h, reason: collision with root package name */
    private final ae.b f8344h;

    /* renamed from: i, reason: collision with root package name */
    private Object f8345i;

    /* renamed from: j, reason: collision with root package name */
    private a f8346j;

    /* renamed from: k, reason: collision with root package name */
    private b f8347k;

    /* renamed from: l, reason: collision with root package name */
    private long f8348l;

    /* renamed from: m, reason: collision with root package name */
    private long f8349m;

    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8353a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8354b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8355c = 2;

        /* renamed from: d, reason: collision with root package name */
        public final int f8356d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L11
                r0 = 1
                if (r3 == r0) goto Le
                r0 = 2
                if (r3 == r0) goto Lb
                java.lang.String r0 = "unknown"
                goto L13
            Lb:
                java.lang.String r0 = "start exceeds end"
                goto L13
            Le:
                java.lang.String r0 = "not seekable to start"
                goto L13
            L11:
                java.lang.String r0 = "invalid period count"
            L13:
                java.lang.String r1 = "Illegal clipping: "
                java.lang.String r0 = r1.concat(r0)
                r2.<init>(r0)
                r2.f8356d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.e.b.<init>(int):void");
        }

        private static String a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return "unknown";
                    }
                    return "start exceeds end";
                }
                return "not seekable to start";
            }
            return "invalid period count";
        }
    }

    private e(s sVar, long j10, long j11) {
        this(sVar, j10, j11, true, false);
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        super.a(hVar, z10);
        a((e) null, this.f8338a);
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.s
    public final void b() {
        b bVar = this.f8347k;
        if (bVar == null) {
            super.b();
            return;
        }
        throw bVar;
    }

    @Deprecated
    private e(s sVar, long j10, long j11, boolean z10) {
        this(sVar, j10, j11, z10, false);
    }

    private e(s sVar, long j10) {
        this(sVar, 0L, j10, true, true);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        d dVar = new d(this.f8338a.a(aVar, bVar), this.f8341d, this.f8348l, this.f8349m);
        this.f8343g.add(dVar);
        return dVar;
    }

    private e(s sVar, long j10, long j11, boolean z10, boolean z11) {
        com.anythink.expressad.exoplayer.k.a.a(j10 >= 0);
        this.f8338a = (s) com.anythink.expressad.exoplayer.k.a.a(sVar);
        this.f8339b = j10;
        this.f8340c = j11;
        this.f8341d = z10;
        this.f8342e = false;
        this.f = z11;
        this.f8343g = new ArrayList<>();
        this.f8344h = new ae.b();
    }

    private void b(com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        if (this.f8347k != null) {
            return;
        }
        this.f8345i = obj;
        a(aeVar);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        com.anythink.expressad.exoplayer.k.a.b(this.f8343g.remove(rVar));
        this.f8338a.a(((d) rVar).f8330a);
        if (!this.f8343g.isEmpty() || this.f8342e) {
            return;
        }
        a(this.f8346j.f8476b);
    }

    private long b(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long a10 = com.anythink.expressad.exoplayer.b.a(this.f8339b);
        long max = Math.max(0L, j10 - a10);
        long j11 = this.f8340c;
        return j11 != Long.MIN_VALUE ? Math.min(com.anythink.expressad.exoplayer.b.a(j11) - a10, max) : max;
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8347k = null;
        this.f8346j = null;
    }

    private void a(com.anythink.expressad.exoplayer.ae aeVar) {
        long j10;
        long j11;
        long j12;
        aeVar.a(0, this.f8344h, false);
        long j13 = this.f8344h.f7285j;
        if (this.f8346j != null && !this.f8343g.isEmpty() && !this.f8342e) {
            long j14 = this.f8348l - j13;
            j12 = this.f8340c != Long.MIN_VALUE ? this.f8349m - j13 : Long.MIN_VALUE;
            j11 = j14;
        } else {
            long j15 = this.f8339b;
            long j16 = this.f8340c;
            if (this.f) {
                long j17 = this.f8344h.f7283h;
                j15 += j17;
                j10 = j17 + j16;
            } else {
                j10 = j16;
            }
            this.f8348l = j13 + j15;
            this.f8349m = j16 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f8343g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8343g.get(i10).a(this.f8348l, this.f8349m);
            }
            j11 = j15;
            j12 = j10;
        }
        try {
            a aVar = new a(aeVar, j11, j12);
            this.f8346j = aVar;
            a(aVar, this.f8345i);
        } catch (b e10) {
            this.f8347k = e10;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: c, reason: collision with root package name */
        private final long f8350c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8351d;

        /* renamed from: e, reason: collision with root package name */
        private final long f8352e;
        private final boolean f;

        public a(com.anythink.expressad.exoplayer.ae aeVar, long j10, long j11) {
            super(aeVar);
            long max;
            long j12;
            boolean z10 = false;
            if (aeVar.c() == 1) {
                ae.b a10 = aeVar.a(0, new ae.b(), false);
                long max2 = Math.max(0L, j10);
                if (j11 == Long.MIN_VALUE) {
                    max = a10.f7284i;
                } else {
                    max = Math.max(0L, j11);
                }
                long j13 = a10.f7284i;
                if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                    max = max > j13 ? j13 : max;
                    if (max2 != 0 && !a10.f7280d) {
                        throw new b(1);
                    }
                    if (max2 > max) {
                        throw new b(2);
                    }
                }
                this.f8350c = max2;
                this.f8351d = max;
                if (max == com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = max - max2;
                }
                this.f8352e = j12;
                if (a10.f7281e && (max == com.anythink.expressad.exoplayer.b.f7291b || (j13 != com.anythink.expressad.exoplayer.b.f7291b && max == j13))) {
                    z10 = true;
                }
                this.f = z10;
                return;
            }
            throw new b(0);
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final ae.b a(int i10, ae.b bVar, boolean z10, long j10) {
            this.f8476b.a(0, bVar, z10, 0L);
            long j11 = bVar.f7285j;
            long j12 = this.f8350c;
            bVar.f7285j = j11 + j12;
            bVar.f7284i = this.f8352e;
            bVar.f7281e = this.f;
            long j13 = bVar.f7283h;
            if (j13 != com.anythink.expressad.exoplayer.b.f7291b) {
                long max = Math.max(j13, j12);
                bVar.f7283h = max;
                long j14 = this.f8351d;
                if (j14 != com.anythink.expressad.exoplayer.b.f7291b) {
                    max = Math.min(max, j14);
                }
                bVar.f7283h = max - this.f8350c;
            }
            long a10 = com.anythink.expressad.exoplayer.b.a(this.f8350c);
            long j15 = bVar.f7278b;
            if (j15 != com.anythink.expressad.exoplayer.b.f7291b) {
                bVar.f7278b = j15 + a10;
            }
            long j16 = bVar.f7279c;
            if (j16 != com.anythink.expressad.exoplayer.b.f7291b) {
                bVar.f7279c = j16 + a10;
            }
            return bVar;
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final ae.a a(int i10, ae.a aVar, boolean z10) {
            this.f8476b.a(0, aVar, z10);
            long b10 = aVar.b() - this.f8350c;
            long j10 = this.f8352e;
            return aVar.a(aVar.f7272a, aVar.f7273b, j10 == com.anythink.expressad.exoplayer.b.f7291b ? -9223372036854775807L : j10 - b10, b10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ long a(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        long a10 = com.anythink.expressad.exoplayer.b.a(this.f8339b);
        long max = Math.max(0L, j10 - a10);
        long j11 = this.f8340c;
        return j11 != Long.MIN_VALUE ? Math.min(com.anythink.expressad.exoplayer.b.a(j11) - a10, max) : max;
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* bridge */ /* synthetic */ void a(Void r12, s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        if (this.f8347k == null) {
            this.f8345i = obj;
            a(aeVar);
        }
    }
}
