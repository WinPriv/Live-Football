package a3;

import a3.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u3.a;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public final class v<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final m0.d<List<Throwable>> f216a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends m<Data, ResourceType, Transcode>> f217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f218c;

    public v(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f216a = cVar;
        if (!list.isEmpty()) {
            this.f217b = list;
            this.f218c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final x a(int i10, int i11, y2.g gVar, com.bumptech.glide.load.data.e eVar, j.b bVar) throws t {
        m0.d<List<Throwable>> dVar = this.f216a;
        List<Throwable> b10 = dVar.b();
        androidx.activity.n.n0(b10);
        List<Throwable> list = b10;
        try {
            List<? extends m<Data, ResourceType, Transcode>> list2 = this.f217b;
            int size = list2.size();
            x xVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    xVar = list2.get(i12).a(i10, i11, gVar, eVar, bVar);
                } catch (t e10) {
                    list.add(e10);
                }
                if (xVar != null) {
                    break;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            throw new t(this.f218c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f217b.toArray()) + '}';
    }
}
