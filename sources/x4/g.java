package x4;

import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import d6.g0;
import d6.s;
import d6.w;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p4.u;
import p4.x;
import x4.a;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes2.dex */
public final class g implements p4.h, u {

    /* renamed from: a, reason: collision with root package name */
    public final int f36402a;

    /* renamed from: b, reason: collision with root package name */
    public final w f36403b;

    /* renamed from: c, reason: collision with root package name */
    public final w f36404c;

    /* renamed from: d, reason: collision with root package name */
    public final w f36405d;

    /* renamed from: e, reason: collision with root package name */
    public final w f36406e;
    public final ArrayDeque<a.C0507a> f;

    /* renamed from: g, reason: collision with root package name */
    public final i f36407g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f36408h;

    /* renamed from: i, reason: collision with root package name */
    public int f36409i;

    /* renamed from: j, reason: collision with root package name */
    public int f36410j;

    /* renamed from: k, reason: collision with root package name */
    public long f36411k;

    /* renamed from: l, reason: collision with root package name */
    public int f36412l;

    /* renamed from: m, reason: collision with root package name */
    public w f36413m;

    /* renamed from: n, reason: collision with root package name */
    public int f36414n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f36415p;

    /* renamed from: q, reason: collision with root package name */
    public int f36416q;

    /* renamed from: r, reason: collision with root package name */
    public p4.j f36417r;

    /* renamed from: s, reason: collision with root package name */
    public a[] f36418s;

    /* renamed from: t, reason: collision with root package name */
    public long[][] f36419t;

    /* renamed from: u, reason: collision with root package name */
    public int f36420u;

    /* renamed from: v, reason: collision with root package name */
    public long f36421v;

    /* renamed from: w, reason: collision with root package name */
    public int f36422w;

    /* renamed from: x, reason: collision with root package name */
    public MotionPhotoMetadata f36423x;

    /* compiled from: Mp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k f36424a;

        /* renamed from: b, reason: collision with root package name */
        public final n f36425b;

        /* renamed from: c, reason: collision with root package name */
        public final p4.w f36426c;

        /* renamed from: d, reason: collision with root package name */
        public final x f36427d;

        /* renamed from: e, reason: collision with root package name */
        public int f36428e;

        public a(k kVar, n nVar, p4.w wVar) {
            x xVar;
            this.f36424a = kVar;
            this.f36425b = nVar;
            this.f36426c = wVar;
            if (o.C.equals(kVar.f.D)) {
                xVar = new x();
            } else {
                xVar = null;
            }
            this.f36427d = xVar;
        }
    }

    public g() {
        this(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x0073. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:163:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x066d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r37, p4.t r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.g.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        boolean z10;
        if ((this.f36402a & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return j.a(iVar, false, z10);
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f36417r = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.f.clear();
        this.f36412l = 0;
        this.f36414n = -1;
        this.o = 0;
        this.f36415p = 0;
        this.f36416q = 0;
        if (j10 == 0) {
            if (this.f36409i != 3) {
                this.f36409i = 0;
                this.f36412l = 0;
                return;
            } else {
                i iVar = this.f36407g;
                iVar.f36434a.clear();
                iVar.f36435b = 0;
                this.f36408h.clear();
                return;
            }
        }
        for (a aVar : this.f36418s) {
            n nVar = aVar.f36425b;
            int f = g0.f(nVar.f, j11, false);
            while (true) {
                if (f >= 0) {
                    if ((nVar.f36475g[f] & 1) != 0) {
                        break;
                    } else {
                        f--;
                    }
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = nVar.a(j11);
            }
            aVar.f36428e = f;
            x xVar = aVar.f36427d;
            if (xVar != null) {
                xVar.f34362b = false;
                xVar.f34363c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8 A[EDGE_INSN: B:64:0x00d8->B:65:0x00d8 BREAK  A[LOOP:1: B:28:0x006e->B:56:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    @Override // p4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p4.u.a h(long r17) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.g.h(long):p4.u$a");
    }

    @Override // p4.u
    public final long i() {
        return this.f36421v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b5, code lost:
    
        r7 = -1;
        r6 = -1;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ba, code lost:
    
        r8 = r4.f27385b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bc, code lost:
    
        if (r8 >= r10) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        r12 = r4.d();
        r8 = r4.d();
        r20 = r9;
        r4.F(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d1, code lost:
    
        if (r8 != 1835360622) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d3, code lost:
    
        r0 = r4.o(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f3, code lost:
    
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01dd, code lost:
    
        if (r8 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01df, code lost:
    
        r2 = r4.o(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e9, code lost:
    
        if (r8 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01eb, code lost:
    
        r7 = r12;
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ee, code lost:
    
        r4.F(r12 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f6, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f8, code lost:
    
        if (r0 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fa, code lost:
    
        if (r2 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fd, code lost:
    
        if (r6 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0201, code lost:
    
        r4.E(r6);
        r4.F(16);
        r2 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r0, r2, r4.o(r7 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ad, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0217, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x029a, code lost:
    
        d6.p.b("MetadataUtil", "Skipped unknown metadata entry: " + x4.a.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c8, code lost:
    
        r6 = x4.f.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00cc, code lost:
    
        if (r6 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00d0, code lost:
    
        if (r6 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d2, code lost:
    
        r6 = x4.f.f36401a[r6 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00da, code lost:
    
        if (r6 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00dc, code lost:
    
        r2 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, j7.j0.G(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00e7, code lost:
    
        d6.p.f("MetadataUtil", "Failed to parse standard genre code");
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d9, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ce, code lost:
    
        r4.E(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x021b, code lost:
    
        r20 = r9;
        r7 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0224, code lost:
    
        if (r7 != 6516084) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0226, code lost:
    
        r2 = x4.f.a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0232, code lost:
    
        if (r7 == 7233901) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0237, code lost:
    
        if (r7 != 7631467) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023e, code lost:
    
        if (r7 == 6516589) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0243, code lost:
    
        if (r7 != 7828084) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024a, code lost:
    
        if (r7 != 6578553) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024c, code lost:
    
        r2 = x4.f.d(r6, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0257, code lost:
    
        if (r7 != 4280916) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0259, code lost:
    
        r2 = x4.f.d(r6, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0263, code lost:
    
        if (r7 != 7630703) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0265, code lost:
    
        r2 = x4.f.d(r6, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x026f, code lost:
    
        if (r7 != 6384738) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0271, code lost:
    
        r2 = x4.f.d(r6, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x027b, code lost:
    
        if (r7 != 7108978) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x027d, code lost:
    
        r2 = x4.f.d(r6, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0287, code lost:
    
        if (r7 != 6776174) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0289, code lost:
    
        r2 = x4.f.d(r6, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0291, code lost:
    
        if (r7 != 6779504) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0293, code lost:
    
        r2 = x4.f.d(r6, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02af, code lost:
    
        r2 = x4.f.d(r6, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02b6, code lost:
    
        r2 = x4.f.d(r6, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02d2, code lost:
    
        r17 = r0;
        r18 = r2;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02dc, code lost:
    
        if (r5.isEmpty() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02df, code lost:
    
        r0 = new com.google.android.exoplayer2.metadata.Metadata(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r4.E(r7);
        r7 = r7 + r8;
        r4.F(r10);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r6 = r4.f27385b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r6 >= r7) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r10 = r4.d() + r6;
        r6 = r4.d();
        r12 = (r6 >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b;
        r16 = r7;
        r17 = r0;
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r12 == 169) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r12 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r6 != 1735291493) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r6 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r2 = x4.f.c(r6, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02bf, code lost:
    
        if (r2 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02c1, code lost:
    
        r5.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02c4, code lost:
    
        r7 = r16;
        r0 = r17;
        r2 = r18;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        if (r6 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        r2 = x4.f.c(r6, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010f, code lost:
    
        if (r6 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r2 = x4.f.e(r6, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        if (r6 != 1668311404) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        r2 = x4.f.e(r6, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if (r6 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012c, code lost:
    
        r2 = x4.f.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r6 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
    
        r2 = x4.f.d(r6, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0140, code lost:
    
        if (r6 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        r2 = x4.f.d(r6, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r6 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        r2 = x4.f.d(r6, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0158, code lost:
    
        if (r6 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015a, code lost:
    
        r2 = x4.f.d(r6, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (r6 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        r2 = x4.f.d(r6, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
    
        if (r6 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        r2 = x4.f.d(r6, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        if (r6 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        r2 = x4.f.e(r6, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018a, code lost:
    
        if (r6 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018c, code lost:
    
        r2 = x4.f.e(r6, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0199, code lost:
    
        if (r6 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        r2 = x4.f.d(r6, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a6, code lost:
    
        if (r6 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a8, code lost:
    
        r2 = x4.f.d(r6, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b3, code lost:
    
        if (r6 != 757935405) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0608 A[LOOP:12: B:342:0x0605->B:344:0x0608, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x047c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r26) throws k4.z0 {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.g.j(long):void");
    }

    public g(int i10) {
        this.f36402a = 0;
        this.f36409i = 0;
        this.f36407g = new i();
        this.f36408h = new ArrayList();
        this.f36406e = new w(16);
        this.f = new ArrayDeque<>();
        this.f36403b = new w(s.f27347a);
        this.f36404c = new w(4);
        this.f36405d = new w();
        this.f36414n = -1;
        this.f36417r = p4.j.f34324b0;
        this.f36418s = new a[0];
    }

    @Override // p4.h
    public final void release() {
    }
}
