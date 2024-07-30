package com.anythink.expressad.exoplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import com.anythink.expressad.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b {
    public static final int A = 8;
    public static final int B = 14;
    public static final int C;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 3;
    public static final int G = 5;
    public static final int H = 2;
    public static final int I = 1;
    public static final int J = 0;
    public static final int K = Integer.MIN_VALUE;
    public static final int L = 3;
    public static final int M = 3;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 1;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 4;
    public static final int T = 11;
    public static final int U = 12;
    public static final int V = 13;
    public static final int W = 14;
    public static final int X = 1;
    public static final int Y = 5;
    public static final int Z = 9;

    /* renamed from: a, reason: collision with root package name */
    public static final long f7286a = Long.MIN_VALUE;
    public static final int aA = -5;
    public static final int aB = 0;
    public static final int aC = 1;
    public static final int aD = 2;
    public static final int aE = 3;
    public static final int aF = 4;
    public static final int aG = 5;
    public static final int aH = 6;
    public static final int aI = 10000;
    public static final int aJ = -1;
    public static final int aK = 0;
    public static final int aL = 1;
    public static final int aM = 2;
    public static final int aN = 3;
    public static final int aO = 4;
    public static final int aP = 5;
    public static final int aQ = 10000;
    public static final int aR = 0;
    public static final int aS = 1;
    public static final int aT = 2;
    public static final int aU = 3;
    public static final int aV = 4;
    public static final int aW = 10000;
    public static final int aX = 65536;
    public static final int aY = 13107200;
    public static final int aZ = 3538944;

    /* renamed from: aa, reason: collision with root package name */
    public static final int f7287aa = 8;

    /* renamed from: ab, reason: collision with root package name */
    public static final int f7288ab = 7;

    /* renamed from: ac, reason: collision with root package name */
    public static final int f7289ac = 10;

    /* renamed from: ad, reason: collision with root package name */
    public static final int f7290ad = 6;
    public static final int ae = 0;
    public static final int af = 2;
    public static final int ag = 3;
    public static final int ah = 1;
    public static final int ai = 4;
    public static final int aj = 1073741824;
    public static final int ak = Integer.MIN_VALUE;
    public static final int al = 1;
    public static final int am = 2;
    public static final int an = 1;
    public static final int ao = 1;
    public static final int ap = 2;
    public static final int aq = 4;
    public static final String ar = "und";
    public static final int as = 0;
    public static final int at = 1;
    public static final int au = 2;
    public static final int av = 3;
    public static final int aw = -1;
    public static final int ax = -2;
    public static final int ay = -3;
    public static final int az = -4;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7291b = -9223372036854775807L;
    public static final int bA = 7;
    public static final int bB = 2;
    public static final int bC = 1;
    public static final int bD = 0;
    public static final int bE = -1000;

    /* renamed from: ba, reason: collision with root package name */
    public static final int f7292ba = 131072;

    /* renamed from: bb, reason: collision with root package name */
    public static final int f7293bb = 131072;

    /* renamed from: bc, reason: collision with root package name */
    public static final int f7294bc = 16777216;

    /* renamed from: bd, reason: collision with root package name */
    public static final String f7295bd = "cenc";
    public static final String be = "cbc1";
    public static final String bf = "cens";
    public static final String bg = "cbcs";
    public static final UUID bh;
    public static final UUID bi;
    public static final UUID bj;
    public static final UUID bk;
    public static final UUID bl;
    public static final int bm = 1;
    public static final int bn = 2;
    public static final int bo = 3;
    public static final int bp = 4;
    public static final int bq = 10000;
    public static final int br = 0;
    public static final int bs = 1;
    public static final int bt = 2;
    public static final int bu = 3;
    public static final int bv = 1;
    public static final int bw = 2;
    public static final int bx = 6;
    public static final int by = 3;
    public static final int bz = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7296c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7297d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7298e = -1;
    public static final int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7299g = 1000000;

    /* renamed from: h, reason: collision with root package name */
    public static final long f7300h = 1000000000;

    /* renamed from: i, reason: collision with root package name */
    public static final String f7301i = "US-ASCII";

    /* renamed from: j, reason: collision with root package name */
    public static final String f7302j = "UTF-8";

    /* renamed from: k, reason: collision with root package name */
    public static final String f7303k = "UTF-16";

    /* renamed from: l, reason: collision with root package name */
    public static final String f7304l = "serif";

    /* renamed from: m, reason: collision with root package name */
    public static final String f7305m = "sans-serif";

    /* renamed from: n, reason: collision with root package name */
    public static final int f7306n = 0;
    public static final int o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7307p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f7308q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f7309r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f7310s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f7311t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f7312u = Integer.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public static final int f7313v = 1073741824;

    /* renamed from: w, reason: collision with root package name */
    public static final int f7314w = 4;

    /* renamed from: x, reason: collision with root package name */
    public static final int f7315x = 5;
    public static final int y = 6;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7316z = 7;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.expressad.exoplayer.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0097b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface l {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface m {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface n {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o {
    }

    static {
        int i10;
        if (af.f8993a < 23) {
            i10 = 1020;
        } else {
            i10 = 6396;
        }
        C = i10;
        bh = new UUID(0L, 0L);
        bi = new UUID(1186680826959645954L, -5988876978535335093L);
        bj = new UUID(-2129748144642739255L, 8654423357094679310L);
        bk = new UUID(-1301668207276963122L, -6645017420763422227L);
        bl = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    private b() {
    }

    public static long a(long j10) {
        return (j10 == f7291b || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long b(long j10) {
        if (j10 != f7291b && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    @TargetApi(21)
    private static int a(Context context) {
        return ((AudioManager) context.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b)).generateAudioSessionId();
    }
}
