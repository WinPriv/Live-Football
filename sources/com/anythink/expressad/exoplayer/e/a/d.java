package com.anythink.expressad.exoplayer.e.a;

import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7799a = 8192;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f7800a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7802c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7803d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f7804e;
        public final long f;

        public /* synthetic */ a(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10, byte b10) {
            this(jArr, iArr, i10, jArr2, iArr2, j10);
        }

        private a(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f7800a = jArr;
            this.f7801b = iArr;
            this.f7802c = i10;
            this.f7803d = jArr2;
            this.f7804e = iArr2;
            this.f = j10;
        }
    }

    private d() {
    }

    public static a a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = f7799a / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += af.a(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j11 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j11;
                int i19 = i10 * min;
                iArr2[i15] = i19;
                i16 = Math.max(i16, i19);
                jArr3[i15] = i14 * j10;
                iArr3[i15] = 1;
                j11 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new a(jArr2, iArr2, i16, jArr3, iArr3, j10 * i14, (byte) 0);
    }
}
