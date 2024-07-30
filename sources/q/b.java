package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import q.h;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class b<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: z, reason: collision with root package name */
    public a f34506z;

    public b() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f34506z == null) {
            this.f34506z = new a(this);
        }
        a aVar = this.f34506z;
        if (aVar.f34527a == null) {
            aVar.f34527a = new h.b();
        }
        return aVar.f34527a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f34506z == null) {
            this.f34506z = new a(this);
        }
        a aVar = this.f34506z;
        if (aVar.f34528b == null) {
            aVar.f34528b = new h.c();
        }
        return aVar.f34528b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f34547u);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f34506z == null) {
            this.f34506z = new a(this);
        }
        a aVar = this.f34506z;
        if (aVar.f34529c == null) {
            aVar.f34529c = new h.e();
        }
        return aVar.f34529c;
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        if (bVar != null) {
            i(bVar);
        }
    }
}
