package j7;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* loaded from: classes2.dex */
public class h0<K, V> extends e<K, V> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final K f29988s;

    /* renamed from: t, reason: collision with root package name */
    public final V f29989t;

    public h0(K k10, V v3) {
        this.f29988s = k10;
        this.f29989t = v3;
    }

    @Override // j7.e, java.util.Map.Entry
    public final K getKey() {
        return this.f29988s;
    }

    @Override // j7.e, java.util.Map.Entry
    public final V getValue() {
        return this.f29989t;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v3) {
        throw new UnsupportedOperationException();
    }
}
