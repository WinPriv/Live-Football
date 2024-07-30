package j7;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: HashBasedTable.java */
/* loaded from: classes2.dex */
public final class d0<R, C, V> extends k2<R, C, V> {

    /* compiled from: HashBasedTable.java */
    /* loaded from: classes2.dex */
    public static class a<C, V> implements i7.m<Map<C, V>>, Serializable {
        @Override // i7.m
        public final Object get() {
            r.y(0, "expectedSize");
            return new LinkedHashMap(1);
        }
    }

    public d0(LinkedHashMap linkedHashMap, a aVar) {
        super(linkedHashMap, aVar);
    }
}
