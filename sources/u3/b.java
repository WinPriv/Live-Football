package u3;

import java.util.ArrayList;
import java.util.List;
import u3.a;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class b implements a.b<List<Object>> {
    @Override // u3.a.b
    public final List<Object> create() {
        return new ArrayList();
    }
}
