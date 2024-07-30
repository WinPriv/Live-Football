package com.anythink.expressad.exoplayer.i;

import android.util.Pair;
import com.anythink.expressad.exoplayer.aa;
import com.anythink.expressad.exoplayer.h.ae;
import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private a f8672a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8673a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8674b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8675c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8676d = 3;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final int f8677e;
        private final int f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f8678g;

        /* renamed from: h, reason: collision with root package name */
        private final af[] f8679h;

        /* renamed from: i, reason: collision with root package name */
        private final int[] f8680i;

        /* renamed from: j, reason: collision with root package name */
        private final int[][][] f8681j;

        /* renamed from: k, reason: collision with root package name */
        private final af f8682k;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.expressad.exoplayer.i.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0113a {
        }

        public a(int[] iArr, af[] afVarArr, int[] iArr2, int[][][] iArr3, af afVar) {
            this.f8678g = iArr;
            this.f8679h = afVarArr;
            this.f8681j = iArr3;
            this.f8680i = iArr2;
            this.f8682k = afVar;
            int length = iArr.length;
            this.f = length;
            this.f8677e = length;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int c(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.f8681j
                r8 = r0[r8]
                r0 = 0
                r1 = r0
                r2 = r1
            L7:
                int r3 = r8.length
                if (r1 >= r3) goto L28
                r3 = r0
            Lb:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L25
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L1d
                r6 = 4
                if (r4 == r6) goto L1c
                r4 = 1
                goto L1e
            L1c:
                return r5
            L1d:
                r4 = 2
            L1e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto Lb
            L25:
                int r1 = r1 + 1
                goto L7
            L28:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.i.e.a.c(int):int");
        }

        @Deprecated
        private int d(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f; i13++) {
                if (this.f8678g[i13] == i10) {
                    int[][] iArr = this.f8681j[i13];
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= iArr.length) {
                            break;
                        }
                        int i16 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i14];
                            if (i16 < iArr2.length) {
                                int i17 = iArr2[i16] & 7;
                                if (i17 != 3) {
                                    if (i17 != 4) {
                                        i11 = 1;
                                    } else {
                                        i15 = 3;
                                        break;
                                    }
                                } else {
                                    i11 = 2;
                                }
                                i15 = Math.max(i15, i11);
                                i16++;
                            }
                        }
                        i14++;
                    }
                    i12 = Math.max(i12, i15);
                }
            }
            return i12;
        }

        private int e(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f; i13++) {
                if (this.f8678g[i13] == i10) {
                    int[][] iArr = this.f8681j[i13];
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= iArr.length) {
                            break;
                        }
                        int i16 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i14];
                            if (i16 < iArr2.length) {
                                int i17 = iArr2[i16] & 7;
                                if (i17 != 3) {
                                    if (i17 != 4) {
                                        i11 = 1;
                                    } else {
                                        i15 = 3;
                                        break;
                                    }
                                } else {
                                    i11 = 2;
                                }
                                i15 = Math.max(i15, i11);
                                i16++;
                            }
                        }
                        i14++;
                    }
                    i12 = Math.max(i12, i15);
                }
            }
            return i12;
        }

        public final int a() {
            return this.f;
        }

        public final af b(int i10) {
            return this.f8679h[i10];
        }

        @Deprecated
        private int b(int i10, int i11, int i12) {
            return a(i10, i11, i12);
        }

        public final int a(int i10) {
            return this.f8678g[i10];
        }

        public final int a(int i10, int i11, int i12) {
            return this.f8681j[i10][i11][i12] & 7;
        }

        public final af b() {
            return this.f8682k;
        }

        public final int a(int i10, int i11) {
            int i12 = this.f8679h[i10].a(i11).f8252a;
            int[] iArr = new int[i12];
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                if (a(i10, i11, i15) == 4) {
                    iArr[i14] = i15;
                    i14++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            int i16 = 16;
            int i17 = 0;
            String str = null;
            boolean z10 = false;
            while (i13 < copyOf.length) {
                String str2 = this.f8679h[i10].a(i11).a(copyOf[i13]).f9257h;
                int i18 = i17 + 1;
                if (i17 == 0) {
                    str = str2;
                } else {
                    z10 |= !com.anythink.expressad.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i16 = Math.min(i16, this.f8681j[i10][i11][i13] & 24);
                i13++;
                i17 = i18;
            }
            return z10 ? Math.min(i16, this.f8680i[i10]) : i16;
        }

        @Deprecated
        private af c() {
            return this.f8682k;
        }

        private int a(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f8679h[i10].a(i11).a(iArr[i12]).f9257h;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !com.anythink.expressad.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i13 = Math.min(i13, this.f8681j[i10][i11][i12] & 24);
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f8680i[i10]) : i13;
        }
    }

    public abstract Pair<aa[], f[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final a a() {
        return this.f8672a;
    }

    @Override // com.anythink.expressad.exoplayer.i.h
    public final void a(Object obj) {
        this.f8672a = (a) obj;
    }

    @Override // com.anythink.expressad.exoplayer.i.h
    public final i a(z[] zVarArr, af afVar) {
        int[] iArr;
        int[] iArr2 = new int[zVarArr.length + 1];
        int length = zVarArr.length + 1;
        ae[][] aeVarArr = new ae[length];
        int[][][] iArr3 = new int[zVarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = afVar.f8256b;
            aeVarArr[i10] = new ae[i11];
            iArr3[i10] = new int[i11];
        }
        int length2 = zVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr4[i12] = zVarArr[i12].m();
        }
        for (int i13 = 0; i13 < afVar.f8256b; i13++) {
            ae a10 = afVar.a(i13);
            int length3 = zVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= zVarArr.length) {
                    break;
                }
                z zVar = zVarArr[i14];
                for (int i16 = 0; i16 < a10.f8252a; i16++) {
                    int a11 = zVar.a(a10.a(i16)) & 7;
                    if (a11 > i15) {
                        if (a11 == 4) {
                            length3 = i14;
                            break;
                        }
                        length3 = i14;
                        i15 = a11;
                    }
                }
                i14++;
            }
            if (length3 == zVarArr.length) {
                iArr = new int[a10.f8252a];
            } else {
                z zVar2 = zVarArr[length3];
                int[] iArr5 = new int[a10.f8252a];
                for (int i17 = 0; i17 < a10.f8252a; i17++) {
                    iArr5[i17] = zVar2.a(a10.a(i17));
                }
                iArr = iArr5;
            }
            int i18 = iArr2[length3];
            aeVarArr[length3][i18] = a10;
            iArr3[length3][i18] = iArr;
            iArr2[length3] = i18 + 1;
        }
        af[] afVarArr = new af[zVarArr.length];
        int[] iArr6 = new int[zVarArr.length];
        for (int i19 = 0; i19 < zVarArr.length; i19++) {
            int i20 = iArr2[i19];
            afVarArr[i19] = new af((ae[]) com.anythink.expressad.exoplayer.k.af.a(aeVarArr[i19], i20));
            iArr3[i19] = (int[][]) com.anythink.expressad.exoplayer.k.af.a(iArr3[i19], i20);
            iArr6[i19] = zVarArr[i19].a();
        }
        a aVar = new a(iArr6, afVarArr, iArr4, iArr3, new af((ae[]) com.anythink.expressad.exoplayer.k.af.a(aeVarArr[zVarArr.length], iArr2[zVarArr.length])));
        Pair<aa[], f[]> a12 = a(aVar, iArr3, iArr4);
        return new i((aa[]) a12.first, (f[]) a12.second, aVar);
    }

    private static int a(z[] zVarArr, ae aeVar) {
        int length = zVarArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < zVarArr.length; i11++) {
            z zVar = zVarArr[i11];
            for (int i12 = 0; i12 < aeVar.f8252a; i12++) {
                int a10 = zVar.a(aeVar.a(i12)) & 7;
                if (a10 > i10) {
                    if (a10 == 4) {
                        return i11;
                    }
                    length = i11;
                    i10 = a10;
                }
            }
        }
        return length;
    }

    private static int[] a(z zVar, ae aeVar) {
        int[] iArr = new int[aeVar.f8252a];
        for (int i10 = 0; i10 < aeVar.f8252a; i10++) {
            iArr[i10] = zVar.a(aeVar.a(i10));
        }
        return iArr;
    }

    private static int[] a(z[] zVarArr) {
        int length = zVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = zVarArr[i10].m();
        }
        return iArr;
    }
}
