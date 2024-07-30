package hd;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f28825a;

    /* renamed from: b, reason: collision with root package name */
    public int f28826b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28827c;

    /* renamed from: d, reason: collision with root package name */
    public final b f28828d;

    /* renamed from: e, reason: collision with root package name */
    public final b f28829e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public a f28830g;

    /* renamed from: h, reason: collision with root package name */
    public a f28831h;

    public a(d dVar, boolean z10, b bVar, b bVar2, int i10) {
        this.f28825a = dVar;
        this.f28827c = z10;
        this.f28828d = bVar;
        this.f28829e = bVar2;
        this.f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(int r3, hd.q r4, hd.b r5) {
        /*
            int r0 = r3 >>> 24
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L1f
            switch(r0) {
                case 19: goto L17;
                case 20: goto L17;
                case 21: goto L17;
                case 22: goto L1f;
                default: goto La;
            }
        La:
            switch(r0) {
                case 71: goto L1b;
                case 72: goto L1b;
                case 73: goto L1b;
                case 74: goto L1b;
                case 75: goto L1b;
                default: goto Ld;
            }
        Ld:
            r2 = 16776960(0xffff00, float:2.3509528E-38)
            r3 = r3 & r2
            int r3 = r3 >> 8
            r5.c(r0, r3)
            goto L24
        L17:
            r5.e(r0)
            goto L24
        L1b:
            r5.g(r3)
            goto L24
        L1f:
            int r3 = r3 >>> 16
            r5.i(r3)
        L24:
            if (r4 != 0) goto L2b
            r3 = 0
            r5.e(r3)
            goto L37
        L2b:
            byte[] r3 = r4.f28970a
            int r4 = r4.f28971b
            r0 = r3[r4]
            int r0 = r0 * 2
            int r0 = r0 + r1
            r5.f(r3, r4, r0)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.b(int, hd.q, hd.b):void");
    }

    public static void d(a[] aVarArr, int i10, b bVar) {
        int length = ((aVarArr.length - i10) * 2) + 1;
        int i11 = i10;
        while (true) {
            int i12 = 0;
            if (i11 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i11];
            if (aVar != null) {
                i12 = aVar.a();
            }
            length += i12;
            i11++;
        }
        bVar.g(length);
        bVar.e(aVarArr.length - i10);
        while (i10 < aVarArr.length) {
            a aVar2 = null;
            int i13 = 0;
            for (a aVar3 = aVarArr[i10]; aVar3 != null; aVar3 = aVar3.f28830g) {
                i13++;
                aVar3.g();
                aVar3.f28831h = aVar2;
                aVar2 = aVar3;
            }
            bVar.i(i13);
            while (aVar2 != null) {
                b bVar2 = aVar2.f28828d;
                bVar.f(bVar2.f28832a, 0, bVar2.f28833b);
                aVar2 = aVar2.f28831h;
            }
            i10++;
        }
    }

    public final int a() {
        int i10 = 0;
        for (a aVar = this; aVar != null; aVar = aVar.f28830g) {
            i10 += aVar.f28828d.f28833b;
        }
        return i10;
    }

    public final void c(b bVar) {
        int i10 = 2;
        int i11 = 0;
        a aVar = null;
        for (a aVar2 = this; aVar2 != null; aVar2 = aVar2.f28830g) {
            i11++;
            i10 += aVar2.f28828d.f28833b;
            aVar2.g();
            aVar2.f28831h = aVar;
            aVar = aVar2;
        }
        bVar.g(i10);
        bVar.i(i11);
        while (aVar != null) {
            b bVar2 = aVar.f28828d;
            bVar.f(bVar2.f28832a, 0, bVar2.f28833b);
            aVar = aVar.f28831h;
        }
    }

    public final void e(Object obj, String str) {
        int charAt;
        int i10;
        this.f28826b++;
        boolean z10 = this.f28827c;
        d dVar = this.f28825a;
        b bVar = this.f28828d;
        if (z10) {
            bVar.i(dVar.x0(str));
        }
        if (obj instanceof String) {
            i10 = dVar.x0((String) obj);
            charAt = 115;
        } else {
            if (obj instanceof Byte) {
                bVar.c(66, dVar.j0(((Byte) obj).byteValue()).f28911a);
                return;
            }
            if (obj instanceof Boolean) {
                bVar.c(90, dVar.j0(((Boolean) obj).booleanValue() ? 1 : 0).f28911a);
                return;
            }
            if (obj instanceof Character) {
                bVar.c(67, dVar.j0(((Character) obj).charValue()).f28911a);
                return;
            }
            if (obj instanceof Short) {
                bVar.c(83, dVar.j0(((Short) obj).shortValue()).f28911a);
                return;
            }
            if (obj instanceof p) {
                i10 = dVar.x0(((p) obj).e());
                charAt = 99;
            } else {
                int i11 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    bVar.c(91, bArr.length);
                    while (i11 < bArr.length) {
                        bVar.c(66, dVar.j0(bArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    bVar.c(91, zArr.length);
                    while (i11 < zArr.length) {
                        bVar.c(90, dVar.j0(zArr[i11] ? 1 : 0).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    bVar.c(91, sArr.length);
                    while (i11 < sArr.length) {
                        bVar.c(83, dVar.j0(sArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    bVar.c(91, cArr.length);
                    while (i11 < cArr.length) {
                        bVar.c(67, dVar.j0(cArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    bVar.c(91, iArr.length);
                    while (i11 < iArr.length) {
                        bVar.c(73, dVar.j0(iArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    bVar.c(91, jArr.length);
                    while (i11 < jArr.length) {
                        bVar.c(74, dVar.l0(jArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    bVar.c(91, fArr.length);
                    while (i11 < fArr.length) {
                        bVar.c(70, dVar.i0(fArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    bVar.c(91, dArr.length);
                    while (i11 < dArr.length) {
                        bVar.c(68, dVar.h0(dArr[i11]).f28911a);
                        i11++;
                    }
                    return;
                }
                k n02 = dVar.n0(obj);
                charAt = ".s.IFJDCS".charAt(n02.f28912b);
                i10 = n02.f28911a;
            }
        }
        bVar.c(charAt, i10);
    }

    public final a f(String str) {
        this.f28826b++;
        boolean z10 = this.f28827c;
        b bVar = this.f28828d;
        if (z10) {
            bVar.i(this.f28825a.x0(str));
        }
        bVar.c(91, 0);
        return new a(this.f28825a, false, bVar, bVar, bVar.f28833b - 2);
    }

    public final void g() {
        b bVar = this.f28829e;
        if (bVar != null) {
            byte[] bArr = bVar.f28832a;
            int i10 = this.f28826b;
            int i11 = this.f;
            bArr[i11] = (byte) (i10 >>> 8);
            bArr[i11 + 1] = (byte) i10;
        }
    }
}
