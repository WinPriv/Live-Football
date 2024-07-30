package e6;

import d6.s;
import d6.w;
import java.util.Collections;
import java.util.List;
import k4.z0;

/* compiled from: HevcConfig.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27778b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27779c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27780d;

    public e(List list, int i10, float f, String str) {
        this.f27777a = list;
        this.f27778b = i10;
        this.f27779c = f;
        this.f27780d = str;
    }

    public static e a(w wVar) throws z0 {
        List singletonList;
        int i10;
        try {
            wVar.F(21);
            int t10 = wVar.t() & 3;
            int t11 = wVar.t();
            int i11 = wVar.f27385b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < t11; i14++) {
                wVar.F(1);
                int y = wVar.y();
                for (int i15 = 0; i15 < y; i15++) {
                    int y10 = wVar.y();
                    i13 += y10 + 4;
                    wVar.F(y10);
                }
            }
            wVar.E(i11);
            byte[] bArr = new byte[i13];
            float f = 1.0f;
            String str = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < t11) {
                int t12 = wVar.t() & 63;
                int y11 = wVar.y();
                int i18 = i12;
                while (i18 < y11) {
                    int y12 = wVar.y();
                    System.arraycopy(s.f27347a, i12, bArr, i17, 4);
                    int i19 = i17 + 4;
                    System.arraycopy(wVar.f27384a, wVar.f27385b, bArr, i19, y12);
                    if (t12 == 33 && i18 == 0) {
                        s.a c10 = s.c(bArr, i19, i19 + y12);
                        float f10 = c10.f27356g;
                        i10 = t11;
                        str = androidx.activity.n.h0(c10.f27351a, c10.f27352b, c10.f27353c, c10.f27354d, c10.f27355e, c10.f);
                        f = f10;
                    } else {
                        i10 = t11;
                    }
                    i17 = i19 + y12;
                    wVar.F(y12);
                    i18++;
                    t11 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            if (i13 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new e(singletonList, t10 + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw z0.a("Error parsing HEVC config", e10);
        }
    }
}
