package a4;

import java.util.Arrays;
import z3.n;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<n> f239a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f240b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f239a = iterable;
        this.f240b = bArr;
    }

    @Override // a4.f
    public final Iterable<n> a() {
        return this.f239a;
    }

    @Override // a4.f
    public final byte[] b() {
        return this.f240b;
    }

    public final boolean equals(Object obj) {
        byte[] b10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f239a.equals(fVar.a())) {
            if (fVar instanceof a) {
                b10 = ((a) fVar).f240b;
            } else {
                b10 = fVar.b();
            }
            if (Arrays.equals(this.f240b, b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f239a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f240b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f239a + ", extras=" + Arrays.toString(this.f240b) + "}";
    }
}
