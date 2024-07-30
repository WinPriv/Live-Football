package hd;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f28834a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f28835b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f28836c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28838e;

    public c(byte[] bArr) {
        int length = bArr.length;
        this.f28834a = bArr;
        if (r(6) <= 52) {
            int t10 = t(8);
            this.f28835b = new int[t10];
            this.f28836c = new String[t10];
            int i10 = 10;
            int i11 = 0;
            int i12 = 1;
            while (i12 < t10) {
                int i13 = i10 + 1;
                this.f28835b[i12] = i13;
                byte b10 = bArr[i10];
                int i14 = 3;
                if (b10 != 1) {
                    if (b10 != 15) {
                        if (b10 != 18 && b10 != 3 && b10 != 4) {
                            if (b10 == 5 || b10 == 6) {
                                i12++;
                                i14 = 9;
                            } else {
                                switch (b10) {
                                }
                            }
                        }
                        i14 = 5;
                    } else {
                        i14 = 4;
                    }
                } else {
                    i14 = 3 + t(i13);
                    if (i14 > i11) {
                        i11 = i14;
                    }
                }
                i10 += i14;
                i12++;
            }
            this.f28837d = i11;
            this.f28838e = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static l p(int i10, l[] lVarArr) {
        if (lVarArr[i10] == null) {
            lVarArr[i10] = new l();
        }
        return lVarArr[i10];
    }

    public final int a(int i10, boolean z10, boolean z11, e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        char[] cArr = eVar.f28864c;
        l[] lVarArr = eVar.f28868h;
        if (z10) {
            int i15 = i10 + 1;
            i12 = this.f28834a[i10] & DefaultClassResolver.NAME;
            i11 = i15;
        } else {
            eVar.f28871k = -1;
            i11 = i10;
            i12 = 255;
        }
        int i16 = 0;
        eVar.f28876q = 0;
        if (i12 < 64) {
            eVar.o = 3;
            eVar.f28878s = 0;
        } else if (i12 < 128) {
            i12 -= 64;
            i11 = e(eVar.f28879t, 0, i11, cArr, lVarArr);
            eVar.o = 4;
            eVar.f28878s = 1;
        } else {
            int t10 = t(i11);
            i11 += 2;
            if (i12 == 247) {
                int e10 = e(eVar.f28879t, 0, i11, cArr, lVarArr);
                eVar.o = 4;
                eVar.f28878s = 1;
                i11 = e10;
            } else {
                if (i12 >= 248 && i12 < 251) {
                    eVar.o = 2;
                    int i17 = 251 - i12;
                    eVar.f28876q = i17;
                    i14 = eVar.f28875p - i17;
                } else if (i12 == 251) {
                    eVar.o = 3;
                    eVar.f28878s = 0;
                } else if (i12 < 255) {
                    if (z11) {
                        i13 = eVar.f28875p;
                    } else {
                        i13 = 0;
                    }
                    int i18 = i12 - 251;
                    int i19 = i13;
                    int i20 = i18;
                    while (i20 > 0) {
                        i11 = e(eVar.f28877r, i19, i11, cArr, lVarArr);
                        i20--;
                        i19++;
                    }
                    eVar.o = 1;
                    eVar.f28876q = i18;
                    i14 = eVar.f28875p + i18;
                } else {
                    eVar.o = 0;
                    int t11 = t(i11);
                    int i21 = i11 + 2;
                    eVar.f28876q = t11;
                    eVar.f28875p = t11;
                    int i22 = 0;
                    while (t11 > 0) {
                        i21 = e(eVar.f28877r, i22, i21, cArr, lVarArr);
                        t11--;
                        i22++;
                    }
                    int t12 = t(i21);
                    i11 = i21 + 2;
                    eVar.f28878s = t12;
                    while (true) {
                        int i23 = i16;
                        if (t12 <= 0) {
                            break;
                        }
                        i16 = i23 + 1;
                        i11 = e(eVar.f28879t, i23, i11, cArr, lVarArr);
                        t12--;
                    }
                }
                eVar.f28875p = i14;
                eVar.f28878s = 0;
            }
            i12 = t10;
        }
        int i24 = i12 + 1 + eVar.f28871k;
        eVar.f28871k = i24;
        p(i24, lVarArr);
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0063. Please report as an issue. */
    public final int b(int i10, char[] cArr, String str, a aVar) {
        Object n10;
        Object sh;
        boolean z10;
        byte[] bArr = this.f28834a;
        int i11 = 0;
        if (aVar == null) {
            int i12 = bArr[i10] & DefaultClassResolver.NAME;
            if (i12 != 64) {
                if (i12 != 91) {
                    if (i12 != 101) {
                        return i10 + 3;
                    }
                    return i10 + 5;
                }
                return c(i10 + 1, cArr, false, null);
            }
            return c(i10 + 3, cArr, true, null);
        }
        int i13 = i10 + 1;
        int i14 = bArr[i10] & DefaultClassResolver.NAME;
        d dVar = aVar.f28825a;
        boolean z11 = aVar.f28827c;
        b bVar = aVar.f28828d;
        if (i14 != 64) {
            if (i14 != 70) {
                int[] iArr = this.f28835b;
                if (i14 != 83) {
                    if (i14 != 99) {
                        if (i14 != 101) {
                            if (i14 != 115) {
                                if (i14 != 73 && i14 != 74) {
                                    if (i14 != 90) {
                                        if (i14 != 91) {
                                            switch (i14) {
                                                case 66:
                                                    sh = new Byte((byte) o(iArr[t(i13)]));
                                                    break;
                                                case 67:
                                                    sh = new Character((char) o(iArr[t(i13)]));
                                                    break;
                                                case 68:
                                                    break;
                                                default:
                                                    return i13;
                                            }
                                        } else {
                                            int t10 = t(i13);
                                            int i15 = i13 + 2;
                                            if (t10 == 0) {
                                                return c(i15 - 2, cArr, false, aVar.f(str));
                                            }
                                            int i16 = i15 + 1;
                                            int i17 = bArr[i15] & DefaultClassResolver.NAME;
                                            if (i17 != 70) {
                                                if (i17 != 83) {
                                                    if (i17 != 90) {
                                                        if (i17 != 73) {
                                                            if (i17 != 74) {
                                                                switch (i17) {
                                                                    case 66:
                                                                        byte[] bArr2 = new byte[t10];
                                                                        while (i11 < t10) {
                                                                            bArr2[i11] = (byte) o(iArr[t(i16)]);
                                                                            i16 += 3;
                                                                            i11++;
                                                                        }
                                                                        aVar.e(bArr2, str);
                                                                        break;
                                                                    case 67:
                                                                        char[] cArr2 = new char[t10];
                                                                        while (i11 < t10) {
                                                                            cArr2[i11] = (char) o(iArr[t(i16)]);
                                                                            i16 += 3;
                                                                            i11++;
                                                                        }
                                                                        aVar.e(cArr2, str);
                                                                        break;
                                                                    case 68:
                                                                        double[] dArr = new double[t10];
                                                                        while (i11 < t10) {
                                                                            dArr[i11] = Double.longBitsToDouble(q(iArr[t(i16)]));
                                                                            i16 += 3;
                                                                            i11++;
                                                                        }
                                                                        aVar.e(dArr, str);
                                                                        break;
                                                                    default:
                                                                        return c(i16 - 3, cArr, false, aVar.f(str));
                                                                }
                                                            } else {
                                                                long[] jArr = new long[t10];
                                                                while (i11 < t10) {
                                                                    jArr[i11] = q(iArr[t(i16)]);
                                                                    i16 += 3;
                                                                    i11++;
                                                                }
                                                                aVar.e(jArr, str);
                                                            }
                                                        } else {
                                                            int[] iArr2 = new int[t10];
                                                            while (i11 < t10) {
                                                                iArr2[i11] = o(iArr[t(i16)]);
                                                                i16 += 3;
                                                                i11++;
                                                            }
                                                            aVar.e(iArr2, str);
                                                        }
                                                    } else {
                                                        boolean[] zArr = new boolean[t10];
                                                        for (int i18 = 0; i18 < t10; i18++) {
                                                            if (o(iArr[t(i16)]) != 0) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            zArr[i18] = z10;
                                                            i16 += 3;
                                                        }
                                                        aVar.e(zArr, str);
                                                    }
                                                } else {
                                                    short[] sArr = new short[t10];
                                                    while (i11 < t10) {
                                                        sArr[i11] = (short) o(iArr[t(i16)]);
                                                        i16 += 3;
                                                        i11++;
                                                    }
                                                    aVar.e(sArr, str);
                                                }
                                            } else {
                                                float[] fArr = new float[t10];
                                                while (i11 < t10) {
                                                    fArr[i11] = Float.intBitsToFloat(o(iArr[t(i16)]));
                                                    i16 += 3;
                                                    i11++;
                                                }
                                                aVar.e(fArr, str);
                                            }
                                            return i16 - 1;
                                        }
                                    } else if (o(iArr[t(i13)]) == 0) {
                                        n10 = Boolean.FALSE;
                                    } else {
                                        n10 = Boolean.TRUE;
                                    }
                                }
                            } else {
                                n10 = s(i13, cArr);
                            }
                        } else {
                            String s10 = s(i13, cArr);
                            String s11 = s(i13 + 2, cArr);
                            aVar.f28826b++;
                            if (z11) {
                                bVar.i(dVar.x0(str));
                            }
                            bVar.c(101, dVar.x0(s10));
                            bVar.i(dVar.x0(s11));
                            return i13 + 4;
                        }
                    } else {
                        n10 = p.a(0, s(i13, cArr).toCharArray());
                    }
                    aVar.e(n10, str);
                    return i13 + 2;
                }
                sh = new Short((short) o(iArr[t(i13)]));
                aVar.e(sh, str);
                return i13 + 2;
            }
            n10 = n(t(i13), cArr);
            aVar.e(n10, str);
            return i13 + 2;
        }
        int i19 = i13 + 2;
        String s12 = s(i13, cArr);
        aVar.f28826b++;
        if (z11) {
            bVar.i(dVar.x0(str));
        }
        bVar.c(64, dVar.x0(s12));
        bVar.i(0);
        return c(i19, cArr, true, new a(aVar.f28825a, true, bVar, bVar, bVar.f28833b - 2));
    }

    public final int c(int i10, char[] cArr, boolean z10, a aVar) {
        int t10 = t(i10);
        int i11 = i10 + 2;
        if (z10) {
            while (t10 > 0) {
                i11 = b(i11 + 2, cArr, s(i11, cArr), aVar);
                t10--;
            }
        } else {
            while (t10 > 0) {
                i11 = b(i11, cArr, null, aVar);
                t10--;
            }
        }
        if (aVar != null) {
            aVar.g();
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(hd.e r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.o(r10)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L76
            if (r1 == r2) goto L76
            r3 = 64
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r3) goto L30
            r3 = 65
            if (r1 == r3) goto L30
            switch(r1) {
                case 19: goto L22;
                case 20: goto L22;
                case 21: goto L22;
                case 22: goto L76;
                default: goto L18;
            }
        L18:
            switch(r1) {
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1b;
            }
        L1b:
            r3 = 67
            if (r1 >= r3) goto L2c
            r4 = -256(0xffffffffffffff00, float:NaN)
            goto L2c
        L22:
            r0 = r0 & r4
            int r10 = r10 + r2
            goto L7b
        L25:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r10 = r10 + 4
            goto L7b
        L2c:
            r0 = r0 & r4
            int r10 = r10 + 3
            goto L7b
        L30:
            r0 = r0 & r4
            int r1 = r10 + 1
            int r1 = r8.t(r1)
            hd.l[] r3 = new hd.l[r1]
            r9.f28872l = r3
            hd.l[] r3 = new hd.l[r1]
            r9.f28873m = r3
            int[] r3 = new int[r1]
            r9.f28874n = r3
            int r10 = r10 + 3
            r3 = 0
        L46:
            if (r3 >= r1) goto L7b
            int r4 = r8.t(r10)
            int r5 = r10 + 2
            int r5 = r8.t(r5)
            hd.l[] r6 = r9.f28872l
            hd.l[] r7 = r9.f28868h
            hd.l r7 = p(r4, r7)
            r6[r3] = r7
            hd.l[] r6 = r9.f28873m
            int r4 = r4 + r5
            hd.l[] r5 = r9.f28868h
            hd.l r4 = p(r4, r5)
            r6[r3] = r4
            int[] r4 = r9.f28874n
            int r5 = r10 + 4
            int r5 = r8.t(r5)
            r4[r3] = r5
            int r10 = r10 + 6
            int r3 = r3 + 1
            goto L46
        L76:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r10 = r10 + 2
        L7b:
            int r1 = r8.l(r10)
            r9.f28869i = r0
            if (r1 != 0) goto L85
            r0 = 0
            goto L8c
        L85:
            hd.q r0 = new hd.q
            byte[] r3 = r8.f28834a
            r0.<init>(r3, r10)
        L8c:
            r9.f28870j = r0
            int r10 = r10 + r2
            int r1 = r1 * 2
            int r1 = r1 + r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.c.d(hd.e, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final int e(Object[] objArr, int i10, int i11, char[] cArr, l[] lVarArr) {
        int i12 = i11 + 1;
        switch (this.f28834a[i11] & DefaultClassResolver.NAME) {
            case 0:
                objArr[i10] = o.f28952a;
                return i12;
            case 1:
                objArr[i10] = o.f28953b;
                return i12;
            case 2:
                objArr[i10] = o.f28954c;
                return i12;
            case 3:
                objArr[i10] = o.f28955d;
                return i12;
            case 4:
                objArr[i10] = o.f28956e;
                return i12;
            case 5:
                objArr[i10] = o.f;
                return i12;
            case 6:
                objArr[i10] = o.f28957g;
                return i12;
            case 7:
                objArr[i10] = m(i12, cArr);
                return i12 + 2;
            default:
                objArr[i10] = p(t(i12), lVarArr);
                return i12 + 2;
        }
    }

    public final a4.j f(a4.j[] jVarArr, String str, int i10, int i11, char[] cArr) {
        int i12 = 0;
        while (true) {
            int length = jVarArr.length;
            byte[] bArr = this.f28834a;
            if (i12 < length) {
                if (((String) jVarArr[i12].f250s).equals(str)) {
                    a4.j jVar = new a4.j((String) jVarArr[i12].f250s);
                    byte[] bArr2 = new byte[i11];
                    jVar.f251t = bArr2;
                    System.arraycopy(bArr, i10, bArr2, 0, i11);
                    return jVar;
                }
                i12++;
            } else {
                a4.j jVar2 = new a4.j(str);
                byte[] bArr3 = new byte[i11];
                jVar2.f251t = bArr3;
                System.arraycopy(bArr, i10, bArr3, 0, i11);
                return jVar2;
            }
        }
    }

    public final String g(char[] cArr, int i10, int i11) {
        int i12;
        int i13 = i11 + i10;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = this.f28834a[i10];
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 == 2) {
                        i12 = (b10 & 63) | (c11 << 6);
                        c11 = (char) i12;
                        c10 = 1;
                    }
                } else {
                    cArr[i14] = (char) ((b10 & 63) | (c11 << 6));
                    i14++;
                    c10 = 0;
                }
                i10 = i15;
            } else {
                int i16 = b10 & DefaultClassResolver.NAME;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 < 224 && i16 > 191) {
                    i12 = i16 & 31;
                    c11 = (char) i12;
                    c10 = 1;
                } else {
                    c11 = (char) (i16 & 15);
                    c10 = 2;
                }
                i10 = i15;
            }
        }
        return new String(cArr, 0, i14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03cd, code lost:
    
        if (r4.charAt(r14) == 'L') goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03cf, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d7, code lost:
    
        if (r4.charAt(r14) == ';') goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03da, code lost:
    
        r8 = r6 + 1;
        r14 = r14 + 1;
        r3[r6] = r4.substring(r9, r14);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:171:0x03b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:239:0x0571. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0b6d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(hd.n r50, hd.e r51, int r52) {
        /*
            Method dump skipped, instructions count: 3298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.c.h(hd.n, hd.e, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] i(hd.n r22, hd.e r23, int r24, boolean r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            char[] r4 = r2.f28864c
            int r5 = r0.t(r3)
            int[] r6 = new int[r5]
            int r3 = r3 + 2
            r7 = 0
            r8 = r7
        L14:
            if (r8 >= r5) goto Lc7
            r6[r8] = r3
            int r9 = r0.o(r3)
            int r10 = r9 >>> 24
            r11 = 1
            if (r10 == 0) goto L5f
            if (r10 == r11) goto L5f
            r12 = 64
            if (r10 == r12) goto L38
            r12 = 65
            if (r10 == r12) goto L38
            switch(r10) {
                case 19: goto L32;
                case 20: goto L32;
                case 21: goto L32;
                case 22: goto L5f;
                default: goto L2e;
            }
        L2e:
            switch(r10) {
                case 71: goto L35;
                case 72: goto L35;
                case 73: goto L35;
                case 74: goto L35;
                case 75: goto L35;
                default: goto L31;
            }
        L31:
            goto L5c
        L32:
            int r3 = r3 + 1
            goto L61
        L35:
            int r3 = r3 + 4
            goto L61
        L38:
            int r12 = r3 + 1
            int r12 = r0.t(r12)
        L3e:
            if (r12 <= 0) goto L5c
            int r13 = r3 + 3
            int r13 = r0.t(r13)
            int r14 = r3 + 5
            int r14 = r0.t(r14)
            hd.l[] r15 = r2.f28868h
            p(r13, r15)
            int r13 = r13 + r14
            hd.l[] r14 = r2.f28868h
            p(r13, r14)
            int r3 = r3 + 6
            int r12 = r12 + (-1)
            goto L3e
        L5c:
            int r3 = r3 + 3
            goto L61
        L5f:
            int r3 = r3 + 2
        L61:
            int r12 = r0.l(r3)
            r13 = 66
            r14 = 0
            if (r10 != r13) goto Lba
            if (r12 != 0) goto L6d
            goto L74
        L6d:
            hd.q r14 = new hd.q
            byte[] r10 = r0.f28834a
            r14.<init>(r10, r3)
        L74:
            int r12 = r12 * 2
            int r12 = r12 + r11
            int r12 = r12 + r3
            int r3 = r12 + 2
            java.lang.String r10 = r0.s(r12, r4)
            hd.b r12 = new hd.b
            r12.<init>()
            hd.a.b(r9, r14, r12)
            hd.d r9 = r1.f28931c
            int r9 = r9.x0(r10)
            r12.i(r9)
            r12.i(r7)
            hd.a r9 = new hd.a
            hd.d r10 = r1.f28931c
            r17 = 1
            int r13 = r12.f28833b
            int r20 = r13 + (-2)
            r15 = r9
            r16 = r10
            r18 = r12
            r19 = r12
            r15.<init>(r16, r17, r18, r19, r20)
            if (r25 == 0) goto Laf
            hd.a r10 = r1.O
            r9.f28830g = r10
            r1.O = r9
            goto Lb5
        Laf:
            hd.a r10 = r1.P
            r9.f28830g = r10
            r1.P = r9
        Lb5:
            int r3 = r0.c(r3, r4, r11, r9)
            goto Lc3
        Lba:
            int r3 = r3 + 3
            int r12 = r12 * 2
            int r12 = r12 + r3
            int r3 = r0.c(r12, r4, r11, r14)
        Lc3:
            int r8 = r8 + 1
            goto L14
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.c.i(hd.n, hd.e, int, boolean):int[]");
    }

    public final void j(androidx.transition.n nVar) {
        String str;
        String str2;
        String str3;
        a4.j jVar;
        int i10;
        String str4;
        String str5;
        String[] strArr;
        int[] iArr;
        androidx.transition.n nVar2;
        int x02;
        int i11;
        String str6;
        int i12;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i13;
        int i14;
        int i15;
        int i16;
        String str16;
        String str17;
        String str18;
        int i17;
        String str19;
        int i18;
        String str20;
        String str21;
        String str22;
        String str23;
        e eVar;
        String str24;
        String str25;
        String str26;
        String str27;
        int i19;
        int v02;
        int x03;
        int i20;
        String str28;
        a4.j[] jVarArr = new a4.j[0];
        char[] cArr = new char[this.f28837d];
        e eVar2 = new e();
        eVar2.f28862a = jVarArr;
        eVar2.f28863b = 4;
        eVar2.f28864c = cArr;
        int i21 = this.f28838e;
        int t10 = t(i21);
        String m10 = m(i21 + 2, cArr);
        String m11 = m(i21 + 4, cArr);
        int i22 = i21 + 6;
        int t11 = t(i22);
        String[] strArr2 = new String[t11];
        int i23 = i21 + 8;
        int i24 = i23;
        for (int i25 = 0; i25 < t11; i25++) {
            strArr2[i25] = m(i24, cArr);
            i24 += 2;
        }
        int t12 = (t(i22) * 2) + i23;
        for (int t13 = t(t12); t13 > 0; t13--) {
            for (int t14 = t(t12 + 8); t14 > 0; t14--) {
                t12 += o(t12 + 12) + 6;
            }
            t12 += 8;
        }
        int i26 = t12 + 2;
        for (int t15 = t(i26); t15 > 0; t15--) {
            for (int t16 = t(i26 + 8); t16 > 0; t16--) {
                i26 += o(i26 + 12) + 6;
            }
            i26 += 8;
        }
        int i27 = i26 + 2;
        int i28 = t10;
        int i29 = i27;
        int t17 = t(i27);
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        String str29 = null;
        a4.j jVar2 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        while (true) {
            str = str31;
            str2 = str30;
            str3 = "Deprecated";
            jVar = jVar2;
            i10 = i30;
            str4 = str29;
            str5 = "Signature";
            strArr = strArr2;
            iArr = this.f28835b;
            if (t17 <= 0) {
                break;
            }
            int i35 = t11;
            String s10 = s(i29 + 2, cArr);
            int i36 = i21;
            if ("SourceFile".equals(s10)) {
                str30 = s(i29 + 8, cArr);
            } else {
                if ("InnerClasses".equals(s10)) {
                    i34 = i29 + 8;
                } else if ("EnclosingMethod".equals(s10)) {
                    String m12 = m(i29 + 8, cArr);
                    int t18 = t(i29 + 10);
                    if (t18 != 0) {
                        str34 = s(iArr[t18], cArr);
                        str28 = s(iArr[t18] + 2, cArr);
                    } else {
                        str28 = str4;
                    }
                    str33 = m12;
                    str29 = str28;
                    str31 = str;
                    str30 = str2;
                    i30 = i10;
                    jVar2 = jVar;
                    i29 = o(i29 + 4) + 6 + i29;
                    t17--;
                    strArr2 = strArr;
                    t11 = i35;
                    i21 = i36;
                } else if ("Signature".equals(s10)) {
                    str32 = s(i29 + 8, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(s10)) {
                    i30 = i29 + 8;
                    str31 = str;
                    str30 = str2;
                    str29 = str4;
                    jVar2 = jVar;
                    i29 = o(i29 + 4) + 6 + i29;
                    t17--;
                    strArr2 = strArr;
                    t11 = i35;
                    i21 = i36;
                } else if ("RuntimeVisibleTypeAnnotations".equals(s10)) {
                    i32 = i29 + 8;
                } else {
                    if ("Deprecated".equals(s10)) {
                        i20 = i28 | 131072;
                    } else if ("Synthetic".equals(s10)) {
                        i20 = i28 | 266240;
                    } else if ("SourceDebugExtension".equals(s10)) {
                        int o = o(i29 + 4);
                        str31 = g(new char[o], i29 + 8, o);
                        str30 = str2;
                        str29 = str4;
                        i30 = i10;
                        jVar2 = jVar;
                        i29 = o(i29 + 4) + 6 + i29;
                        t17--;
                        strArr2 = strArr;
                        t11 = i35;
                        i21 = i36;
                    } else if ("RuntimeInvisibleAnnotations".equals(s10)) {
                        i31 = i29 + 8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(s10)) {
                        i33 = i29 + 8;
                    } else if ("BootstrapMethods".equals(s10)) {
                        int t19 = t(i29 + 8);
                        int[] iArr2 = new int[t19];
                        int i37 = i29 + 10;
                        for (int i38 = 0; i38 < t19; i38++) {
                            iArr2[i38] = i37;
                            i37 += (t(i37 + 2) + 2) << 1;
                        }
                        eVar2.f28865d = iArr2;
                    } else {
                        a4.j f = f(jVarArr, s10, i29 + 8, o(i29 + 4), cArr);
                        f.f252u = jVar;
                        jVar2 = f;
                        i30 = i10;
                        str30 = str2;
                        str29 = str4;
                        str31 = str;
                        i29 = o(i29 + 4) + 6 + i29;
                        t17--;
                        strArr2 = strArr;
                        t11 = i35;
                        i21 = i36;
                    }
                    i28 = i20;
                }
                str30 = str2;
            }
            str31 = str;
            str29 = str4;
            i30 = i10;
            jVar2 = jVar;
            i29 = o(i29 + 4) + 6 + i29;
            t17--;
            strArr2 = strArr;
            t11 = i35;
            i21 = i36;
        }
        int i39 = t11;
        int i40 = i21;
        String str35 = "RuntimeInvisibleTypeAnnotations";
        String str36 = "RuntimeInvisibleAnnotations";
        int i41 = i28;
        String str37 = "RuntimeVisibleTypeAnnotations";
        String str38 = str32;
        String str39 = "RuntimeVisibleAnnotations";
        e eVar3 = eVar2;
        String str40 = "Synthetic";
        nVar.Z(o(iArr[1] - 7), i41, m10, str38, m11, strArr);
        if (str2 == null && str == null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            d dVar = (d) nVar2;
            if (str2 != null) {
                dVar.f28855s = dVar.x0(str2);
            }
            if (str != null) {
                b bVar = new b();
                bVar.d(0, Integer.MAX_VALUE, str);
                dVar.f28856t = bVar;
            }
        }
        String str41 = str33;
        if (str41 != null) {
            d dVar2 = (d) nVar2;
            dVar2.f28857u = dVar2.v0(str41);
            String str42 = str34;
            if (str42 != null && str4 != null) {
                dVar2.f28858v = dVar2.w0(str42, str4);
            }
        }
        if (i10 != 0) {
            int i42 = i10 + 2;
            for (int t20 = t(i10); t20 > 0; t20--) {
                i42 = c(i42 + 2, cArr, true, nVar2.a0(s(i42, cArr), true));
            }
        }
        int i43 = i31;
        if (i43 != 0) {
            int i44 = i43 + 2;
            for (int t21 = t(i43); t21 > 0; t21--) {
                i44 = c(i44 + 2, cArr, true, nVar2.a0(s(i44, cArr), false));
            }
        }
        int i45 = i32;
        if (i45 != 0) {
            int i46 = i45 + 2;
            for (int t22 = t(i45); t22 > 0; t22--) {
                int d10 = d(eVar3, i46);
                i46 = c(d10 + 2, cArr, true, nVar2.c0(eVar3.f28869i, eVar3.f28870j, s(d10, cArr), true));
            }
        }
        int i47 = i33;
        if (i47 != 0) {
            int i48 = i47 + 2;
            for (int t23 = t(i47); t23 > 0; t23--) {
                int d11 = d(eVar3, i48);
                i48 = c(d11 + 2, cArr, true, nVar2.c0(eVar3.f28869i, eVar3.f28870j, s(d11, cArr), false));
            }
        }
        a4.j jVar3 = jVar;
        while (jVar3 != null) {
            a4.j jVar4 = (a4.j) jVar3.f252u;
            d dVar3 = (d) nVar2;
            jVar3.f252u = dVar3.A;
            dVar3.A = jVar3;
            jVar3 = jVar4;
        }
        int i49 = i34;
        if (i49 != 0) {
            int i50 = i49 + 2;
            for (int t24 = t(i49); t24 > 0; t24--) {
                String m13 = m(i50, cArr);
                String m14 = m(i50 + 2, cArr);
                String s11 = s(i50 + 4, cArr);
                int t25 = t(i50 + 6);
                d dVar4 = (d) nVar2;
                if (dVar4.C == null) {
                    dVar4.C = new b();
                }
                k o02 = dVar4.o0(m13);
                if (o02.f28913c == 0) {
                    dVar4.B++;
                    dVar4.C.i(o02.f28911a);
                    b bVar2 = dVar4.C;
                    if (m14 == null) {
                        v02 = 0;
                    } else {
                        v02 = dVar4.v0(m14);
                    }
                    bVar2.i(v02);
                    b bVar3 = dVar4.C;
                    if (s11 == null) {
                        x03 = 0;
                    } else {
                        x03 = dVar4.x0(s11);
                    }
                    bVar3.i(x03);
                    dVar4.C.i(t25);
                    o02.f28913c = dVar4.B;
                }
                i50 += 8;
            }
        }
        int i51 = (i39 * 2) + i40 + 10;
        int t26 = t(i51 - 2);
        while (t26 > 0) {
            char[] cArr2 = eVar3.f28864c;
            int t27 = t(i51);
            String s12 = s(i51 + 2, cArr2);
            String s13 = s(i51 + 4, cArr2);
            int i52 = i51 + 6;
            int i53 = t27;
            int i54 = i52;
            int i55 = 0;
            a4.j jVar5 = null;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            String str43 = null;
            Object obj = null;
            int t28 = t(i52);
            while (t28 > 0) {
                String s14 = s(i54 + 2, cArr2);
                if ("ConstantValue".equals(s14)) {
                    int t29 = t(i54 + 8);
                    if (t29 == 0) {
                        str16 = str40;
                        obj = null;
                        str17 = str3;
                        str18 = str37;
                        str21 = str5;
                        str24 = str18;
                        str26 = str16;
                        i18 = t26;
                        str25 = str17;
                        str22 = str35;
                        str23 = str39;
                        str27 = str36;
                    } else {
                        obj = n(t29, cArr2);
                        str16 = str40;
                        str17 = str3;
                        str18 = str37;
                        str21 = str5;
                        str24 = str18;
                        str26 = str16;
                        i18 = t26;
                        str25 = str17;
                        str22 = str35;
                        str23 = str39;
                        str27 = str36;
                    }
                } else if (str5.equals(s14)) {
                    str43 = s(i54 + 8, cArr2);
                    str16 = str40;
                    str17 = str3;
                    str18 = str37;
                    str21 = str5;
                    str24 = str18;
                    str26 = str16;
                    i18 = t26;
                    str25 = str17;
                    str22 = str35;
                    str23 = str39;
                    str27 = str36;
                } else {
                    if (str3.equals(s14)) {
                        str16 = str40;
                        i19 = 131072;
                    } else {
                        str16 = str40;
                        if (str16.equals(s14)) {
                            i19 = 266240;
                        } else {
                            str17 = str3;
                            String str44 = str39;
                            if (str44.equals(s14)) {
                                str39 = str44;
                                i17 = i54 + 8;
                                str18 = str37;
                                str19 = str36;
                            } else {
                                str39 = str44;
                                str18 = str37;
                                if (str18.equals(s14)) {
                                    i57 = i54 + 8;
                                    str21 = str5;
                                    str24 = str18;
                                    str26 = str16;
                                    i18 = t26;
                                    str25 = str17;
                                    str22 = str35;
                                    str23 = str39;
                                    str27 = str36;
                                } else {
                                    i17 = i55;
                                    str19 = str36;
                                    if (str19.equals(s14)) {
                                        i58 = i54 + 8;
                                    } else {
                                        i18 = t26;
                                        str20 = str35;
                                        if (str20.equals(s14)) {
                                            i56 = i54 + 8;
                                            str21 = str5;
                                            str24 = str18;
                                            str26 = str16;
                                            str27 = str19;
                                            str22 = str20;
                                            str25 = str17;
                                            i55 = i17;
                                            str23 = str39;
                                        } else {
                                            str21 = str5;
                                            str22 = str20;
                                            str23 = str39;
                                            eVar = eVar3;
                                            str24 = str18;
                                            str25 = str17;
                                            str26 = str16;
                                            str27 = str19;
                                            a4.j f10 = f(eVar3.f28862a, s14, i54 + 8, o(i54 + 4), cArr2);
                                            f10.f252u = jVar5;
                                            jVar5 = f10;
                                            i55 = i17;
                                            i56 = i56;
                                            i54 += o(i54 + 4) + 6;
                                            t28--;
                                            eVar3 = eVar;
                                            t26 = i18;
                                            str5 = str21;
                                            str35 = str22;
                                            str39 = str23;
                                            str3 = str25;
                                            str37 = str24;
                                            str40 = str26;
                                            str36 = str27;
                                        }
                                    }
                                }
                            }
                            i18 = t26;
                            str20 = str35;
                            str21 = str5;
                            str24 = str18;
                            str26 = str16;
                            str27 = str19;
                            str22 = str20;
                            str25 = str17;
                            i55 = i17;
                            str23 = str39;
                        }
                    }
                    i53 |= i19;
                    str17 = str3;
                    str18 = str37;
                    str21 = str5;
                    str24 = str18;
                    str26 = str16;
                    i18 = t26;
                    str25 = str17;
                    str22 = str35;
                    str23 = str39;
                    str27 = str36;
                }
                eVar = eVar3;
                i54 += o(i54 + 4) + 6;
                t28--;
                eVar3 = eVar;
                t26 = i18;
                str5 = str21;
                str35 = str22;
                str39 = str23;
                str3 = str25;
                str37 = str24;
                str40 = str26;
                str36 = str27;
            }
            String str45 = str5;
            String str46 = str3;
            String str47 = str40;
            String str48 = str35;
            String str49 = str37;
            String str50 = str39;
            String str51 = str36;
            int i59 = t26;
            int i60 = i56;
            e eVar4 = eVar3;
            int i61 = i55;
            i51 = i54 + 2;
            g gVar = new g((d) nVar2, i53, s12, s13, str43, obj);
            if (i61 != 0) {
                int i62 = i61 + 2;
                for (int t30 = t(i61); t30 > 0; t30--) {
                    i62 = c(i62 + 2, cArr2, true, gVar.a(s(i62, cArr2), true));
                }
            }
            if (i58 != 0) {
                int i63 = i58 + 2;
                for (int t31 = t(i58); t31 > 0; t31--) {
                    i63 = c(i63 + 2, cArr2, true, gVar.a(s(i63, cArr2), false));
                }
            }
            if (i57 != 0) {
                int i64 = i57 + 2;
                for (int t32 = t(i57); t32 > 0; t32--) {
                    int d12 = d(eVar4, i64);
                    i64 = c(d12 + 2, cArr2, true, gVar.b(eVar4.f28869i, eVar4.f28870j, s(d12, cArr2), true));
                }
            }
            if (i60 != 0) {
                int i65 = i60 + 2;
                for (int t33 = t(i60); t33 > 0; t33--) {
                    int d13 = d(eVar4, i65);
                    i65 = c(d13 + 2, cArr2, true, gVar.b(eVar4.f28869i, eVar4.f28870j, s(d13, cArr2), false));
                }
            }
            while (jVar5 != null) {
                a4.j jVar6 = (a4.j) jVar5.f252u;
                jVar5.f252u = gVar.f28893l;
                gVar.f28893l = jVar5;
                jVar5 = jVar6;
            }
            int i66 = i59 - 1;
            eVar3 = eVar4;
            str35 = str48;
            str39 = str50;
            str3 = str46;
            str37 = str49;
            str40 = str47;
            str36 = str51;
            t26 = i66;
            str5 = str45;
        }
        String str52 = str5;
        e eVar5 = eVar3;
        String str53 = str3;
        String str54 = str40;
        String str55 = str35;
        String str56 = str37;
        String str57 = str39;
        String str58 = str36;
        int i67 = i51 + 2;
        int t34 = t(i67 - 2);
        int i68 = i67;
        while (t34 > 0) {
            char[] cArr3 = eVar5.f28864c;
            eVar5.f28866e = t(i68);
            eVar5.f = s(i68 + 2, cArr3);
            eVar5.f28867g = s(i68 + 4, cArr3);
            int i69 = i68 + 6;
            int i70 = i69;
            int t35 = t(i69);
            int i71 = t34;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            int i79 = 0;
            String str59 = null;
            a4.j jVar7 = null;
            String[] strArr3 = null;
            int i80 = 0;
            while (t35 > 0) {
                int i81 = i72;
                String s15 = s(i70 + 2, cArr3);
                int i82 = i73;
                if ("Code".equals(s15)) {
                    if ((eVar5.f28863b & 1) == 0) {
                        i75 = i70 + 8;
                        i13 = i81;
                        i73 = i82;
                        str15 = str52;
                        str12 = str55;
                        str13 = str53;
                        str14 = str54;
                        i70 += o(i70 + 4) + 6;
                        t35--;
                        i72 = i13;
                        str54 = str14;
                        str52 = str15;
                        str55 = str12;
                        str53 = str13;
                    } else {
                        i11 = i74;
                        i12 = i79;
                        str6 = str52;
                        str7 = str56;
                    }
                } else if ("Exceptions".equals(s15)) {
                    int t36 = t(i70 + 8);
                    strArr3 = new String[t36];
                    int i83 = i70 + 10;
                    i11 = i74;
                    for (int i84 = 0; i84 < t36; i84++) {
                        strArr3[i84] = m(i83, cArr3);
                        i83 += 2;
                    }
                    i12 = i79;
                    str6 = str52;
                    str7 = str56;
                } else {
                    i11 = i74;
                    str6 = str52;
                    if (str6.equals(s15)) {
                        str59 = s(i70 + 8, cArr3);
                        i12 = i79;
                        i13 = i81;
                        str8 = str54;
                        str9 = str58;
                    } else {
                        String str60 = str53;
                        if (str60.equals(s15)) {
                            i14 = eVar5.f28866e;
                            str53 = str60;
                            i12 = i79;
                            i15 = 131072;
                            str7 = str56;
                            str8 = str54;
                        } else {
                            i12 = i79;
                            String str61 = str57;
                            if (str61.equals(s15)) {
                                i78 = i70 + 8;
                                str53 = str60;
                                str57 = str61;
                                i16 = i82;
                                str7 = str56;
                            } else {
                                str57 = str61;
                                str7 = str56;
                                if (str7.equals(s15)) {
                                    i11 = i70 + 8;
                                    str53 = str60;
                                    i16 = i82;
                                } else {
                                    str53 = str60;
                                    if ("AnnotationDefault".equals(s15)) {
                                        i16 = i70 + 8;
                                    } else {
                                        str8 = str54;
                                        if (str8.equals(s15)) {
                                            i14 = eVar5.f28866e;
                                            i15 = 266240;
                                        } else {
                                            str56 = str7;
                                            str9 = str58;
                                            if (str9.equals(s15)) {
                                                i13 = i70 + 8;
                                            } else {
                                                str58 = str9;
                                                str10 = str55;
                                                if (str10.equals(s15)) {
                                                    i12 = i70 + 8;
                                                    str11 = str8;
                                                } else {
                                                    str11 = str8;
                                                    if ("RuntimeVisibleParameterAnnotations".equals(s15)) {
                                                        i77 = i70 + 8;
                                                    } else if ("RuntimeInvisibleParameterAnnotations".equals(s15)) {
                                                        i76 = i70 + 8;
                                                    } else if ("MethodParameters".equals(s15)) {
                                                        i80 = i70 + 8;
                                                    } else {
                                                        str12 = str10;
                                                        str13 = str53;
                                                        str14 = str11;
                                                        str15 = str6;
                                                        a4.j f11 = f(eVar5.f28862a, s15, i70 + 8, o(i70 + 4), cArr3);
                                                        f11.f252u = jVar7;
                                                        jVar7 = f11;
                                                        i73 = i82;
                                                        i79 = i12;
                                                        i13 = i81;
                                                        i74 = i11;
                                                        i75 = i75;
                                                        i76 = i76;
                                                        i77 = i77;
                                                        i70 += o(i70 + 4) + 6;
                                                        t35--;
                                                        i72 = i13;
                                                        str54 = str14;
                                                        str52 = str15;
                                                        str55 = str12;
                                                        str53 = str13;
                                                    }
                                                }
                                                i13 = i81;
                                                i73 = i82;
                                                str12 = str10;
                                                i79 = i12;
                                                str13 = str53;
                                                str14 = str11;
                                                int i85 = i11;
                                                str15 = str6;
                                                i74 = i85;
                                                i70 += o(i70 + 4) + 6;
                                                t35--;
                                                i72 = i13;
                                                str54 = str14;
                                                str52 = str15;
                                                str55 = str12;
                                                str53 = str13;
                                            }
                                        }
                                    }
                                }
                            }
                            i82 = i16;
                        }
                        eVar5.f28866e = i14 | i15;
                        str11 = str8;
                        str56 = str7;
                        i13 = i81;
                        i73 = i82;
                        str10 = str55;
                        str12 = str10;
                        i79 = i12;
                        str13 = str53;
                        str14 = str11;
                        int i852 = i11;
                        str15 = str6;
                        i74 = i852;
                        i70 += o(i70 + 4) + 6;
                        t35--;
                        i72 = i13;
                        str54 = str14;
                        str52 = str15;
                        str55 = str12;
                        str53 = str13;
                    }
                    str11 = str8;
                    str58 = str9;
                    str10 = str55;
                    i73 = i82;
                    str12 = str10;
                    i79 = i12;
                    str13 = str53;
                    str14 = str11;
                    int i8522 = i11;
                    str15 = str6;
                    i74 = i8522;
                    i70 += o(i70 + 4) + 6;
                    t35--;
                    i72 = i13;
                    str54 = str14;
                    str52 = str15;
                    str55 = str12;
                    str53 = str13;
                }
                str8 = str54;
                str11 = str8;
                str56 = str7;
                i13 = i81;
                i73 = i82;
                str10 = str55;
                str12 = str10;
                i79 = i12;
                str13 = str53;
                str14 = str11;
                int i85222 = i11;
                str15 = str6;
                i74 = i85222;
                i70 += o(i70 + 4) + 6;
                t35--;
                i72 = i13;
                str54 = str14;
                str52 = str15;
                str55 = str12;
                str53 = str13;
            }
            int i86 = i72;
            int i87 = i74;
            int i88 = i75;
            int i89 = i76;
            int i90 = i77;
            int i91 = i79;
            String str62 = str52;
            String str63 = str55;
            String str64 = str53;
            String str65 = str54;
            int i92 = i73;
            int i93 = i70 + 2;
            n b02 = nVar.b0(eVar5.f28866e, eVar5.f, eVar5.f28867g, str59, strArr3);
            b02.f28931c.getClass();
            if (i80 != 0) {
                int i94 = this.f28834a[i80] & DefaultClassResolver.NAME;
                int i95 = i80 + 1;
                while (i94 > 0) {
                    String s16 = s(i95, cArr3);
                    int t37 = t(i95 + 2);
                    if (b02.G == null) {
                        b02.G = new b();
                    }
                    b02.F++;
                    b bVar4 = b02.G;
                    if (s16 == null) {
                        x02 = 0;
                    } else {
                        x02 = b02.f28931c.x0(s16);
                    }
                    bVar4.i(x02);
                    bVar4.i(t37);
                    i94--;
                    i95 += 4;
                }
            }
            if (i92 != 0) {
                b bVar5 = new b();
                b02.f28938k = bVar5;
                a aVar = new a(b02.f28931c, false, bVar5, null, 0);
                b(i92, cArr3, null, aVar);
                aVar.g();
            }
            if (i78 != 0) {
                int i96 = i78 + 2;
                for (int t38 = t(i78); t38 > 0; t38--) {
                    i96 = c(i96 + 2, cArr3, true, b02.u(s(i96, cArr3), true));
                }
            }
            if (i86 != 0) {
                int i97 = i86 + 2;
                for (int t39 = t(i86); t39 > 0; t39--) {
                    i97 = c(i97 + 2, cArr3, true, b02.u(s(i97, cArr3), false));
                }
            }
            if (i87 != 0) {
                int i98 = i87 + 2;
                for (int t40 = t(i87); t40 > 0; t40--) {
                    int d14 = d(eVar5, i98);
                    i98 = c(d14 + 2, cArr3, true, b02.H(eVar5.f28869i, eVar5.f28870j, s(d14, cArr3), true));
                }
            }
            if (i91 != 0) {
                int i99 = i91 + 2;
                for (int t41 = t(i91); t41 > 0; t41--) {
                    int d15 = d(eVar5, i99);
                    i99 = c(d15 + 2, cArr3, true, b02.H(eVar5.f28869i, eVar5.f28870j, s(d15, cArr3), false));
                }
            }
            if (i90 != 0) {
                k(b02, eVar5, i90, true);
            }
            if (i89 != 0) {
                k(b02, eVar5, i89, false);
            }
            while (jVar7 != null) {
                a4.j jVar8 = (a4.j) jVar7.f252u;
                jVar7.f252u = b02.f28945s;
                b02.f28945s = jVar7;
                jVar7 = jVar8;
            }
            if (i88 != 0) {
                h(b02, eVar5, i88);
            }
            t34 = i71 - 1;
            i68 = i93;
            str54 = str65;
            str52 = str62;
            str55 = str63;
            str53 = str64;
        }
    }

    public final void k(n nVar, e eVar, int i10, boolean z10) {
        int i11 = i10 + 1;
        int i12 = this.f28834a[i10] & DefaultClassResolver.NAME;
        int length = p.b(eVar.f28867g).length - i12;
        int i13 = 0;
        while (i13 < length) {
            nVar.F(i13, "Ljava/lang/Synthetic;", false).g();
            i13++;
        }
        char[] cArr = eVar.f28864c;
        while (i13 < i12 + length) {
            i11 += 2;
            for (int t10 = t(i11); t10 > 0; t10--) {
                i11 = c(i11 + 2, cArr, true, nVar.F(i13, s(i11, cArr), z10));
            }
            i13++;
        }
    }

    public final int l(int i10) {
        return this.f28834a[i10] & DefaultClassResolver.NAME;
    }

    public final String m(int i10, char[] cArr) {
        return s(this.f28835b[t(i10)], cArr);
    }

    public final Object n(int i10, char[] cArr) {
        int i11;
        int[] iArr = this.f28835b;
        int i12 = iArr[i10];
        byte b10 = this.f28834a[i12 - 1];
        if (b10 != 16) {
            switch (b10) {
                case 3:
                    return new Integer(o(i12));
                case 4:
                    return new Float(Float.intBitsToFloat(o(i12)));
                case 5:
                    return new Long(q(i12));
                case 6:
                    return new Double(Double.longBitsToDouble(q(i12)));
                case 7:
                    char[] charArray = s(i12, cArr).toCharArray();
                    if (charArray[0] == '[') {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                    return new p(i11, charArray, 0, charArray.length);
                case 8:
                    return s(i12, cArr);
                default:
                    int l10 = l(i12);
                    int i13 = iArr[t(i12 + 1)];
                    String m10 = m(i13, cArr);
                    int i14 = iArr[t(i13 + 2)];
                    return new i(l10, m10, s(i14, cArr), s(i14 + 2, cArr));
            }
        }
        return p.a(0, s(i12, cArr).toCharArray());
    }

    public final int o(int i10) {
        byte[] bArr = this.f28834a;
        return (bArr[i10 + 3] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 24) | ((bArr[i10 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i10 + 2] & DefaultClassResolver.NAME) << 8);
    }

    public final long q(int i10) {
        return (o(i10) << 32) | (o(i10 + 4) & 4294967295L);
    }

    public final short r(int i10) {
        byte[] bArr = this.f28834a;
        return (short) ((bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8));
    }

    public final String s(int i10, char[] cArr) {
        int t10 = t(i10);
        if (i10 != 0 && t10 != 0) {
            String[] strArr = this.f28836c;
            String str = strArr[t10];
            if (str != null) {
                return str;
            }
            int i11 = this.f28835b[t10];
            String g6 = g(cArr, i11 + 2, t(i11));
            strArr[t10] = g6;
            return g6;
        }
        return null;
    }

    public final int t(int i10) {
        byte[] bArr = this.f28834a;
        return (bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8);
    }
}
