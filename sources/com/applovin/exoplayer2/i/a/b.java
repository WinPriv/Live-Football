package com.applovin.exoplayer2.i.a;

import a3.k;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.a.b;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.i.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final y f15570a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final x f15571b = new x();

    /* renamed from: c, reason: collision with root package name */
    private int f15572c = -1;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15573d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15574e;
    private final C0178b[] f;

    /* renamed from: g, reason: collision with root package name */
    private C0178b f15575g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f15576h;

    /* renamed from: i, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f15577i;

    /* renamed from: j, reason: collision with root package name */
    private c f15578j;

    /* renamed from: k, reason: collision with root package name */
    private int f15579k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f15580c = new Comparator() { // from class: com.applovin.exoplayer2.i.a.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = b.a.a((b.a) obj, (b.a) obj2);
                return a10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.i.a f15581a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15582b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i10, int i11, float f10, int i12, float f11, boolean z10, int i13, int i14) {
            a.C0175a b10 = new a.C0175a().a(charSequence).a(alignment).a(f, i10).a(i11).a(f10).b(i12).b(f11);
            if (z10) {
                b10.c(i13);
            }
            this.f15581a = b10.e();
            this.f15582b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f15582b, aVar.f15582b);
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0178b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f15583a = a(2, 2, 2, 0);

        /* renamed from: b, reason: collision with root package name */
        public static final int f15584b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f15585c;

        /* renamed from: d, reason: collision with root package name */
        private static final int[] f15586d;

        /* renamed from: e, reason: collision with root package name */
        private static final int[] f15587e;
        private static final int[] f;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean[] f15588g;

        /* renamed from: h, reason: collision with root package name */
        private static final int[] f15589h;

        /* renamed from: i, reason: collision with root package name */
        private static final int[] f15590i;

        /* renamed from: j, reason: collision with root package name */
        private static final int[] f15591j;

        /* renamed from: k, reason: collision with root package name */
        private static final int[] f15592k;
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;

        /* renamed from: l, reason: collision with root package name */
        private final List<SpannableString> f15593l = new ArrayList();

        /* renamed from: m, reason: collision with root package name */
        private final SpannableStringBuilder f15594m = new SpannableStringBuilder();

        /* renamed from: n, reason: collision with root package name */
        private boolean f15595n;
        private boolean o;

        /* renamed from: p, reason: collision with root package name */
        private int f15596p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f15597q;

        /* renamed from: r, reason: collision with root package name */
        private int f15598r;

        /* renamed from: s, reason: collision with root package name */
        private int f15599s;

        /* renamed from: t, reason: collision with root package name */
        private int f15600t;

        /* renamed from: u, reason: collision with root package name */
        private int f15601u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f15602v;

        /* renamed from: w, reason: collision with root package name */
        private int f15603w;

        /* renamed from: x, reason: collision with root package name */
        private int f15604x;
        private int y;

        /* renamed from: z, reason: collision with root package name */
        private int f15605z;

        static {
            int a10 = a(0, 0, 0, 0);
            f15584b = a10;
            int a11 = a(0, 0, 0, 3);
            f15585c = a11;
            f15586d = new int[]{0, 0, 0, 0, 0, 2, 0};
            f15587e = new int[]{0, 0, 0, 0, 0, 0, 2};
            f = new int[]{3, 3, 3, 3, 3, 3, 1};
            f15588g = new boolean[]{false, false, false, true, true, true, false};
            f15589h = new int[]{a10, a11, a10, a10, a11, a10, a10};
            f15590i = new int[]{0, 1, 2, 3, 4, 3, 4};
            f15591j = new int[]{0, 0, 0, 0, 0, 3, 3};
            f15592k = new int[]{a10, a10, a10, a10, a10, a11, a11};
        }

        public C0178b() {
            b();
        }

        public boolean a() {
            return !d() || (this.f15593l.isEmpty() && this.f15594m.length() == 0);
        }

        public void b() {
            c();
            this.f15595n = false;
            this.o = false;
            this.f15596p = 4;
            this.f15597q = false;
            this.f15598r = 0;
            this.f15599s = 0;
            this.f15600t = 0;
            this.f15601u = 15;
            this.f15602v = true;
            this.f15603w = 0;
            this.f15604x = 0;
            this.y = 0;
            int i10 = f15584b;
            this.f15605z = i10;
            this.D = f15583a;
            this.F = i10;
        }

        public void c() {
            this.f15593l.clear();
            this.f15594m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean d() {
            return this.f15595n;
        }

        public boolean e() {
            return this.o;
        }

        public void f() {
            int length = this.f15594m.length();
            if (length > 0) {
                this.f15594m.delete(length - 1, length);
            }
        }

        public SpannableString g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15594m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.applovin.exoplayer2.i.a.b.a h() {
            /*
                Method dump skipped, instructions count: 189
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.C0178b.h():com.applovin.exoplayer2.i.a.b$a");
        }

        public void a(boolean z10) {
            this.o = z10;
        }

        public void a(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f15595n = true;
            this.o = z10;
            this.f15602v = z11;
            this.f15596p = i10;
            this.f15597q = z13;
            this.f15598r = i11;
            this.f15599s = i12;
            this.f15600t = i15;
            int i18 = i13 + 1;
            if (this.f15601u != i18) {
                this.f15601u = i18;
                while (true) {
                    if ((!z11 || this.f15593l.size() < this.f15601u) && this.f15593l.size() < 15) {
                        break;
                    } else {
                        this.f15593l.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f15604x != i16) {
                this.f15604x = i16;
                int i19 = i16 - 1;
                a(f15589h[i19], f15585c, f15588g[i19], 0, f15587e[i19], f[i19], f15586d[i19]);
            }
            if (i17 == 0 || this.y == i17) {
                return;
            }
            this.y = i17;
            int i20 = i17 - 1;
            a(0, 1, 1, false, false, f15591j[i20], f15590i[i20]);
            a(f15583a, f15592k[i20], f15584b);
        }

        public static int b(int i10, int i11, int i12) {
            return a(i10, i11, i12, 0);
        }

        public void a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f15605z = i10;
            this.f15603w = i15;
        }

        public void a(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.A != -1) {
                if (!z10) {
                    this.f15594m.setSpan(new StyleSpan(2), this.A, this.f15594m.length(), 33);
                    this.A = -1;
                }
            } else if (z10) {
                this.A = this.f15594m.length();
            }
            if (this.B == -1) {
                if (z11) {
                    this.B = this.f15594m.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f15594m.setSpan(new UnderlineSpan(), this.B, this.f15594m.length(), 33);
                this.B = -1;
            }
        }

        public void a(int i10, int i11, int i12) {
            if (this.C != -1 && this.D != i10) {
                this.f15594m.setSpan(new ForegroundColorSpan(this.D), this.C, this.f15594m.length(), 33);
            }
            if (i10 != f15583a) {
                this.C = this.f15594m.length();
                this.D = i10;
            }
            if (this.E != -1 && this.F != i11) {
                this.f15594m.setSpan(new BackgroundColorSpan(this.F), this.E, this.f15594m.length(), 33);
            }
            if (i11 != f15584b) {
                this.E = this.f15594m.length();
                this.F = i11;
            }
        }

        public void a(int i10, int i11) {
            if (this.G != i10) {
                a('\n');
            }
            this.G = i10;
        }

        public void a(char c10) {
            if (c10 == '\n') {
                this.f15593l.add(g());
                this.f15594m.clear();
                if (this.A != -1) {
                    this.A = 0;
                }
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.E != -1) {
                    this.E = 0;
                }
                while (true) {
                    if ((!this.f15602v || this.f15593l.size() < this.f15601u) && this.f15593l.size() < 15) {
                        return;
                    } else {
                        this.f15593l.remove(0);
                    }
                }
            } else {
                this.f15594m.append(c10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.applovin.exoplayer2.l.a.a(r4, r0, r1)
                com.applovin.exoplayer2.l.a.a(r5, r0, r1)
                com.applovin.exoplayer2.l.a.a(r6, r0, r1)
                com.applovin.exoplayer2.l.a.a(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.C0178b.a(int, int, int, int):int");
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15606a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15607b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f15608c;

        /* renamed from: d, reason: collision with root package name */
        int f15609d = 0;

        public c(int i10, int i11) {
            this.f15606a = i10;
            this.f15607b = i11;
            this.f15608c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f15574e = i10 == -1 ? 1 : i10;
        this.f15573d = list != null && com.applovin.exoplayer2.l.e.a(list);
        this.f = new C0178b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f[i11] = new C0178b();
        }
        this.f15575g = this.f[0];
    }

    private void a(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f15576h = q();
                return;
            }
            if (i10 != 8) {
                switch (i10) {
                    case 12:
                        r();
                        return;
                    case 13:
                        this.f15575g.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            k.y("Currently unsupported COMMAND_EXT1 Command: ", i10, "Cea708Decoder");
                            this.f15571b.b(8);
                            return;
                        } else if (i10 >= 24 && i10 <= 31) {
                            k.y("Currently unsupported COMMAND_P16 Command: ", i10, "Cea708Decoder");
                            this.f15571b.b(16);
                            return;
                        } else {
                            k.y("Invalid C0 command: ", i10, "Cea708Decoder");
                            return;
                        }
                }
            }
            this.f15575g.f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void b(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case com.anythink.expressad.video.module.a.a.T /* 129 */:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f15579k != i12) {
                    this.f15579k = i12;
                    this.f15575g = this.f[i12];
                    return;
                }
                return;
            case 136:
                while (i11 <= 8) {
                    if (this.f15571b.e()) {
                        this.f[8 - i11].c();
                    }
                    i11++;
                }
                return;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f15571b.e()) {
                        this.f[8 - i13].a(true);
                    }
                }
                return;
            case 138:
                while (i11 <= 8) {
                    if (this.f15571b.e()) {
                        this.f[8 - i11].a(false);
                    }
                    i11++;
                }
                return;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f15571b.e()) {
                        this.f[8 - i14].a(!r0.e());
                    }
                }
                return;
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                while (i11 <= 8) {
                    if (this.f15571b.e()) {
                        this.f[8 - i11].b();
                    }
                    i11++;
                }
                return;
            case 141:
                this.f15571b.b(8);
                return;
            case 142:
                return;
            case 143:
                r();
                return;
            case 144:
                if (!this.f15575g.d()) {
                    this.f15571b.b(16);
                    return;
                } else {
                    m();
                    return;
                }
            case 145:
                if (!this.f15575g.d()) {
                    this.f15571b.b(24);
                    return;
                } else {
                    n();
                    return;
                }
            case 146:
                if (!this.f15575g.d()) {
                    this.f15571b.b(16);
                    return;
                } else {
                    o();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
            default:
                k.y("Invalid C1 command: ", i10, "Cea708Decoder");
                return;
            case 151:
                if (!this.f15575g.d()) {
                    this.f15571b.b(32);
                    return;
                } else {
                    p();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                i(i15);
                if (this.f15579k != i15) {
                    this.f15579k = i15;
                    this.f15575g = this.f[i15];
                    return;
                }
                return;
        }
    }

    private void g(int i10) {
        if (i10 == 32) {
            this.f15575g.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f15575g.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f15575g.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f15575g.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f15575g.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f15575g.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f15575g.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f15575g.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f15575g.a((char) 339);
            return;
        }
        if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f15575g.a((char) 9608);
                    return;
                case 49:
                    this.f15575g.a((char) 8216);
                    return;
                case 50:
                    this.f15575g.a((char) 8217);
                    return;
                case 51:
                    this.f15575g.a((char) 8220);
                    return;
                case 52:
                    this.f15575g.a((char) 8221);
                    return;
                case 53:
                    this.f15575g.a((char) 8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f15575g.a((char) 8539);
                            return;
                        case 119:
                            this.f15575g.a((char) 8540);
                            return;
                        case 120:
                            this.f15575g.a((char) 8541);
                            return;
                        case 121:
                            this.f15575g.a((char) 8542);
                            return;
                        case 122:
                            this.f15575g.a((char) 9474);
                            return;
                        case 123:
                            this.f15575g.a((char) 9488);
                            return;
                        case 124:
                            this.f15575g.a((char) 9492);
                            return;
                        case 125:
                            this.f15575g.a((char) 9472);
                            return;
                        case 126:
                            this.f15575g.a((char) 9496);
                            return;
                        case com.anythink.expressad.video.module.a.a.R /* 127 */:
                            this.f15575g.a((char) 9484);
                            return;
                        default:
                            k.y("Invalid G2 character: ", i10, "Cea708Decoder");
                            return;
                    }
            }
        }
        this.f15575g.a((char) 8480);
    }

    private void i() {
        if (this.f15578j == null) {
            return;
        }
        l();
        this.f15578j = null;
    }

    private void l() {
        c cVar = this.f15578j;
        if (cVar.f15609d != (cVar.f15607b * 2) - 1) {
            q.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f15578j.f15607b * 2) - 1) + ", but current index is " + this.f15578j.f15609d + " (sequence number " + this.f15578j.f15606a + ");");
        }
        x xVar = this.f15571b;
        c cVar2 = this.f15578j;
        xVar.a(cVar2.f15608c, cVar2.f15609d);
        int c10 = this.f15571b.c(3);
        int c11 = this.f15571b.c(5);
        if (c10 == 7) {
            this.f15571b.b(2);
            c10 = this.f15571b.c(6);
            if (c10 < 7) {
                k.y("Invalid extended service number: ", c10, "Cea708Decoder");
            }
        }
        if (c11 == 0) {
            if (c10 != 0) {
                q.c("Cea708Decoder", "serviceNumber is non-zero (" + c10 + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (c10 != this.f15574e) {
            return;
        }
        boolean z10 = false;
        while (this.f15571b.a() > 0) {
            int c12 = this.f15571b.c(8);
            if (c12 != 16) {
                if (c12 <= 31) {
                    a(c12);
                } else {
                    if (c12 <= 127) {
                        e(c12);
                    } else if (c12 <= 159) {
                        b(c12);
                    } else if (c12 <= 255) {
                        f(c12);
                    } else {
                        k.y("Invalid base command: ", c12, "Cea708Decoder");
                    }
                    z10 = true;
                }
            } else {
                int c13 = this.f15571b.c(8);
                if (c13 <= 31) {
                    c(c13);
                } else {
                    if (c13 <= 127) {
                        g(c13);
                    } else if (c13 <= 159) {
                        d(c13);
                    } else if (c13 <= 255) {
                        h(c13);
                    } else {
                        k.y("Invalid extended command: ", c13, "Cea708Decoder");
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f15576h = q();
        }
    }

    private void m() {
        this.f15575g.a(this.f15571b.c(4), this.f15571b.c(2), this.f15571b.c(2), this.f15571b.e(), this.f15571b.e(), this.f15571b.c(3), this.f15571b.c(3));
    }

    private void n() {
        int a10 = C0178b.a(this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2));
        int a11 = C0178b.a(this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2));
        this.f15571b.b(2);
        this.f15575g.a(a10, a11, C0178b.b(this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2)));
    }

    private void o() {
        this.f15571b.b(4);
        int c10 = this.f15571b.c(4);
        this.f15571b.b(2);
        this.f15575g.a(c10, this.f15571b.c(6));
    }

    private void p() {
        int a10 = C0178b.a(this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2));
        int c10 = this.f15571b.c(2);
        int b10 = C0178b.b(this.f15571b.c(2), this.f15571b.c(2), this.f15571b.c(2));
        if (this.f15571b.e()) {
            c10 |= 4;
        }
        boolean e10 = this.f15571b.e();
        int c11 = this.f15571b.c(2);
        int c12 = this.f15571b.c(2);
        int c13 = this.f15571b.c(2);
        this.f15571b.b(8);
        this.f15575g.a(a10, b10, e10, c10, c11, c12, c13);
    }

    private List<com.applovin.exoplayer2.i.a> q() {
        a h10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f[i10].a() && this.f[i10].e() && (h10 = this.f[i10].h()) != null) {
                arrayList.add(h10);
            }
        }
        Collections.sort(arrayList, a.f15580c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f15581a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f[i10].b();
        }
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void c() {
        super.c();
        this.f15576h = null;
        this.f15577i = null;
        this.f15579k = 0;
        this.f15575g = this.f[0];
        r();
        this.f15578j = null;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ com.applovin.exoplayer2.i.k b() throws h {
        return super.b();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public boolean f() {
        return this.f15576h != this.f15577i;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }

    private void d(int i10) {
        if (i10 <= 135) {
            this.f15571b.b(32);
            return;
        }
        if (i10 <= 143) {
            this.f15571b.b(40);
        } else if (i10 <= 159) {
            this.f15571b.b(2);
            this.f15571b.b(this.f15571b.c(6) * 8);
        }
    }

    private void e(int i10) {
        if (i10 == 127) {
            this.f15575g.a((char) 9835);
        } else {
            this.f15575g.a((char) (i10 & p.f9095b));
        }
    }

    private void f(int i10) {
        this.f15575g.a((char) (i10 & p.f9095b));
    }

    private void h(int i10) {
        if (i10 == 160) {
            this.f15575g.a((char) 13252);
        } else {
            k.y("Invalid G3 character: ", i10, "Cea708Decoder");
            this.f15575g.a('_');
        }
    }

    private void i(int i10) {
        C0178b c0178b = this.f[i10];
        this.f15571b.b(2);
        boolean e10 = this.f15571b.e();
        boolean e11 = this.f15571b.e();
        boolean e12 = this.f15571b.e();
        int c10 = this.f15571b.c(3);
        boolean e13 = this.f15571b.e();
        int c11 = this.f15571b.c(7);
        int c12 = this.f15571b.c(8);
        int c13 = this.f15571b.c(4);
        int c14 = this.f15571b.c(4);
        this.f15571b.b(2);
        int c15 = this.f15571b.c(6);
        this.f15571b.b(2);
        c0178b.a(e10, e11, e12, c10, e13, c11, c12, c14, c15, c13, this.f15571b.c(3), this.f15571b.c(3));
    }

    private void c(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f15571b.b(8);
        } else if (i10 <= 23) {
            this.f15571b.b(16);
        } else if (i10 <= 31) {
            this.f15571b.b(24);
        }
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public void a(j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f13645b);
        this.f15570a.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f15570a.a() >= 3) {
            int h10 = this.f15570a.h() & 7;
            int i10 = h10 & 3;
            boolean z10 = (h10 & 4) == 4;
            byte h11 = (byte) this.f15570a.h();
            byte h12 = (byte) this.f15570a.h();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (h11 & 192) >> 6;
                        int i12 = this.f15572c;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            r();
                            q.c("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f15572c + " current=" + i11);
                        }
                        this.f15572c = i11;
                        int i13 = h11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f15578j = cVar;
                        byte[] bArr = cVar.f15608c;
                        int i14 = cVar.f15609d;
                        cVar.f15609d = i14 + 1;
                        bArr[i14] = h12;
                    } else {
                        com.applovin.exoplayer2.l.a.a(i10 == 2);
                        c cVar2 = this.f15578j;
                        if (cVar2 == null) {
                            q.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f15608c;
                            int i15 = cVar2.f15609d;
                            int i16 = i15 + 1;
                            bArr2[i15] = h11;
                            cVar2.f15609d = i16 + 1;
                            bArr2[i16] = h12;
                        }
                    }
                    c cVar3 = this.f15578j;
                    if (cVar3.f15609d == (cVar3.f15607b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public com.applovin.exoplayer2.i.f g() {
        List<com.applovin.exoplayer2.i.a> list = this.f15576h;
        this.f15577i = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(j jVar) throws h {
        super.a(jVar);
    }
}
