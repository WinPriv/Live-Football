package j7;

import j7.b1;

/* compiled from: ImmutableMultimap.java */
/* loaded from: classes2.dex */
public final class r0 extends t2<Object> {

    /* renamed from: s, reason: collision with root package name */
    public final t2 f30092s;

    /* renamed from: t, reason: collision with root package name */
    public t2 f30093t = b1.a.f29879w;

    public r0(s0 s0Var) {
        this.f30092s = s0Var.f30094w.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f30093t.hasNext() && !this.f30092s.hasNext()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f30093t.hasNext()) {
            this.f30093t = ((g0) this.f30092s.next()).iterator();
        }
        return this.f30093t.next();
    }
}
