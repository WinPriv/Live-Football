package j7;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: Sets.java */
/* loaded from: classes2.dex */
public final class d2 extends b<Object> {

    /* renamed from: u, reason: collision with root package name */
    public final Iterator<Object> f29937u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e2 f29938v;

    public d2(e2 e2Var) {
        this.f29938v = e2Var;
        this.f29937u = e2Var.f29941s.iterator();
    }

    @Override // j7.b
    @CheckForNull
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.f29937u;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f29877s = 3;
                return null;
            }
        } while (!this.f29938v.f29942t.contains(next));
        return next;
    }
}
