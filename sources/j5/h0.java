package j5;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
/* loaded from: classes2.dex */
public interface h0 {

    /* compiled from: ShuffleOrder.java */
    /* loaded from: classes2.dex */
    public static class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public final Random f29754a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f29755b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f29756c;

        public a() {
            this(new Random());
        }

        @Override // j5.h0
        public final int a() {
            int[] iArr = this.f29755b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // j5.h0
        public final a b(int i10) {
            int i11 = i10 + 0;
            int[] iArr = this.f29755b;
            int[] iArr2 = new int[iArr.length - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 >= 0 && i14 < i10) {
                    i12++;
                } else {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= i11;
                    }
                    iArr2[i15] = i14;
                }
            }
            return new a(iArr2, new Random(this.f29754a.nextLong()));
        }

        @Override // j5.h0
        public final int c(int i10) {
            int i11 = this.f29756c[i10] - 1;
            if (i11 < 0) {
                return -1;
            }
            return this.f29755b[i11];
        }

        @Override // j5.h0
        public final int d(int i10) {
            int i11 = this.f29756c[i10] + 1;
            int[] iArr = this.f29755b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // j5.h0
        public final a e(int i10) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            int i11 = 0;
            while (true) {
                random = this.f29754a;
                iArr = this.f29755b;
                if (i11 >= i10) {
                    break;
                }
                iArr2[i11] = random.nextInt(iArr.length + 1);
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr3[i11] = iArr3[nextInt];
                iArr3[nextInt] = i11 + 0;
                i11 = i12;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i10];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < iArr.length + i10; i15++) {
                if (i13 < i10 && i14 == iArr2[i13]) {
                    iArr4[i15] = iArr3[i13];
                    i13++;
                } else {
                    int i16 = i14 + 1;
                    int i17 = iArr[i14];
                    iArr4[i15] = i17;
                    if (i17 >= 0) {
                        iArr4[i15] = i17 + i10;
                    }
                    i14 = i16;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // j5.h0
        public final int f() {
            int[] iArr = this.f29755b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // j5.h0
        public final a g() {
            return new a(new Random(this.f29754a.nextLong()));
        }

        @Override // j5.h0
        public final int getLength() {
            return this.f29755b.length;
        }

        public a(Random random) {
            this(new int[0], random);
        }

        public a(int[] iArr, Random random) {
            this.f29755b = iArr;
            this.f29754a = random;
            this.f29756c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f29756c[iArr[i10]] = i10;
            }
        }
    }

    int a();

    a b(int i10);

    int c(int i10);

    int d(int i10);

    a e(int i10);

    int f();

    a g();

    int getLength();
}
