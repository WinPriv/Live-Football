package a3;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class f implements y2.e {

    /* renamed from: b, reason: collision with root package name */
    public final y2.e f113b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.e f114c;

    public f(y2.e eVar, y2.e eVar2) {
        this.f113b = eVar;
        this.f114c = eVar2;
    }

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        this.f113b.a(messageDigest);
        this.f114c.a(messageDigest);
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f113b.equals(fVar.f113b) || !this.f114c.equals(fVar.f114c)) {
            return false;
        }
        return true;
    }

    @Override // y2.e
    public final int hashCode() {
        return this.f114c.hashCode() + (this.f113b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f113b + ", signature=" + this.f114c + '}';
    }
}
