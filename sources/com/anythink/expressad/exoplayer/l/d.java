package com.anythink.expressad.exoplayer.l;

import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9188b;

    private d(List<byte[]> list, int i10) {
        this.f9187a = list;
        this.f9188b = i10;
    }

    public static d a(s sVar) {
        List singletonList;
        try {
            sVar.d(21);
            int d10 = sVar.d() & 3;
            int d11 = sVar.d();
            int c10 = sVar.c();
            int i10 = 0;
            for (int i11 = 0; i11 < d11; i11++) {
                sVar.d(1);
                int e10 = sVar.e();
                for (int i12 = 0; i12 < e10; i12++) {
                    int e11 = sVar.e();
                    i10 += e11 + 4;
                    sVar.d(e11);
                }
            }
            sVar.c(c10);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < d11; i14++) {
                sVar.d(1);
                int e12 = sVar.e();
                for (int i15 = 0; i15 < e12; i15++) {
                    int e13 = sVar.e();
                    byte[] bArr2 = p.f9094a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(sVar.f9123a, sVar.c(), bArr, length, e13);
                    i13 = length + e13;
                    sVar.d(e13);
                }
            }
            if (i10 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new d(singletonList, d10 + 1);
        } catch (ArrayIndexOutOfBoundsException e14) {
            throw new t("Error parsing HEVC config", e14);
        }
    }
}
