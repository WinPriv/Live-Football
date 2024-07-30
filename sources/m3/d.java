package m3;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32662a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Z> f32663a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f32664b;

        /* renamed from: c, reason: collision with root package name */
        public final c<Z, R> f32665c;

        public a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
            this.f32663a = cls;
            this.f32664b = cls2;
            this.f32665c = cVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f32662a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f32663a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f32664b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !arrayList.contains(aVar.f32664b)) {
                arrayList.add(aVar.f32664b);
            }
        }
        return arrayList;
    }
}
