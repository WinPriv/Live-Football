package r4;

import a3.k;
import com.anythink.expressad.exoplayer.k.o;
import d6.g0;
import d6.p;
import d6.w;
import j7.j0;
import j7.v1;
import k4.i0;

/* compiled from: ListChunk.java */
/* loaded from: classes2.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final j0<a> f34888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34889b;

    public f(int i10, v1 v1Var) {
        this.f34889b = i10;
        this.f34888a = v1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0036. Please report as an issue. */
    public static f b(int i10, w wVar) {
        a aVar;
        String str;
        String str2;
        a gVar;
        j0.a aVar2 = new j0.a();
        int i11 = wVar.f27386c;
        int i12 = -2;
        while (wVar.f27386c - wVar.f27385b > 8) {
            int g6 = wVar.g();
            int g10 = wVar.f27385b + wVar.g();
            wVar.D(g10);
            if (g6 == 1414744396) {
                aVar = b(wVar.g(), wVar);
            } else {
                switch (g6) {
                    case 1718776947:
                        if (i12 == 2) {
                            wVar.F(4);
                            int g11 = wVar.g();
                            int g12 = wVar.g();
                            wVar.F(4);
                            int g13 = wVar.g();
                            switch (g13) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = o.f9078l;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = o.f9074h;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                k.s("Ignoring track with unsupported compression ", g13, "StreamFormatChunk");
                            } else {
                                i0.a aVar3 = new i0.a();
                                aVar3.f30538p = g11;
                                aVar3.f30539q = g12;
                                aVar3.f30534k = str2;
                                gVar = new g(new i0(aVar3));
                                aVar = gVar;
                                break;
                            }
                        } else if (i12 == 1) {
                            int l10 = wVar.l();
                            if (l10 != 1) {
                                if (l10 != 85) {
                                    if (l10 != 255) {
                                        if (l10 != 8192) {
                                            if (l10 != 8193) {
                                                str = null;
                                            } else {
                                                str = o.D;
                                            }
                                        } else {
                                            str = o.f9090z;
                                        }
                                    } else {
                                        str = o.f9083r;
                                    }
                                } else {
                                    str = o.f9085t;
                                }
                            } else {
                                str = o.f9088w;
                            }
                            if (str == null) {
                                k.s("Ignoring track with unsupported format tag ", l10, "StreamFormatChunk");
                            } else {
                                int l11 = wVar.l();
                                int g14 = wVar.g();
                                wVar.F(6);
                                int v3 = g0.v(wVar.y());
                                int l12 = wVar.l();
                                byte[] bArr = new byte[l12];
                                wVar.b(bArr, 0, l12);
                                i0.a aVar4 = new i0.a();
                                aVar4.f30534k = str;
                                aVar4.f30546x = l11;
                                aVar4.y = g14;
                                if (o.f9088w.equals(str) && v3 != 0) {
                                    aVar4.f30547z = v3;
                                }
                                if (o.f9083r.equals(str) && l12 > 0) {
                                    aVar4.f30536m = j0.G(bArr);
                                }
                                aVar = new g(new i0(aVar4));
                                break;
                            }
                        } else {
                            p.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + g0.B(i12));
                        }
                        aVar = null;
                        break;
                    case 1751742049:
                        int g15 = wVar.g();
                        wVar.F(8);
                        int g16 = wVar.g();
                        int g17 = wVar.g();
                        wVar.F(4);
                        wVar.g();
                        wVar.F(12);
                        aVar = new c(g15, g16, g17);
                        break;
                    case 1752331379:
                        int g18 = wVar.g();
                        wVar.F(12);
                        wVar.g();
                        int g19 = wVar.g();
                        int g20 = wVar.g();
                        wVar.F(4);
                        int g21 = wVar.g();
                        int g22 = wVar.g();
                        wVar.F(8);
                        gVar = new d(g18, g19, g20, g21, g22);
                        aVar = gVar;
                        break;
                    case 1852994675:
                        aVar = new h(wVar.q(wVar.f27386c - wVar.f27385b));
                        break;
                    default:
                        aVar = null;
                        break;
                }
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    int i13 = ((d) aVar).f34872a;
                    if (i13 != 1935960438) {
                        if (i13 != 1935963489) {
                            if (i13 != 1937012852) {
                                p.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i13));
                                i12 = -1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                }
                aVar2.b(aVar);
            }
            wVar.E(g10);
            wVar.D(i11);
        }
        return new f(i10, aVar2.e());
    }

    public final <T extends a> T a(Class<T> cls) {
        j0.b listIterator = this.f34888a.listIterator(0);
        while (listIterator.hasNext()) {
            T t10 = (T) listIterator.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // r4.a
    public final int getType() {
        return this.f34889b;
    }
}
