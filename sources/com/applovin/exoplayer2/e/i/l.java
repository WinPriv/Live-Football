package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f14692a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    private final af f14693b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14694c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f14695d;

    /* renamed from: e, reason: collision with root package name */
    private final a f14696e;
    private final r f;

    /* renamed from: g, reason: collision with root package name */
    private b f14697g;

    /* renamed from: h, reason: collision with root package name */
    private long f14698h;

    /* renamed from: i, reason: collision with root package name */
    private String f14699i;

    /* renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14700j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14701k;

    /* renamed from: l, reason: collision with root package name */
    private long f14702l;

    public l() {
        this(null);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.f14695d);
        this.f14696e.a();
        b bVar = this.f14697g;
        if (bVar != null) {
            bVar.a();
        }
        r rVar = this.f;
        if (rVar != null) {
            rVar.a();
        }
        this.f14698h = 0L;
        this.f14702l = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public l(af afVar) {
        this.f14693b = afVar;
        this.f14695d = new boolean[4];
        this.f14696e = new a(128);
        this.f14702l = com.anythink.expressad.exoplayer.b.f7291b;
        if (afVar != null) {
            this.f = new r(178, 128);
            this.f14694c = new com.applovin.exoplayer2.l.y();
        } else {
            this.f = null;
            this.f14694c = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final byte[] f14703d = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public int f14704a;

        /* renamed from: b, reason: collision with root package name */
        public int f14705b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f14706c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14707e;
        private int f;

        public a(int i10) {
            this.f14706c = new byte[i10];
        }

        public void a() {
            this.f14707e = false;
            this.f14704a = 0;
            this.f = 0;
        }

        public boolean a(int i10, int i11) {
            int i12 = this.f;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f14704a -= i11;
                                this.f14707e = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f14705b = this.f14704a;
                            this.f = 4;
                        }
                    } else if (i10 > 31) {
                        com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f = 3;
                    }
                } else if (i10 != 181) {
                    com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f = 2;
                }
            } else if (i10 == 176) {
                this.f = 1;
                this.f14707e = true;
            }
            byte[] bArr = f14703d;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f14707e) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f14706c;
                int length = bArr2.length;
                int i13 = this.f14704a;
                if (length < i13 + i12) {
                    this.f14706c = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f14706c, this.f14704a, i12);
                this.f14704a += i12;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f14708a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f14709b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14710c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14711d;

        /* renamed from: e, reason: collision with root package name */
        private int f14712e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private long f14713g;

        /* renamed from: h, reason: collision with root package name */
        private long f14714h;

        public b(com.applovin.exoplayer2.e.x xVar) {
            this.f14708a = xVar;
        }

        public void a() {
            this.f14709b = false;
            this.f14710c = false;
            this.f14711d = false;
            this.f14712e = -1;
        }

        public void a(int i10, long j10) {
            this.f14712e = i10;
            this.f14711d = false;
            this.f14709b = i10 == 182 || i10 == 179;
            this.f14710c = i10 == 182;
            this.f = 0;
            this.f14714h = j10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f14710c) {
                int i12 = this.f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f14711d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f14710c = false;
                } else {
                    this.f = (i11 - i10) + i12;
                }
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f14712e == 182 && z10 && this.f14709b) {
                long j11 = this.f14714h;
                if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                    this.f14708a.a(j11, this.f14711d ? 1 : 0, (int) (j10 - this.f14713g), i10, null);
                }
            }
            if (this.f14712e != 179) {
                this.f14713g = j10;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14699i = dVar.c();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 2);
        this.f14700j = a10;
        this.f14697g = new b(a10);
        af afVar = this.f14693b;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14702l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14697g);
        com.applovin.exoplayer2.l.a.a(this.f14700j);
        int c10 = yVar.c();
        int b10 = yVar.b();
        byte[] d10 = yVar.d();
        this.f14698h += yVar.a();
        this.f14700j.a(yVar, yVar.a());
        while (true) {
            int a10 = com.applovin.exoplayer2.l.v.a(d10, c10, b10, this.f14695d);
            if (a10 == b10) {
                break;
            }
            int i10 = a10 + 3;
            int i11 = yVar.d()[i10] & DefaultClassResolver.NAME;
            int i12 = a10 - c10;
            int i13 = 0;
            if (!this.f14701k) {
                if (i12 > 0) {
                    this.f14696e.a(d10, c10, a10);
                }
                if (this.f14696e.a(i11, i12 < 0 ? -i12 : 0)) {
                    com.applovin.exoplayer2.e.x xVar = this.f14700j;
                    a aVar = this.f14696e;
                    xVar.a(a(aVar, aVar.f14705b, (String) com.applovin.exoplayer2.l.a.b(this.f14699i)));
                    this.f14701k = true;
                }
            }
            this.f14697g.a(d10, c10, a10);
            r rVar = this.f;
            if (rVar != null) {
                if (i12 > 0) {
                    rVar.a(d10, c10, a10);
                } else {
                    i13 = -i12;
                }
                if (this.f.b(i13)) {
                    r rVar2 = this.f;
                    ((com.applovin.exoplayer2.l.y) ai.a(this.f14694c)).a(this.f.f14818a, com.applovin.exoplayer2.l.v.a(rVar2.f14818a, rVar2.f14819b));
                    ((af) ai.a(this.f14693b)).a(this.f14702l, this.f14694c);
                }
                if (i11 == 178 && yVar.d()[a10 + 2] == 1) {
                    this.f.a(i11);
                }
            }
            int i14 = b10 - a10;
            this.f14697g.a(this.f14698h - i14, i14, this.f14701k);
            this.f14697g.a(i11, this.f14702l);
            c10 = i10;
        }
        if (!this.f14701k) {
            this.f14696e.a(d10, c10, b10);
        }
        this.f14697g.a(d10, c10, b10);
        r rVar3 = this.f;
        if (rVar3 != null) {
            rVar3.a(d10, c10, b10);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    private static com.applovin.exoplayer2.v a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f14706c, aVar.f14704a);
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(copyOf);
        xVar.e(i10);
        xVar.e(4);
        xVar.d();
        xVar.b(8);
        if (xVar.e()) {
            xVar.b(4);
            xVar.b(3);
        }
        int c10 = xVar.c(4);
        float f = 1.0f;
        if (c10 == 15) {
            int c11 = xVar.c(8);
            int c12 = xVar.c(8);
            if (c12 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            } else {
                f = c11 / c12;
            }
        } else {
            float[] fArr = f14692a;
            if (c10 < fArr.length) {
                f = fArr[c10];
            } else {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.e()) {
            xVar.b(2);
            xVar.b(1);
            if (xVar.e()) {
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(3);
                xVar.b(11);
                xVar.d();
                xVar.b(15);
                xVar.d();
            }
        }
        if (xVar.c(2) != 0) {
            com.applovin.exoplayer2.l.q.c("H263Reader", "Unhandled video object layer shape");
        }
        xVar.d();
        int c13 = xVar.c(16);
        xVar.d();
        if (xVar.e()) {
            if (c13 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = c13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xVar.b(i11);
            }
        }
        xVar.d();
        int c14 = xVar.c(13);
        xVar.d();
        int c15 = xVar.c(13);
        xVar.d();
        xVar.d();
        return new v.a().a(str).f(com.anythink.expressad.exoplayer.k.o.f9078l).g(c14).h(c15).b(f).a(Collections.singletonList(copyOf)).a();
    }
}
