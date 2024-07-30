package j7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes2.dex */
public final class j1 extends q2<Map.Entry<Object, Object>, Object> {
    public j1(Iterator it) {
        super(it);
    }

    @Override // j7.q2
    public final Object a(Map.Entry<Object, Object> entry) {
        return entry.getKey();
    }
}
