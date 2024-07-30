package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements ad.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f14655a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f14656b;

    public g() {
        this(0);
    }

    private af b(ad.b bVar) {
        return new af(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List<com.applovin.exoplayer2.v> c(ad.b bVar) {
        boolean z10;
        String str;
        int i10;
        List<byte[]> list;
        if (a(32)) {
            return this.f14656b;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bVar.f14588d);
        ArrayList arrayList = this.f14656b;
        while (yVar.a() > 0) {
            int h10 = yVar.h();
            int c10 = yVar.c() + yVar.h();
            if (h10 == 134) {
                arrayList = new ArrayList();
                int h11 = yVar.h() & 31;
                for (int i11 = 0; i11 < h11; i11++) {
                    String f = yVar.f(3);
                    int h12 = yVar.h();
                    boolean z11 = true;
                    if ((h12 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = h12 & 63;
                        str = com.anythink.expressad.exoplayer.k.o.X;
                    } else {
                        str = com.anythink.expressad.exoplayer.k.o.W;
                        i10 = 1;
                    }
                    byte h13 = (byte) yVar.h();
                    yVar.e(1);
                    if (z10) {
                        if ((h13 & 64) == 0) {
                            z11 = false;
                        }
                        list = com.applovin.exoplayer2.l.e.a(z11);
                    } else {
                        list = null;
                    }
                    arrayList.add(new v.a().f(str).c(f).p(i10).a(list).a());
                }
            }
            yVar.d(c10);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public SparseArray<ad> a() {
        return new SparseArray<>();
    }

    public g(int i10) {
        this(i10, com.applovin.exoplayer2.common.a.s.g());
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public ad a(int i10, ad.b bVar) {
        if (i10 == 2) {
            return new t(new k(b(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new t(new q(bVar.f14586b));
        }
        if (i10 == 21) {
            return new t(new o());
        }
        if (i10 == 27) {
            if (a(4)) {
                return null;
            }
            return new t(new m(a(bVar), a(1), a(8)));
        }
        if (i10 == 36) {
            return new t(new n(a(bVar)));
        }
        if (i10 != 89) {
            if (i10 != 138) {
                if (i10 == 172) {
                    return new t(new d(bVar.f14586b));
                }
                if (i10 != 257) {
                    if (i10 != 129) {
                        if (i10 != 130) {
                            if (i10 == 134) {
                                if (a(16)) {
                                    return null;
                                }
                                return new y(new s(com.anythink.expressad.exoplayer.k.o.ag));
                            }
                            if (i10 != 135) {
                                switch (i10) {
                                    case 15:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new f(false, bVar.f14586b));
                                    case 16:
                                        return new t(new l(b(bVar)));
                                    case 17:
                                        if (a(2)) {
                                            return null;
                                        }
                                        return new t(new p(bVar.f14586b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (!a(64)) {
                            return null;
                        }
                    }
                    return new t(new b(bVar.f14586b));
                }
                return new y(new s("application/vnd.dvb.ait"));
            }
            return new t(new h(bVar.f14586b));
        }
        return new t(new i(bVar.f14587c));
    }

    public g(int i10, List<com.applovin.exoplayer2.v> list) {
        this.f14655a = i10;
        this.f14656b = list;
    }

    private z a(ad.b bVar) {
        return new z(c(bVar));
    }

    private boolean a(int i10) {
        return (i10 & this.f14655a) != 0;
    }
}
