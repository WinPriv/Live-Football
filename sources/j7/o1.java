package j7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes2.dex */
public final class o1<V> implements i7.m<List<V>>, Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final int f30052s;

    public o1(int i10) {
        r.y(i10, "expectedValuesPerKey");
        this.f30052s = i10;
    }

    @Override // i7.m
    public final Object get() {
        return new ArrayList(this.f30052s);
    }
}
