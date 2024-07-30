package nc;

import java.util.Map;
import nc.h;

/* loaded from: classes2.dex */
public final class l implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StringBuffer f33513c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33514d;

    /* loaded from: classes2.dex */
    public class a implements h.c {
        public a() {
        }

        @Override // nc.h.c
        public final boolean a(Object obj) {
            return obj.getClass().getName().startsWith(l.this.f33512b);
        }

        @Override // nc.h.c
        public final h.a b(Object obj) {
            String str = l.this.f33514d;
            if (str != null && str.contains(obj.getClass().getName())) {
                return h.a.b(obj);
            }
            h.a aVar = new h.a();
            aVar.f33504a = -1;
            aVar.f33505b = obj;
            return aVar;
        }
    }

    public l(String str, String str2, StringBuffer stringBuffer, String str3) {
        this.f33511a = str;
        this.f33512b = str2;
        this.f33513c = stringBuffer;
        this.f33514d = str3;
    }

    @Override // nc.h.c
    public final boolean a(Object obj) {
        return obj instanceof Map;
    }

    @Override // nc.h.c
    public final h.a b(Object obj) {
        Map map;
        String str = this.f33511a;
        try {
            map = (Map) obj;
        } catch (Throwable unused) {
        }
        if (map.size() <= 0) {
            return h.a.a();
        }
        if (map.containsKey(str)) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                return h.a.a();
            }
            Object a10 = h.a(obj2, this.f33512b, this.f33513c, new a());
            if (a10 != null) {
                return h.a.b(a10);
            }
            return h.a.a();
        }
        return h.a.a();
    }
}
