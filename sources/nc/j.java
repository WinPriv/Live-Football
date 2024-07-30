package nc;

import java.util.Iterator;
import java.util.Map;
import nc.h;

/* loaded from: classes2.dex */
public final class j implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33508a;

    public j(String str) {
        this.f33508a = str;
    }

    @Override // nc.h.c
    public final boolean a(Object obj) {
        return obj instanceof Map;
    }

    @Override // nc.h.c
    public final h.a b(Object obj) {
        Map map = (Map) obj;
        if (map.size() == 0) {
            return h.a.a();
        }
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value == null) {
                return h.a.a();
            }
            if (value.getClass().getSimpleName().contains(this.f33508a)) {
                return h.a.b(value);
            }
            h.a aVar = new h.a();
            aVar.f33504a = -1;
            aVar.f33505b = value;
            return aVar;
        }
        return h.a.a();
    }
}
