package z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i0;
import z4.d0;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes2.dex */
public final class g implements d0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f37085a;

    /* renamed from: b, reason: collision with root package name */
    public final List<i0> f37086b;

    public g(int i10, List<i0> list) {
        this.f37085a = i10;
        this.f37086b = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0030. Please report as an issue. */
    @Override // z4.d0.c
    public final d0 a(int i10, d0.b bVar) {
        if (i10 != 2) {
            String str = bVar.f37044a;
            if (i10 != 3 && i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 27) {
                        if (i10 != 36) {
                            if (i10 != 89) {
                                if (i10 != 138) {
                                    if (i10 != 172) {
                                        if (i10 != 257) {
                                            if (i10 != 134) {
                                                if (i10 != 135) {
                                                    switch (i10) {
                                                        case 15:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new f(false, str));
                                                        case 16:
                                                            return new t(new l(new e0(b(bVar))));
                                                        case 17:
                                                            if (c(2)) {
                                                                return null;
                                                            }
                                                            return new t(new p(str));
                                                        default:
                                                            switch (i10) {
                                                                case 128:
                                                                    break;
                                                                case com.anythink.expressad.video.module.a.a.T /* 129 */:
                                                                    break;
                                                                case 130:
                                                                    if (!c(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new t(new b(str));
                                            }
                                            if (c(16)) {
                                                return null;
                                            }
                                            return new y(new s(com.anythink.expressad.exoplayer.k.o.ag));
                                        }
                                        return new y(new s("application/vnd.dvb.ait"));
                                    }
                                    return new t(new d(str));
                                }
                                return new t(new h(str));
                            }
                            return new t(new i(bVar.f37045b));
                        }
                        return new t(new n(new z(b(bVar))));
                    }
                    if (c(4)) {
                        return null;
                    }
                    return new t(new m(new z(b(bVar)), c(1), c(8)));
                }
                return new t(new o());
            }
            return new t(new q(str));
        }
        return new t(new k(new e0(b(bVar))));
    }

    public final List<i0> b(d0.b bVar) {
        boolean z10;
        String str;
        int i10;
        List<byte[]> list;
        boolean z11;
        byte[] bArr;
        boolean c10 = c(32);
        List<i0> list2 = this.f37086b;
        if (c10) {
            return list2;
        }
        d6.w wVar = new d6.w(bVar.f37046c);
        while (wVar.f27386c - wVar.f27385b > 0) {
            int t10 = wVar.t();
            int t11 = wVar.f27385b + wVar.t();
            if (t10 == 134) {
                ArrayList arrayList = new ArrayList();
                int t12 = wVar.t() & 31;
                for (int i11 = 0; i11 < t12; i11++) {
                    String q10 = wVar.q(3);
                    int t13 = wVar.t();
                    if ((t13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = t13 & 63;
                        str = com.anythink.expressad.exoplayer.k.o.X;
                    } else {
                        str = com.anythink.expressad.exoplayer.k.o.W;
                        i10 = 1;
                    }
                    byte t14 = (byte) wVar.t();
                    wVar.F(1);
                    if (z10) {
                        if ((t14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    i0.a aVar = new i0.a();
                    aVar.f30534k = str;
                    aVar.f30527c = q10;
                    aVar.C = i10;
                    aVar.f30536m = list;
                    arrayList.add(new i0(aVar));
                }
                list2 = arrayList;
            }
            wVar.E(t11);
        }
        return list2;
    }

    public final boolean c(int i10) {
        if ((i10 & this.f37085a) != 0) {
            return true;
        }
        return false;
    }
}
