package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class u implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f8533a;

    /* renamed from: c, reason: collision with root package name */
    private final h f8535c;

    /* renamed from: e, reason: collision with root package name */
    private r.a f8537e;
    private af f;

    /* renamed from: g, reason: collision with root package name */
    private r[] f8538g;

    /* renamed from: h, reason: collision with root package name */
    private z f8539h;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<r> f8536d = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<y, Integer> f8534b = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.f8535c = hVar;
        this.f8533a = rVarArr;
        this.f8539h = hVar.a(new z[0]);
    }

    private void f() {
        this.f8537e.a((r.a) this);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(r.a aVar, long j10) {
        this.f8537e = aVar;
        Collections.addAll(this.f8536d, this.f8533a);
        for (r rVar : this.f8533a) {
            rVar.a(this, j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
        this.f8539h.a_(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final af b() {
        return this.f;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        if (!this.f8536d.isEmpty()) {
            int size = this.f8536d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8536d.get(i10).c(j10);
            }
            return false;
        }
        return this.f8539h.c(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long d() {
        return this.f8539h.d();
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long e() {
        return this.f8539h.e();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long b(long j10) {
        long b10 = this.f8538g[0].b(j10);
        int i10 = 1;
        while (true) {
            r[] rVarArr = this.f8538g;
            if (i10 >= rVarArr.length) {
                return b10;
            }
            if (rVarArr[i10].b(b10) != b10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a() {
        for (r rVar : this.f8533a) {
            rVar.a();
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long c() {
        long c10 = this.f8533a[0].c();
        int i10 = 1;
        while (true) {
            r[] rVarArr = this.f8533a;
            if (i10 >= rVarArr.length) {
                if (c10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    for (r rVar : this.f8538g) {
                        if (rVar != this.f8533a[0] && rVar.b(c10) != c10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return c10;
            }
            if (rVarArr[i10].c() != com.anythink.expressad.exoplayer.b.f7291b) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i10++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(com.anythink.expressad.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j10) {
        y[] yVarArr2 = yVarArr;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            y yVar = yVarArr2[i10];
            iArr[i10] = yVar == null ? -1 : this.f8534b.get(yVar).intValue();
            iArr2[i10] = -1;
            com.anythink.expressad.exoplayer.i.f fVar = fVarArr[i10];
            if (fVar != null) {
                ae f = fVar.f();
                int i11 = 0;
                while (true) {
                    r[] rVarArr = this.f8533a;
                    if (i11 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i11].b().a(f) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f8534b.clear();
        int length = fVarArr.length;
        y[] yVarArr3 = new y[length];
        y[] yVarArr4 = new y[fVarArr.length];
        com.anythink.expressad.exoplayer.i.f[] fVarArr2 = new com.anythink.expressad.exoplayer.i.f[fVarArr.length];
        ArrayList arrayList = new ArrayList(this.f8533a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f8533a.length) {
            for (int i13 = 0; i13 < fVarArr.length; i13++) {
                com.anythink.expressad.exoplayer.i.f fVar2 = null;
                yVarArr4[i13] = iArr[i13] == i12 ? yVarArr2[i13] : null;
                if (iArr2[i13] == i12) {
                    fVar2 = fVarArr[i13];
                }
                fVarArr2[i13] = fVar2;
            }
            int i14 = i12;
            com.anythink.expressad.exoplayer.i.f[] fVarArr3 = fVarArr2;
            ArrayList arrayList2 = arrayList;
            long a10 = this.f8533a[i12].a(fVarArr2, zArr, yVarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = a10;
            } else if (a10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    com.anythink.expressad.exoplayer.k.a.b(yVarArr4[i15] != null);
                    yVarArr3[i15] = yVarArr4[i15];
                    this.f8534b.put(yVarArr4[i15], Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    com.anythink.expressad.exoplayer.k.a.b(yVarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f8533a[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            fVarArr2 = fVarArr3;
            yVarArr2 = yVarArr;
        }
        y[] yVarArr5 = yVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(yVarArr3, 0, yVarArr5, 0, length);
        r[] rVarArr2 = new r[arrayList3.size()];
        this.f8538g = rVarArr2;
        arrayList3.toArray(rVarArr2);
        this.f8539h = this.f8535c.a(this.f8538g);
        return j11;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(long j10, boolean z10) {
        for (r rVar : this.f8538g) {
            rVar.a(j10, z10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        return this.f8538g[0].a(j10, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.expressad.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8536d.remove(rVar);
        if (this.f8536d.isEmpty()) {
            int i10 = 0;
            for (r rVar2 : this.f8533a) {
                i10 += rVar2.b().f8256b;
            }
            ae[] aeVarArr = new ae[i10];
            int i11 = 0;
            for (r rVar3 : this.f8533a) {
                af b10 = rVar3.b();
                int i12 = b10.f8256b;
                int i13 = 0;
                while (i13 < i12) {
                    aeVarArr[i11] = b10.a(i13);
                    i13++;
                    i11++;
                }
            }
            this.f = new af(aeVarArr);
            this.f8537e.a((r) this);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8537e.a((r.a) this);
    }
}
