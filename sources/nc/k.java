package nc;

import nc.h;

/* loaded from: classes2.dex */
public final class k implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33510b;

    public k(String str, String str2) {
        this.f33509a = str;
        this.f33510b = str2;
    }

    @Override // nc.h.c
    public final boolean a(Object obj) {
        return obj.getClass().getName().startsWith(this.f33509a);
    }

    @Override // nc.h.c
    public final h.a b(Object obj) {
        try {
            String str = this.f33510b;
            if (str != null && str.contains(obj.getClass().getName())) {
                return h.a.b(obj);
            }
            h.a aVar = new h.a();
            aVar.f33504a = -1;
            aVar.f33505b = obj;
            return aVar;
        } catch (Throwable unused) {
            return h.a.a();
        }
    }
}
