package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15522a = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f15523b = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f15524c = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f15525d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f15526e = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] f = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, com.anythink.expressad.video.dynview.a.a.f11393p, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f15527g = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: h, reason: collision with root package name */
    private static final boolean[] f15528h = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: j, reason: collision with root package name */
    private final int f15530j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15531k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15532l;

    /* renamed from: m, reason: collision with root package name */
    private final long f15533m;

    /* renamed from: p, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f15535p;

    /* renamed from: q, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f15536q;

    /* renamed from: r, reason: collision with root package name */
    private int f15537r;

    /* renamed from: s, reason: collision with root package name */
    private int f15538s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15539t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15540u;

    /* renamed from: v, reason: collision with root package name */
    private byte f15541v;

    /* renamed from: w, reason: collision with root package name */
    private byte f15542w;
    private boolean y;

    /* renamed from: z, reason: collision with root package name */
    private long f15544z;

    /* renamed from: i, reason: collision with root package name */
    private final y f15529i = new y();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<C0176a> f15534n = new ArrayList<>();
    private C0176a o = new C0176a(0, 4);

    /* renamed from: x, reason: collision with root package name */
    private int f15543x = 0;

    /* renamed from: com.applovin.exoplayer2.i.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0176a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0177a> f15560a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f15561b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f15562c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f15563d;

        /* renamed from: e, reason: collision with root package name */
        private int f15564e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private int f15565g;

        /* renamed from: h, reason: collision with root package name */
        private int f15566h;

        /* renamed from: com.applovin.exoplayer2.i.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0177a {

            /* renamed from: a, reason: collision with root package name */
            public final int f15567a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f15568b;

            /* renamed from: c, reason: collision with root package name */
            public int f15569c;

            public C0177a(int i10, boolean z10, int i11) {
                this.f15567a = i10;
                this.f15568b = z10;
                this.f15569c = i11;
            }
        }

        public C0176a(int i10, int i11) {
            a(i10);
            this.f15566h = i11;
        }

        public com.applovin.exoplayer2.i.a d(int i10) {
            float f;
            int i11 = this.f15564e + this.f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f15561b.size(); i13++) {
                spannableStringBuilder.append(ai.a(this.f15561b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(ai.a(d(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f15565g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f15565g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i15 = this.f15563d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f15565g == 1) {
                i15 -= this.f15566h - 1;
            }
            return new a.C0175a().a(spannableStringBuilder).a(Layout.Alignment.ALIGN_NORMAL).a(i15, 1).a(f).b(i10).e();
        }

        public void b(int i10) {
            this.f15565g = i10;
        }

        public void c(int i10) {
            this.f15566h = i10;
        }

        public void a(int i10) {
            this.f15565g = i10;
            this.f15560a.clear();
            this.f15561b.clear();
            this.f15562c.setLength(0);
            this.f15563d = 15;
            this.f15564e = 0;
            this.f = 0;
        }

        public void b() {
            int length = this.f15562c.length();
            if (length > 0) {
                this.f15562c.delete(length - 1, length);
                for (int size = this.f15560a.size() - 1; size >= 0; size--) {
                    C0177a c0177a = this.f15560a.get(size);
                    int i10 = c0177a.f15569c;
                    if (i10 != length) {
                        return;
                    }
                    c0177a.f15569c = i10 - 1;
                }
            }
        }

        public void c() {
            this.f15561b.add(d());
            this.f15562c.setLength(0);
            this.f15560a.clear();
            int min = Math.min(this.f15566h, this.f15563d);
            while (this.f15561b.size() >= min) {
                this.f15561b.remove(0);
            }
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public boolean a() {
            return this.f15560a.isEmpty() && this.f15561b.isEmpty() && this.f15562c.length() == 0;
        }

        public void a(int i10, boolean z10) {
            this.f15560a.add(new C0177a(i10, z10, this.f15562c.length()));
        }

        public void a(char c10) {
            if (this.f15562c.length() < 32) {
                this.f15562c.append(c10);
            }
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15562c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f15560a.size()) {
                C0177a c0177a = this.f15560a.get(i14);
                boolean z11 = c0177a.f15568b;
                int i16 = c0177a.f15567a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f15524c[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0177a.f15569c;
                i14++;
                if (i17 != (i14 < this.f15560a.size() ? this.f15560a.get(i14).f15569c : length)) {
                    if (i10 != -1 && !z11) {
                        a(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        b(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        a(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                a(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                b(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                a(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    public a(String str, int i10, long j10) {
        long j11;
        int i11;
        if (j10 > 0) {
            j11 = j10 * 1000;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f15533m = j11;
        if (o.f9067ac.equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f15530j = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        q.c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f15532l = 0;
                        this.f15531k = 0;
                    } else {
                        this.f15532l = 1;
                        this.f15531k = 1;
                    }
                } else {
                    this.f15532l = 0;
                    this.f15531k = 1;
                }
            } else {
                this.f15532l = 1;
                this.f15531k = 0;
            }
        } else {
            this.f15532l = 0;
            this.f15531k = 0;
        }
        a(0);
        m();
        this.y = true;
        this.f15544z = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private static boolean c(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean f(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean g(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean h(byte b10) {
        return (b10 & 224) == 0;
    }

    private static int i(byte b10) {
        return (b10 >> 3) & 1;
    }

    private static boolean j(byte b10) {
        if ((b10 & 240) == 16) {
            return true;
        }
        return false;
    }

    private static boolean k(byte b10) {
        if (1 <= b10 && b10 <= 15) {
            return true;
        }
        return false;
    }

    private static boolean l(byte b10) {
        return (b10 & 247) == 20;
    }

    private void m() {
        this.o.a(this.f15537r);
        this.f15534n.clear();
        this.f15534n.add(this.o);
    }

    private boolean n() {
        if (this.f15533m == com.anythink.expressad.exoplayer.b.f7291b || this.f15544z == com.anythink.expressad.exoplayer.b.f7291b || k() - this.f15544z < this.f15533m) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void d() {
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    /* renamed from: e */
    public k b() throws h {
        k j10;
        k b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        if (!n() || (j10 = j()) == null) {
            return null;
        }
        this.f15535p = Collections.emptyList();
        this.f15544z = com.anythink.expressad.exoplayer.b.f7291b;
        j10.a(k(), g(), Long.MAX_VALUE);
        return j10;
    }

    private static boolean d(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean h(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean i(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private List<com.applovin.exoplayer2.i.a> l() {
        int size = this.f15534n.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            com.applovin.exoplayer2.i.a d10 = this.f15534n.get(i11).d(Integer.MIN_VALUE);
            arrayList.add(d10);
            if (d10 != null) {
                i10 = Math.min(i10, d10.f15514j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            com.applovin.exoplayer2.i.a aVar = (com.applovin.exoplayer2.i.a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f15514j != i10) {
                    aVar = (com.applovin.exoplayer2.i.a) com.applovin.exoplayer2.l.a.b(this.f15534n.get(i12).d(i10));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // com.applovin.exoplayer2.i.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.exoplayer2.i.j r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.a.a(com.applovin.exoplayer2.i.j):void");
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(j jVar) throws h {
        super.a(jVar);
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void c() {
        super.c();
        this.f15535p = null;
        this.f15536q = null;
        a(0);
        b(4);
        m();
        this.f15539t = false;
        this.f15540u = false;
        this.f15541v = (byte) 0;
        this.f15542w = (byte) 0;
        this.f15543x = 0;
        this.y = true;
        this.f15544z = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public boolean f() {
        return this.f15535p != this.f15536q;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public com.applovin.exoplayer2.i.f g() {
        List<com.applovin.exoplayer2.i.a> list = this.f15535p;
        this.f15536q = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    private void b(byte b10) {
        this.o.a(' ');
        this.o.a((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private static char d(byte b10) {
        return (char) f15525d[(b10 & Ascii.DEL) - 32];
    }

    private static char f(byte b10) {
        return (char) f[b10 & Ascii.US];
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }

    private static char g(byte b10) {
        return (char) f15527g[b10 & Ascii.US];
    }

    private void b(int i10) {
        this.f15538s = i10;
        this.o.c(i10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0018. Please report as an issue. */
    private void b(byte b10, byte b11) {
        if (k(b10)) {
            this.y = false;
            return;
        }
        if (l(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.y = false;
                                return;
                            default:
                                return;
                        }
                    case 37:
                    case 38:
                    case 39:
                        this.y = true;
                }
            }
            this.y = true;
        }
    }

    private static char e(byte b10) {
        return (char) f15526e[b10 & Ascii.SI];
    }

    private static char e(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return f(b11);
        }
        return g(b11);
    }

    private void c(byte b10) {
        if (b10 == 32) {
            a(2);
            return;
        }
        if (b10 != 41) {
            switch (b10) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case 38:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i10 = this.f15537r;
                    if (i10 == 0) {
                        return;
                    }
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f15535p = Collections.emptyList();
                                int i11 = this.f15537r;
                                if (i11 == 1 || i11 == 3) {
                                    m();
                                    return;
                                }
                                return;
                            case 45:
                                if (i10 != 1 || this.o.a()) {
                                    return;
                                }
                                this.o.c();
                                return;
                            case 46:
                                m();
                                return;
                            case 47:
                                this.f15535p = l();
                                m();
                                return;
                            default:
                                return;
                        }
                    }
                    this.o.b();
                    return;
            }
        }
        a(3);
    }

    private boolean a(byte b10) {
        if (h(b10)) {
            this.f15543x = i(b10);
        }
        return this.f15543x == this.f15532l;
    }

    private boolean a(boolean z10, byte b10, byte b11) {
        if (z10 && j(b10)) {
            if (this.f15540u && this.f15541v == b10 && this.f15542w == b11) {
                this.f15540u = false;
                return true;
            }
            this.f15540u = true;
            this.f15541v = b10;
            this.f15542w = b11;
        } else {
            this.f15540u = false;
        }
        return false;
    }

    private void a(byte b10, byte b11) {
        int i10 = f15522a[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.o.f15563d) {
            if (this.f15537r != 1 && !this.o.a()) {
                C0176a c0176a = new C0176a(this.f15537r, this.f15538s);
                this.o = c0176a;
                this.f15534n.add(c0176a);
            }
            this.o.f15563d = i10;
        }
        boolean z10 = (b11 & Ascii.DLE) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.o.a(z10 ? 8 : i11, z11);
        if (z10) {
            this.o.f15564e = f15523b[i11];
        }
    }

    private void a(int i10) {
        int i11 = this.f15537r;
        if (i11 == i10) {
            return;
        }
        this.f15537r = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f15534n.size(); i12++) {
                this.f15534n.get(i12).b(i10);
            }
            return;
        }
        m();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f15535p = Collections.emptyList();
        }
    }
}
