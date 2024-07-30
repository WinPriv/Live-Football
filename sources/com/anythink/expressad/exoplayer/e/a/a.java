package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.huawei.hms.ads.jsb.constant.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7736a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7741b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7742c = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7743d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7744e = 0;
    public final int aU;
    public static final int f = af.f("ftyp");

    /* renamed from: g, reason: collision with root package name */
    public static final int f7745g = af.f("avc1");

    /* renamed from: h, reason: collision with root package name */
    public static final int f7746h = af.f("avc3");

    /* renamed from: i, reason: collision with root package name */
    public static final int f7747i = af.f("hvc1");

    /* renamed from: j, reason: collision with root package name */
    public static final int f7748j = af.f("hev1");

    /* renamed from: k, reason: collision with root package name */
    public static final int f7749k = af.f("s263");

    /* renamed from: l, reason: collision with root package name */
    public static final int f7750l = af.f("d263");

    /* renamed from: m, reason: collision with root package name */
    public static final int f7751m = af.f("mdat");

    /* renamed from: n, reason: collision with root package name */
    public static final int f7752n = af.f("mp4a");
    public static final int o = af.f(".mp3");

    /* renamed from: p, reason: collision with root package name */
    public static final int f7753p = af.f("wave");

    /* renamed from: q, reason: collision with root package name */
    public static final int f7754q = af.f("lpcm");

    /* renamed from: r, reason: collision with root package name */
    public static final int f7755r = af.f("sowt");

    /* renamed from: s, reason: collision with root package name */
    public static final int f7756s = af.f("ac-3");

    /* renamed from: t, reason: collision with root package name */
    public static final int f7757t = af.f("dac3");

    /* renamed from: u, reason: collision with root package name */
    public static final int f7758u = af.f("ec-3");

    /* renamed from: v, reason: collision with root package name */
    public static final int f7759v = af.f("dec3");

    /* renamed from: w, reason: collision with root package name */
    public static final int f7760w = af.f("dtsc");

    /* renamed from: x, reason: collision with root package name */
    public static final int f7761x = af.f("dtsh");
    public static final int y = af.f("dtsl");

    /* renamed from: z, reason: collision with root package name */
    public static final int f7762z = af.f("dtse");
    public static final int A = af.f("ddts");
    public static final int B = af.f("tfdt");
    public static final int C = af.f("tfhd");
    public static final int D = af.f("trex");
    public static final int E = af.f("trun");
    public static final int F = af.f("sidx");
    public static final int G = af.f("moov");
    public static final int H = af.f("mvhd");
    public static final int I = af.f("trak");
    public static final int J = af.f("mdia");
    public static final int K = af.f("minf");
    public static final int L = af.f("stbl");
    public static final int M = af.f("avcC");
    public static final int N = af.f("hvcC");
    public static final int O = af.f("esds");
    public static final int P = af.f("moof");
    public static final int Q = af.f("traf");
    public static final int R = af.f("mvex");
    public static final int S = af.f("mehd");
    public static final int T = af.f("tkhd");
    public static final int U = af.f("edts");
    public static final int V = af.f("elst");
    public static final int W = af.f("mdhd");
    public static final int X = af.f("hdlr");
    public static final int Y = af.f("stsd");
    public static final int Z = af.f("pssh");

    /* renamed from: aa, reason: collision with root package name */
    public static final int f7737aa = af.f("sinf");

    /* renamed from: ab, reason: collision with root package name */
    public static final int f7738ab = af.f("schm");

    /* renamed from: ac, reason: collision with root package name */
    public static final int f7739ac = af.f("schi");

    /* renamed from: ad, reason: collision with root package name */
    public static final int f7740ad = af.f("tenc");
    public static final int ae = af.f("encv");
    public static final int af = af.f("enca");
    public static final int ag = af.f("frma");
    public static final int ah = af.f("saiz");
    public static final int ai = af.f("saio");
    public static final int aj = af.f("sbgp");
    public static final int ak = af.f("sgpd");
    public static final int al = af.f(Constant.MAP_KEY_UUID);
    public static final int am = af.f("senc");
    public static final int an = af.f("pasp");
    public static final int ao = af.f("TTML");
    public static final int ap = af.f("vmhd");
    public static final int aq = af.f("mp4v");
    public static final int ar = af.f("stts");
    public static final int as = af.f("stss");
    public static final int at = af.f("ctts");
    public static final int au = af.f("stsc");
    public static final int av = af.f("stsz");
    public static final int aw = af.f("stz2");
    public static final int ax = af.f("stco");
    public static final int ay = af.f("co64");
    public static final int az = af.f("tx3g");
    public static final int aA = af.f("wvtt");
    public static final int aB = af.f("stpp");
    public static final int aC = af.f("c608");
    public static final int aD = af.f("samr");
    public static final int aE = af.f("sawb");
    public static final int aF = af.f("udta");
    public static final int aG = af.f("meta");
    public static final int aH = af.f("ilst");
    public static final int aI = af.f("mean");
    public static final int aJ = af.f("name");
    public static final int aK = af.f("data");
    public static final int aL = af.f("emsg");
    public static final int aM = af.f("st3d");
    public static final int aN = af.f("sv3d");
    public static final int aO = af.f("proj");
    public static final int aP = af.f("vp08");
    public static final int aQ = af.f("vp09");
    public static final int aR = af.f("vpcC");
    public static final int aS = af.f("camm");
    public static final int aT = af.f("alac");

    /* renamed from: com.anythink.expressad.exoplayer.e.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0101a extends a {
        public final long aV;
        public final List<b> aW;
        public final List<C0101a> aX;

        public C0101a(int i10, long j10) {
            super(i10);
            this.aV = j10;
            this.aW = new ArrayList();
            this.aX = new ArrayList();
        }

        private int f(int i10) {
            int size = this.aW.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                if (this.aW.get(i12).aU == i10) {
                    i11++;
                }
            }
            int size2 = this.aX.size();
            for (int i13 = 0; i13 < size2; i13++) {
                if (this.aX.get(i13).aU == i10) {
                    i11++;
                }
            }
            return i11;
        }

        public final void a(b bVar) {
            this.aW.add(bVar);
        }

        public final b d(int i10) {
            int size = this.aW.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.aW.get(i11);
                if (bVar.aU == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public final C0101a e(int i10) {
            int size = this.aX.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0101a c0101a = this.aX.get(i11);
                if (c0101a.aU == i10) {
                    return c0101a;
                }
            }
            return null;
        }

        @Override // com.anythink.expressad.exoplayer.e.a.a
        public final String toString() {
            return a.c(this.aU) + " leaves: " + Arrays.toString(this.aW.toArray()) + " containers: " + Arrays.toString(this.aX.toArray());
        }

        public final void a(C0101a c0101a) {
            this.aX.add(c0101a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public final s aV;

        public b(int i10, s sVar) {
            super(i10);
            this.aV = sVar;
        }
    }

    public a(int i10) {
        this.aU = i10;
    }

    public static int a(int i10) {
        return (i10 >> 24) & p.f9095b;
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & p.f9095b));
        sb2.append((char) ((i10 >> 16) & p.f9095b));
        sb2.append((char) ((i10 >> 8) & p.f9095b));
        sb2.append((char) (i10 & p.f9095b));
        return sb2.toString();
    }

    public String toString() {
        return c(this.aU);
    }
}
