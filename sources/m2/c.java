package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes.dex */
public final class c extends u0.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ArrayList arrayList, int i10) {
        super(arrayList, 1);
        this.f32641u = i10;
        if (i10 != 1) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t2.a aVar = (t2.a) arrayList.get(i11);
                n2.c cVar = (n2.c) aVar.f35379b;
                n2.c cVar2 = (n2.c) aVar.f35380c;
                if (cVar != null && cVar2 != null) {
                    float[] fArr = cVar.f33221a;
                    int length = fArr.length;
                    float[] fArr2 = cVar2.f33221a;
                    if (length != fArr2.length) {
                        int length2 = fArr.length + fArr2.length;
                        float[] fArr3 = new float[length2];
                        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                        Arrays.sort(fArr3);
                        float f = Float.NaN;
                        int i12 = 0;
                        for (int i13 = 0; i13 < length2; i13++) {
                            float f10 = fArr3[i13];
                            if (f10 != f) {
                                fArr3[i12] = f10;
                                i12++;
                                f = fArr3[i13];
                            }
                        }
                        float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                        aVar = new t2.a(cVar.a(copyOfRange), cVar2.a(copyOfRange));
                    }
                }
                arrayList.set(i11, aVar);
            }
            return;
        }
        super(arrayList, 1);
    }

    @Override // m2.i
    public final j2.a a() {
        int i10 = this.f32641u;
        Object obj = this.f35738t;
        switch (i10) {
            case 0:
                return new j2.e((List) obj, 0);
            default:
                return new j2.e((List) obj, 1);
        }
    }
}
