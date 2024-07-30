package s5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d6.g0;
import d6.p;
import d6.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r5.a;
import r5.i;
import r5.l;

/* compiled from: Cea608Decoder.java */
/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: h, reason: collision with root package name */
    public final int f35139h;

    /* renamed from: i, reason: collision with root package name */
    public final int f35140i;

    /* renamed from: j, reason: collision with root package name */
    public final int f35141j;

    /* renamed from: n, reason: collision with root package name */
    public List<r5.a> f35145n;
    public List<r5.a> o;

    /* renamed from: p, reason: collision with root package name */
    public int f35146p;

    /* renamed from: q, reason: collision with root package name */
    public int f35147q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35148r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35149s;

    /* renamed from: t, reason: collision with root package name */
    public byte f35150t;

    /* renamed from: u, reason: collision with root package name */
    public byte f35151u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35153w;

    /* renamed from: x, reason: collision with root package name */
    public long f35154x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f35137z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, com.anythink.expressad.video.dynview.a.a.f11393p, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final w f35138g = new w();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<C0476a> f35143l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public C0476a f35144m = new C0476a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f35152v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f35142k = 16000000;

    /* compiled from: Cea608Decoder.java */
    /* renamed from: s5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0476a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f35155a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f35156b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f35157c;

        /* renamed from: d, reason: collision with root package name */
        public int f35158d;

        /* renamed from: e, reason: collision with root package name */
        public int f35159e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f35160g;

        /* renamed from: h, reason: collision with root package name */
        public int f35161h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: s5.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0477a {

            /* renamed from: a, reason: collision with root package name */
            public final int f35162a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f35163b;

            /* renamed from: c, reason: collision with root package name */
            public int f35164c;

            public C0477a(int i10, boolean z10, int i11) {
                this.f35162a = i10;
                this.f35163b = z10;
                this.f35164c = i11;
            }
        }

        public C0476a(int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            this.f35155a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f35156b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f35157c = sb2;
            this.f35160g = i10;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f35158d = 15;
            this.f35159e = 0;
            this.f = 0;
            this.f35161h = i11;
        }

        public final void a(char c10) {
            StringBuilder sb2 = this.f35157c;
            if (sb2.length() < 32) {
                sb2.append(c10);
            }
        }

        public final void b() {
            C0477a c0477a;
            int i10;
            StringBuilder sb2 = this.f35157c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f35155a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0 && (i10 = (c0477a = (C0477a) arrayList.get(size)).f35164c) == length) {
                        c0477a.f35164c = i10 - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public final r5.a c(int i10) {
            float f;
            int i11 = this.f35159e + this.f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f35156b;
                if (i13 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequence = (CharSequence) arrayList.get(i13);
                int i14 = g0.f27302a;
                if (charSequence.length() > i12) {
                    charSequence = charSequence.subSequence(0, i12);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
                i13++;
            }
            SpannableString d10 = d();
            int i15 = g0.f27302a;
            int length = d10.length();
            CharSequence charSequence2 = d10;
            if (length > i12) {
                charSequence2 = d10.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i12 - spannableStringBuilder.length();
            int i16 = i11 - length2;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f35160g == 2 && (Math.abs(i16) < 3 || length2 < 0)) {
                    i10 = 1;
                } else if (this.f35160g == 2 && i16 > 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length2;
                }
                f = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i17 = this.f35158d;
            if (i17 > 7) {
                i17 = (i17 - 15) - 2;
            } else if (this.f35160g == 1) {
                i17 -= this.f35161h - 1;
            }
            a.C0471a c0471a = new a.C0471a();
            c0471a.f34901a = spannableStringBuilder;
            c0471a.f34903c = Layout.Alignment.ALIGN_NORMAL;
            c0471a.f34905e = i17;
            c0471a.f = 1;
            c0471a.f34907h = f;
            c0471a.f34908i = i10;
            return c0471a.a();
        }

        public final SpannableString d() {
            int i10;
            boolean z10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35157c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (true) {
                ArrayList arrayList = this.f35155a;
                if (i15 >= arrayList.size()) {
                    break;
                }
                C0477a c0477a = (C0477a) arrayList.get(i15);
                boolean z12 = c0477a.f35163b;
                int i17 = c0477a.f35162a;
                if (i17 != 8) {
                    if (i17 == 7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i17 != 7) {
                        i14 = a.A[i17];
                    }
                    z11 = z10;
                }
                int i18 = c0477a.f35164c;
                i15++;
                if (i15 < arrayList.size()) {
                    i10 = ((C0477a) arrayList.get(i15)).f35164c;
                } else {
                    i10 = length;
                }
                if (i18 != i10) {
                    if (i11 != -1 && !z12) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i18, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i18;
                    }
                    if (i12 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i12, i18, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i18;
                    }
                    if (i14 != i13) {
                        if (i13 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, i18, 33);
                        }
                        i13 = i14;
                        i16 = i18;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (i12 != -1 && i12 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
            if (i16 != length && i13 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            if (this.f35155a.isEmpty() && this.f35156b.isEmpty() && this.f35157c.length() == 0) {
                return true;
            }
            return false;
        }
    }

    public a(String str, int i10) {
        int i11;
        if (o.f9067ac.equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f35139h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        p.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f35141j = 0;
                        this.f35140i = 0;
                    } else {
                        this.f35141j = 1;
                        this.f35140i = 1;
                    }
                } else {
                    this.f35141j = 0;
                    this.f35140i = 1;
                }
            } else {
                this.f35141j = 1;
                this.f35140i = 0;
            }
        } else {
            this.f35141j = 0;
            this.f35140i = 0;
        }
        k(0);
        j();
        this.f35153w = true;
        this.f35154x = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // s5.c
    public final d e() {
        List<r5.a> list = this.f35145n;
        this.o = list;
        list.getClass();
        return new d(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x0230. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[SYNTHETIC] */
    @Override // s5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(s5.c.a r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.a.f(s5.c$a):void");
    }

    @Override // s5.c, n4.d
    public final void flush() {
        super.flush();
        this.f35145n = null;
        this.o = null;
        k(0);
        this.f35147q = 4;
        this.f35144m.f35161h = 4;
        j();
        this.f35148r = false;
        this.f35149s = false;
        this.f35150t = (byte) 0;
        this.f35151u = (byte) 0;
        this.f35152v = 0;
        this.f35153w = true;
        this.f35154x = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // s5.c, n4.d
    /* renamed from: g */
    public final l b() throws i {
        boolean z10;
        l pollFirst;
        l b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        long j10 = this.f35142k;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f35154x;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b && this.f35208e - j11 >= j10) {
                z10 = true;
                if (!z10 && (pollFirst = this.f35205b.pollFirst()) != null) {
                    this.f35145n = Collections.emptyList();
                    this.f35154x = com.anythink.expressad.exoplayer.b.f7291b;
                    pollFirst.i(this.f35208e, e(), Long.MAX_VALUE);
                    return pollFirst;
                }
            }
        }
        z10 = false;
        return !z10 ? null : null;
    }

    @Override // s5.c
    public final boolean h() {
        if (this.f35145n != this.o) {
            return true;
        }
        return false;
    }

    public final List<r5.a> i() {
        ArrayList<C0476a> arrayList = this.f35143l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            r5.a c10 = arrayList.get(i11).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.A);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            r5.a aVar = (r5.a) arrayList2.get(i12);
            if (aVar != null) {
                if (aVar.A != i10) {
                    aVar = arrayList.get(i12).c(i10);
                    aVar.getClass();
                }
                arrayList3.add(aVar);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C0476a c0476a = this.f35144m;
        c0476a.f35160g = this.f35146p;
        c0476a.f35155a.clear();
        c0476a.f35156b.clear();
        c0476a.f35157c.setLength(0);
        c0476a.f35158d = 15;
        c0476a.f35159e = 0;
        c0476a.f = 0;
        ArrayList<C0476a> arrayList = this.f35143l;
        arrayList.clear();
        arrayList.add(this.f35144m);
    }

    public final void k(int i10) {
        int i11 = this.f35146p;
        if (i11 == i10) {
            return;
        }
        this.f35146p = i10;
        if (i10 == 3) {
            int i12 = 0;
            while (true) {
                ArrayList<C0476a> arrayList = this.f35143l;
                if (i12 < arrayList.size()) {
                    arrayList.get(i12).f35160g = i10;
                    i12++;
                } else {
                    return;
                }
            }
        } else {
            j();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f35145n = Collections.emptyList();
            }
        }
    }

    @Override // s5.c, n4.d
    public final void release() {
    }
}
