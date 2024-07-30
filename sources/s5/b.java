package s5;

import a3.k;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.g.f.e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d6.p;
import d6.v;
import d6.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import r5.a;
import s5.c;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes2.dex */
public final class b extends s5.c {

    /* renamed from: g, reason: collision with root package name */
    public final w f35165g = new w();

    /* renamed from: h, reason: collision with root package name */
    public final v f35166h = new v();

    /* renamed from: i, reason: collision with root package name */
    public int f35167i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f35168j;

    /* renamed from: k, reason: collision with root package name */
    public final C0478b[] f35169k;

    /* renamed from: l, reason: collision with root package name */
    public C0478b f35170l;

    /* renamed from: m, reason: collision with root package name */
    public List<r5.a> f35171m;

    /* renamed from: n, reason: collision with root package name */
    public List<r5.a> f35172n;
    public c o;

    /* renamed from: p, reason: collision with root package name */
    public int f35173p;

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final e f35174c = new e(2);

        /* renamed from: a, reason: collision with root package name */
        public final r5.a f35175a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35176b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i10, float f10, int i11, boolean z10, int i12, int i13) {
            a.C0471a c0471a = new a.C0471a();
            c0471a.f34901a = spannableStringBuilder;
            c0471a.f34903c = alignment;
            c0471a.f34905e = f;
            c0471a.f = 0;
            c0471a.f34906g = i10;
            c0471a.f34907h = f10;
            c0471a.f34908i = i11;
            c0471a.f34911l = -3.4028235E38f;
            if (z10) {
                c0471a.o = i12;
                c0471a.f34913n = true;
            }
            this.f35175a = c0471a.a();
            this.f35176b = i13;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: s5.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0478b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f35177w = c(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f35178x;
        public static final int[] y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f35179z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f35180a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f35181b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f35182c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f35183d;

        /* renamed from: e, reason: collision with root package name */
        public int f35184e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public int f35185g;

        /* renamed from: h, reason: collision with root package name */
        public int f35186h;

        /* renamed from: i, reason: collision with root package name */
        public int f35187i;

        /* renamed from: j, reason: collision with root package name */
        public int f35188j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f35189k;

        /* renamed from: l, reason: collision with root package name */
        public int f35190l;

        /* renamed from: m, reason: collision with root package name */
        public int f35191m;

        /* renamed from: n, reason: collision with root package name */
        public int f35192n;
        public int o;

        /* renamed from: p, reason: collision with root package name */
        public int f35193p;

        /* renamed from: q, reason: collision with root package name */
        public int f35194q;

        /* renamed from: r, reason: collision with root package name */
        public int f35195r;

        /* renamed from: s, reason: collision with root package name */
        public int f35196s;

        /* renamed from: t, reason: collision with root package name */
        public int f35197t;

        /* renamed from: u, reason: collision with root package name */
        public int f35198u;

        /* renamed from: v, reason: collision with root package name */
        public int f35199v;

        static {
            int c10 = c(0, 0, 0, 0);
            f35178x = c10;
            int c11 = c(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f35179z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{c10, c11, c10, c10, c11, c10, c10};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{c10, c10, c10, c10, c10, c11, c11};
        }

        public C0478b() {
            d();
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
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                d6.a.c(r4, r0)
                d6.a.c(r5, r0)
                d6.a.c(r6, r0)
                d6.a.c(r7, r0)
                r0 = 0
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
            throw new UnsupportedOperationException("Method not decompiled: s5.b.C0478b.c(int, int, int, int):int");
        }

        public final void a(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f35181b;
            if (c10 == '\n') {
                ArrayList arrayList = this.f35180a;
                arrayList.add(b());
                spannableStringBuilder.clear();
                if (this.f35193p != -1) {
                    this.f35193p = 0;
                }
                if (this.f35194q != -1) {
                    this.f35194q = 0;
                }
                if (this.f35195r != -1) {
                    this.f35195r = 0;
                }
                if (this.f35197t != -1) {
                    this.f35197t = 0;
                }
                while (true) {
                    if ((this.f35189k && arrayList.size() >= this.f35188j) || arrayList.size() >= 15) {
                        arrayList.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                spannableStringBuilder.append(c10);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35181b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f35193p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f35193p, length, 33);
                }
                if (this.f35194q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35194q, length, 33);
                }
                if (this.f35195r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35196s), this.f35195r, length, 33);
                }
                if (this.f35197t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35198u), this.f35197t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f35180a.clear();
            this.f35181b.clear();
            this.f35193p = -1;
            this.f35194q = -1;
            this.f35195r = -1;
            this.f35197t = -1;
            this.f35199v = 0;
            this.f35182c = false;
            this.f35183d = false;
            this.f35184e = 4;
            this.f = false;
            this.f35185g = 0;
            this.f35186h = 0;
            this.f35187i = 0;
            this.f35188j = 15;
            this.f35189k = true;
            this.f35190l = 0;
            this.f35191m = 0;
            this.f35192n = 0;
            int i10 = f35178x;
            this.o = i10;
            this.f35196s = f35177w;
            this.f35198u = i10;
        }

        public final void e(boolean z10, boolean z11) {
            int i10 = this.f35193p;
            SpannableStringBuilder spannableStringBuilder = this.f35181b;
            if (i10 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f35193p, spannableStringBuilder.length(), 33);
                    this.f35193p = -1;
                }
            } else if (z10) {
                this.f35193p = spannableStringBuilder.length();
            }
            if (this.f35194q != -1) {
                if (!z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35194q, spannableStringBuilder.length(), 33);
                    this.f35194q = -1;
                    return;
                }
                return;
            }
            if (z11) {
                this.f35194q = spannableStringBuilder.length();
            }
        }

        public final void f(int i10, int i11) {
            int i12 = this.f35195r;
            SpannableStringBuilder spannableStringBuilder = this.f35181b;
            if (i12 != -1 && this.f35196s != i10) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35196s), this.f35195r, spannableStringBuilder.length(), 33);
            }
            if (i10 != f35177w) {
                this.f35195r = spannableStringBuilder.length();
                this.f35196s = i10;
            }
            if (this.f35197t != -1 && this.f35198u != i11) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35198u), this.f35197t, spannableStringBuilder.length(), 33);
            }
            if (i11 != f35178x) {
                this.f35197t = spannableStringBuilder.length();
                this.f35198u = i11;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f35200a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35201b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f35202c;

        /* renamed from: d, reason: collision with root package name */
        public int f35203d = 0;

        public c(int i10, int i11) {
            this.f35200a = i10;
            this.f35201b = i11;
            this.f35202c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f35168j = i10 == -1 ? 1 : i10;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f35169k = new C0478b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f35169k[i11] = new C0478b();
        }
        this.f35170l = this.f35169k[0];
    }

    @Override // s5.c
    public final d e() {
        List<r5.a> list = this.f35171m;
        this.f35172n = list;
        list.getClass();
        return new d(list);
    }

    @Override // s5.c
    public final void f(c.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f33322u;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.f35165g;
        wVar.C(limit, array);
        while (wVar.f27386c - wVar.f27385b >= 3) {
            int t10 = wVar.t() & 7;
            int i10 = t10 & 3;
            boolean z11 = false;
            if ((t10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte t11 = (byte) wVar.t();
            byte t12 = (byte) wVar.t();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (t11 & 192) >> 6;
                        int i12 = this.f35167i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            p.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f35167i + " current=" + i11);
                        }
                        this.f35167i = i11;
                        int i13 = t11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.o = cVar;
                        int i14 = cVar.f35203d;
                        cVar.f35203d = i14 + 1;
                        cVar.f35202c[i14] = t12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        d6.a.a(z11);
                        c cVar2 = this.o;
                        if (cVar2 == null) {
                            p.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i15 = cVar2.f35203d;
                            int i16 = i15 + 1;
                            byte[] bArr = cVar2.f35202c;
                            bArr[i15] = t11;
                            cVar2.f35203d = i16 + 1;
                            bArr[i16] = t12;
                        }
                    }
                    c cVar3 = this.o;
                    if (cVar3.f35203d == (cVar3.f35201b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // s5.c, n4.d
    public final void flush() {
        super.flush();
        this.f35171m = null;
        this.f35172n = null;
        this.f35173p = 0;
        this.f35170l = this.f35169k[0];
        k();
        this.o = null;
    }

    @Override // s5.c
    public final boolean h() {
        if (this.f35171m != this.f35172n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0141. Please report as an issue. */
    public final void i() {
        int i10;
        String str;
        c cVar = this.o;
        if (cVar == null) {
            return;
        }
        int i11 = 2;
        String str2 = "Cea708Decoder";
        if (cVar.f35203d != (cVar.f35201b * 2) - 1) {
            StringBuilder sb2 = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.o.f35201b * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.o.f35203d);
            sb2.append(" (sequence number ");
            sb2.append(this.o.f35200a);
            sb2.append(");");
            p.b("Cea708Decoder", sb2.toString());
        }
        c cVar2 = this.o;
        byte[] bArr = cVar2.f35202c;
        int i12 = cVar2.f35203d;
        v vVar = this.f35166h;
        vVar.j(i12, bArr);
        boolean z10 = false;
        while (true) {
            if (vVar.b() > 0) {
                int i13 = 3;
                int g6 = vVar.g(3);
                int g10 = vVar.g(5);
                if (g6 == 7) {
                    vVar.m(i11);
                    g6 = vVar.g(6);
                    if (g6 < 7) {
                        k.s("Invalid extended service number: ", g6, str2);
                    }
                }
                if (g10 == 0) {
                    if (g6 != 0) {
                        p.f(str2, "serviceNumber is non-zero (" + g6 + ") when blockSize is 0");
                    }
                } else if (g6 != this.f35168j) {
                    vVar.n(g10);
                } else {
                    int e10 = (g10 * 8) + vVar.e();
                    while (vVar.e() < e10) {
                        int g11 = vVar.g(8);
                        if (g11 != 16) {
                            if (g11 <= 31) {
                                if (g11 != 0) {
                                    if (g11 != i13) {
                                        if (g11 != 8) {
                                            switch (g11) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.f35170l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (g11 >= 17 && g11 <= 23) {
                                                        p.f(str2, "Currently unsupported COMMAND_EXT1 Command: " + g11);
                                                        vVar.m(8);
                                                        break;
                                                    } else if (g11 >= 24 && g11 <= 31) {
                                                        p.f(str2, "Currently unsupported COMMAND_P16 Command: " + g11);
                                                        vVar.m(16);
                                                        break;
                                                    } else {
                                                        k.s("Invalid C0 command: ", g11, str2);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f35170l.f35181b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f35171m = j();
                                    }
                                }
                            } else if (g11 <= 127) {
                                if (g11 == 127) {
                                    this.f35170l.a((char) 9835);
                                } else {
                                    this.f35170l.a((char) (g11 & com.anythink.expressad.exoplayer.k.p.f9095b));
                                }
                                z10 = true;
                            } else {
                                if (g11 <= 159) {
                                    C0478b[] c0478bArr = this.f35169k;
                                    switch (g11) {
                                        case 128:
                                        case com.anythink.expressad.video.module.a.a.T /* 129 */:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str = str2;
                                            i10 = e10;
                                            z10 = true;
                                            int i14 = g11 - 128;
                                            if (this.f35173p != i14) {
                                                this.f35173p = i14;
                                                this.f35170l = c0478bArr[i14];
                                            }
                                            str2 = str;
                                            break;
                                        case 136:
                                            str = str2;
                                            i10 = e10;
                                            z10 = true;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (vVar.f()) {
                                                    C0478b c0478b = c0478bArr[8 - i15];
                                                    c0478b.f35180a.clear();
                                                    c0478b.f35181b.clear();
                                                    c0478b.f35193p = -1;
                                                    c0478b.f35194q = -1;
                                                    c0478b.f35195r = -1;
                                                    c0478b.f35197t = -1;
                                                    c0478b.f35199v = 0;
                                                }
                                            }
                                            str2 = str;
                                            break;
                                        case 137:
                                            str = str2;
                                            i10 = e10;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (vVar.f()) {
                                                    c0478bArr[8 - i16].f35183d = true;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 138:
                                            str = str2;
                                            i10 = e10;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (vVar.f()) {
                                                    c0478bArr[8 - i17].f35183d = false;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 139:
                                            str = str2;
                                            i10 = e10;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (vVar.f()) {
                                                    c0478bArr[8 - i18].f35183d = !r3.f35183d;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                                            str = str2;
                                            i10 = e10;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (vVar.f()) {
                                                    c0478bArr[8 - i19].d();
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 141:
                                            str = str2;
                                            i10 = e10;
                                            vVar.m(8);
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 142:
                                            str = str2;
                                            i10 = e10;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 143:
                                            str = str2;
                                            i10 = e10;
                                            k();
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 144:
                                            str = str2;
                                            i10 = e10;
                                            if (!this.f35170l.f35182c) {
                                                vVar.m(16);
                                                i13 = 3;
                                                z10 = true;
                                                str2 = str;
                                                break;
                                            } else {
                                                vVar.g(4);
                                                vVar.g(2);
                                                vVar.g(2);
                                                boolean f = vVar.f();
                                                boolean f10 = vVar.f();
                                                vVar.g(3);
                                                vVar.g(3);
                                                this.f35170l.e(f, f10);
                                                i13 = 3;
                                                z10 = true;
                                                str2 = str;
                                            }
                                        case 145:
                                            str = str2;
                                            i10 = e10;
                                            if (!this.f35170l.f35182c) {
                                                vVar.m(24);
                                            } else {
                                                int c10 = C0478b.c(vVar.g(2), vVar.g(2), vVar.g(2), vVar.g(2));
                                                int c11 = C0478b.c(vVar.g(2), vVar.g(2), vVar.g(2), vVar.g(2));
                                                vVar.m(2);
                                                C0478b.c(vVar.g(2), vVar.g(2), vVar.g(2), 0);
                                                this.f35170l.f(c10, c11);
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 146:
                                            str = str2;
                                            i10 = e10;
                                            if (!this.f35170l.f35182c) {
                                                vVar.m(16);
                                            } else {
                                                vVar.m(4);
                                                int g12 = vVar.g(4);
                                                vVar.m(2);
                                                vVar.g(6);
                                                C0478b c0478b2 = this.f35170l;
                                                if (c0478b2.f35199v != g12) {
                                                    c0478b2.a('\n');
                                                }
                                                c0478b2.f35199v = g12;
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                                        default:
                                            i10 = e10;
                                            z10 = true;
                                            k.s("Invalid C1 command: ", g11, str2);
                                            break;
                                        case 151:
                                            str = str2;
                                            i10 = e10;
                                            if (!this.f35170l.f35182c) {
                                                vVar.m(32);
                                            } else {
                                                int c12 = C0478b.c(vVar.g(2), vVar.g(2), vVar.g(2), vVar.g(2));
                                                vVar.g(2);
                                                C0478b.c(vVar.g(2), vVar.g(2), vVar.g(2), 0);
                                                vVar.f();
                                                vVar.f();
                                                vVar.g(2);
                                                vVar.g(2);
                                                int g13 = vVar.g(2);
                                                vVar.m(8);
                                                C0478b c0478b3 = this.f35170l;
                                                c0478b3.o = c12;
                                                c0478b3.f35190l = g13;
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i20 = g11 - 152;
                                            C0478b c0478b4 = c0478bArr[i20];
                                            vVar.m(i11);
                                            boolean f11 = vVar.f();
                                            boolean f12 = vVar.f();
                                            vVar.f();
                                            int g14 = vVar.g(i13);
                                            boolean f13 = vVar.f();
                                            int g15 = vVar.g(7);
                                            int g16 = vVar.g(8);
                                            int g17 = vVar.g(4);
                                            int g18 = vVar.g(4);
                                            vVar.m(i11);
                                            i10 = e10;
                                            vVar.g(6);
                                            vVar.m(i11);
                                            int g19 = vVar.g(3);
                                            int g20 = vVar.g(3);
                                            str = str2;
                                            c0478b4.f35182c = true;
                                            c0478b4.f35183d = f11;
                                            c0478b4.f35189k = f12;
                                            c0478b4.f35184e = g14;
                                            c0478b4.f = f13;
                                            c0478b4.f35185g = g15;
                                            c0478b4.f35186h = g16;
                                            c0478b4.f35187i = g17;
                                            int i21 = g18 + 1;
                                            if (c0478b4.f35188j != i21) {
                                                c0478b4.f35188j = i21;
                                                while (true) {
                                                    ArrayList arrayList = c0478b4.f35180a;
                                                    if ((f12 && arrayList.size() >= c0478b4.f35188j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g19 != 0 && c0478b4.f35191m != g19) {
                                                c0478b4.f35191m = g19;
                                                int i22 = g19 - 1;
                                                int i23 = C0478b.C[i22];
                                                boolean z11 = C0478b.B[i22];
                                                int i24 = C0478b.f35179z[i22];
                                                int i25 = C0478b.A[i22];
                                                int i26 = C0478b.y[i22];
                                                c0478b4.o = i23;
                                                c0478b4.f35190l = i26;
                                            }
                                            if (g20 != 0 && c0478b4.f35192n != g20) {
                                                c0478b4.f35192n = g20;
                                                int i27 = g20 - 1;
                                                int i28 = C0478b.E[i27];
                                                int i29 = C0478b.D[i27];
                                                c0478b4.e(false, false);
                                                c0478b4.f(C0478b.f35177w, C0478b.F[i27]);
                                            }
                                            if (this.f35173p != i20) {
                                                this.f35173p = i20;
                                                this.f35170l = c0478bArr[i20];
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                    }
                                } else {
                                    i10 = e10;
                                    if (g11 <= 255) {
                                        this.f35170l.a((char) (g11 & com.anythink.expressad.exoplayer.k.p.f9095b));
                                        z10 = true;
                                    } else {
                                        k.s("Invalid base command: ", g11, str2);
                                    }
                                }
                                i11 = 2;
                            }
                            i10 = e10;
                        } else {
                            i10 = e10;
                            int g21 = vVar.g(8);
                            if (g21 <= 31) {
                                if (g21 > 7) {
                                    if (g21 <= 15) {
                                        vVar.m(8);
                                    } else if (g21 <= 23) {
                                        vVar.m(16);
                                    } else if (g21 <= 31) {
                                        vVar.m(24);
                                    }
                                }
                            } else if (g21 <= 127) {
                                if (g21 != 32) {
                                    if (g21 != 33) {
                                        if (g21 != 37) {
                                            if (g21 != 42) {
                                                if (g21 != 44) {
                                                    if (g21 != 63) {
                                                        if (g21 != 57) {
                                                            if (g21 != 58) {
                                                                if (g21 != 60) {
                                                                    if (g21 != 61) {
                                                                        switch (g21) {
                                                                            case 48:
                                                                                this.f35170l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f35170l.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f35170l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f35170l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f35170l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f35170l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (g21) {
                                                                                    case 118:
                                                                                        this.f35170l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f35170l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f35170l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f35170l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f35170l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f35170l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f35170l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f35170l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f35170l.a((char) 9496);
                                                                                        break;
                                                                                    case com.anythink.expressad.video.module.a.a.R /* 127 */:
                                                                                        this.f35170l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        k.s("Invalid G2 character: ", g21, str2);
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f35170l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f35170l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f35170l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f35170l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f35170l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f35170l.a((char) 338);
                                                }
                                            } else {
                                                this.f35170l.a((char) 352);
                                            }
                                        } else {
                                            this.f35170l.a((char) 8230);
                                        }
                                    } else {
                                        this.f35170l.a((char) 160);
                                    }
                                } else {
                                    this.f35170l.a(' ');
                                }
                                z10 = true;
                            } else if (g21 <= 159) {
                                if (g21 <= 135) {
                                    vVar.m(32);
                                } else if (g21 <= 143) {
                                    vVar.m(40);
                                } else if (g21 <= 159) {
                                    i11 = 2;
                                    vVar.m(2);
                                    vVar.m(vVar.g(6) * 8);
                                }
                            } else {
                                if (g21 <= 255) {
                                    if (g21 == 160) {
                                        this.f35170l.a((char) 13252);
                                    } else {
                                        k.s("Invalid G3 character: ", g21, str2);
                                        this.f35170l.a('_');
                                    }
                                    z10 = true;
                                } else {
                                    k.s("Invalid extended command: ", g21, str2);
                                }
                                i11 = 2;
                            }
                            i11 = 2;
                        }
                        e10 = i10;
                    }
                }
            }
        }
        if (z10) {
            this.f35171m = j();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<r5.a> j() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.b.j():java.util.List");
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f35169k[i10].d();
        }
    }
}
