package m8;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import o8.r;

/* compiled from: JsonObject.java */
/* loaded from: classes2.dex */
public final class q extends n {

    /* renamed from: s, reason: collision with root package name */
    public final o8.r<String, n> f32942s = new o8.r<>(false);

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof q) || !((q) obj).f32942s.equals(this.f32942s))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32942s.hashCode();
    }

    public final void n(n nVar, String str) {
        if (nVar == null) {
            nVar = p.f32941s;
        }
        this.f32942s.put(str, nVar);
    }

    public final void o(String str, Boolean bool) {
        n sVar;
        if (bool == null) {
            sVar = p.f32941s;
        } else {
            sVar = new s(bool);
        }
        n(sVar, str);
    }

    public final void p(String str, Number number) {
        n sVar;
        if (number == null) {
            sVar = p.f32941s;
        } else {
            sVar = new s(number);
        }
        n(sVar, str);
    }

    public final void q(String str, String str2) {
        n sVar;
        if (str2 == null) {
            sVar = p.f32941s;
        } else {
            sVar = new s(str2);
        }
        n(sVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m8.n
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final q d() {
        boolean z10;
        q qVar = new q();
        o8.r rVar = o8.r.this;
        r.e eVar = rVar.f33756x.f33767v;
        int i10 = rVar.f33755w;
        while (true) {
            if (eVar != rVar.f33756x) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (eVar != rVar.f33756x) {
                    if (rVar.f33755w == i10) {
                        r.e eVar2 = eVar.f33767v;
                        qVar.n(((n) eVar.getValue()).d(), (String) eVar.getKey());
                        eVar = eVar2;
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return qVar;
            }
        }
    }

    public final n s(String str) {
        return this.f32942s.get(str);
    }

    public final l t(String str) {
        return (l) this.f32942s.get(str);
    }

    public final q u(String str) {
        return (q) this.f32942s.get(str);
    }

    public final boolean v(String str) {
        return this.f32942s.containsKey(str);
    }
}
