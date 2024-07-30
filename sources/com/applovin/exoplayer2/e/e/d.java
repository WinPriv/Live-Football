package com.applovin.exoplayer2.e.e;

import android.util.Pair;
import android.util.SparseArray;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class d implements h {

    /* renamed from: a */
    public static final l f14212a = new v2.a(1);

    /* renamed from: b */
    private static final byte[] f14213b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f14214c = ai.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d */
    private static final byte[] f14215d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e */
    private static final UUID f14216e = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> f;
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private r I;
    private r J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: aa */
    private boolean f14217aa;

    /* renamed from: ab */
    private boolean f14218ab;

    /* renamed from: ac */
    private boolean f14219ac;

    /* renamed from: ad */
    private int f14220ad;
    private byte ae;
    private boolean af;
    private j ag;

    /* renamed from: g */
    private final com.applovin.exoplayer2.e.e.c f14221g;

    /* renamed from: h */
    private final f f14222h;

    /* renamed from: i */
    private final SparseArray<b> f14223i;

    /* renamed from: j */
    private final boolean f14224j;

    /* renamed from: k */
    private final y f14225k;

    /* renamed from: l */
    private final y f14226l;

    /* renamed from: m */
    private final y f14227m;

    /* renamed from: n */
    private final y f14228n;
    private final y o;

    /* renamed from: p */
    private final y f14229p;

    /* renamed from: q */
    private final y f14230q;

    /* renamed from: r */
    private final y f14231r;

    /* renamed from: s */
    private final y f14232s;

    /* renamed from: t */
    private final y f14233t;

    /* renamed from: u */
    private ByteBuffer f14234u;

    /* renamed from: v */
    private long f14235v;

    /* renamed from: w */
    private long f14236w;

    /* renamed from: x */
    private long f14237x;
    private long y;

    /* renamed from: z */
    private long f14238z;

    /* loaded from: classes.dex */
    public final class a implements com.applovin.exoplayer2.e.e.b {
        private a() {
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public int a(int i10) {
            return d.this.a(i10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public boolean b(int i10) {
            return d.this.b(i10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void c(int i10) throws com.applovin.exoplayer2.ai {
            d.this.c(i10);
        }

        public /* synthetic */ a(d dVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, long j10, long j11) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, long j10) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, j10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, double d10) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, d10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, String str) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, str);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, int i11, i iVar) throws IOException {
            d.this.a(i10, i11, iVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public byte[] M;
        public int N;
        public int O;
        public int P;
        public long Q;
        public long R;
        public c S;
        public boolean T;
        public boolean U;
        public x V;
        public int W;
        private int X;
        private String Y;

        /* renamed from: a */
        public String f14240a;

        /* renamed from: b */
        public String f14241b;

        /* renamed from: c */
        public int f14242c;

        /* renamed from: d */
        public int f14243d;

        /* renamed from: e */
        public int f14244e;
        public int f;

        /* renamed from: g */
        public boolean f14245g;

        /* renamed from: h */
        public byte[] f14246h;

        /* renamed from: i */
        public x.a f14247i;

        /* renamed from: j */
        public byte[] f14248j;

        /* renamed from: k */
        public com.applovin.exoplayer2.d.e f14249k;

        /* renamed from: l */
        public int f14250l;

        /* renamed from: m */
        public int f14251m;

        /* renamed from: n */
        public int f14252n;
        public int o;

        /* renamed from: p */
        public int f14253p;

        /* renamed from: q */
        public int f14254q;

        /* renamed from: r */
        public float f14255r;

        /* renamed from: s */
        public float f14256s;

        /* renamed from: t */
        public float f14257t;

        /* renamed from: u */
        public byte[] f14258u;

        /* renamed from: v */
        public int f14259v;

        /* renamed from: w */
        public boolean f14260w;

        /* renamed from: x */
        public int f14261x;
        public int y;

        /* renamed from: z */
        public int f14262z;

        private b() {
            this.f14250l = -1;
            this.f14251m = -1;
            this.f14252n = -1;
            this.o = -1;
            this.f14253p = 0;
            this.f14254q = -1;
            this.f14255r = gl.Code;
            this.f14256s = gl.Code;
            this.f14257t = gl.Code;
            this.f14258u = null;
            this.f14259v = -1;
            this.f14260w = false;
            this.f14261x = -1;
            this.y = -1;
            this.f14262z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.N = 1;
            this.O = -1;
            this.P = 8000;
            this.Q = 0L;
            this.R = 0L;
            this.U = true;
            this.Y = "eng";
        }

        private byte[] c() {
            if (this.C != -1.0f && this.D != -1.0f && this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                order.put((byte) 0);
                order.putShort((short) ((this.C * 50000.0f) + 0.5f));
                order.putShort((short) ((this.D * 50000.0f) + 0.5f));
                order.putShort((short) ((this.E * 50000.0f) + 0.5f));
                order.putShort((short) ((this.F * 50000.0f) + 0.5f));
                order.putShort((short) ((this.G * 50000.0f) + 0.5f));
                order.putShort((short) ((this.H * 50000.0f) + 0.5f));
                order.putShort((short) ((this.I * 50000.0f) + 0.5f));
                order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                order.putShort((short) (this.K + 0.5f));
                order.putShort((short) (this.L + 0.5f));
                order.putShort((short) this.A);
                order.putShort((short) this.B);
                return bArr;
            }
            return null;
        }

        public void d() {
            com.applovin.exoplayer2.l.a.b(this.V);
        }

        public void b() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a();
            }
        }

        private static boolean b(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                int j10 = yVar.j();
                if (j10 == 1) {
                    return true;
                }
                if (j10 != 65534) {
                    return false;
                }
                yVar.d(24);
                if (yVar.s() == d.f14216e.getMostSignificantBits()) {
                    if (yVar.s() == d.f14216e.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01cf. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x040e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0426  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0447  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0428  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.applovin.exoplayer2.e.j r21, int r22) throws com.applovin.exoplayer2.ai {
            /*
                Method dump skipped, instructions count: 1628
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.b.a(com.applovin.exoplayer2.e.j, int):void");
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void a() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        private static Pair<String, List<byte[]>> a(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                yVar.e(16);
                long p10 = yVar.p();
                if (p10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (p10 == 859189832) {
                    return new Pair<>(o.f9073g, null);
                }
                if (p10 == 826496599) {
                    byte[] d10 = yVar.d();
                    for (int c10 = yVar.c() + 20; c10 < d10.length - 4; c10++) {
                        if (d10[c10] == 0 && d10[c10 + 1] == 0 && d10[c10 + 2] == 1 && d10[c10 + 3] == 15) {
                            return new Pair<>(o.o, Collections.singletonList(Arrays.copyOfRange(d10, c10, d10.length)));
                        }
                    }
                    throw com.applovin.exoplayer2.ai.b("Failed to find FourCC VC1 initialization data", null);
                }
                q.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(o.f9081p, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> a(byte[] bArr) throws com.applovin.exoplayer2.ai {
            int i10;
            int i11;
            try {
                if (bArr[0] == 2) {
                    int i12 = 0;
                    int i13 = 1;
                    while (true) {
                        i10 = bArr[i13];
                        if ((i10 & p.f9095b) != 255) {
                            break;
                        }
                        i12 += p.f9095b;
                        i13++;
                    }
                    int i14 = i13 + 1;
                    int i15 = i12 + (i10 & p.f9095b);
                    int i16 = 0;
                    while (true) {
                        i11 = bArr[i14];
                        if ((i11 & p.f9095b) != 255) {
                            break;
                        }
                        i16 += p.f9095b;
                        i14++;
                    }
                    int i17 = i14 + 1;
                    int i18 = i16 + (i11 & p.f9095b);
                    if (bArr[i17] == 1) {
                        byte[] bArr2 = new byte[i15];
                        System.arraycopy(bArr, i17, bArr2, 0, i15);
                        int i19 = i17 + i15;
                        if (bArr[i19] == 3) {
                            int i20 = i19 + i18;
                            if (bArr[i20] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i20];
                                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                        }
                        throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                    }
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
            }
        }

        private byte[] a(String str) throws com.applovin.exoplayer2.ai {
            byte[] bArr = this.f14248j;
            if (bArr != null) {
                return bArr;
            }
            throw com.applovin.exoplayer2.ai.b("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a3.l.v(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f = Collections.unmodifiableMap(hashMap);
    }

    public d() {
        this(0);
    }

    private void e(int i10) throws com.applovin.exoplayer2.ai {
        if (this.I == null || this.J == null) {
            throw com.applovin.exoplayer2.ai.b("Element " + i10 + " must be in a Cues", null);
        }
    }

    private b f(int i10) throws com.applovin.exoplayer2.ai {
        d(i10);
        return this.A;
    }

    private void g() {
        com.applovin.exoplayer2.l.a.a(this.ag);
    }

    public static /* synthetic */ h[] h() {
        return new h[]{new d()};
    }

    public int a(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public boolean b(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void c() {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final byte[] f14263a = new byte[10];

        /* renamed from: b */
        private boolean f14264b;

        /* renamed from: c */
        private int f14265c;

        /* renamed from: d */
        private long f14266d;

        /* renamed from: e */
        private int f14267e;
        private int f;

        /* renamed from: g */
        private int f14268g;

        public void a() {
            this.f14264b = false;
            this.f14265c = 0;
        }

        public void a(i iVar) throws IOException {
            if (this.f14264b) {
                return;
            }
            iVar.d(this.f14263a, 0, 10);
            iVar.a();
            if (com.applovin.exoplayer2.b.b.b(this.f14263a) == 0) {
                return;
            }
            this.f14264b = true;
        }

        public void a(b bVar, long j10, int i10, int i11, int i12) {
            if (this.f14264b) {
                int i13 = this.f14265c;
                int i14 = i13 + 1;
                this.f14265c = i14;
                if (i13 == 0) {
                    this.f14266d = j10;
                    this.f14267e = i10;
                    this.f = 0;
                }
                this.f += i11;
                this.f14268g = i12;
                if (i14 >= 16) {
                    a(bVar);
                }
            }
        }

        public void a(b bVar) {
            if (this.f14265c > 0) {
                bVar.V.a(this.f14266d, this.f14267e, this.f, this.f14268g, bVar.f14247i);
                this.f14265c = 0;
            }
        }
    }

    public d(int i10) {
        this(new com.applovin.exoplayer2.e.e.a(), i10);
    }

    private void d(int i10) throws com.applovin.exoplayer2.ai {
        if (this.A != null) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Element " + i10 + " must be in a TrackEntry", null);
    }

    public void c(int i10) throws com.applovin.exoplayer2.ai {
        g();
        if (i10 == 160) {
            if (this.M != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.Q; i12++) {
                i11 += this.R[i12];
            }
            b bVar = this.f14223i.get(this.S);
            bVar.d();
            for (int i13 = 0; i13 < this.Q; i13++) {
                long j10 = ((bVar.f14244e * i13) / 1000) + this.N;
                int i14 = this.U;
                if (i13 == 0 && !this.W) {
                    i14 |= 1;
                }
                int i15 = this.R[i13];
                i11 -= i15;
                a(bVar, j10, i14, i15, i11);
            }
            this.M = 0;
            return;
        }
        if (i10 == 174) {
            b bVar2 = (b) com.applovin.exoplayer2.l.a.a(this.A);
            String str = bVar2.f14241b;
            if (str != null) {
                if (a(str)) {
                    bVar2.a(this.ag, bVar2.f14242c);
                    this.f14223i.put(bVar2.f14242c, bVar2);
                }
                this.A = null;
                return;
            }
            throw com.applovin.exoplayer2.ai.b("CodecId is missing in TrackEntry element", null);
        }
        if (i10 == 19899) {
            int i16 = this.C;
            if (i16 != -1) {
                long j11 = this.D;
                if (j11 != -1) {
                    if (i16 == 475249515) {
                        this.F = j11;
                        return;
                    }
                    return;
                }
            }
            throw com.applovin.exoplayer2.ai.b("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            d(i10);
            b bVar3 = this.A;
            if (bVar3.f14245g) {
                if (bVar3.f14247i != null) {
                    bVar3.f14249k = new com.applovin.exoplayer2.d.e(new e.a(com.applovin.exoplayer2.h.f15239a, o.f, this.A.f14247i.f14946b));
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i10 == 28032) {
            d(i10);
            b bVar4 = this.A;
            if (bVar4.f14245g && bVar4.f14246h != null) {
                throw com.applovin.exoplayer2.ai.b("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f14237x == com.anythink.expressad.exoplayer.b.f7291b) {
                this.f14237x = 1000000L;
            }
            long j12 = this.y;
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f14238z = a(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f14223i.size() != 0) {
                this.ag.a();
                return;
            }
            throw com.applovin.exoplayer2.ai.b("No valid tracks were found", null);
        }
        if (i10 != 475249515) {
            return;
        }
        if (!this.B) {
            this.ag.a(a(this.I, this.J));
            this.B = true;
        }
        this.I = null;
        this.J = null;
    }

    public d(com.applovin.exoplayer2.e.e.c cVar, int i10) {
        this.f14236w = -1L;
        this.f14237x = com.anythink.expressad.exoplayer.b.f7291b;
        this.y = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14238z = com.anythink.expressad.exoplayer.b.f7291b;
        this.F = -1L;
        this.G = -1L;
        this.H = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14221g = cVar;
        cVar.a(new a());
        this.f14224j = (i10 & 1) == 0;
        this.f14222h = new f();
        this.f14223i = new SparseArray<>();
        this.f14227m = new y(4);
        this.f14228n = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.o = new y(4);
        this.f14225k = new y(v.f16336a);
        this.f14226l = new y(4);
        this.f14229p = new y();
        this.f14230q = new y();
        this.f14231r = new y(8);
        this.f14232s = new y();
        this.f14233t = new y();
        this.R = new int[1];
    }

    private int e() {
        int i10 = this.Y;
        f();
        return i10;
    }

    private void f() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f14217aa = false;
        this.f14218ab = false;
        this.f14219ac = false;
        this.f14220ad = 0;
        this.ae = (byte) 0;
        this.af = false;
        this.f14229p.a(0);
    }

    @Override // com.applovin.exoplayer2.e.h
    public final boolean a(i iVar) throws IOException {
        return new e().a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void a(j jVar) {
        this.ag = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.H = com.anythink.expressad.exoplayer.b.f7291b;
        this.M = 0;
        this.f14221g.a();
        this.f14222h.a();
        f();
        for (int i10 = 0; i10 < this.f14223i.size(); i10++) {
            this.f14223i.valueAt(i10).b();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public final int a(i iVar, u uVar) throws IOException {
        this.L = false;
        boolean z10 = true;
        while (z10 && !this.L) {
            z10 = this.f14221g.a(iVar);
            if (z10 && a(uVar, iVar.c())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f14223i.size(); i10++) {
            b valueAt = this.f14223i.valueAt(i10);
            valueAt.d();
            valueAt.a();
        }
        return -1;
    }

    public void a(int i10, long j10, long j11) throws com.applovin.exoplayer2.ai {
        g();
        if (i10 == 160) {
            this.W = false;
            return;
        }
        if (i10 == 174) {
            this.A = new b();
            return;
        }
        if (i10 == 187) {
            this.K = false;
            return;
        }
        if (i10 == 19899) {
            this.C = -1;
            this.D = -1L;
            return;
        }
        if (i10 == 20533) {
            f(i10).f14245g = true;
            return;
        }
        if (i10 == 21968) {
            f(i10).f14260w = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f14236w;
            if (j12 != -1 && j12 != j10) {
                throw com.applovin.exoplayer2.ai.b("Multiple Segment elements not supported", null);
            }
            this.f14236w = j10;
            this.f14235v = j11;
            return;
        }
        if (i10 != 475249515) {
            if (i10 == 524531317 && !this.B) {
                if (this.f14224j && this.F != -1) {
                    this.E = true;
                    return;
                } else {
                    this.ag.a(new v.b(this.f14238z));
                    this.B = true;
                    return;
                }
            }
            return;
        }
        this.I = new r();
        this.J = new r();
    }

    public void a(int i10, long j10) throws com.applovin.exoplayer2.ai {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                f(i10).f14243d = (int) j10;
                return;
            case 136:
                f(i10).U = j10 == 1;
                return;
            case 155:
                this.O = a(j10);
                return;
            case 159:
                f(i10).N = (int) j10;
                return;
            case 176:
                f(i10).f14250l = (int) j10;
                return;
            case 179:
                e(i10);
                this.I.a(a(j10));
                return;
            case 186:
                f(i10).f14251m = (int) j10;
                return;
            case 215:
                f(i10).f14242c = (int) j10;
                return;
            case 231:
                this.H = a(j10);
                return;
            case 238:
                this.V = (int) j10;
                return;
            case 241:
                if (this.K) {
                    return;
                }
                e(i10);
                this.J.a(j10);
                this.K = true;
                return;
            case 251:
                this.W = true;
                return;
            case 16871:
                f(i10).X = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw com.applovin.exoplayer2.ai.b("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.D = j10 + this.f14236w;
                return;
            case 21432:
                int i11 = (int) j10;
                d(i10);
                if (i11 == 0) {
                    this.A.f14259v = 0;
                    return;
                }
                if (i11 == 1) {
                    this.A.f14259v = 2;
                    return;
                } else if (i11 == 3) {
                    this.A.f14259v = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.A.f14259v = 3;
                    return;
                }
            case 21680:
                f(i10).f14252n = (int) j10;
                return;
            case 21682:
                f(i10).f14253p = (int) j10;
                return;
            case 21690:
                f(i10).o = (int) j10;
                return;
            case 21930:
                f(i10).T = j10 == 1;
                return;
            case 21998:
                f(i10).f = (int) j10;
                return;
            case 22186:
                f(i10).Q = j10;
                return;
            case 22203:
                f(i10).R = j10;
                return;
            case 25188:
                f(i10).O = (int) j10;
                return;
            case 30321:
                d(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.A.f14254q = 0;
                    return;
                }
                if (i12 == 1) {
                    this.A.f14254q = 1;
                    return;
                } else if (i12 == 2) {
                    this.A.f14254q = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.A.f14254q = 3;
                    return;
                }
            case 2352003:
                f(i10).f14244e = (int) j10;
                return;
            case 2807729:
                this.f14237x = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        d(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.A.f14262z = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.A.f14262z = 1;
                            return;
                        }
                    case 21946:
                        d(i10);
                        int b10 = com.applovin.exoplayer2.m.b.b((int) j10);
                        if (b10 != -1) {
                            this.A.y = b10;
                            return;
                        }
                        return;
                    case 21947:
                        d(i10);
                        this.A.f14260w = true;
                        int a10 = com.applovin.exoplayer2.m.b.a((int) j10);
                        if (a10 != -1) {
                            this.A.f14261x = a10;
                            return;
                        }
                        return;
                    case 21948:
                        f(i10).A = (int) j10;
                        return;
                    case 21949:
                        f(i10).B = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public void a(int i10, double d10) throws com.applovin.exoplayer2.ai {
        if (i10 == 181) {
            f(i10).P = (int) d10;
            return;
        }
        if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    f(i10).C = (float) d10;
                    return;
                case 21970:
                    f(i10).D = (float) d10;
                    return;
                case 21971:
                    f(i10).E = (float) d10;
                    return;
                case 21972:
                    f(i10).F = (float) d10;
                    return;
                case 21973:
                    f(i10).G = (float) d10;
                    return;
                case 21974:
                    f(i10).H = (float) d10;
                    return;
                case 21975:
                    f(i10).I = (float) d10;
                    return;
                case 21976:
                    f(i10).J = (float) d10;
                    return;
                case 21977:
                    f(i10).K = (float) d10;
                    return;
                case 21978:
                    f(i10).L = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            f(i10).f14255r = (float) d10;
                            return;
                        case 30324:
                            f(i10).f14256s = (float) d10;
                            return;
                        case 30325:
                            f(i10).f14257t = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        }
        this.y = (long) d10;
    }

    public void a(int i10, String str) throws com.applovin.exoplayer2.ai {
        if (i10 == 134) {
            f(i10).f14241b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                f(i10).f14240a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                f(i10).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("DocType " + str + " not supported", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0234, code lost:
    
        throw com.applovin.exoplayer2.ai.b("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r23, int r24, com.applovin.exoplayer2.e.i r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.a(int, int, com.applovin.exoplayer2.e.i):void");
    }

    public void a(b bVar, i iVar, int i10) throws IOException {
        if (bVar.X != 1685485123 && bVar.X != 1685480259) {
            iVar.b(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        bVar.M = bArr;
        iVar.b(bArr, 0, i10);
    }

    public void a(b bVar, int i10, i iVar, int i11) throws IOException {
        if (i10 == 4 && "V_VP9".equals(bVar.f14241b)) {
            this.f14233t.a(i11);
            iVar.b(this.f14233t.d(), 0, i11);
        } else {
            iVar.b(i11);
        }
    }

    private void a(b bVar, long j10, int i10, int i11, int i12) {
        c cVar = bVar.S;
        if (cVar != null) {
            cVar.a(bVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f14241b) || "S_TEXT/ASS".equals(bVar.f14241b)) {
                if (this.Q > 1) {
                    q.c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.O;
                    if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                        q.c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(bVar.f14241b, j11, this.f14230q.d());
                        int c10 = this.f14230q.c();
                        while (true) {
                            if (c10 >= this.f14230q.b()) {
                                break;
                            }
                            if (this.f14230q.d()[c10] == 0) {
                                this.f14230q.c(c10);
                                break;
                            }
                            c10++;
                        }
                        x xVar = bVar.V;
                        y yVar = this.f14230q;
                        xVar.a(yVar, yVar.b());
                        i11 += this.f14230q.b();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.Q > 1) {
                    i10 &= -268435457;
                } else {
                    int b10 = this.f14233t.b();
                    bVar.V.a(this.f14233t, b10, 2);
                    i11 += b10;
                }
            }
            bVar.V.a(j10, i10, i11, i12, bVar.f14247i);
        }
        this.L = true;
    }

    private void a(i iVar, int i10) throws IOException {
        if (this.f14227m.b() >= i10) {
            return;
        }
        if (this.f14227m.e() < i10) {
            y yVar = this.f14227m;
            yVar.b(Math.max(yVar.e() * 2, i10));
        }
        iVar.b(this.f14227m.d(), this.f14227m.b(), i10 - this.f14227m.b());
        this.f14227m.c(i10);
    }

    private int a(i iVar, b bVar, int i10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f14241b)) {
            a(iVar, f14213b, i10);
            return e();
        }
        if ("S_TEXT/ASS".equals(bVar.f14241b)) {
            a(iVar, f14215d, i10);
            return e();
        }
        x xVar = bVar.V;
        if (!this.f14217aa) {
            if (bVar.f14245g) {
                this.U &= -1073741825;
                if (!this.f14218ab) {
                    iVar.b(this.f14227m.d(), 0, 1);
                    this.X++;
                    if ((this.f14227m.d()[0] & 128) != 128) {
                        this.ae = this.f14227m.d()[0];
                        this.f14218ab = true;
                    } else {
                        throw com.applovin.exoplayer2.ai.b("Extension bit is set in signal byte", null);
                    }
                }
                byte b10 = this.ae;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.U |= 1073741824;
                    if (!this.af) {
                        iVar.b(this.f14231r.d(), 0, 8);
                        this.X += 8;
                        this.af = true;
                        this.f14227m.d()[0] = (byte) ((z10 ? 128 : 0) | 8);
                        this.f14227m.d(0);
                        xVar.a(this.f14227m, 1, 1);
                        this.Y++;
                        this.f14231r.d(0);
                        xVar.a(this.f14231r, 8, 1);
                        this.Y += 8;
                    }
                    if (z10) {
                        if (!this.f14219ac) {
                            iVar.b(this.f14227m.d(), 0, 1);
                            this.X++;
                            this.f14227m.d(0);
                            this.f14220ad = this.f14227m.h();
                            this.f14219ac = true;
                        }
                        int i12 = this.f14220ad * 4;
                        this.f14227m.a(i12);
                        iVar.b(this.f14227m.d(), 0, i12);
                        this.X += i12;
                        short s10 = (short) ((this.f14220ad / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f14234u;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f14234u = ByteBuffer.allocate(i13);
                        }
                        this.f14234u.position(0);
                        this.f14234u.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f14220ad;
                            if (i14 >= i11) {
                                break;
                            }
                            int w10 = this.f14227m.w();
                            if (i14 % 2 == 0) {
                                this.f14234u.putShort((short) (w10 - i15));
                            } else {
                                this.f14234u.putInt(w10 - i15);
                            }
                            i14++;
                            i15 = w10;
                        }
                        int i16 = (i10 - this.X) - i15;
                        if (i11 % 2 == 1) {
                            this.f14234u.putInt(i16);
                        } else {
                            this.f14234u.putShort((short) i16);
                            this.f14234u.putInt(0);
                        }
                        this.f14232s.a(this.f14234u.array(), i13);
                        xVar.a(this.f14232s, i13, 1);
                        this.Y += i13;
                    }
                }
            } else {
                byte[] bArr = bVar.f14246h;
                if (bArr != null) {
                    this.f14229p.a(bArr, bArr.length);
                }
            }
            if (bVar.f > 0) {
                this.U |= 268435456;
                this.f14233t.a(0);
                this.f14227m.a(4);
                this.f14227m.d()[0] = (byte) ((i10 >> 24) & p.f9095b);
                this.f14227m.d()[1] = (byte) ((i10 >> 16) & p.f9095b);
                this.f14227m.d()[2] = (byte) ((i10 >> 8) & p.f9095b);
                this.f14227m.d()[3] = (byte) (i10 & p.f9095b);
                xVar.a(this.f14227m, 4, 2);
                this.Y += 4;
            }
            this.f14217aa = true;
        }
        int b11 = this.f14229p.b() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f14241b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f14241b)) {
            if (bVar.S != null) {
                com.applovin.exoplayer2.l.a.b(this.f14229p.b() == 0);
                bVar.S.a(iVar);
            }
            while (true) {
                int i17 = this.X;
                if (i17 >= b11) {
                    break;
                }
                int a10 = a(iVar, xVar, b11 - i17);
                this.X += a10;
                this.Y += a10;
            }
        } else {
            byte[] d10 = this.f14226l.d();
            d10[0] = 0;
            d10[1] = 0;
            d10[2] = 0;
            int i18 = bVar.W;
            int i19 = 4 - i18;
            while (this.X < b11) {
                int i20 = this.Z;
                if (i20 == 0) {
                    a(iVar, d10, i19, i18);
                    this.X += i18;
                    this.f14226l.d(0);
                    this.Z = this.f14226l.w();
                    this.f14225k.d(0);
                    xVar.a(this.f14225k, 4);
                    this.Y += 4;
                } else {
                    int a11 = a(iVar, xVar, i20);
                    this.X += a11;
                    this.Y += a11;
                    this.Z -= a11;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f14241b)) {
            this.f14228n.d(0);
            xVar.a(this.f14228n, 4);
            this.Y += 4;
        }
        return e();
    }

    private void a(i iVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f14230q.e() < length) {
            this.f14230q.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f14230q.d(), 0, bArr.length);
        }
        iVar.b(this.f14230q.d(), bArr.length, i10);
        this.f14230q.d(0);
        this.f14230q.c(length);
    }

    private static void a(String str, long j10, byte[] bArr) {
        byte[] a10;
        int i10;
        str.getClass();
        if (str.equals("S_TEXT/ASS")) {
            a10 = a(j10, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            a10 = a(j10, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(a10, 0, bArr, i10, a10.length);
    }

    private static byte[] a(long j10, String str, long j11) {
        com.applovin.exoplayer2.l.a.a(j10 != com.anythink.expressad.exoplayer.b.f7291b);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * com.anythink.expressad.d.a.b.ck) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return ai.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private void a(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        int min = Math.min(i11, this.f14229p.a());
        iVar.b(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f14229p.a(bArr, i10, min);
        }
    }

    private int a(i iVar, x xVar, int i10) throws IOException {
        int a10 = this.f14229p.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            xVar.a(this.f14229p, min);
            return min;
        }
        return xVar.a((g) iVar, i10, false);
    }

    private com.applovin.exoplayer2.e.v a(r rVar, r rVar2) {
        int i10;
        if (this.f14236w != -1 && this.f14238z != com.anythink.expressad.exoplayer.b.f7291b && rVar != null && rVar.a() != 0 && rVar2 != null && rVar2.a() == rVar.a()) {
            int a10 = rVar.a();
            int[] iArr = new int[a10];
            long[] jArr = new long[a10];
            long[] jArr2 = new long[a10];
            long[] jArr3 = new long[a10];
            int i11 = 0;
            for (int i12 = 0; i12 < a10; i12++) {
                jArr3[i12] = rVar.a(i12);
                jArr[i12] = rVar2.a(i12) + this.f14236w;
            }
            while (true) {
                i10 = a10 - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            iArr[i10] = (int) ((this.f14236w + this.f14235v) - jArr[i10]);
            long j10 = this.f14238z - jArr3[i10];
            jArr2[i10] = j10;
            if (j10 <= 0) {
                q.c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
                iArr = Arrays.copyOf(iArr, i10);
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                jArr3 = Arrays.copyOf(jArr3, i10);
            }
            return new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3);
        }
        return new v.b(this.f14238z);
    }

    private boolean a(u uVar, long j10) {
        if (this.E) {
            this.G = j10;
            uVar.f14937a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j11 = this.G;
            if (j11 != -1) {
                uVar.f14937a = j11;
                this.G = -1L;
                return true;
            }
        }
        return false;
    }

    private long a(long j10) throws com.applovin.exoplayer2.ai {
        long j11 = this.f14237x;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            return ai.d(j10, j11, 1000L);
        }
        throw com.applovin.exoplayer2.ai.b("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static boolean a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = 31;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    private static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }
}
