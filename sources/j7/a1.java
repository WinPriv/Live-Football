package j7;

import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* loaded from: classes2.dex */
public final class a1 extends t2<Object> {

    /* renamed from: s, reason: collision with root package name */
    public boolean f29874s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f29875t;

    public a1(Object obj) {
        this.f29875t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f29874s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f29874s) {
            this.f29874s = true;
            return this.f29875t;
        }
        throw new NoSuchElementException();
    }
}
