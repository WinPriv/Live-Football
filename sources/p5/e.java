package p5;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import j7.j0;
import j7.m0;
import j7.r;
import j7.v1;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMediaPlaylist.java */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final int f34397d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34398e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34399g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34400h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f34401i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34402j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34403k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34404l;

    /* renamed from: m, reason: collision with root package name */
    public final long f34405m;

    /* renamed from: n, reason: collision with root package name */
    public final long f34406n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f34407p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f34408q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f34409r;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f34410s;

    /* renamed from: t, reason: collision with root package name */
    public final m0 f34411t;

    /* renamed from: u, reason: collision with root package name */
    public final long f34412u;

    /* renamed from: v, reason: collision with root package name */
    public final C0460e f34413v;

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class a extends d {
        public final boolean D;
        public final boolean E;

        public a(String str, c cVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, cVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.D = z11;
            this.E = z12;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f34414a;

        /* renamed from: b, reason: collision with root package name */
        public final long f34415b;

        /* renamed from: c, reason: collision with root package name */
        public final int f34416c;

        public b(Uri uri, long j10, int i10) {
            this.f34414a = uri;
            this.f34415b = j10;
            this.f34416c = i10;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static class d implements Comparable<Long> {
        public final long A;
        public final long B;
        public final boolean C;

        /* renamed from: s, reason: collision with root package name */
        public final String f34417s;

        /* renamed from: t, reason: collision with root package name */
        public final c f34418t;

        /* renamed from: u, reason: collision with root package name */
        public final long f34419u;

        /* renamed from: v, reason: collision with root package name */
        public final int f34420v;

        /* renamed from: w, reason: collision with root package name */
        public final long f34421w;

        /* renamed from: x, reason: collision with root package name */
        public final DrmInitData f34422x;
        public final String y;

        /* renamed from: z, reason: collision with root package name */
        public final String f34423z;

        public d(String str, c cVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f34417s = str;
            this.f34418t = cVar;
            this.f34419u = j10;
            this.f34420v = i10;
            this.f34421w = j11;
            this.f34422x = drmInitData;
            this.y = str2;
            this.f34423z = str3;
            this.A = j12;
            this.B = j13;
            this.C = z10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l10) {
            Long l11 = l10;
            long longValue = l11.longValue();
            long j10 = this.f34421w;
            if (j10 > longValue) {
                return 1;
            }
            if (j10 < l11.longValue()) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* renamed from: p5.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0460e {

        /* renamed from: a, reason: collision with root package name */
        public final long f34424a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34425b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34426c;

        /* renamed from: d, reason: collision with root package name */
        public final long f34427d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f34428e;

        public C0460e(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f34424a = j10;
            this.f34425b = z10;
            this.f34426c = j11;
            this.f34427d = j12;
            this.f34428e = z11;
        }
    }

    public e(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List<c> list2, List<a> list3, C0460e c0460e, Map<Uri, b> map) {
        super(str, list, z12);
        this.f34397d = i10;
        this.f34400h = j11;
        this.f34399g = z10;
        this.f34401i = z11;
        this.f34402j = i11;
        this.f34403k = j12;
        this.f34404l = i12;
        this.f34405m = j13;
        this.f34406n = j14;
        this.o = z13;
        this.f34407p = z14;
        this.f34408q = drmInitData;
        this.f34409r = j0.C(list2);
        this.f34410s = j0.C(list3);
        this.f34411t = m0.a(map);
        if (!list3.isEmpty()) {
            a aVar = (a) r.B(list3);
            this.f34412u = aVar.f34421w + aVar.f34419u;
        } else if (!list2.isEmpty()) {
            c cVar = (c) r.B(list2);
            this.f34412u = cVar.f34421w + cVar.f34419u;
        } else {
            this.f34412u = 0L;
        }
        long j15 = com.anythink.expressad.exoplayer.b.f7291b;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            if (j10 >= 0) {
                j15 = Math.min(this.f34412u, j10);
            } else {
                j15 = Math.max(0L, this.f34412u + j10);
            }
        }
        this.f34398e = j15;
        this.f = j10 >= 0;
        this.f34413v = c0460e;
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class c extends d {
        public final String D;
        public final j0 E;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(long j10, long j11, String str, String str2, String str3) {
            this(str, null, "", 0L, -1, com.anythink.expressad.exoplayer.b.f7291b, null, str2, str3, j10, j11, false, v1.f30113w);
            j0.b bVar = j0.f30006t;
        }

        public c(String str, c cVar, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<a> list) {
            super(str, cVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.D = str2;
            this.E = j0.C(list);
        }
    }

    @Override // i5.b
    public final g a(List list) {
        return this;
    }
}
