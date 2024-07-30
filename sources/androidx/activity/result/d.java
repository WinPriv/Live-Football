package androidx.activity.result;

import java.util.HashMap;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public final class d extends b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f533c;

    public d(e eVar, String str, e.a aVar) {
        this.f533c = eVar;
        this.f531a = str;
        this.f532b = aVar;
    }

    public final void a(Object obj) {
        e eVar = this.f533c;
        HashMap hashMap = eVar.f536c;
        String str = this.f531a;
        Integer num = (Integer) hashMap.get(str);
        e.a aVar = this.f532b;
        if (num != null) {
            eVar.f538e.add(str);
            try {
                eVar.b(num.intValue(), aVar, obj);
                return;
            } catch (Exception e10) {
                eVar.f538e.remove(str);
                throw e10;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.f533c.f(this.f531a);
    }
}
