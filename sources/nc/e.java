package nc;

import java.util.List;
import nc.h;

/* loaded from: classes2.dex */
public final class e implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33498a;

    public e(String str) {
        this.f33498a = str;
    }

    @Override // nc.h.c
    public final boolean a(Object obj) {
        if (!(obj instanceof List) && !obj.getClass().getName().contains(this.f33498a)) {
            return false;
        }
        return true;
    }

    @Override // nc.h.c
    public final h.a b(Object obj) {
        try {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() <= 0) {
                    return h.a.a();
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object obj2 = list.get(i10);
                    if (obj2.getClass().getName().contains(this.f33498a)) {
                        return h.a.b(obj2);
                    }
                }
                return h.a.a();
            }
            return h.a.b(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
