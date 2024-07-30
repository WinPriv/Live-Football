package nc;

import java.util.Map;
import nc.h;

/* loaded from: classes2.dex */
public final class i implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33507b;

    public i(String str, String str2) {
        this.f33506a = str;
        this.f33507b = str2;
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
        String str = this.f33506a;
        if (map.containsKey(str)) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                return h.a.a();
            }
            if (obj2.getClass().getName().contains(this.f33507b)) {
                return h.a.b(obj2);
            }
            h.a aVar = new h.a();
            aVar.f33504a = -1;
            aVar.f33505b = obj2;
            return aVar;
        }
        return h.a.a();
    }
}
