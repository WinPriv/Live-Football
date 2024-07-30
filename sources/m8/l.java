package m8;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class l extends n implements Iterable<n> {

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<n> f32940s;

    public l() {
        this.f32940s = new ArrayList<>();
    }

    @Override // m8.n
    public final boolean e() {
        return r().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof l) || !((l) obj).f32940s.equals(this.f32940s))) {
            return false;
        }
        return true;
    }

    @Override // m8.n
    public final double f() {
        return r().f();
    }

    @Override // m8.n
    public final float g() {
        return r().g();
    }

    @Override // m8.n
    public final int h() {
        return r().h();
    }

    public final int hashCode() {
        return this.f32940s.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return this.f32940s.iterator();
    }

    @Override // m8.n
    public final long l() {
        return r().l();
    }

    @Override // m8.n
    public final String m() {
        return r().m();
    }

    public final void n(String str) {
        n sVar;
        ArrayList<n> arrayList = this.f32940s;
        if (str == null) {
            sVar = p.f32941s;
        } else {
            sVar = new s(str);
        }
        arrayList.add(sVar);
    }

    public final void o(n nVar) {
        if (nVar == null) {
            nVar = p.f32941s;
        }
        this.f32940s.add(nVar);
    }

    @Override // m8.n
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final l d() {
        ArrayList<n> arrayList = this.f32940s;
        if (!arrayList.isEmpty()) {
            l lVar = new l(arrayList.size());
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                lVar.o(it.next().d());
            }
            return lVar;
        }
        return new l();
    }

    public final n q(int i10) {
        return this.f32940s.get(i10);
    }

    public final n r() {
        ArrayList<n> arrayList = this.f32940s;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        throw new IllegalStateException(a3.l.i("Array must have size 1, but has size ", size));
    }

    public final int size() {
        return this.f32940s.size();
    }

    public l(int i10) {
        this.f32940s = new ArrayList<>(i10);
    }
}
