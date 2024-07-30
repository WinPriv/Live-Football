package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.e.h {

    /* renamed from: a */
    public static final com.applovin.exoplayer2.e.l f14557a = new com.applovin.exoplayer2.e.f.h(2);

    /* renamed from: b */
    private final int f14558b;

    /* renamed from: c */
    private final int f14559c;

    /* renamed from: d */
    private final List<ag> f14560d;

    /* renamed from: e */
    private final com.applovin.exoplayer2.l.y f14561e;
    private final SparseIntArray f;

    /* renamed from: g */
    private final ad.c f14562g;

    /* renamed from: h */
    private final SparseArray<ad> f14563h;

    /* renamed from: i */
    private final SparseBooleanArray f14564i;

    /* renamed from: j */
    private final SparseBooleanArray f14565j;

    /* renamed from: k */
    private final ab f14566k;

    /* renamed from: l */
    private aa f14567l;

    /* renamed from: m */
    private com.applovin.exoplayer2.e.j f14568m;

    /* renamed from: n */
    private int f14569n;
    private boolean o;

    /* renamed from: p */
    private boolean f14570p;

    /* renamed from: q */
    private boolean f14571q;

    /* renamed from: r */
    private ad f14572r;

    /* renamed from: s */
    private int f14573s;

    /* renamed from: t */
    private int f14574t;

    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: b */
        private final com.applovin.exoplayer2.l.x f14576b = new com.applovin.exoplayer2.l.x(new byte[4]);

        public a() {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            if (yVar.h() == 0 && (yVar.h() & 128) != 0) {
                yVar.e(6);
                int a10 = yVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    yVar.a(this.f14576b, 4);
                    int c10 = this.f14576b.c(16);
                    this.f14576b.b(3);
                    if (c10 == 0) {
                        this.f14576b.b(13);
                    } else {
                        int c11 = this.f14576b.c(13);
                        if (ac.this.f14563h.get(c11) == null) {
                            ac.this.f14563h.put(c11, new y(new b(c11)));
                            ac.b(ac.this);
                        }
                    }
                }
                if (ac.this.f14558b != 2) {
                    ac.this.f14563h.remove(0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements x {

        /* renamed from: b */
        private final com.applovin.exoplayer2.l.x f14578b = new com.applovin.exoplayer2.l.x(new byte[5]);

        /* renamed from: c */
        private final SparseArray<ad> f14579c = new SparseArray<>();

        /* renamed from: d */
        private final SparseIntArray f14580d = new SparseIntArray();

        /* renamed from: e */
        private final int f14581e;

        public b(int i10) {
            this.f14581e = i10;
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            ag agVar;
            if (yVar.h() != 2) {
                return;
            }
            if (ac.this.f14558b == 1 || ac.this.f14558b == 2 || ac.this.f14569n == 1) {
                agVar = (ag) ac.this.f14560d.get(0);
            } else {
                agVar = new ag(((ag) ac.this.f14560d.get(0)).a());
                ac.this.f14560d.add(agVar);
            }
            if ((yVar.h() & 128) == 0) {
                return;
            }
            yVar.e(1);
            int i10 = yVar.i();
            int i11 = 3;
            yVar.e(3);
            yVar.a(this.f14578b, 2);
            this.f14578b.b(3);
            int i12 = 13;
            ac.this.f14574t = this.f14578b.c(13);
            yVar.a(this.f14578b, 2);
            int i13 = 4;
            this.f14578b.b(4);
            yVar.e(this.f14578b.c(12));
            if (ac.this.f14558b == 2 && ac.this.f14572r == null) {
                ad.b bVar = new ad.b(21, null, null, ai.f);
                ac acVar = ac.this;
                acVar.f14572r = acVar.f14562g.a(21, bVar);
                if (ac.this.f14572r != null) {
                    ac.this.f14572r.a(agVar, ac.this.f14568m, new ad.d(i10, 21, 8192));
                }
            }
            this.f14579c.clear();
            this.f14580d.clear();
            int a10 = yVar.a();
            while (a10 > 0) {
                yVar.a(this.f14578b, 5);
                int c10 = this.f14578b.c(8);
                this.f14578b.b(i11);
                int c11 = this.f14578b.c(i12);
                this.f14578b.b(i13);
                int c12 = this.f14578b.c(12);
                ad.b a11 = a(yVar, c12);
                if (c10 == 6 || c10 == 5) {
                    c10 = a11.f14585a;
                }
                a10 -= c12 + 5;
                int i14 = ac.this.f14558b == 2 ? c10 : c11;
                if (!ac.this.f14564i.get(i14)) {
                    ad a12 = (ac.this.f14558b == 2 && c10 == 21) ? ac.this.f14572r : ac.this.f14562g.a(c10, a11);
                    if (ac.this.f14558b != 2 || c11 < this.f14580d.get(i14, 8192)) {
                        this.f14580d.put(i14, c11);
                        this.f14579c.put(i14, a12);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.f14580d.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = this.f14580d.keyAt(i15);
                int valueAt = this.f14580d.valueAt(i15);
                ac.this.f14564i.put(keyAt, true);
                ac.this.f14565j.put(valueAt, true);
                ad valueAt2 = this.f14579c.valueAt(i15);
                if (valueAt2 != null) {
                    if (valueAt2 != ac.this.f14572r) {
                        valueAt2.a(agVar, ac.this.f14568m, new ad.d(i10, keyAt, 8192));
                    }
                    ac.this.f14563h.put(valueAt, valueAt2);
                }
            }
            if (ac.this.f14558b == 2) {
                if (ac.this.o) {
                    return;
                }
                ac.this.f14568m.a();
                ac.this.f14569n = 0;
                ac.this.o = true;
                return;
            }
            ac.this.f14563h.remove(this.f14581e);
            ac acVar2 = ac.this;
            acVar2.f14569n = acVar2.f14558b == 1 ? 0 : ac.this.f14569n - 1;
            if (ac.this.f14569n == 0) {
                ac.this.f14568m.a();
                ac.this.o = true;
            }
        }

        private ad.b a(com.applovin.exoplayer2.l.y yVar, int i10) {
            int c10 = yVar.c();
            int i11 = i10 + c10;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (yVar.c() < i11) {
                int h10 = yVar.h();
                int c11 = yVar.c() + yVar.h();
                if (c11 > i11) {
                    break;
                }
                if (h10 == 5) {
                    long o = yVar.o();
                    if (o != 1094921523) {
                        if (o != 1161904947) {
                            if (o != 1094921524) {
                                if (o == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (h10 != 106) {
                        if (h10 != 122) {
                            if (h10 == 127) {
                                if (yVar.h() != 21) {
                                }
                                i12 = 172;
                            } else if (h10 == 123) {
                                i12 = 138;
                            } else if (h10 == 10) {
                                str = yVar.f(3).trim();
                            } else if (h10 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (yVar.c() < c11) {
                                    String trim = yVar.f(3).trim();
                                    int h11 = yVar.h();
                                    byte[] bArr = new byte[4];
                                    yVar.a(bArr, 0, 4);
                                    arrayList2.add(new ad.a(trim, h11, bArr));
                                }
                                arrayList = arrayList2;
                                i12 = 89;
                            } else if (h10 == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                yVar.e(c11 - yVar.c());
            }
            yVar.d(i11);
            return new ad.b(i12, str, arrayList, Arrays.copyOfRange(yVar.d(), c10, i11));
        }
    }

    public ac() {
        this(0);
    }

    public static /* synthetic */ int b(ac acVar) {
        int i10 = acVar.f14569n;
        acVar.f14569n = i10 + 1;
        return i10;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    public ac(int i10) {
        this(1, i10, 112800);
    }

    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new ac()};
    }

    public ac(int i10, int i11, int i12) {
        this(i10, new ag(0L), new g(i11), i12);
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] d10 = this.f14561e.d();
        if (9400 - this.f14561e.c() < 188) {
            int a10 = this.f14561e.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f14561e.c(), d10, 0, a10);
            }
            this.f14561e.a(d10, a10);
        }
        while (this.f14561e.a() < 188) {
            int b10 = this.f14561e.b();
            int a11 = iVar.a(d10, b10, 9400 - b10);
            if (a11 == -1) {
                return false;
            }
            this.f14561e.c(b10 + a11);
        }
        return true;
    }

    public ac(int i10, ag agVar, ad.c cVar, int i11) {
        this.f14562g = (ad.c) com.applovin.exoplayer2.l.a.b(cVar);
        this.f14559c = i11;
        this.f14558b = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f14560d = arrayList;
            arrayList.add(agVar);
        } else {
            this.f14560d = Collections.singletonList(agVar);
        }
        this.f14561e = new com.applovin.exoplayer2.l.y(new byte[9400], 0);
        this.f14564i = new SparseBooleanArray();
        this.f14565j = new SparseBooleanArray();
        this.f14563h = new SparseArray<>();
        this.f = new SparseIntArray();
        this.f14566k = new ab(i11);
        this.f14568m = com.applovin.exoplayer2.e.j.f14871a;
        this.f14574t = -1;
        b();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        boolean z10;
        byte[] d10 = this.f14561e.d();
        iVar.d(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                iVar.b(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f14568m = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        aa aaVar;
        com.applovin.exoplayer2.l.a.b(this.f14558b != 2);
        int size = this.f14560d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ag agVar = this.f14560d.get(i10);
            boolean z10 = agVar.c() == com.anythink.expressad.exoplayer.b.f7291b;
            if (!z10) {
                long a10 = agVar.a();
                z10 = (a10 == com.anythink.expressad.exoplayer.b.f7291b || a10 == 0 || a10 == j11) ? false : true;
            }
            if (z10) {
                agVar.a(j11);
            }
        }
        if (j11 != 0 && (aaVar = this.f14567l) != null) {
            aaVar.a(j11);
        }
        this.f14561e.a(0);
        this.f.clear();
        for (int i11 = 0; i11 < this.f14563h.size(); i11++) {
            this.f14563h.valueAt(i11).a();
        }
        this.f14573s = 0;
    }

    private void b() {
        this.f14564i.clear();
        this.f14563h.clear();
        SparseArray<ad> a10 = this.f14562g.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14563h.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f14563h.put(0, new y(new a()));
        this.f14572r = null;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        long d10 = iVar.d();
        if (this.o) {
            if (((d10 == -1 || this.f14558b == 2) ? false : true) && !this.f14566k.a()) {
                return this.f14566k.a(iVar, uVar, this.f14574t);
            }
            a(d10);
            if (this.f14571q) {
                this.f14571q = false;
                a(0L, 0L);
                if (iVar.c() != 0) {
                    uVar.f14937a = 0L;
                    return 1;
                }
            }
            aa aaVar = this.f14567l;
            if (aaVar != null && aaVar.b()) {
                return this.f14567l.a(iVar, uVar);
            }
        }
        if (!b(iVar)) {
            return -1;
        }
        int a10 = a();
        int b10 = this.f14561e.b();
        if (a10 > b10) {
            return 0;
        }
        int q10 = this.f14561e.q();
        if ((8388608 & q10) != 0) {
            this.f14561e.d(a10);
            return 0;
        }
        int i10 = ((4194304 & q10) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & q10) >> 8;
        boolean z10 = (q10 & 32) != 0;
        ad adVar = (q10 & 16) != 0 ? this.f14563h.get(i11) : null;
        if (adVar == null) {
            this.f14561e.d(a10);
            return 0;
        }
        if (this.f14558b != 2) {
            int i12 = q10 & 15;
            int i13 = this.f.get(i11, i12 - 1);
            this.f.put(i11, i12);
            if (i13 == i12) {
                this.f14561e.d(a10);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                adVar.a();
            }
        }
        if (z10) {
            int h10 = this.f14561e.h();
            i10 |= (this.f14561e.h() & 64) != 0 ? 2 : 0;
            this.f14561e.e(h10 - 1);
        }
        boolean z11 = this.o;
        if (a(i11)) {
            this.f14561e.c(a10);
            adVar.a(this.f14561e, i10);
            this.f14561e.c(b10);
        }
        if (this.f14558b != 2 && !z11 && this.o && d10 != -1) {
            this.f14571q = true;
        }
        this.f14561e.d(a10);
        return 0;
    }

    private void a(long j10) {
        if (this.f14570p) {
            return;
        }
        this.f14570p = true;
        if (this.f14566k.b() != com.anythink.expressad.exoplayer.b.f7291b) {
            aa aaVar = new aa(this.f14566k.c(), this.f14566k.b(), j10, this.f14574t, this.f14559c);
            this.f14567l = aaVar;
            this.f14568m.a(aaVar.a());
            return;
        }
        this.f14568m.a(new v.b(this.f14566k.b()));
    }

    private int a() throws com.applovin.exoplayer2.ai {
        int c10 = this.f14561e.c();
        int b10 = this.f14561e.b();
        int a10 = ae.a(this.f14561e.d(), c10, b10);
        this.f14561e.d(a10);
        int i10 = a10 + 188;
        if (i10 > b10) {
            int i11 = (a10 - c10) + this.f14573s;
            this.f14573s = i11;
            if (this.f14558b == 2 && i11 > 376) {
                throw com.applovin.exoplayer2.ai.b("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f14573s = 0;
        }
        return i10;
    }

    private boolean a(int i10) {
        return this.f14558b == 2 || this.o || !this.f14565j.get(i10, false);
    }
}
