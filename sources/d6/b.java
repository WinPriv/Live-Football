package d6;

import android.os.Bundle;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import k4.f;

/* compiled from: BundleableUtil.java */
/* loaded from: classes2.dex */
public final class b {
    public static v1 a(f.a aVar, ArrayList arrayList) {
        j0.b bVar = j0.f30006t;
        j0.a aVar2 = new j0.a();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            aVar2.b(aVar.mo0fromBundle(bundle));
        }
        return aVar2.e();
    }
}
