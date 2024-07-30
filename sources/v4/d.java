package v4;

import a3.l;
import android.util.SparseArray;
import com.anythink.expressad.exoplayer.k.p;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.huawei.hms.ads.gl;
import d6.g0;
import d6.s;
import d6.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p4.h;
import p4.i;
import p4.j;
import p4.w;
import p4.x;

/* compiled from: MatroskaExtractor.java */
/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f35924c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f35925d0 = g0.C("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f35926e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f35927f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f35928g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    public static final Map<String, Integer> f35929h0;
    public long A;
    public long B;
    public s.d C;
    public s.d D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final c f35930a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f35931a0;

    /* renamed from: b, reason: collision with root package name */
    public final f f35932b;

    /* renamed from: b0, reason: collision with root package name */
    public j f35933b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<b> f35934c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35935d;

    /* renamed from: e, reason: collision with root package name */
    public final w f35936e;
    public final w f;

    /* renamed from: g, reason: collision with root package name */
    public final w f35937g;

    /* renamed from: h, reason: collision with root package name */
    public final w f35938h;

    /* renamed from: i, reason: collision with root package name */
    public final w f35939i;

    /* renamed from: j, reason: collision with root package name */
    public final w f35940j;

    /* renamed from: k, reason: collision with root package name */
    public final w f35941k;

    /* renamed from: l, reason: collision with root package name */
    public final w f35942l;

    /* renamed from: m, reason: collision with root package name */
    public final w f35943m;

    /* renamed from: n, reason: collision with root package name */
    public final w f35944n;
    public ByteBuffer o;

    /* renamed from: p, reason: collision with root package name */
    public long f35945p;

    /* renamed from: q, reason: collision with root package name */
    public long f35946q;

    /* renamed from: r, reason: collision with root package name */
    public long f35947r;

    /* renamed from: s, reason: collision with root package name */
    public long f35948s;

    /* renamed from: t, reason: collision with root package name */
    public long f35949t;

    /* renamed from: u, reason: collision with root package name */
    public b f35950u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35951v;

    /* renamed from: w, reason: collision with root package name */
    public int f35952w;

    /* renamed from: x, reason: collision with root package name */
    public long f35953x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public long f35954z;

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes2.dex */
    public final class a implements v4.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:365:0x0888, code lost:
        
            if (r0.m() == r1.getLeastSignificantBits()) goto L488;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:103:0x054a. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:112:0x08e5  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x08fe  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x090d  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0ada  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0919  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0a4f  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0a51  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x0900  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x088f  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x08b6  */
        /* JADX WARN: Type inference failed for: r0v113 */
        /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r2v50, types: [int] */
        /* JADX WARN: Type inference failed for: r2v51 */
        /* JADX WARN: Type inference failed for: r2v66 */
        /* JADX WARN: Type inference failed for: r2v68 */
        /* JADX WARN: Type inference failed for: r2v69 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r6v41 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r37) throws k4.z0 {
            /*
                Method dump skipped, instructions count: 3390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.d.a.a(int):void");
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public byte[] N;
        public x T;
        public boolean U;
        public p4.w X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f35956a;

        /* renamed from: b, reason: collision with root package name */
        public String f35957b;

        /* renamed from: c, reason: collision with root package name */
        public int f35958c;

        /* renamed from: d, reason: collision with root package name */
        public int f35959d;

        /* renamed from: e, reason: collision with root package name */
        public int f35960e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f35961g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f35962h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f35963i;

        /* renamed from: j, reason: collision with root package name */
        public w.a f35964j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f35965k;

        /* renamed from: l, reason: collision with root package name */
        public DrmInitData f35966l;

        /* renamed from: m, reason: collision with root package name */
        public int f35967m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f35968n = -1;
        public int o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f35969p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f35970q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f35971r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f35972s = gl.Code;

        /* renamed from: t, reason: collision with root package name */
        public float f35973t = gl.Code;

        /* renamed from: u, reason: collision with root package name */
        public float f35974u = gl.Code;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f35975v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f35976w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f35977x = false;
        public int y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f35978z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] a(String str) throws z0 {
            byte[] bArr = this.f35965k;
            if (bArr != null) {
                return bArr;
            }
            throw z0.a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        l.v(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f35929h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        boolean z10;
        v4.a aVar = new v4.a();
        this.f35946q = -1L;
        this.f35947r = com.anythink.expressad.exoplayer.b.f7291b;
        this.f35948s = com.anythink.expressad.exoplayer.b.f7291b;
        this.f35949t = com.anythink.expressad.exoplayer.b.f7291b;
        this.f35954z = -1L;
        this.A = -1L;
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
        this.f35930a = aVar;
        aVar.f35919d = new a();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35935d = z10;
        this.f35932b = new f();
        this.f35934c = new SparseArray<>();
        this.f35937g = new d6.w(4);
        this.f35938h = new d6.w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f35939i = new d6.w(4);
        this.f35936e = new d6.w(s.f27347a);
        this.f = new d6.w(4);
        this.f35940j = new d6.w();
        this.f35941k = new d6.w();
        this.f35942l = new d6.w(8);
        this.f35943m = new d6.w();
        this.f35944n = new d6.w();
        this.L = new int[1];
    }

    public static byte[] h(long j10, String str, long j11) {
        boolean z10;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * com.anythink.expressad.d.a.b.P) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return g0.C(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void a(int i10) throws z0 {
        if (this.C != null && this.D != null) {
            return;
        }
        throw z0.a("Element " + i10 + " must be in a Cues", null);
    }

    @EnsuresNonNull({"currentTrack"})
    public final void b(int i10) throws z0 {
        if (this.f35950u != null) {
            return;
        }
        throw z0.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01f4, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x09c7, code lost:
    
        if (r4 == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x09c9, code lost:
    
        r1 = ((p4.e) r38).f34314d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x09d1, code lost:
    
        if (r37.y == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x09d3, code lost:
    
        r37.A = r1;
        r3 = r39;
        r3.f34349a = r37.f35954z;
        r37.y = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x09f1, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x09f4, code lost:
    
        if (r1 == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x09f6, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04ab, code lost:
    
        throw k4.z0.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x09df, code lost:
    
        r3 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x09e3, code lost:
    
        if (r37.f35951v == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x09e5, code lost:
    
        r1 = r37.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x09eb, code lost:
    
        if (r1 == (-1)) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x09ed, code lost:
    
        r3.f34349a = r1;
        r37.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x09f3, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x09f8, code lost:
    
        r3 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0787, code lost:
    
        throw k4.z0.a("DocTypeReadVersion " + r10 + " not supported", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0a1a, code lost:
    
        if (r4 != false) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0a1c, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0a1d, code lost:
    
        r1 = r37.f35934c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0a23, code lost:
    
        if (r2 >= r1.size()) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0a25, code lost:
    
        r1 = r1.valueAt(r2);
        r1.X.getClass();
        r3 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0a32, code lost:
    
        if (r3 == null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0a34, code lost:
    
        r3.a(r1.X, r1.f35964j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0a3b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0a3e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0a40, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:356:0x088c  */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r38, p4.t r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        e eVar = new e();
        p4.e eVar2 = (p4.e) iVar;
        long j10 = eVar2.f34313c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        d6.w wVar = eVar.f35979a;
        eVar2.c(wVar.f27384a, 0, 4, false);
        eVar.f35980b = 4;
        for (long u2 = wVar.u(); u2 != 440786851; u2 = ((u2 << 8) & (-256)) | (wVar.f27384a[0] & DefaultClassResolver.NAME)) {
            int i11 = eVar.f35980b + 1;
            eVar.f35980b = i11;
            if (i11 == i10) {
                return false;
            }
            eVar2.c(wVar.f27384a, 0, 1, false);
        }
        long a10 = eVar.a(eVar2);
        long j12 = eVar.f35980b;
        if (a10 == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + a10 >= j10) {
            return false;
        }
        while (true) {
            long j13 = eVar.f35980b;
            long j14 = j12 + a10;
            if (j13 < j14) {
                if (eVar.a(eVar2) == Long.MIN_VALUE) {
                    return false;
                }
                long a11 = eVar.a(eVar2);
                if (a11 < 0 || a11 > 2147483647L) {
                    return false;
                }
                if (a11 != 0) {
                    int i12 = (int) a11;
                    eVar2.k(i12, false);
                    eVar.f35980b += i12;
                }
            } else {
                if (j13 != j14) {
                    return false;
                }
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5 A[EDGE_INSN: B:50:0x00d5->B:49:0x00d5 BREAK  A[LOOP:0: B:42:0x00c4->B:46:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(v4.d.b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.e(v4.d$b, long, int, int, int):void");
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f35933b0 = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        this.B = com.anythink.expressad.exoplayer.b.f7291b;
        this.G = 0;
        v4.a aVar = (v4.a) this.f35930a;
        aVar.f35920e = 0;
        aVar.f35917b.clear();
        f fVar = aVar.f35918c;
        fVar.f35983b = 0;
        fVar.f35984c = 0;
        f fVar2 = this.f35932b;
        fVar2.f35983b = 0;
        fVar2.f35984c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray<b> sparseArray = this.f35934c;
            if (i10 < sparseArray.size()) {
                x xVar = sparseArray.valueAt(i10).T;
                if (xVar != null) {
                    xVar.f34362b = false;
                    xVar.f34363c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void i(p4.e eVar, int i10) throws IOException {
        d6.w wVar = this.f35937g;
        if (wVar.f27386c >= i10) {
            return;
        }
        byte[] bArr = wVar.f27384a;
        if (bArr.length < i10) {
            wVar.a(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = wVar.f27384a;
        int i11 = wVar.f27386c;
        eVar.a(bArr2, i11, i10 - i11, false);
        wVar.D(i10);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f35931a0 = false;
        this.f35940j.B(0);
    }

    public final long k(long j10) throws z0 {
        long j11 = this.f35947r;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            return g0.P(j10, j11, 1000L);
        }
        throw z0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @RequiresNonNull({"#2.output"})
    public final int l(p4.e eVar, b bVar, int i10, boolean z10) throws IOException {
        int a10;
        int a11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f35957b)) {
            m(eVar, f35924c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(bVar.f35957b)) {
            m(eVar, f35926e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f35957b)) {
            m(eVar, f35927f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        p4.w wVar = bVar.X;
        boolean z14 = this.V;
        boolean z15 = true;
        d6.w wVar2 = this.f35940j;
        if (!z14) {
            boolean z16 = bVar.f35962h;
            d6.w wVar3 = this.f35937g;
            if (z16) {
                this.O &= -1073741825;
                int i15 = 128;
                if (!this.W) {
                    eVar.a(wVar3.f27384a, 0, 1, false);
                    this.S++;
                    byte b10 = wVar3.f27384a[0];
                    if ((b10 & 128) != 128) {
                        this.Z = b10;
                        this.W = true;
                    } else {
                        throw z0.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if ((b11 & 2) == 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.O |= 1073741824;
                    if (!this.f35931a0) {
                        d6.w wVar4 = this.f35942l;
                        eVar.a(wVar4.f27384a, 0, 8, false);
                        this.S += 8;
                        this.f35931a0 = true;
                        byte[] bArr = wVar3.f27384a;
                        if (!z13) {
                            i15 = 0;
                        }
                        bArr[0] = (byte) (i15 | 8);
                        wVar3.E(0);
                        wVar.e(1, wVar3);
                        this.T++;
                        wVar4.E(0);
                        wVar.e(8, wVar4);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            eVar.a(wVar3.f27384a, 0, 1, false);
                            this.S++;
                            wVar3.E(0);
                            this.Y = wVar3.t();
                            this.X = true;
                        }
                        int i16 = this.Y * 4;
                        wVar3.B(i16);
                        eVar.a(wVar3.f27384a, 0, i16, false);
                        this.S += i16;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i17 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.o = ByteBuffer.allocate(i17);
                        }
                        this.o.position(0);
                        this.o.putShort(s10);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i18 >= i11) {
                                break;
                            }
                            int w10 = wVar3.w();
                            if (i18 % 2 == 0) {
                                this.o.putShort((short) (w10 - i19));
                            } else {
                                this.o.putInt(w10 - i19);
                            }
                            i18++;
                            i19 = w10;
                        }
                        int i20 = (i10 - this.S) - i19;
                        if (i11 % 2 == 1) {
                            this.o.putInt(i20);
                        } else {
                            this.o.putShort((short) i20);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        d6.w wVar5 = this.f35943m;
                        wVar5.C(i17, array);
                        wVar.e(i17, wVar5);
                        this.T += i17;
                    }
                }
            } else {
                byte[] bArr2 = bVar.f35963i;
                if (bArr2 != null) {
                    wVar2.C(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(bVar.f35957b)) {
                z11 = z10;
            } else if (bVar.f > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.O |= 268435456;
                this.f35944n.B(0);
                int i21 = (wVar2.f27386c + i10) - this.S;
                wVar3.B(4);
                byte[] bArr3 = wVar3.f27384a;
                bArr3[0] = (byte) ((i21 >> 24) & p.f9095b);
                bArr3[1] = (byte) ((i21 >> 16) & p.f9095b);
                bArr3[2] = (byte) ((i21 >> 8) & p.f9095b);
                bArr3[3] = (byte) (i21 & p.f9095b);
                wVar.e(4, wVar3);
                this.T += 4;
            }
            this.V = true;
        }
        int i22 = i10 + wVar2.f27386c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f35957b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f35957b)) {
            if (bVar.T != null) {
                if (wVar2.f27386c != 0) {
                    z15 = false;
                }
                d6.a.d(z15);
                bVar.T.c(eVar);
            }
            while (true) {
                int i23 = this.S;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int i25 = wVar2.f27386c - wVar2.f27385b;
                if (i25 > 0) {
                    a11 = Math.min(i24, i25);
                    wVar.f(a11, wVar2);
                } else {
                    a11 = wVar.a(eVar, i24, false);
                }
                this.S += a11;
                this.T += a11;
            }
        } else {
            d6.w wVar6 = this.f;
            byte[] bArr4 = wVar6.f27384a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = bVar.Y;
            int i27 = 4 - i26;
            while (this.S < i22) {
                int i28 = this.U;
                if (i28 == 0) {
                    int min = Math.min(i26, wVar2.f27386c - wVar2.f27385b);
                    eVar.a(bArr4, i27 + min, i26 - min, false);
                    if (min > 0) {
                        wVar2.b(bArr4, i27, min);
                    }
                    this.S += i26;
                    wVar6.E(0);
                    this.U = wVar6.w();
                    d6.w wVar7 = this.f35936e;
                    wVar7.E(0);
                    wVar.f(4, wVar7);
                    this.T += 4;
                } else {
                    int i29 = wVar2.f27386c - wVar2.f27385b;
                    if (i29 > 0) {
                        a10 = Math.min(i28, i29);
                        wVar.f(a10, wVar2);
                    } else {
                        a10 = wVar.a(eVar, i28, false);
                    }
                    this.S += a10;
                    this.T += a10;
                    this.U -= a10;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f35957b)) {
            d6.w wVar8 = this.f35938h;
            wVar8.E(0);
            wVar.f(4, wVar8);
            this.T += 4;
        }
        int i30 = this.T;
        j();
        return i30;
    }

    public final void m(p4.e eVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        d6.w wVar = this.f35941k;
        byte[] bArr2 = wVar.f27384a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            wVar.C(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        eVar.a(wVar.f27384a, bArr.length, i10, false);
        wVar.E(0);
        wVar.D(length);
    }

    @Override // p4.h
    public final void release() {
    }
}
