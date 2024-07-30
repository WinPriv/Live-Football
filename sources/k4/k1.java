package k4;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f30560b = new k1(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30561a;

    public k1(boolean z10) {
        this.f30561a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass() && this.f30561a == ((k1) obj).f30561a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f30561a ? 1 : 0;
    }
}
