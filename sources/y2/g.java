package y2;

import java.security.MessageDigest;
import y2.f;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final t3.b f36567b = new t3.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            t3.b bVar = this.f36567b;
            if (i10 < bVar.f34547u) {
                f fVar = (f) bVar.h(i10);
                V l10 = this.f36567b.l(i10);
                f.b<T> bVar2 = fVar.f36564b;
                if (fVar.f36566d == null) {
                    fVar.f36566d = fVar.f36565c.getBytes(e.f36561a);
                }
                bVar2.a(fVar.f36566d, l10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(f<T> fVar) {
        t3.b bVar = this.f36567b;
        if (bVar.containsKey(fVar)) {
            return (T) bVar.getOrDefault(fVar, null);
        }
        return fVar.f36563a;
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f36567b.equals(((g) obj).f36567b);
        }
        return false;
    }

    @Override // y2.e
    public final int hashCode() {
        return this.f36567b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f36567b + '}';
    }
}
