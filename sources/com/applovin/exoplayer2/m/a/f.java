package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.m.a.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
final class f {
    private static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static ArrayList<e.a> b(y yVar) {
        int q10;
        yVar.e(8);
        int c10 = yVar.c();
        int b10 = yVar.b();
        while (c10 < b10 && (q10 = yVar.q() + c10) > c10 && q10 <= b10) {
            int q11 = yVar.q();
            if (q11 != 2037673328 && q11 != 1836279920) {
                yVar.d(q10);
                c10 = q10;
            } else {
                yVar.c(q10);
                return c(yVar);
            }
        }
        return null;
    }

    private static ArrayList<e.a> c(y yVar) {
        if (yVar.h() != 0) {
            return null;
        }
        yVar.e(7);
        int q10 = yVar.q();
        if (q10 == 1684433976) {
            y yVar2 = new y();
            Inflater inflater = new Inflater(true);
            try {
                if (!ai.a(yVar, yVar2, inflater)) {
                    return null;
                }
                inflater.end();
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (q10 != 1918990112) {
            return null;
        }
        return d(yVar);
    }

    private static ArrayList<e.a> d(y yVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int c10 = yVar.c();
        int b10 = yVar.b();
        while (c10 < b10) {
            int q10 = yVar.q() + c10;
            if (q10 <= c10 || q10 > b10) {
                return null;
            }
            if (yVar.q() == 1835365224) {
                e.a e10 = e(yVar);
                if (e10 == null) {
                    return null;
                }
                arrayList.add(e10);
            }
            yVar.d(q10);
            c10 = q10;
        }
        return arrayList;
    }

    private static e.a e(y yVar) {
        int q10 = yVar.q();
        if (q10 > 10000) {
            return null;
        }
        float[] fArr = new float[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            fArr[i10] = yVar.z();
        }
        int q11 = yVar.q();
        if (q11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(q10 * 2.0d) / log);
        x xVar = new x(yVar.d());
        int i11 = 8;
        xVar.a(yVar.c() * 8);
        float[] fArr2 = new float[q11 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < q11) {
            int i15 = 0;
            while (i15 < i12) {
                int a10 = iArr[i15] + a(xVar.c(ceil));
                if (a10 >= q10 || a10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[a10];
                iArr[i15] = a10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        xVar.a((xVar.b() + 7) & (-8));
        int i16 = 32;
        int c10 = xVar.c(32);
        e.b[] bVarArr = new e.b[c10];
        int i17 = 0;
        while (i17 < c10) {
            int c11 = xVar.c(i11);
            int c12 = xVar.c(i11);
            int c13 = xVar.c(i16);
            if (c13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(q11 * d10) / log);
            float[] fArr3 = new float[c13 * 3];
            float[] fArr4 = new float[c13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < c13; i19++) {
                i18 += a(xVar.c(ceil2));
                if (i18 < 0 || i18 >= q11) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new e.b(c11, fArr3, fArr4, c12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayList;
        y yVar = new y(bArr);
        try {
            arrayList = a(yVar) ? b(yVar) : c(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayList.get(0), arrayList.get(1), i10);
    }

    private static boolean a(y yVar) {
        yVar.e(4);
        int q10 = yVar.q();
        yVar.d(0);
        return q10 == 1886547818;
    }
}
