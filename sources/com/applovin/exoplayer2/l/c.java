package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static <T extends com.applovin.exoplayer2.g> T a(g.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.fromBundle(bundle);
    }

    public static <T extends com.applovin.exoplayer2.g> com.applovin.exoplayer2.common.a.s<T> a(g.a<T> aVar, List<Bundle> list) {
        s.a i10 = com.applovin.exoplayer2.common.a.s.i();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10.a(aVar.fromBundle((Bundle) a.b(list.get(i11))));
        }
        return i10.a();
    }

    public static <T extends com.applovin.exoplayer2.g> List<T> a(g.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static <T extends com.applovin.exoplayer2.g> SparseArray<T> a(g.a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray3.put(sparseArray.keyAt(i10), aVar.fromBundle(sparseArray.valueAt(i10)));
        }
        return sparseArray3;
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) ai.a(c.class.getClassLoader()));
        }
    }
}
