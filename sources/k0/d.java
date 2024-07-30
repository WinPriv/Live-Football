package k0;

import b6.e;
import j7.u1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k4.i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30249s;

    public /* synthetic */ d(int i10) {
        this.f30249s = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f30249s) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
            default:
                return e.h.d((e.h) obj, (e.h) obj2);
            case 2:
                n5.b bVar = (n5.b) obj;
                n5.b bVar2 = (n5.b) obj2;
                int compare = Integer.compare(bVar.f33352c, bVar2.f33352c);
                if (compare == 0) {
                    return bVar.f33351b.compareTo(bVar2.f33351b);
                }
                return compare;
            case 3:
                return ((i0) obj2).f30524z - ((i0) obj).f30524z;
            case 4:
                u1<Integer> u1Var = b6.e.f3021i;
                return 0;
            case 5:
                return ((e.a) Collections.max((List) obj)).c((e.a) Collections.max((List) obj2));
        }
    }
}
