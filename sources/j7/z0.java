package j7;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: Iterators.java */
/* loaded from: classes2.dex */
public final class z0 extends b<Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Iterator f30150u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i7.h f30151v;

    public z0(Iterator it, i7.h hVar) {
        this.f30150u = it;
        this.f30151v = hVar;
    }

    @Override // j7.b
    @CheckForNull
    public final Object a() {
        Object next;
        do {
            Iterator it = this.f30150u;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f29877s = 3;
                return null;
            }
        } while (!this.f30151v.apply(next));
        return next;
    }
}
