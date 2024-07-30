package k;

import java.util.HashMap;
import k.b;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: w, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f30229w = new HashMap<>();

    @Override // k.b
    public final b.c<K, V> a(K k10) {
        return this.f30229w.get(k10);
    }

    @Override // k.b
    public final V b(K k10, V v3) {
        b.c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f30235t;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f30229w;
        b.c<K, V> cVar = new b.c<>(k10, v3);
        this.f30233v++;
        b.c<K, V> cVar2 = this.f30231t;
        if (cVar2 == null) {
            this.f30230s = cVar;
            this.f30231t = cVar;
        } else {
            cVar2.f30236u = cVar;
            cVar.f30237v = cVar2;
            this.f30231t = cVar;
        }
        hashMap.put(k10, cVar);
        return null;
    }

    @Override // k.b
    public final V c(K k10) {
        V v3 = (V) super.c(k10);
        this.f30229w.remove(k10);
        return v3;
    }
}
