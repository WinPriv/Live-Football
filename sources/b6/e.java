package b6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import b6.a;
import b6.f;
import b6.h;
import b6.k;
import b6.m;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.b.f0;
import com.applovin.exoplayer2.b0;
import com.huawei.hms.ads.br;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import d6.p;
import j5.m0;
import j5.n0;
import j7.a2;
import j7.j0;
import j7.t1;
import j7.u;
import j7.u1;
import j7.v;
import j7.v1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import k4.i0;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes2.dex */
public final class e extends b6.h {

    /* renamed from: i, reason: collision with root package name */
    public static final u1<Integer> f3021i;

    /* renamed from: j, reason: collision with root package name */
    public static final u1<Integer> f3022j;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3023c;

    /* renamed from: d, reason: collision with root package name */
    public final f.b f3024d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3025e;
    public final c f;

    /* renamed from: g, reason: collision with root package name */
    public final C0031e f3026g;

    /* renamed from: h, reason: collision with root package name */
    public m4.d f3027h;

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class a extends g<a> implements Comparable<a> {
        public final boolean A;
        public final int B;
        public final int C;
        public final int D;
        public final boolean E;
        public final int F;
        public final int G;
        public final boolean H;
        public final int I;
        public final int J;
        public final int K;
        public final int L;
        public final boolean M;
        public final boolean N;

        /* renamed from: w, reason: collision with root package name */
        public final int f3028w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f3029x;
        public final String y;

        /* renamed from: z, reason: collision with root package name */
        public final c f3030z;

        public a(int i10, m0 m0Var, int i11, c cVar, int i12, boolean z10, b6.d dVar) {
            super(i10, i11, m0Var);
            int i13;
            int i14;
            int bitCount;
            boolean z11;
            boolean z12;
            boolean z13;
            String locale;
            String[] strArr;
            int i15;
            boolean z14;
            boolean z15;
            boolean z16;
            this.f3030z = cVar;
            this.y = e.i(this.f3056v.f30520u);
            int i16 = 0;
            this.A = e.g(i12, false);
            int i17 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i17 < cVar.F.size()) {
                    i14 = e.f(this.f3056v, cVar.F.get(i17), false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    i14 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.C = i17;
            this.B = i14;
            int i18 = this.f3056v.f30522w;
            int i19 = cVar.G;
            if (i18 != 0 && i18 == i19) {
                bitCount = Integer.MAX_VALUE;
            } else {
                bitCount = Integer.bitCount(i18 & i19);
            }
            this.D = bitCount;
            i0 i0Var = this.f3056v;
            int i20 = i0Var.f30522w;
            if (i20 != 0 && (i20 & 1) == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.E = z11;
            if ((i0Var.f30521v & 1) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.H = z12;
            int i21 = i0Var.Q;
            this.I = i21;
            this.J = i0Var.R;
            int i22 = i0Var.f30524z;
            this.K = i22;
            if ((i22 == -1 || i22 <= cVar.I) && ((i21 == -1 || i21 <= cVar.H) && dVar.apply(i0Var))) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f3029x = z13;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i23 = g0.f27302a;
            if (i23 >= 24) {
                strArr = configuration.getLocales().toLanguageTags().split(",", -1);
            } else {
                String[] strArr2 = new String[1];
                Locale locale2 = configuration.locale;
                if (i23 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                strArr2[0] = locale;
                strArr = strArr2;
            }
            for (int i24 = 0; i24 < strArr.length; i24++) {
                strArr[i24] = g0.K(strArr[i24]);
            }
            int i25 = 0;
            while (true) {
                if (i25 < strArr.length) {
                    i15 = e.f(this.f3056v, strArr[i25], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i25++;
                    }
                } else {
                    i15 = 0;
                    i25 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.F = i25;
            this.G = i15;
            int i26 = 0;
            while (true) {
                j0<String> j0Var = cVar.J;
                if (i26 >= j0Var.size()) {
                    break;
                }
                String str = this.f3056v.D;
                if (str != null && str.equals(j0Var.get(i26))) {
                    i13 = i26;
                    break;
                }
                i26++;
            }
            this.L = i13;
            if ((i12 & 384) == 128) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.M = z14;
            if ((i12 & 64) == 64) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.N = z15;
            c cVar2 = this.f3030z;
            if (e.g(i12, cVar2.F0) && ((z16 = this.f3029x) || cVar2.f3038z0)) {
                i16 = (!e.g(i12, false) || !z16 || this.f3056v.f30524z == -1 || cVar2.P || cVar2.O || (!cVar2.H0 && z10)) ? 1 : 2;
            }
            this.f3028w = i16;
        }

        @Override // b6.e.g
        public final int a() {
            return this.f3028w;
        }

        @Override // b6.e.g
        public final boolean b(a aVar) {
            int i10;
            String str;
            int i11;
            a aVar2 = aVar;
            c cVar = this.f3030z;
            boolean z10 = cVar.C0;
            i0 i0Var = aVar2.f3056v;
            i0 i0Var2 = this.f3056v;
            if ((z10 || ((i11 = i0Var2.Q) != -1 && i11 == i0Var.Q)) && ((cVar.A0 || ((str = i0Var2.D) != null && TextUtils.equals(str, i0Var.D))) && (cVar.B0 || ((i10 = i0Var2.R) != -1 && i10 == i0Var.R)))) {
                if (!cVar.D0) {
                    if (this.M != aVar2.M || this.N != aVar2.N) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            Object k10;
            u1<Integer> u1Var;
            boolean z10 = this.A;
            boolean z11 = this.f3029x;
            if (z11 && z10) {
                k10 = e.f3021i;
            } else {
                k10 = e.f3021i.k();
            }
            v c10 = v.f30109a.c(z10, aVar.A);
            Integer valueOf = Integer.valueOf(this.C);
            Integer valueOf2 = Integer.valueOf(aVar.C);
            t1.f30103s.getClass();
            a2 a2Var = a2.f29876s;
            v b10 = c10.b(valueOf, valueOf2, a2Var).a(this.B, aVar.B).a(this.D, aVar.D).c(this.H, aVar.H).c(this.E, aVar.E).b(Integer.valueOf(this.F), Integer.valueOf(aVar.F), a2Var).a(this.G, aVar.G).c(z11, aVar.f3029x).b(Integer.valueOf(this.L), Integer.valueOf(aVar.L), a2Var);
            int i10 = this.K;
            Integer valueOf3 = Integer.valueOf(i10);
            int i11 = aVar.K;
            Integer valueOf4 = Integer.valueOf(i11);
            if (this.f3030z.O) {
                u1Var = e.f3021i.k();
            } else {
                u1Var = e.f3022j;
            }
            v b11 = b10.b(valueOf3, valueOf4, u1Var).c(this.M, aVar.M).c(this.N, aVar.N).b(Integer.valueOf(this.I), Integer.valueOf(aVar.I), k10).b(Integer.valueOf(this.J), Integer.valueOf(aVar.J), k10);
            Integer valueOf5 = Integer.valueOf(i10);
            Integer valueOf6 = Integer.valueOf(i11);
            if (!g0.a(this.y, aVar.y)) {
                k10 = e.f3022j;
            }
            return b11.b(valueOf5, valueOf6, k10).e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: s, reason: collision with root package name */
        public final boolean f3031s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f3032t;

        public b(i0 i0Var, int i10) {
            this.f3031s = (i0Var.f30521v & 1) != 0;
            this.f3032t = e.g(i10, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return v.f30109a.c(this.f3032t, bVar2.f3032t).c(this.f3031s, bVar2.f3031s).e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class d implements k4.f {

        /* renamed from: v, reason: collision with root package name */
        public static final String f3039v = g0.F(0);

        /* renamed from: w, reason: collision with root package name */
        public static final String f3040w = g0.F(1);

        /* renamed from: x, reason: collision with root package name */
        public static final String f3041x = g0.F(2);
        public static final b0 y = new b0(21);

        /* renamed from: s, reason: collision with root package name */
        public final int f3042s;

        /* renamed from: t, reason: collision with root package name */
        public final int[] f3043t;

        /* renamed from: u, reason: collision with root package name */
        public final int f3044u;

        public d(int i10, int[] iArr, int i11) {
            this.f3042s = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f3043t = copyOf;
            this.f3044u = i11;
            Arrays.sort(copyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f3042s == dVar.f3042s && Arrays.equals(this.f3043t, dVar.f3043t) && this.f3044u == dVar.f3044u) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f3043t) + (this.f3042s * 31)) * 31) + this.f3044u;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* renamed from: b6.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0031e {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f3045a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3046b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f3047c;

        /* renamed from: d, reason: collision with root package name */
        public a f3048d;

        /* compiled from: DefaultTrackSelector.java */
        /* renamed from: b6.e$e$a */
        /* loaded from: classes2.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f3049a;

            public a(e eVar) {
                this.f3049a = eVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                e eVar = this.f3049a;
                u1<Integer> u1Var = e.f3021i;
                eVar.h();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                e eVar = this.f3049a;
                u1<Integer> u1Var = e.f3021i;
                eVar.h();
            }
        }

        public C0031e(Spatializer spatializer) {
            boolean z10;
            this.f3045a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3046b = z10;
        }

        public static C0031e f(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(o.f9069b);
            if (audioManager == null) {
                return null;
            }
            return new C0031e(audioManager.getSpatializer());
        }

        public final boolean a(i0 i0Var, m4.d dVar) {
            boolean equals = o.B.equals(i0Var.D);
            int i10 = i0Var.Q;
            if (equals && i10 == 16) {
                i10 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(g0.n(i10));
            int i11 = i0Var.R;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f3045a.canBeSpatialized(dVar.a().f32725a, channelMask.build());
        }

        public final void b(e eVar, Looper looper) {
            if (this.f3048d == null && this.f3047c == null) {
                this.f3048d = new a(eVar);
                Handler handler = new Handler(looper);
                this.f3047c = handler;
                this.f3045a.addOnSpatializerStateChangedListener(new f0(1, handler), this.f3048d);
            }
        }

        public final boolean c() {
            return this.f3045a.isAvailable();
        }

        public final boolean d() {
            return this.f3045a.isEnabled();
        }

        public final void e() {
            a aVar = this.f3048d;
            if (aVar != null && this.f3047c != null) {
                this.f3045a.removeOnSpatializerStateChangedListener(aVar);
                Handler handler = this.f3047c;
                int i10 = g0.f27302a;
                handler.removeCallbacksAndMessages(null);
                this.f3047c = null;
                this.f3048d = null;
            }
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class f extends g<f> implements Comparable<f> {
        public final int A;
        public final int B;
        public final int C;
        public final int D;
        public final boolean E;

        /* renamed from: w, reason: collision with root package name */
        public final int f3050w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f3051x;
        public final boolean y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f3052z;

        public f(int i10, m0 m0Var, int i11, c cVar, int i12, String str) {
            super(i10, i11, m0Var);
            boolean z10;
            boolean z11;
            j0<String> j0Var;
            int i13;
            boolean z12;
            boolean z13;
            boolean z14;
            int i14 = 0;
            this.f3051x = e.g(i12, false);
            int i15 = this.f3056v.f30521v & (~cVar.M);
            if ((i15 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.y = z10;
            if ((i15 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f3052z = z11;
            j0<String> j0Var2 = cVar.K;
            if (j0Var2.isEmpty()) {
                j0Var = j0.G("");
            } else {
                j0Var = j0Var2;
            }
            int i16 = 0;
            while (true) {
                if (i16 < j0Var.size()) {
                    i13 = e.f(this.f3056v, j0Var.get(i16), cVar.N);
                    if (i13 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    i13 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.A = i16;
            this.B = i13;
            int i17 = this.f3056v.f30522w;
            int i18 = cVar.L;
            int bitCount = (i17 == 0 || i17 != i18) ? Integer.bitCount(i17 & i18) : Integer.MAX_VALUE;
            this.C = bitCount;
            if ((this.f3056v.f30522w & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.E = z12;
            if (e.i(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int f = e.f(this.f3056v, str, z13);
            this.D = f;
            if (i13 <= 0 && ((!j0Var2.isEmpty() || bitCount <= 0) && !this.y && (!this.f3052z || f <= 0))) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (e.g(i12, cVar.F0) && z14) {
                i14 = 1;
            }
            this.f3050w = i14;
        }

        @Override // b6.e.g
        public final int a() {
            return this.f3050w;
        }

        @Override // b6.e.g
        public final /* bridge */ /* synthetic */ boolean b(f fVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Comparator, j7.a2] */
        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            v c10 = v.f30109a.c(this.f3051x, fVar.f3051x);
            Integer valueOf = Integer.valueOf(this.A);
            Integer valueOf2 = Integer.valueOf(fVar.A);
            t1 t1Var = t1.f30103s;
            t1Var.getClass();
            ?? r42 = a2.f29876s;
            v b10 = c10.b(valueOf, valueOf2, r42);
            int i10 = this.B;
            v a10 = b10.a(i10, fVar.B);
            int i11 = this.C;
            v c11 = a10.a(i11, fVar.C).c(this.y, fVar.y);
            Boolean valueOf3 = Boolean.valueOf(this.f3052z);
            Boolean valueOf4 = Boolean.valueOf(fVar.f3052z);
            if (i10 != 0) {
                t1Var = r42;
            }
            v a11 = c11.b(valueOf3, valueOf4, t1Var).a(this.D, fVar.D);
            if (i11 == 0) {
                a11 = a11.d(this.E, fVar.E);
            }
            return a11.e();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static abstract class g<T extends g<T>> {

        /* renamed from: s, reason: collision with root package name */
        public final int f3053s;

        /* renamed from: t, reason: collision with root package name */
        public final m0 f3054t;

        /* renamed from: u, reason: collision with root package name */
        public final int f3055u;

        /* renamed from: v, reason: collision with root package name */
        public final i0 f3056v;

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: classes2.dex */
        public interface a<T extends g<T>> {
            v1 a(int i10, m0 m0Var, int[] iArr);
        }

        public g(int i10, int i11, m0 m0Var) {
            this.f3053s = i10;
            this.f3054t = m0Var;
            this.f3055u = i11;
            this.f3056v = m0Var.f29804v[i11];
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class h extends g<h> {
        public final int A;
        public final int B;
        public final int C;
        public final int D;
        public final boolean E;
        public final boolean F;
        public final int G;
        public final boolean H;
        public final boolean I;
        public final int J;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f3057w;

        /* renamed from: x, reason: collision with root package name */
        public final c f3058x;
        public final boolean y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f3059z;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:128:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x00d7 A[EDGE_INSN: B:133:0x00d7->B:70:0x00d7 BREAK  A[LOOP:0: B:62:0x00ba->B:131:0x00d4], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(int r5, j5.m0 r6, int r7, b6.e.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.e.h.<init>(int, j5.m0, int, b6.e$c, int, int, boolean):void");
        }

        public static int c(h hVar, h hVar2) {
            v c10 = v.f30109a.c(hVar.f3059z, hVar2.f3059z).a(hVar.D, hVar2.D).c(hVar.E, hVar2.E).c(hVar.f3057w, hVar2.f3057w).c(hVar.y, hVar2.y);
            Integer valueOf = Integer.valueOf(hVar.C);
            Integer valueOf2 = Integer.valueOf(hVar2.C);
            t1.f30103s.getClass();
            v b10 = c10.b(valueOf, valueOf2, a2.f29876s);
            boolean z10 = hVar2.H;
            boolean z11 = hVar.H;
            v c11 = b10.c(z11, z10);
            boolean z12 = hVar2.I;
            boolean z13 = hVar.I;
            v c12 = c11.c(z13, z12);
            if (z11 && z13) {
                c12 = c12.a(hVar.J, hVar2.J);
            }
            return c12.e();
        }

        public static int d(h hVar, h hVar2) {
            Object k10;
            u1<Integer> u1Var;
            if (hVar.f3057w && hVar.f3059z) {
                k10 = e.f3021i;
            } else {
                k10 = e.f3021i.k();
            }
            v.a aVar = v.f30109a;
            int i10 = hVar.A;
            Integer valueOf = Integer.valueOf(i10);
            Integer valueOf2 = Integer.valueOf(hVar2.A);
            if (hVar.f3058x.O) {
                u1Var = e.f3021i.k();
            } else {
                u1Var = e.f3022j;
            }
            return aVar.b(valueOf, valueOf2, u1Var).b(Integer.valueOf(hVar.B), Integer.valueOf(hVar2.B), k10).b(Integer.valueOf(i10), Integer.valueOf(hVar2.A), k10).e();
        }

        @Override // b6.e.g
        public final int a() {
            return this.G;
        }

        @Override // b6.e.g
        public final boolean b(h hVar) {
            h hVar2 = hVar;
            if (this.F || g0.a(this.f3056v.D, hVar2.f3056v.D)) {
                if (!this.f3058x.y0) {
                    if (this.H != hVar2.H || this.I != hVar2.I) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    static {
        u1<Integer> uVar;
        u1<Integer> uVar2;
        Comparator mVar = new com.applovin.exoplayer2.j.m(2);
        if (mVar instanceof u1) {
            uVar = (u1) mVar;
        } else {
            uVar = new u(mVar);
        }
        f3021i = uVar;
        Comparator dVar = new k0.d(4);
        if (dVar instanceof u1) {
            uVar2 = (u1) dVar;
        } else {
            uVar2 = new u(dVar);
        }
        f3022j = uVar2;
    }

    public e(Context context) {
        boolean z10;
        a.b bVar = new a.b();
        c cVar = c.K0;
        c cVar2 = new c(new c.a(context));
        this.f3023c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f3024d = bVar;
        this.f = cVar2;
        this.f3027h = m4.d.y;
        if (context != null && g0.I(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3025e = z10;
        if (!z10 && context != null && g0.f27302a >= 32) {
            this.f3026g = C0031e.f(context);
        }
        if (cVar2.E0 && context == null) {
            p.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void e(n0 n0Var, c cVar, HashMap hashMap) {
        for (int i10 = 0; i10 < n0Var.f29814s; i10++) {
            j jVar = cVar.Q.get(n0Var.a(i10));
            if (jVar != null) {
                m0 m0Var = jVar.f3071s;
                j jVar2 = (j) hashMap.get(Integer.valueOf(m0Var.f29803u));
                if (jVar2 == null || (jVar2.f3072t.isEmpty() && !jVar.f3072t.isEmpty())) {
                    hashMap.put(Integer.valueOf(m0Var.f29803u), jVar);
                }
            }
        }
    }

    public static int f(i0 i0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(i0Var.f30520u)) {
            return 4;
        }
        String i10 = i(str);
        String i11 = i(i0Var.f30520u);
        if (i11 != null && i10 != null) {
            if (!i11.startsWith(i10) && !i10.startsWith(i11)) {
                int i12 = g0.f27302a;
                if (!i11.split("-", 2)[0].equals(i10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || i11 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean g(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4 && (!z10 || i11 != 3)) {
            return false;
        }
        return true;
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.anythink.expressad.exoplayer.b.ar)) {
            return null;
        }
        return str;
    }

    public static Pair j(int i10, h.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        RandomAccess randomAccess;
        boolean z10;
        h.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < aVar3.f3063a) {
            if (i10 == aVar3.f3064b[i11]) {
                n0 n0Var = aVar3.f3065c[i11];
                for (int i12 = 0; i12 < n0Var.f29814s; i12++) {
                    m0 a10 = n0Var.a(i12);
                    v1 a11 = aVar2.a(i11, a10, iArr[i11][i12]);
                    int i13 = a10.f29801s;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        g gVar = (g) a11.get(i14);
                        int a12 = gVar.a();
                        if (!zArr[i14] && a12 != 0) {
                            if (a12 == 1) {
                                randomAccess = j0.G(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    g gVar2 = (g) a11.get(i15);
                                    if (gVar2.a() == 2 && gVar.b(gVar2)) {
                                        arrayList2.add(gVar2);
                                        z10 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i11++;
            aVar3 = aVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((g) list.get(i16)).f3055u;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new f.a(0, gVar3.f3054t, iArr2), Integer.valueOf(gVar3.f3053s));
    }

    @Override // b6.m
    public final void b() {
        C0031e c0031e;
        synchronized (this.f3023c) {
            if (g0.f27302a >= 32 && (c0031e = this.f3026g) != null) {
                c0031e.e();
            }
        }
        super.b();
    }

    @Override // b6.m
    public final void d(m4.d dVar) {
        boolean z10;
        synchronized (this.f3023c) {
            if (!this.f3027h.equals(dVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3027h = dVar;
        }
        if (z10) {
            h();
        }
    }

    public final void h() {
        boolean z10;
        m.a aVar;
        C0031e c0031e;
        synchronized (this.f3023c) {
            if (this.f.E0 && !this.f3025e && g0.f27302a >= 32 && (c0031e = this.f3026g) != null && c0031e.f3046b) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10 && (aVar = this.f3122a) != null) {
            ((k4.f0) aVar).f30436z.g(10);
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes2.dex */
    public static final class c extends k {
        public static final c K0 = new c(new a());
        public static final String L0 = g0.F(1000);
        public static final String M0 = g0.F(1001);
        public static final String N0 = g0.F(1002);
        public static final String O0 = g0.F(1003);
        public static final String P0 = g0.F(1004);
        public static final String Q0 = g0.F(1005);
        public static final String R0 = g0.F(1006);
        public static final String S0 = g0.F(1007);
        public static final String T0 = g0.F(1008);
        public static final String U0 = g0.F(br.L);
        public static final String V0 = g0.F(1010);
        public static final String W0 = g0.F(1011);
        public static final String X0 = g0.F(1012);
        public static final String Y0 = g0.F(1013);
        public static final String Z0 = g0.F(1014);

        /* renamed from: a1, reason: collision with root package name */
        public static final String f3033a1 = g0.F(IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE);

        /* renamed from: b1, reason: collision with root package name */
        public static final String f3034b1 = g0.F(1016);
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        public final boolean F0;
        public final boolean G0;
        public final boolean H0;
        public final SparseArray<Map<n0, d>> I0;
        public final SparseBooleanArray J0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f3035v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f3036w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f3037x0;
        public final boolean y0;

        /* renamed from: z0, reason: collision with root package name */
        public final boolean f3038z0;

        public c(a aVar) {
            super(aVar);
            this.f3035v0 = aVar.A;
            this.f3036w0 = aVar.B;
            this.f3037x0 = aVar.C;
            this.y0 = aVar.D;
            this.f3038z0 = aVar.E;
            this.A0 = aVar.F;
            this.B0 = aVar.G;
            this.C0 = aVar.H;
            this.D0 = aVar.I;
            this.E0 = aVar.J;
            this.F0 = aVar.K;
            this.G0 = aVar.L;
            this.H0 = aVar.M;
            this.I0 = aVar.N;
            this.J0 = aVar.O;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[LOOP:0: B:47:0x009c->B:65:0x00f3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0099 A[SYNTHETIC] */
        @Override // b6.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b6.e.c.equals(java.lang.Object):boolean");
        }

        @Override // b6.k
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f3035v0 ? 1 : 0)) * 31) + (this.f3036w0 ? 1 : 0)) * 31) + (this.f3037x0 ? 1 : 0)) * 31) + (this.y0 ? 1 : 0)) * 31) + (this.f3038z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0);
        }

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: classes2.dex */
        public static final class a extends k.a {
            public boolean A;
            public boolean B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public final SparseArray<Map<n0, d>> N;
            public final SparseBooleanArray O;

            public a(Context context) {
                d(context);
                e(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                c();
            }

            @Override // b6.k.a
            public final k.a b(int i10, int i11) {
                super.b(i10, i11);
                return this;
            }

            public final void c() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            public final void d(Context context) {
                CaptioningManager captioningManager;
                String locale;
                int i10 = g0.f27302a;
                if (i10 >= 19) {
                    if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.f3116t = 1088;
                        Locale locale2 = captioningManager.getLocale();
                        if (locale2 != null) {
                            if (i10 >= 21) {
                                locale = locale2.toLanguageTag();
                            } else {
                                locale = locale2.toString();
                            }
                            this.f3115s = j0.G(locale);
                        }
                    }
                }
            }

            public final void e(Context context) {
                Display display;
                Point point;
                String A;
                String[] split;
                DisplayManager displayManager;
                int i10 = g0.f27302a;
                if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                    display = displayManager.getDisplay(0);
                } else {
                    display = null;
                }
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && g0.I(context)) {
                    if (i10 < 28) {
                        A = g0.A("sys.display-size");
                    } else {
                        A = g0.A("vendor.display-size");
                    }
                    if (!TextUtils.isEmpty(A)) {
                        try {
                            split = A.trim().split("x", -1);
                        } catch (NumberFormatException unused) {
                        }
                        if (split.length == 2) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                point = new Point(parseInt, parseInt2);
                                b(point.x, point.y);
                            }
                        }
                        p.c("Util", "Invalid display size: " + A);
                    }
                    if ("Sony".equals(g0.f27304c) && g0.f27305d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point = new Point(3840, 2160);
                        b(point.x, point.y);
                    }
                }
                point = new Point();
                if (i10 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else if (i10 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
                b(point.x, point.y);
            }

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                c();
            }

            public a(Bundle bundle) {
                super(bundle);
                v1 a10;
                SparseArray sparseArray;
                SparseBooleanArray sparseBooleanArray;
                c();
                c cVar = c.K0;
                this.A = bundle.getBoolean(c.L0, cVar.f3035v0);
                this.B = bundle.getBoolean(c.M0, cVar.f3036w0);
                this.C = bundle.getBoolean(c.N0, cVar.f3037x0);
                this.D = bundle.getBoolean(c.Z0, cVar.y0);
                this.E = bundle.getBoolean(c.O0, cVar.f3038z0);
                this.F = bundle.getBoolean(c.P0, cVar.A0);
                this.G = bundle.getBoolean(c.Q0, cVar.B0);
                this.H = bundle.getBoolean(c.R0, cVar.C0);
                this.I = bundle.getBoolean(c.f3033a1, cVar.D0);
                this.J = bundle.getBoolean(c.f3034b1, cVar.E0);
                this.K = bundle.getBoolean(c.S0, cVar.F0);
                this.L = bundle.getBoolean(c.T0, cVar.G0);
                this.M = bundle.getBoolean(c.U0, cVar.H0);
                this.N = new SparseArray<>();
                int[] intArray = bundle.getIntArray(c.V0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(c.W0);
                if (parcelableArrayList == null) {
                    a10 = v1.f30113w;
                } else {
                    a10 = d6.b.a(n0.f29813x, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(c.X0);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    b0 b0Var = d.y;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i10 = 0; i10 < sparseParcelableArray.size(); i10++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i10), b0Var.mo0fromBundle((Bundle) sparseParcelableArray.valueAt(i10)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray != null && intArray.length == a10.f30115v) {
                    for (int i11 = 0; i11 < intArray.length; i11++) {
                        int i12 = intArray[i11];
                        n0 n0Var = (n0) a10.get(i11);
                        d dVar = (d) sparseArray.get(i11);
                        SparseArray<Map<n0, d>> sparseArray3 = this.N;
                        Map<n0, d> map = sparseArray3.get(i12);
                        if (map == null) {
                            map = new HashMap<>();
                            sparseArray3.put(i12, map);
                        }
                        if (!map.containsKey(n0Var) || !g0.a(map.get(n0Var), dVar)) {
                            map.put(n0Var, dVar);
                        }
                    }
                }
                int[] intArray2 = bundle.getIntArray(c.Y0);
                if (intArray2 == null) {
                    sparseBooleanArray = new SparseBooleanArray();
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
                    for (int i13 : intArray2) {
                        sparseBooleanArray2.append(i13, true);
                    }
                    sparseBooleanArray = sparseBooleanArray2;
                }
                this.O = sparseBooleanArray;
            }
        }
    }
}
