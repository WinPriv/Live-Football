package j4;

import a3.l;
import android.util.SparseArray;
import java.util.HashMap;
import w3.d;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<d> f29639a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<d, Integer> f29640b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f29640b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        hashMap.put(d.VERY_LOW, 1);
        hashMap.put(d.HIGHEST, 2);
        for (d dVar : hashMap.keySet()) {
            f29639a.append(f29640b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f29640b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f29639a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(l.i("Unknown Priority for value ", i10));
    }
}
