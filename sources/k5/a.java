package k5;

import android.net.Uri;
import com.applovin.exoplayer2.a.l;
import com.applovin.exoplayer2.d.w;
import d6.g0;
import java.util.Arrays;
import k4.f;

/* compiled from: AdPlaybackState.java */
/* loaded from: classes2.dex */
public final class a implements f {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final w E;
    public static final a y = new a(null, new C0418a[0], 0, com.anythink.expressad.exoplayer.b.f7291b, 0);

    /* renamed from: z, reason: collision with root package name */
    public static final C0418a f30859z;

    /* renamed from: s, reason: collision with root package name */
    public final Object f30860s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30861t;

    /* renamed from: u, reason: collision with root package name */
    public final long f30862u;

    /* renamed from: v, reason: collision with root package name */
    public final long f30863v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30864w;

    /* renamed from: x, reason: collision with root package name */
    public final C0418a[] f30865x;

    /* compiled from: AdPlaybackState.java */
    /* renamed from: k5.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0418a implements f {
        public static final String A = g0.F(0);
        public static final String B = g0.F(1);
        public static final String C = g0.F(2);
        public static final String D = g0.F(3);
        public static final String E = g0.F(4);
        public static final String F = g0.F(5);
        public static final String G = g0.F(6);
        public static final String H = g0.F(7);
        public static final l I = new l(21);

        /* renamed from: s, reason: collision with root package name */
        public final long f30866s;

        /* renamed from: t, reason: collision with root package name */
        public final int f30867t;

        /* renamed from: u, reason: collision with root package name */
        public final int f30868u;

        /* renamed from: v, reason: collision with root package name */
        public final Uri[] f30869v;

        /* renamed from: w, reason: collision with root package name */
        public final int[] f30870w;

        /* renamed from: x, reason: collision with root package name */
        public final long[] f30871x;
        public final long y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f30872z;

        public C0418a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            boolean z11;
            if (iArr.length == uriArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            d6.a.a(z11);
            this.f30866s = j10;
            this.f30867t = i10;
            this.f30868u = i11;
            this.f30870w = iArr;
            this.f30869v = uriArr;
            this.f30871x = jArr;
            this.y = j11;
            this.f30872z = z10;
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f30870w;
                if (i12 >= iArr.length || this.f30872z || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0418a.class != obj.getClass()) {
                return false;
            }
            C0418a c0418a = (C0418a) obj;
            if (this.f30866s == c0418a.f30866s && this.f30867t == c0418a.f30867t && this.f30868u == c0418a.f30868u && Arrays.equals(this.f30869v, c0418a.f30869v) && Arrays.equals(this.f30870w, c0418a.f30870w) && Arrays.equals(this.f30871x, c0418a.f30871x) && this.y == c0418a.y && this.f30872z == c0418a.f30872z) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10 = ((this.f30867t * 31) + this.f30868u) * 31;
            long j10 = this.f30866s;
            int hashCode = (Arrays.hashCode(this.f30871x) + ((Arrays.hashCode(this.f30870w) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f30869v)) * 31)) * 31)) * 31;
            long j11 = this.y;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f30872z ? 1 : 0);
        }
    }

    static {
        C0418a c0418a = new C0418a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = c0418a.f30870w;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0418a.f30871x;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, com.anythink.expressad.exoplayer.b.f7291b);
        f30859z = new C0418a(c0418a.f30866s, 0, c0418a.f30868u, copyOf, (Uri[]) Arrays.copyOf(c0418a.f30869v, 0), copyOf2, c0418a.y, c0418a.f30872z);
        A = g0.F(1);
        B = g0.F(2);
        C = g0.F(3);
        D = g0.F(4);
        E = new w(16);
    }

    public a(Object obj, C0418a[] c0418aArr, long j10, long j11, int i10) {
        this.f30860s = obj;
        this.f30862u = j10;
        this.f30863v = j11;
        this.f30861t = c0418aArr.length + i10;
        this.f30865x = c0418aArr;
        this.f30864w = i10;
    }

    public final C0418a a(int i10) {
        int i11 = this.f30864w;
        if (i10 < i11) {
            return f30859z;
        }
        return this.f30865x[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (g0.a(this.f30860s, aVar.f30860s) && this.f30861t == aVar.f30861t && this.f30862u == aVar.f30862u && this.f30863v == aVar.f30863v && this.f30864w == aVar.f30864w && Arrays.equals(this.f30865x, aVar.f30865x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f30861t * 31;
        Object obj = this.f30860s;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i10 + hashCode) * 31) + ((int) this.f30862u)) * 31) + ((int) this.f30863v)) * 31) + this.f30864w) * 31) + Arrays.hashCode(this.f30865x);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f30860s);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f30862u);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            C0418a[] c0418aArr = this.f30865x;
            if (i10 < c0418aArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(c0418aArr[i10].f30866s);
                sb2.append(", ads=[");
                for (int i11 = 0; i11 < c0418aArr[i10].f30870w.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = c0418aArr[i10].f30870w[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(c0418aArr[i10].f30871x[i11]);
                    sb2.append(')');
                    if (i11 < c0418aArr[i10].f30870w.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < c0418aArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
