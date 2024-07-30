package k8;

import a3.l;
import javax.annotation.Nonnull;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30892b;

    public a(String str, String str2) {
        if (str != null) {
            this.f30891a = str;
            if (str2 != null) {
                this.f30892b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // k8.d
    @Nonnull
    public final String a() {
        return this.f30891a;
    }

    @Override // k8.d
    @Nonnull
    public final String b() {
        return this.f30892b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f30891a.equals(dVar.a()) && this.f30892b.equals(dVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30891a.hashCode() ^ 1000003) * 1000003) ^ this.f30892b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f30891a);
        sb2.append(", version=");
        return l.p(sb2, this.f30892b, "}");
    }
}
