package j7;

import java.util.Map;
import java.util.Set;

/* compiled from: Table.java */
/* loaded from: classes2.dex */
public interface n2<R, C, V> {

    /* compiled from: Table.java */
    /* loaded from: classes2.dex */
    public interface a<R, C, V> {
        V getValue();

        C k();

        R p();
    }

    Set<a<R, C, V>> k();

    Map<R, Map<C, V>> p();

    int size();
}
