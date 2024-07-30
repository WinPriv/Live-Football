package com.applovin.exoplayer2.h.a;

import android.net.Uri;
import android.os.Bundle;
import com.anythink.expressad.exoplayer.b;
import com.applovin.exoplayer2.a0;
import com.applovin.exoplayer2.b0;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: b */
    public final Object f15252b;

    /* renamed from: c */
    public final int f15253c;

    /* renamed from: d */
    public final long f15254d;

    /* renamed from: e */
    public final long f15255e;
    public final int f;

    /* renamed from: i */
    private final C0173a[] f15256i;

    /* renamed from: a */
    public static final a f15249a = new a(null, new C0173a[0], 0, b.f7291b, 0);

    /* renamed from: h */
    private static final C0173a f15251h = new C0173a(0).b(0);

    /* renamed from: g */
    public static final g.a<a> f15250g = new a0(5);

    /* renamed from: com.applovin.exoplayer2.h.a.a$a */
    /* loaded from: classes.dex */
    public static final class C0173a implements g {

        /* renamed from: h */
        public static final g.a<C0173a> f15257h = new b0(5);

        /* renamed from: a */
        public final long f15258a;

        /* renamed from: b */
        public final int f15259b;

        /* renamed from: c */
        public final Uri[] f15260c;

        /* renamed from: d */
        public final int[] f15261d;

        /* renamed from: e */
        public final long[] f15262e;
        public final long f;

        /* renamed from: g */
        public final boolean f15263g;

        public C0173a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static /* synthetic */ C0173a b(Bundle bundle) {
            return a(bundle);
        }

        public int a() {
            return a(-1);
        }

        public boolean c() {
            if (this.f15259b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f15259b; i10++) {
                int i11 = this.f15261d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0173a.class != obj.getClass()) {
                return false;
            }
            C0173a c0173a = (C0173a) obj;
            if (this.f15258a == c0173a.f15258a && this.f15259b == c0173a.f15259b && Arrays.equals(this.f15260c, c0173a.f15260c) && Arrays.equals(this.f15261d, c0173a.f15261d) && Arrays.equals(this.f15262e, c0173a.f15262e) && this.f == c0173a.f && this.f15263g == c0173a.f15263g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f15259b * 31;
            long j10 = this.f15258a;
            int hashCode = (Arrays.hashCode(this.f15262e) + ((Arrays.hashCode(this.f15261d) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f15260c)) * 31)) * 31)) * 31;
            long j11 = this.f;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f15263g ? 1 : 0);
        }

        private C0173a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            com.applovin.exoplayer2.l.a.a(iArr.length == uriArr.length);
            this.f15258a = j10;
            this.f15259b = i10;
            this.f15261d = iArr;
            this.f15260c = uriArr;
            this.f15262e = jArr;
            this.f = j11;
            this.f15263g = z10;
        }

        public int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f15261d;
                if (i12 >= iArr.length || this.f15263g || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean b() {
            return this.f15259b == -1 || a() < this.f15259b;
        }

        public C0173a b(int i10) {
            int[] a10 = a(this.f15261d, i10);
            long[] a11 = a(this.f15262e, i10);
            return new C0173a(this.f15258a, i10, a10, (Uri[]) Arrays.copyOf(this.f15260c, i10), a11, this.f, this.f15263g);
        }

        private static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, b.f7291b);
            return copyOf;
        }

        public static C0173a a(Bundle bundle) {
            long j10 = bundle.getLong(c(0));
            int i10 = bundle.getInt(c(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(2));
            int[] intArray = bundle.getIntArray(c(3));
            long[] longArray = bundle.getLongArray(c(4));
            long j11 = bundle.getLong(c(5));
            boolean z10 = bundle.getBoolean(c(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0173a(j10, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }
    }

    private a(Object obj, C0173a[] c0173aArr, long j10, long j11, int i10) {
        this.f15252b = obj;
        this.f15254d = j10;
        this.f15255e = j11;
        this.f15253c = c0173aArr.length + i10;
        this.f15256i = c0173aArr;
        this.f = i10;
    }

    public static /* synthetic */ a b(Bundle bundle) {
        return a(bundle);
    }

    public C0173a a(int i10) {
        int i11 = this.f;
        if (i10 < i11) {
            return f15251h;
        }
        return this.f15256i[i10 - i11];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (ai.a(this.f15252b, aVar.f15252b) && this.f15253c == aVar.f15253c && this.f15254d == aVar.f15254d && this.f15255e == aVar.f15255e && this.f == aVar.f && Arrays.equals(this.f15256i, aVar.f15256i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i10 = this.f15253c * 31;
        Object obj = this.f15252b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i10 + hashCode) * 31) + ((int) this.f15254d)) * 31) + ((int) this.f15255e)) * 31) + this.f) * 31) + Arrays.hashCode(this.f15256i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f15252b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f15254d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f15256i.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f15256i[i10].f15258a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f15256i[i10].f15261d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f15256i[i10].f15261d[i11];
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
                sb2.append(this.f15256i[i10].f15262e[i11]);
                sb2.append(')');
                if (i11 < this.f15256i[i10].f15261d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f15256i.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != b.f7291b && j10 >= j11) {
            return -1;
        }
        int i10 = this.f;
        while (i10 < this.f15253c && ((a(i10).f15258a != Long.MIN_VALUE && a(i10).f15258a <= j10) || !a(i10).b())) {
            i10++;
        }
        if (i10 < this.f15253c) {
            return i10;
        }
        return -1;
    }

    public int a(long j10, long j11) {
        int i10 = this.f15253c - 1;
        while (i10 >= 0 && a(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !a(i10).c()) {
            return -1;
        }
        return i10;
    }

    private boolean a(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = a(i10).f15258a;
        return j12 == Long.MIN_VALUE ? j11 == b.f7291b || j10 < j11 : j10 < j12;
    }

    public static a a(Bundle bundle) {
        C0173a[] c0173aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            c0173aArr = new C0173a[0];
        } else {
            C0173a[] c0173aArr2 = new C0173a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c0173aArr2[i10] = C0173a.f15257h.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            c0173aArr = c0173aArr2;
        }
        return new a(null, c0173aArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), b.f7291b), bundle.getInt(b(4)));
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }
}
