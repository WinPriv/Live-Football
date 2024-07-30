package f0;

import android.graphics.Path;
import android.util.Log;
import com.huawei.hms.ads.gl;

/* compiled from: PathParser.java */
/* loaded from: classes.dex */
public final class d {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            char c10 = aVar.f27904a;
            a aVar2 = aVarArr2[i10];
            if (c10 != aVar2.f27904a || aVar.f27905b.length != aVar2.f27905b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
    
        if (r13 == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:40:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f0.d.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.c(java.lang.String):f0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 != null) {
            try {
                a.b(c10, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(s.f.b("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }

    /* compiled from: PathParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public char f27904a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f27905b;

        public a(char c10, float[] fArr) {
            this.f27904a = c10;
            this.f27905b = fArr;
        }

        public static void a(Path path, float f, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
            double d10;
            double d11;
            boolean z12;
            double radians = Math.toRadians(f15);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f;
            double d13 = f10;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f13;
            double d17 = d14 / d16;
            double d18 = f14;
            double d19 = ((d13 * cos) + ((-f) * sin)) / d18;
            double d20 = d13;
            double d21 = f12;
            double d22 = ((d21 * sin) + (f11 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f11) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f, f10, f11, f12, f13 * sqrt, f14 * sqrt, f15, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            if (atan22 >= 0.0d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = d41;
            double d44 = atan22 / ceil;
            int i10 = 0;
            while (i10 < ceil) {
                double d45 = atan2 + d44;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
                double d51 = (d37 * sin4) - (d38 * cos4);
                double d52 = (cos4 * d48) + (sin4 * d40);
                double d53 = d45 - atan2;
                double tan = Math.tan(d53 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(gl.Code, gl.Code);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
                i10++;
                atan2 = d45;
                d40 = d40;
                cos2 = cos2;
                ceil = ceil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            char c10;
            a aVar;
            int i12;
            boolean z10;
            boolean z11;
            float f;
            float f10;
            boolean z12;
            boolean z13;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            a[] aVarArr2 = aVarArr;
            int i13 = 6;
            float[] fArr = new float[6];
            char c11 = 'm';
            int i14 = 0;
            char c12 = 'm';
            int i15 = 0;
            while (i15 < aVarArr2.length) {
                a aVar2 = aVarArr2[i15];
                char c13 = aVar2.f27904a;
                float f30 = fArr[i14];
                float f31 = fArr[1];
                float f32 = fArr[2];
                float f33 = fArr[3];
                float f34 = fArr[4];
                float f35 = fArr[5];
                switch (c13) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i13;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f34, f35);
                        f30 = f34;
                        f32 = f30;
                        f31 = f35;
                        f33 = f31;
                        break;
                }
                i10 = 2;
                float f36 = f34;
                float f37 = f35;
                float f38 = f30;
                float f39 = f31;
                int i16 = i14;
                while (true) {
                    float[] fArr2 = aVar2.f27905b;
                    if (i16 < fArr2.length) {
                        if (c13 != 'A') {
                            if (c13 != 'C') {
                                if (c13 != 'H') {
                                    if (c13 != 'Q') {
                                        if (c13 != 'V') {
                                            if (c13 != 'a') {
                                                if (c13 != 'c') {
                                                    if (c13 != 'h') {
                                                        if (c13 != 'q') {
                                                            if (c13 != 'v') {
                                                                if (c13 != 'L') {
                                                                    if (c13 != 'M') {
                                                                        if (c13 != 'S') {
                                                                            if (c13 != 'T') {
                                                                                if (c13 != 'l') {
                                                                                    if (c13 != c11) {
                                                                                        if (c13 != 's') {
                                                                                            if (c13 == 't') {
                                                                                                if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                                    f29 = gl.Code;
                                                                                                    f28 = gl.Code;
                                                                                                } else {
                                                                                                    f28 = f38 - f32;
                                                                                                    f29 = f39 - f33;
                                                                                                }
                                                                                                int i17 = i16 + 0;
                                                                                                int i18 = i16 + 1;
                                                                                                path.rQuadTo(f28, f29, fArr2[i17], fArr2[i18]);
                                                                                                float f40 = f28 + f38;
                                                                                                float f41 = f29 + f39;
                                                                                                f38 += fArr2[i17];
                                                                                                f39 += fArr2[i18];
                                                                                                f33 = f41;
                                                                                                f32 = f40;
                                                                                            }
                                                                                            i11 = i16;
                                                                                        } else {
                                                                                            if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                                f26 = gl.Code;
                                                                                                f27 = gl.Code;
                                                                                            } else {
                                                                                                float f42 = f38 - f32;
                                                                                                f26 = f39 - f33;
                                                                                                f27 = f42;
                                                                                            }
                                                                                            int i19 = i16 + 0;
                                                                                            int i20 = i16 + 1;
                                                                                            int i21 = i16 + 2;
                                                                                            int i22 = i16 + 3;
                                                                                            i11 = i16;
                                                                                            f11 = f39;
                                                                                            float f43 = f38;
                                                                                            path.rCubicTo(f27, f26, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                                                            f12 = fArr2[i19] + f43;
                                                                                            f13 = fArr2[i20] + f11;
                                                                                            f14 = f43 + fArr2[i21];
                                                                                            f15 = fArr2[i22];
                                                                                        }
                                                                                    } else {
                                                                                        i11 = i16;
                                                                                        float f44 = fArr2[i11 + 0];
                                                                                        f38 += f44;
                                                                                        float f45 = fArr2[i11 + 1];
                                                                                        f39 += f45;
                                                                                        if (i11 > 0) {
                                                                                            path.rLineTo(f44, f45);
                                                                                        } else {
                                                                                            path.rMoveTo(f44, f45);
                                                                                            f37 = f39;
                                                                                            f36 = f38;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i11 = i16;
                                                                                    f18 = f39;
                                                                                    int i23 = i11 + 0;
                                                                                    float f46 = fArr2[i23];
                                                                                    int i24 = i11 + 1;
                                                                                    path.rLineTo(f46, fArr2[i24]);
                                                                                    f38 += fArr2[i23];
                                                                                    f19 = fArr2[i24];
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                float f47 = f39;
                                                                                float f48 = f38;
                                                                                if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                    f24 = f48;
                                                                                    f25 = f47;
                                                                                } else {
                                                                                    f24 = (f48 * 2.0f) - f32;
                                                                                    f25 = (f47 * 2.0f) - f33;
                                                                                }
                                                                                int i25 = i11 + 0;
                                                                                int i26 = i11 + 1;
                                                                                path.quadTo(f24, f25, fArr2[i25], fArr2[i26]);
                                                                                f33 = f25;
                                                                                f32 = f24;
                                                                                c10 = c13;
                                                                                aVar = aVar2;
                                                                                i12 = i15;
                                                                                f38 = fArr2[i25];
                                                                                f39 = fArr2[i26];
                                                                            }
                                                                        } else {
                                                                            i11 = i16;
                                                                            float f49 = f39;
                                                                            float f50 = f38;
                                                                            if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                f23 = f50;
                                                                                f22 = f49;
                                                                            } else {
                                                                                f22 = (f49 * 2.0f) - f33;
                                                                                f23 = (f50 * 2.0f) - f32;
                                                                            }
                                                                            int i27 = i11 + 0;
                                                                            int i28 = i11 + 1;
                                                                            int i29 = i11 + 2;
                                                                            int i30 = i11 + 3;
                                                                            path.cubicTo(f23, f22, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                                                            float f51 = fArr2[i27];
                                                                            float f52 = fArr2[i28];
                                                                            f17 = fArr2[i29];
                                                                            f16 = fArr2[i30];
                                                                            f32 = f51;
                                                                            f33 = f52;
                                                                            f38 = f17;
                                                                            f39 = f16;
                                                                        }
                                                                    } else {
                                                                        i11 = i16;
                                                                        f20 = fArr2[i11 + 0];
                                                                        f21 = fArr2[i11 + 1];
                                                                        if (i11 > 0) {
                                                                            path.lineTo(f20, f21);
                                                                        } else {
                                                                            path.moveTo(f20, f21);
                                                                            f36 = f20;
                                                                            f37 = f21;
                                                                        }
                                                                    }
                                                                    f38 = f36;
                                                                    f39 = f37;
                                                                } else {
                                                                    i11 = i16;
                                                                    int i31 = i11 + 0;
                                                                    int i32 = i11 + 1;
                                                                    path.lineTo(fArr2[i31], fArr2[i32]);
                                                                    f20 = fArr2[i31];
                                                                    f21 = fArr2[i32];
                                                                }
                                                                f38 = f20;
                                                                f39 = f21;
                                                            } else {
                                                                i11 = i16;
                                                                f18 = f39;
                                                                int i33 = i11 + 0;
                                                                path.rLineTo(gl.Code, fArr2[i33]);
                                                                f19 = fArr2[i33];
                                                            }
                                                            f39 = f18 + f19;
                                                        } else {
                                                            i11 = i16;
                                                            f11 = f39;
                                                            float f53 = f38;
                                                            int i34 = i11 + 0;
                                                            float f54 = fArr2[i34];
                                                            int i35 = i11 + 1;
                                                            int i36 = i11 + 2;
                                                            int i37 = i11 + 3;
                                                            path.rQuadTo(f54, fArr2[i35], fArr2[i36], fArr2[i37]);
                                                            f12 = fArr2[i34] + f53;
                                                            f13 = fArr2[i35] + f11;
                                                            float f55 = f53 + fArr2[i36];
                                                            float f56 = fArr2[i37];
                                                            f14 = f55;
                                                            f15 = f56;
                                                        }
                                                    } else {
                                                        i11 = i16;
                                                        int i38 = i11 + 0;
                                                        path.rLineTo(fArr2[i38], gl.Code);
                                                        f38 += fArr2[i38];
                                                    }
                                                    c10 = c13;
                                                    aVar = aVar2;
                                                    i12 = i15;
                                                } else {
                                                    i11 = i16;
                                                    f11 = f39;
                                                    float f57 = f38;
                                                    int i39 = i11 + 2;
                                                    int i40 = i11 + 3;
                                                    int i41 = i11 + 4;
                                                    int i42 = i11 + 5;
                                                    path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                                    f12 = fArr2[i39] + f57;
                                                    f13 = fArr2[i40] + f11;
                                                    f14 = f57 + fArr2[i41];
                                                    f15 = fArr2[i42];
                                                }
                                                f16 = f11 + f15;
                                                f32 = f12;
                                                f33 = f13;
                                                f17 = f14;
                                                f38 = f17;
                                                f39 = f16;
                                                c10 = c13;
                                                aVar = aVar2;
                                                i12 = i15;
                                            } else {
                                                i11 = i16;
                                                float f58 = f39;
                                                float f59 = f38;
                                                int i43 = i11 + 5;
                                                float f60 = fArr2[i43] + f59;
                                                int i44 = i11 + 6;
                                                float f61 = fArr2[i44] + f58;
                                                float f62 = fArr2[i11 + 0];
                                                float f63 = fArr2[i11 + 1];
                                                float f64 = fArr2[i11 + 2];
                                                if (fArr2[i11 + 3] != gl.Code) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (fArr2[i11 + 4] != gl.Code) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c10 = c13;
                                                aVar = aVar2;
                                                i12 = i15;
                                                a(path, f59, f58, f60, f61, f62, f63, f64, z12, z13);
                                                f38 = f59 + fArr2[i43];
                                                f39 = f58 + fArr2[i44];
                                            }
                                        } else {
                                            i11 = i16;
                                            c10 = c13;
                                            aVar = aVar2;
                                            i12 = i15;
                                            int i45 = i11 + 0;
                                            path.lineTo(f38, fArr2[i45]);
                                            f39 = fArr2[i45];
                                        }
                                    } else {
                                        i11 = i16;
                                        c10 = c13;
                                        aVar = aVar2;
                                        i12 = i15;
                                        int i46 = i11 + 0;
                                        int i47 = i11 + 1;
                                        int i48 = i11 + 2;
                                        int i49 = i11 + 3;
                                        path.quadTo(fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                                        f = fArr2[i46];
                                        f10 = fArr2[i47];
                                        f38 = fArr2[i48];
                                        f39 = fArr2[i49];
                                    }
                                } else {
                                    i11 = i16;
                                    c10 = c13;
                                    aVar = aVar2;
                                    i12 = i15;
                                    int i50 = i11 + 0;
                                    path.lineTo(fArr2[i50], f39);
                                    f38 = fArr2[i50];
                                }
                                i16 = i11 + i10;
                                aVar2 = aVar;
                                c12 = c10;
                                c13 = c12;
                                i15 = i12;
                                c11 = 'm';
                                i14 = 0;
                            } else {
                                i11 = i16;
                                c10 = c13;
                                aVar = aVar2;
                                i12 = i15;
                                int i51 = i11 + 2;
                                int i52 = i11 + 3;
                                int i53 = i11 + 4;
                                int i54 = i11 + 5;
                                path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i51], fArr2[i52], fArr2[i53], fArr2[i54]);
                                float f65 = fArr2[i53];
                                float f66 = fArr2[i54];
                                f = fArr2[i51];
                                f38 = f65;
                                f39 = f66;
                                f10 = fArr2[i52];
                            }
                            f32 = f;
                            f33 = f10;
                            i16 = i11 + i10;
                            aVar2 = aVar;
                            c12 = c10;
                            c13 = c12;
                            i15 = i12;
                            c11 = 'm';
                            i14 = 0;
                        } else {
                            i11 = i16;
                            float f67 = f39;
                            float f68 = f38;
                            c10 = c13;
                            aVar = aVar2;
                            i12 = i15;
                            int i55 = i11 + 5;
                            float f69 = fArr2[i55];
                            int i56 = i11 + 6;
                            float f70 = fArr2[i56];
                            float f71 = fArr2[i11 + 0];
                            float f72 = fArr2[i11 + 1];
                            float f73 = fArr2[i11 + 2];
                            if (fArr2[i11 + 3] != gl.Code) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (fArr2[i11 + 4] != gl.Code) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            a(path, f68, f67, f69, f70, f71, f72, f73, z10, z11);
                            f38 = fArr2[i55];
                            f39 = fArr2[i56];
                        }
                        f33 = f39;
                        f32 = f38;
                        i16 = i11 + i10;
                        aVar2 = aVar;
                        c12 = c10;
                        c13 = c12;
                        i15 = i12;
                        c11 = 'm';
                        i14 = 0;
                    }
                }
                int i57 = i15;
                int i58 = i14;
                fArr[i58] = f38;
                fArr[1] = f39;
                fArr[2] = f32;
                fArr[3] = f33;
                fArr[4] = f36;
                fArr[5] = f37;
                i15 = i57 + 1;
                i13 = 6;
                c11 = 'm';
                i14 = i58;
                c12 = aVarArr[i57].f27904a;
                aVarArr2 = aVarArr;
            }
        }

        public a(a aVar) {
            this.f27904a = aVar.f27904a;
            float[] fArr = aVar.f27905b;
            this.f27905b = d.b(fArr, fArr.length);
        }
    }
}
