package o3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y2.i;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33603a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f33604b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f33605a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f33606b;

        /* renamed from: c, reason: collision with root package name */
        public final i<T, R> f33607c;

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.f33605a = cls;
            this.f33606b = cls2;
            this.f33607c = iVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f33603a.contains(str)) {
            this.f33603a.add(str);
        }
        list = (List) this.f33604b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f33604b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = this.f33603a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f33604b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f33605a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f33606b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !arrayList.contains(aVar.f33606b)) {
                        arrayList.add(aVar.f33606b);
                    }
                }
            }
        }
        return arrayList;
    }
}
