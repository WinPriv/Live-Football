package e6;

import d6.s;
import d6.w;
import java.util.ArrayList;
import java.util.List;
import k4.z0;

/* compiled from: AvcConfig.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27754c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27755d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27756e;
    public final String f;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f, String str) {
        this.f27752a = arrayList;
        this.f27753b = i10;
        this.f27754c = i11;
        this.f27755d = i12;
        this.f27756e = f;
        this.f = str;
    }

    public static a a(w wVar) throws z0 {
        byte[] bArr;
        int i10;
        int i11;
        float f;
        String str;
        try {
            wVar.F(4);
            int t10 = (wVar.t() & 3) + 1;
            if (t10 != 3) {
                ArrayList arrayList = new ArrayList();
                int t11 = wVar.t() & 31;
                int i12 = 0;
                while (true) {
                    bArr = androidx.activity.n.f519z;
                    if (i12 >= t11) {
                        break;
                    }
                    int y = wVar.y();
                    int i13 = wVar.f27385b;
                    wVar.F(y);
                    byte[] bArr2 = wVar.f27384a;
                    byte[] bArr3 = new byte[y + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i13, bArr3, 4, y);
                    arrayList.add(bArr3);
                    i12++;
                }
                int t12 = wVar.t();
                for (int i14 = 0; i14 < t12; i14++) {
                    int y10 = wVar.y();
                    int i15 = wVar.f27385b;
                    wVar.F(y10);
                    byte[] bArr4 = wVar.f27384a;
                    byte[] bArr5 = new byte[y10 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i15, bArr5, 4, y10);
                    arrayList.add(bArr5);
                }
                if (t11 > 0) {
                    s.c d10 = s.d((byte[]) arrayList.get(0), t10, ((byte[]) arrayList.get(0)).length);
                    int i16 = d10.f27363e;
                    int i17 = d10.f;
                    float f10 = d10.f27364g;
                    str = androidx.activity.n.g0(d10.f27359a, d10.f27360b, d10.f27361c);
                    i10 = i16;
                    i11 = i17;
                    f = f10;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new a(arrayList, t10, i10, i11, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw z0.a("Error parsing AVC config", e10);
        }
    }
}
