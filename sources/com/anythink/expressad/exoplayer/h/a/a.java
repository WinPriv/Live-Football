package com.anythink.expressad.exoplayer.h.a;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8148a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8149b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8150c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8151d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8152e = 4;
    public static final a f = new a(new long[0]);

    /* renamed from: g, reason: collision with root package name */
    public final int f8153g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f8154h;

    /* renamed from: i, reason: collision with root package name */
    public final C0106a[] f8155i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8156j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8157k;

    /* renamed from: com.anythink.expressad.exoplayer.h.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0106a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8158a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri[] f8159b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f8160c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f8161d;

        public C0106a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private int c() {
            return a(-1);
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f8160c;
                if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final C0106a b(int i10) {
            com.anythink.expressad.exoplayer.k.a.a(this.f8158a == -1 && this.f8160c.length <= i10);
            return new C0106a(i10, a(this.f8160c, i10), (Uri[]) Arrays.copyOf(this.f8159b, i10), a(this.f8161d, i10));
        }

        private C0106a(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
            com.anythink.expressad.exoplayer.k.a.a(iArr.length == uriArr.length);
            this.f8158a = i10;
            this.f8160c = iArr;
            this.f8159b = uriArr;
            this.f8161d = jArr;
        }

        public final boolean a() {
            return this.f8158a == -1 || a(-1) < this.f8158a;
        }

        public final C0106a a(Uri uri, int i10) {
            int i11 = this.f8158a;
            com.anythink.expressad.exoplayer.k.a.a(i11 == -1 || i10 < i11);
            int[] a10 = a(this.f8160c, i10 + 1);
            com.anythink.expressad.exoplayer.k.a.a(a10[i10] == 0);
            long[] jArr = this.f8161d;
            if (jArr.length != a10.length) {
                jArr = a(jArr, a10.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f8159b, a10.length);
            uriArr[i10] = uri;
            a10[i10] = 1;
            return new C0106a(this.f8158a, a10, uriArr, jArr);
        }

        public final C0106a b() {
            if (this.f8158a == -1) {
                return new C0106a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f8160c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = copyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    copyOf[i10] = 2;
                }
            }
            return new C0106a(length, copyOf, this.f8159b, this.f8161d);
        }

        public final C0106a a(int i10, int i11) {
            int i12 = this.f8158a;
            com.anythink.expressad.exoplayer.k.a.a(i12 == -1 || i11 < i12);
            int[] a10 = a(this.f8160c, i11 + 1);
            int i13 = a10[i11];
            com.anythink.expressad.exoplayer.k.a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArr = this.f8161d;
            if (jArr.length != a10.length) {
                jArr = a(jArr, a10.length);
            }
            Uri[] uriArr = this.f8159b;
            if (uriArr.length != a10.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, a10.length);
            }
            a10[i11] = i10;
            return new C0106a(this.f8158a, a10, uriArr, jArr);
        }

        public final C0106a a(long[] jArr) {
            com.anythink.expressad.exoplayer.k.a.a(this.f8158a == -1 || jArr.length <= this.f8159b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f8159b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0106a(this.f8158a, this.f8160c, this.f8159b, jArr);
        }

        private static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, com.anythink.expressad.exoplayer.b.f7291b);
            return copyOf;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    private a(long... jArr) {
        this.f8153g = 0;
        this.f8154h = Arrays.copyOf(jArr, 0);
        this.f8155i = new C0106a[0];
        this.f8156j = 0L;
        this.f8157k = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private int a(long j10) {
        int length = this.f8154h.length - 1;
        while (length >= 0) {
            long j11 = this.f8154h[length];
            if (j11 != Long.MIN_VALUE && j11 <= j10) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.f8155i[length].a()) {
            return -1;
        }
        return length;
    }

    private int b(long j10) {
        int i10 = 0;
        while (true) {
            long[] jArr = this.f8154h;
            if (i10 >= jArr.length) {
                break;
            }
            long j11 = jArr[i10];
            if (j11 == Long.MIN_VALUE || (j10 < j11 && this.f8155i[i10].a())) {
                break;
            }
            i10++;
        }
        if (i10 < this.f8154h.length) {
            return i10;
        }
        return -1;
    }

    private a c(int i10, int i11) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = c0106aArr2[i10].a(2, i11);
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    private a d(int i10, int i11) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = c0106aArr2[i10].a(4, i11);
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    private a a(int i10, int i11) {
        com.anythink.expressad.exoplayer.k.a.a(i11 > 0);
        C0106a[] c0106aArr = this.f8155i;
        if (c0106aArr[i10].f8158a == i11) {
            return this;
        }
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = this.f8155i[i10].b(i11);
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    private a b(int i10, int i11) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = c0106aArr2[i10].a(3, i11);
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    private a c(long j10) {
        return this.f8156j == j10 ? this : new a(this.f8154h, this.f8155i, j10, this.f8157k);
    }

    private a d(long j10) {
        return this.f8157k == j10 ? this : new a(this.f8154h, this.f8155i, this.f8156j, j10);
    }

    private a(long[] jArr, C0106a[] c0106aArr, long j10, long j11) {
        this.f8153g = c0106aArr.length;
        this.f8154h = jArr;
        this.f8155i = c0106aArr;
        this.f8156j = j10;
        this.f8157k = j11;
    }

    private a a(int i10, int i11, Uri uri) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = c0106aArr2[i10].a(uri, i11);
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    private a a(int i10) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        c0106aArr2[i10] = c0106aArr2[i10].b();
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }

    public final a a(long[][] jArr) {
        C0106a[] c0106aArr = this.f8155i;
        C0106a[] c0106aArr2 = (C0106a[]) Arrays.copyOf(c0106aArr, c0106aArr.length);
        for (int i10 = 0; i10 < this.f8153g; i10++) {
            c0106aArr2[i10] = c0106aArr2[i10].a(jArr[i10]);
        }
        return new a(this.f8154h, c0106aArr2, this.f8156j, this.f8157k);
    }
}
