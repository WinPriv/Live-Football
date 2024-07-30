package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.i;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: s, reason: collision with root package name */
    public final Object f1934s;

    /* renamed from: t, reason: collision with root package name */
    public final b.a f1935t;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1934s = obj;
        this.f1935t = b.f1942c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.k
    public final void c(m mVar, i.b bVar) {
        HashMap hashMap = this.f1935t.f1945a;
        List list = (List) hashMap.get(bVar);
        Object obj = this.f1934s;
        b.a.a(list, mVar, bVar, obj);
        b.a.a((List) hashMap.get(i.b.ON_ANY), mVar, bVar, obj);
    }
}
