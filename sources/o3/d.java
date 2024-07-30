package o3;

import java.util.ArrayList;
import y2.j;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33608a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f33609a;

        /* renamed from: b, reason: collision with root package name */
        public final j<T> f33610b;

        public a(Class<T> cls, j<T> jVar) {
            this.f33609a = cls;
            this.f33610b = jVar;
        }
    }

    public final synchronized <Z> j<Z> a(Class<Z> cls) {
        int size = this.f33608a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f33608a.get(i10);
            if (aVar.f33609a.isAssignableFrom(cls)) {
                return (j<Z>) aVar.f33610b;
            }
        }
        return null;
    }
}
