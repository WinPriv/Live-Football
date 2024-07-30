package j7;

import j7.b1;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: ImmutableMultimap.java */
/* loaded from: classes2.dex */
public final class q0 extends t2<Map.Entry<Object, Object>> {

    /* renamed from: s, reason: collision with root package name */
    public final t2 f30088s;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public Object f30089t = null;

    /* renamed from: u, reason: collision with root package name */
    public t2 f30090u = b1.a.f29879w;

    public q0(s0 s0Var) {
        this.f30088s = s0Var.f30094w.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f30090u.hasNext() && !this.f30088s.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f30090u.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f30088s.next();
            this.f30089t = entry.getKey();
            this.f30090u = ((g0) entry.getValue()).iterator();
        }
        Object obj = this.f30089t;
        Objects.requireNonNull(obj);
        return new h0(obj, this.f30090u.next());
    }
}
