package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.a0;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class i implements com.applovin.exoplayer2.g {
    public static final g.a<i> N;
    public static final i o;

    /* renamed from: p */
    @Deprecated
    public static final i f15988p;
    public final boolean A;
    public final s<String> B;
    public final s<String> C;
    public final int D;
    public final int E;
    public final int F;
    public final s<String> G;
    public final s<String> H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final w<Integer> M;

    /* renamed from: q */
    public final int f15989q;

    /* renamed from: r */
    public final int f15990r;

    /* renamed from: s */
    public final int f15991s;

    /* renamed from: t */
    public final int f15992t;

    /* renamed from: u */
    public final int f15993u;

    /* renamed from: v */
    public final int f15994v;

    /* renamed from: w */
    public final int f15995w;

    /* renamed from: x */
    public final int f15996x;
    public final int y;

    /* renamed from: z */
    public final int f15997z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f15998a;

        /* renamed from: b */
        private int f15999b;

        /* renamed from: c */
        private int f16000c;

        /* renamed from: d */
        private int f16001d;

        /* renamed from: e */
        private int f16002e;
        private int f;

        /* renamed from: g */
        private int f16003g;

        /* renamed from: h */
        private int f16004h;

        /* renamed from: i */
        private int f16005i;

        /* renamed from: j */
        private int f16006j;

        /* renamed from: k */
        private boolean f16007k;

        /* renamed from: l */
        private s<String> f16008l;

        /* renamed from: m */
        private s<String> f16009m;

        /* renamed from: n */
        private int f16010n;
        private int o;

        /* renamed from: p */
        private int f16011p;

        /* renamed from: q */
        private s<String> f16012q;

        /* renamed from: r */
        private s<String> f16013r;

        /* renamed from: s */
        private int f16014s;

        /* renamed from: t */
        private boolean f16015t;

        /* renamed from: u */
        private boolean f16016u;

        /* renamed from: v */
        private boolean f16017v;

        /* renamed from: w */
        private w<Integer> f16018w;

        @Deprecated
        public a() {
            this.f15998a = Integer.MAX_VALUE;
            this.f15999b = Integer.MAX_VALUE;
            this.f16000c = Integer.MAX_VALUE;
            this.f16001d = Integer.MAX_VALUE;
            this.f16005i = Integer.MAX_VALUE;
            this.f16006j = Integer.MAX_VALUE;
            this.f16007k = true;
            this.f16008l = s.g();
            this.f16009m = s.g();
            this.f16010n = 0;
            this.o = Integer.MAX_VALUE;
            this.f16011p = Integer.MAX_VALUE;
            this.f16012q = s.g();
            this.f16013r = s.g();
            this.f16014s = 0;
            this.f16015t = false;
            this.f16016u = false;
            this.f16017v = false;
            this.f16018w = w.g();
        }

        private void a(Context context) {
            CaptioningManager captioningManager;
            if ((ai.f16274a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f16014s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f16013r = s.a(ai.a(locale));
                }
            }
        }

        public a b(Context context, boolean z10) {
            Point d10 = ai.d(context);
            return b(d10.x, d10.y, z10);
        }

        public a b(int i10, int i11, boolean z10) {
            this.f16005i = i10;
            this.f16006j = i11;
            this.f16007k = z10;
            return this;
        }

        public a b(Context context) {
            if (ai.f16274a >= 19) {
                a(context);
            }
            return this;
        }

        private static s<String> a(String[] strArr) {
            s.a i10 = s.i();
            for (String str : (String[]) com.applovin.exoplayer2.l.a.b(strArr)) {
                i10.a(ai.b((String) com.applovin.exoplayer2.l.a.b(str)));
            }
            return i10.a();
        }

        public i b() {
            return new i(this);
        }

        public a(Context context) {
            this();
            b(context);
            b(context, true);
        }

        public a(Bundle bundle) {
            String a10 = i.a(6);
            i iVar = i.o;
            this.f15998a = bundle.getInt(a10, iVar.f15989q);
            this.f15999b = bundle.getInt(i.a(7), iVar.f15990r);
            this.f16000c = bundle.getInt(i.a(8), iVar.f15991s);
            this.f16001d = bundle.getInt(i.a(9), iVar.f15992t);
            this.f16002e = bundle.getInt(i.a(10), iVar.f15993u);
            this.f = bundle.getInt(i.a(11), iVar.f15994v);
            this.f16003g = bundle.getInt(i.a(12), iVar.f15995w);
            this.f16004h = bundle.getInt(i.a(13), iVar.f15996x);
            this.f16005i = bundle.getInt(i.a(14), iVar.y);
            this.f16006j = bundle.getInt(i.a(15), iVar.f15997z);
            this.f16007k = bundle.getBoolean(i.a(16), iVar.A);
            this.f16008l = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(17)), new String[0]));
            this.f16009m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(1)), new String[0]));
            this.f16010n = bundle.getInt(i.a(2), iVar.D);
            this.o = bundle.getInt(i.a(18), iVar.E);
            this.f16011p = bundle.getInt(i.a(19), iVar.F);
            this.f16012q = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(20)), new String[0]));
            this.f16013r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(3)), new String[0]));
            this.f16014s = bundle.getInt(i.a(4), iVar.I);
            this.f16015t = bundle.getBoolean(i.a(5), iVar.J);
            this.f16016u = bundle.getBoolean(i.a(21), iVar.K);
            this.f16017v = bundle.getBoolean(i.a(22), iVar.L);
            this.f16018w = w.a((Collection) com.applovin.exoplayer2.common.b.c.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(i.a(23)), new int[0])));
        }
    }

    static {
        i b10 = new a().b();
        o = b10;
        f15988p = b10;
        N = new a0(8);
    }

    public i(a aVar) {
        this.f15989q = aVar.f15998a;
        this.f15990r = aVar.f15999b;
        this.f15991s = aVar.f16000c;
        this.f15992t = aVar.f16001d;
        this.f15993u = aVar.f16002e;
        this.f15994v = aVar.f;
        this.f15995w = aVar.f16003g;
        this.f15996x = aVar.f16004h;
        this.y = aVar.f16005i;
        this.f15997z = aVar.f16006j;
        this.A = aVar.f16007k;
        this.B = aVar.f16008l;
        this.C = aVar.f16009m;
        this.D = aVar.f16010n;
        this.E = aVar.o;
        this.F = aVar.f16011p;
        this.G = aVar.f16012q;
        this.H = aVar.f16013r;
        this.I = aVar.f16014s;
        this.J = aVar.f16015t;
        this.K = aVar.f16016u;
        this.L = aVar.f16017v;
        this.M = aVar.f16018w;
    }

    public static /* synthetic */ i a(Bundle bundle) {
        return new a(bundle).b();
    }

    public static /* synthetic */ i b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15989q == iVar.f15989q && this.f15990r == iVar.f15990r && this.f15991s == iVar.f15991s && this.f15992t == iVar.f15992t && this.f15993u == iVar.f15993u && this.f15994v == iVar.f15994v && this.f15995w == iVar.f15995w && this.f15996x == iVar.f15996x && this.A == iVar.A && this.y == iVar.y && this.f15997z == iVar.f15997z && this.B.equals(iVar.B) && this.C.equals(iVar.C) && this.D == iVar.D && this.E == iVar.E && this.F == iVar.F && this.G.equals(iVar.G) && this.H.equals(iVar.H) && this.I == iVar.I && this.J == iVar.J && this.K == iVar.K && this.L == iVar.L && this.M.equals(iVar.M)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.M.hashCode() + ((((((((((this.H.hashCode() + ((this.G.hashCode() + ((((((((this.C.hashCode() + ((this.B.hashCode() + ((((((((((((((((((((((this.f15989q + 31) * 31) + this.f15990r) * 31) + this.f15991s) * 31) + this.f15992t) * 31) + this.f15993u) * 31) + this.f15994v) * 31) + this.f15995w) * 31) + this.f15996x) * 31) + (this.A ? 1 : 0)) * 31) + this.y) * 31) + this.f15997z) * 31)) * 31)) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31)) * 31)) * 31) + this.I) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
