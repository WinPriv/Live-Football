package p4;

/* compiled from: SeekPoint.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f34354c = new v(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f34355a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34356b;

    public v(long j10, long j11) {
        this.f34355a = j10;
        this.f34356b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f34355a == vVar.f34355a && this.f34356b == vVar.f34356b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f34355a) * 31) + ((int) this.f34356b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f34355a);
        sb2.append(", position=");
        return a3.l.n(sb2, this.f34356b, "]");
    }
}
