package a2;

/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f44a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45b;

    public g(String str, int i10) {
        this.f44a = str;
        this.f45b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f45b != gVar.f45b) {
            return false;
        }
        return this.f44a.equals(gVar.f44a);
    }

    public final int hashCode() {
        return (this.f44a.hashCode() * 31) + this.f45b;
    }
}
