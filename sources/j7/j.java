package j7;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ArrayListMultimap.java */
/* loaded from: classes2.dex */
public final class j<K, V> extends c<Object, Object> {
    public final transient int y;

    public j() {
        super(new p(12));
        r.y(3, "expectedValuesPerKey");
        this.y = 3;
    }

    @Override // j7.d
    public final Collection x() {
        return new ArrayList(this.y);
    }
}
