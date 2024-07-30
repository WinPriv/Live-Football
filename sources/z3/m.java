package z3;

import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final w3.b f36953a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f36954b;

    public m(w3.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f36953a = bVar;
                this.f36954b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f36953a.equals(mVar.f36953a)) {
            return false;
        }
        return Arrays.equals(this.f36954b, mVar.f36954b);
    }

    public final int hashCode() {
        return ((this.f36953a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36954b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f36953a + ", bytes=[...]}";
    }
}
