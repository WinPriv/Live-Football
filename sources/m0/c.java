package m0;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f32635a;

    /* renamed from: b, reason: collision with root package name */
    public final S f32636b;

    public c(F f, S s10) {
        this.f32635a = f;
        this.f32636b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f32635a, this.f32635a) || !b.a(cVar.f32636b, this.f32636b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        F f = this.f32635a;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s10 = this.f32636b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f32635a + " " + this.f32636b + "}";
    }
}
