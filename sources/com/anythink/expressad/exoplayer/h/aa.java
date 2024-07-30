package com.anythink.expressad.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface aa {

    /* loaded from: classes.dex */
    public static class a implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final Random f8201a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f8202b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f8203c;

        public a() {
            this(0, new Random());
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int a() {
            return this.f8202b.length;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int b(int i10) {
            int i11 = this.f8203c[i10] - 1;
            if (i11 >= 0) {
                return this.f8202b[i11];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int c() {
            int[] iArr = this.f8202b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f8201a.nextLong()));
        }

        private a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int a(int i10) {
            int i11 = this.f8203c[i10] + 1;
            int[] iArr = this.f8202b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa c(int i10) {
            int[] iArr = new int[this.f8202b.length - 1];
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                int[] iArr2 = this.f8202b;
                if (i11 < iArr2.length) {
                    int i12 = iArr2[i11];
                    if (i12 == i10) {
                        z10 = true;
                    } else {
                        int i13 = z10 ? i11 - 1 : i11;
                        if (i12 > i10) {
                            i12--;
                        }
                        iArr[i13] = i12;
                    }
                    i11++;
                } else {
                    return new a(iArr, new Random(this.f8201a.nextLong()));
                }
            }
        }

        private a(int i10, Random random) {
            this(a(i10, random), random);
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int b() {
            int[] iArr = this.f8202b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f8202b = iArr;
            this.f8201a = random;
            this.f8203c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f8203c[iArr[i10]] = i10;
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa a(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f8201a.nextInt(this.f8202b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f8201a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f8202b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f8202b;
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
                    return new a(iArr3, new Random(this.f8201a.nextLong()));
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

    /* loaded from: classes.dex */
    public static final class b implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final int f8204a;

        public b(int i10) {
            this.f8204a = i10;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int a() {
            return this.f8204a;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int b(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int c() {
            return this.f8204a > 0 ? 0 : -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int a(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f8204a) {
                return i11;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final int b() {
            int i10 = this.f8204a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa c(int i10) {
            return new b(this.f8204a - 1);
        }

        @Override // com.anythink.expressad.exoplayer.h.aa
        public final aa a(int i10, int i11) {
            return new b(this.f8204a + i11);
        }
    }

    int a();

    int a(int i10);

    aa a(int i10, int i11);

    int b();

    int b(int i10);

    int c();

    aa c(int i10);

    aa d();
}
