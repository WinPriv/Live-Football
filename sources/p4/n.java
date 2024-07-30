package p4;

import java.util.Arrays;
import p4.p;

/* compiled from: FlacMetadataReader.java */
/* loaded from: classes2.dex */
public final class n {
    public static p.a a(d6.w wVar) {
        wVar.F(1);
        int v3 = wVar.v();
        long j10 = wVar.f27385b + v3;
        int i10 = v3 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long m10 = wVar.m();
            if (m10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = m10;
            jArr2[i11] = wVar.m();
            wVar.F(2);
            i11++;
        }
        wVar.F((int) (j10 - wVar.f27385b));
        return new p.a(jArr, jArr2);
    }
}
