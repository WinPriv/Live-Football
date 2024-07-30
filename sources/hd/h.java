package hd;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f28894i;

    /* renamed from: a, reason: collision with root package name */
    public l f28895a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f28896b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28897c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f28898d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f28899e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f28900g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f28901h;

    static {
        int[] iArr = new int[com.anythink.expressad.video.dynview.a.a.f11393p];
        for (int i10 = 0; i10 < 202; i10++) {
            iArr[i10] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i10) - 'E';
        }
        f28894i = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        if (r8.isInterface() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        r11 = r11.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (r11.isAssignableFrom(r8) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r12 = r11.getName().replace('.', '/');
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(hd.d r15, int r16, int[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.h.h(hd.d, int, int[], int):boolean");
    }

    public static int i(d dVar, String str) {
        int i10;
        if (str.charAt(0) == '(') {
            i10 = str.indexOf(41) + 1;
        } else {
            i10 = 0;
        }
        char charAt = str.charAt(i10);
        int i11 = 16777218;
        if (charAt == 'F') {
            return 16777218;
        }
        if (charAt != 'L') {
            if (charAt != 'S') {
                if (charAt == 'V') {
                    return 0;
                }
                if (charAt != 'Z' && charAt != 'I') {
                    if (charAt == 'J') {
                        return 16777220;
                    }
                    switch (charAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 16777219;
                        default:
                            int i12 = i10 + 1;
                            while (str.charAt(i12) == '[') {
                                i12++;
                            }
                            char charAt2 = str.charAt(i12);
                            if (charAt2 != 'F') {
                                if (charAt2 != 'S') {
                                    if (charAt2 != 'Z') {
                                        if (charAt2 != 'I') {
                                            if (charAt2 != 'J') {
                                                switch (charAt2) {
                                                    case 'B':
                                                        i11 = 16777226;
                                                        break;
                                                    case 'C':
                                                        i11 = 16777227;
                                                        break;
                                                    case 'D':
                                                        i11 = 16777219;
                                                        break;
                                                    default:
                                                        i11 = dVar.t0(str.substring(i12 + 1, str.length() - 1)) | 24117248;
                                                        break;
                                                }
                                            } else {
                                                i11 = 16777220;
                                            }
                                        } else {
                                            i11 = 16777217;
                                        }
                                    } else {
                                        i11 = 16777225;
                                    }
                                } else {
                                    i11 = 16777228;
                                }
                            }
                            return ((i12 - i10) << 28) | i11;
                    }
                }
            }
            return 16777217;
        }
        return dVar.t0(str.substring(i10 + 1, str.length() - 1)) | 24117248;
    }

    public final int a() {
        int i10 = this.f;
        if (i10 > 0) {
            int[] iArr = this.f28899e;
            int i11 = i10 - 1;
            this.f = i11;
            return iArr[i11];
        }
        l lVar = this.f28895a;
        int i12 = lVar.f - 1;
        lVar.f = i12;
        return (-i12) | 50331648;
    }

    public final int b(int i10) {
        int[] iArr = this.f28898d;
        if (iArr != null && i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                int i12 = i10 | 33554432;
                iArr[i10] = i12;
                return i12;
            }
            return i11;
        }
        return i10 | 33554432;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[LOOP:0: B:6:0x0022->B:13:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(hd.d r7, int r8) {
        /*
            r6 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r8 != r0) goto Lf
            java.lang.String r0 = r7.f28851n
        L9:
            int r7 = r7.t0(r0)
            r7 = r7 | r1
            goto L21
        Lf:
            r0 = -1048576(0xfffffffffff00000, float:NaN)
            r0 = r0 & r8
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r0 != r2) goto L50
            hd.k[] r0 = r7.f28847j
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r8
            r0 = r0[r2]
            java.lang.String r0 = r0.f28915e
            goto L9
        L21:
            r0 = 0
        L22:
            int r1 = r6.f28900g
            if (r0 >= r1) goto L50
            int[] r1 = r6.f28901h
            r1 = r1[r0]
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r1
            r3 = 251658240(0xf000000, float:6.3108872E-30)
            r3 = r3 & r1
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r5 = 8388607(0x7fffff, float:1.1754942E-38)
            if (r3 != r4) goto L3e
            int[] r3 = r6.f28896b
            r1 = r1 & r5
            r1 = r3[r1]
        L3c:
            int r1 = r1 + r2
            goto L4a
        L3e:
            r4 = 50331648(0x3000000, float:3.761582E-37)
            if (r3 != r4) goto L4a
            int[] r3 = r6.f28897c
            int r4 = r3.length
            r1 = r1 & r5
            int r4 = r4 - r1
            r1 = r3[r4]
            goto L3c
        L4a:
            if (r8 != r1) goto L4d
            return r7
        L4d:
            int r0 = r0 + 1
            goto L22
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.h.c(hd.d, int):int");
    }

    public final void d(int i10, int i11) {
        if (this.f28898d == null) {
            this.f28898d = new int[10];
        }
        int length = this.f28898d.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.f28898d, 0, iArr, 0, length);
            this.f28898d = iArr;
        }
        this.f28898d[i10] = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        if (r11.charAt(0) == '[') goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:118:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0017. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r11, int r12, hd.d r13, hd.k r14) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.h.e(int, int, hd.d, hd.k):void");
    }

    public final void f(d dVar, String str) {
        int i10 = i(dVar, str);
        if (i10 != 0) {
            j(i10);
            if (i10 == 16777220 || i10 == 16777219) {
                j(com.anythink.expressad.exoplayer.b.f7294bc);
            }
        }
    }

    public final void g(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            k((p.c(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            k(1);
        } else {
            k(2);
        }
    }

    public final void j(int i10) {
        if (this.f28899e == null) {
            this.f28899e = new int[10];
        }
        int length = this.f28899e.length;
        int i11 = this.f;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.f28899e, 0, iArr, 0, length);
            this.f28899e = iArr;
        }
        int[] iArr2 = this.f28899e;
        int i12 = this.f;
        int i13 = i12 + 1;
        this.f = i13;
        iArr2[i12] = i10;
        l lVar = this.f28895a;
        int i14 = lVar.f + i13;
        if (i14 > lVar.f28924g) {
            lVar.f28924g = i14;
        }
    }

    public final void k(int i10) {
        int i11 = this.f;
        if (i11 >= i10) {
            this.f = i11 - i10;
            return;
        }
        this.f28895a.f -= i10 - i11;
        this.f = 0;
    }
}
