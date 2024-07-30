package ad;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f407s == cVar.f407s) {
                    if (this.f408t == cVar.f408t) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f407s * 31) + this.f408t;
    }

    public final boolean isEmpty() {
        if (this.f407s > this.f408t) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f407s + ".." + this.f408t;
    }
}
