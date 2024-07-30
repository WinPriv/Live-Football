package t3;

import androidx.activity.n;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes.dex */
public final class f implements g<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f35416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f35417b;

    public f(g gVar) {
        this.f35417b = gVar;
    }

    @Override // t3.g
    public final Object get() {
        if (this.f35416a == null) {
            synchronized (this) {
                if (this.f35416a == null) {
                    Object obj = this.f35417b.get();
                    n.n0(obj);
                    this.f35416a = obj;
                }
            }
        }
        return this.f35416a;
    }
}
