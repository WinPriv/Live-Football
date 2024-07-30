package com.applovin.exoplayer2.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface z {

    /* loaded from: classes.dex */
    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        private final Random f15500a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f15501b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f15502c;

        public a(int i10) {
            this(i10, new Random());
        }

        @Override // com.applovin.exoplayer2.h.z
        public int a() {
            return this.f15501b.length;
        }

        @Override // com.applovin.exoplayer2.h.z
        public int b(int i10) {
            int i11 = this.f15502c[i10] - 1;
            if (i11 >= 0) {
                return this.f15501b[i11];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public int c() {
            int[] iArr = this.f15501b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public z d() {
            return new a(0, new Random(this.f15500a.nextLong()));
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        @Override // com.applovin.exoplayer2.h.z
        public int a(int i10) {
            int i11 = this.f15502c[i10] + 1;
            int[] iArr = this.f15501b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f15501b = iArr;
            this.f15500a = random;
            this.f15502c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f15502c[iArr[i10]] = i10;
            }
        }

        @Override // com.applovin.exoplayer2.h.z
        public int b() {
            int[] iArr = this.f15501b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.h.z
        public z a(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f15500a.nextInt(this.f15501b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f15500a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f15501b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f15501b;
                if (i12 < iArr4.length + i11) {
                    if (i15 < i11 && i16 == iArr[i15]) {
                        iArr3[i12] = iArr2[i15];
                        i15++;
                    } else {
                        int i17 = i16 + 1;
                        int i18 = iArr4[i16];
                        iArr3[i12] = i18;
                        if (i18 >= i10) {
                            iArr3[i12] = i18 + i11;
                        }
                        i16 = i17;
                    }
                    i12++;
                } else {
                    return new a(iArr3, new Random(this.f15500a.nextLong()));
                }
            }
        }

        @Override // com.applovin.exoplayer2.h.z
        public z b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f15501b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f15501b;
                if (i13 < iArr2.length) {
                    int i15 = iArr2[i13];
                    if (i15 < i10 || i15 >= i11) {
                        int i16 = i13 - i14;
                        if (i15 >= i10) {
                            i15 -= i12;
                        }
                        iArr[i16] = i15;
                    } else {
                        i14++;
                    }
                    i13++;
                } else {
                    return new a(iArr, new Random(this.f15500a.nextLong()));
                }
            }
        }

        private static int[] a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }
    }

    int a();

    int a(int i10);

    z a(int i10, int i11);

    int b();

    int b(int i10);

    z b(int i10, int i11);

    int c();

    z d();
}
