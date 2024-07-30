package s7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.h0;

/* compiled from: DependencyCycleException.java */
/* loaded from: classes2.dex */
public final class m extends h0 {

    /* renamed from: s, reason: collision with root package name */
    public final List<b<?>> f35244s;

    public m(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f35244s = arrayList;
    }
}
