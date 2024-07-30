package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.g0;
import z4.d0;

/* compiled from: SectionReader.java */
/* loaded from: classes2.dex */
public final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f37292a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f37293b = new d6.w(32);

    /* renamed from: c, reason: collision with root package name */
    public int f37294c;

    /* renamed from: d, reason: collision with root package name */
    public int f37295d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37296e;
    public boolean f;

    public y(x xVar) {
        this.f37292a = xVar;
    }

    @Override // z4.d0
    public final void a() {
        this.f = true;
    }

    @Override // z4.d0
    public final void b(d6.d0 d0Var, p4.j jVar, d0.d dVar) {
        this.f37292a.b(d0Var, jVar, dVar);
        this.f = true;
    }

    @Override // z4.d0
    public final void c(int i10, d6.w wVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = wVar.f27385b + wVar.t();
        } else {
            i11 = -1;
        }
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            wVar.E(i11);
            this.f37295d = 0;
        }
        while (true) {
            int i12 = wVar.f27386c;
            int i13 = wVar.f27385b;
            if (i12 - i13 > 0) {
                int i14 = this.f37295d;
                d6.w wVar2 = this.f37293b;
                if (i14 < 3) {
                    if (i14 == 0) {
                        int t10 = wVar.t();
                        wVar.E(wVar.f27385b - 1);
                        if (t10 == 255) {
                            this.f = true;
                            return;
                        }
                    }
                    int min = Math.min(wVar.f27386c - wVar.f27385b, 3 - this.f37295d);
                    wVar.b(wVar2.f27384a, this.f37295d, min);
                    int i15 = this.f37295d + min;
                    this.f37295d = i15;
                    if (i15 == 3) {
                        wVar2.E(0);
                        wVar2.D(3);
                        wVar2.F(1);
                        int t11 = wVar2.t();
                        int t12 = wVar2.t();
                        if ((t11 & 128) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f37296e = z11;
                        int i16 = (((t11 & 15) << 8) | t12) + 3;
                        this.f37294c = i16;
                        byte[] bArr = wVar2.f27384a;
                        if (bArr.length < i16) {
                            wVar2.a(Math.min(4098, Math.max(i16, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i12 - i13, this.f37294c - i14);
                    wVar.b(wVar2.f27384a, this.f37295d, min2);
                    int i17 = this.f37295d + min2;
                    this.f37295d = i17;
                    int i18 = this.f37294c;
                    if (i17 != i18) {
                        continue;
                    } else {
                        if (this.f37296e) {
                            byte[] bArr2 = wVar2.f27384a;
                            int i19 = g0.f27302a;
                            int i20 = -1;
                            for (int i21 = 0; i21 < i18; i21++) {
                                i20 = g0.f27313m[((i20 >>> 24) ^ (bArr2[i21] & DefaultClassResolver.NAME)) & com.anythink.expressad.exoplayer.k.p.f9095b] ^ (i20 << 8);
                            }
                            if (i20 != 0) {
                                this.f = true;
                                return;
                            }
                            wVar2.D(this.f37294c - 4);
                        } else {
                            wVar2.D(i18);
                        }
                        wVar2.E(0);
                        this.f37292a.c(wVar2);
                        this.f37295d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }
}
