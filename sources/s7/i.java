package s7;

import com.google.firebase.components.ComponentRegistrar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements c8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35229b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f35228a = i10;
        this.f35229b = obj;
    }

    @Override // c8.a
    public final Object get() {
        int i10 = this.f35228a;
        Object obj = this.f35229b;
        switch (i10) {
            case 0:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = d8.b.f27492m;
                return new f8.b((n7.e) obj);
        }
    }
}
