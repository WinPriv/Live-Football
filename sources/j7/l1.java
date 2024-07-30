package j7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes2.dex */
public final class l1 extends q2<Object, Map.Entry<Object, Object>> {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i7.d f30032t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Iterator it, i7.d dVar) {
        super(it);
        this.f30032t = dVar;
    }

    @Override // j7.q2
    public final Map.Entry<Object, Object> a(Object obj) {
        return new h0(obj, this.f30032t.apply(obj));
    }
}
