package uc;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class b<A, B> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public final A f35845s;

    /* renamed from: t, reason: collision with root package name */
    public final B f35846t;

    public b(A a10, B b10) {
        this.f35845s = a10;
        this.f35846t = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (zc.d.a(this.f35845s, bVar.f35845s) && zc.d.a(this.f35846t, bVar.f35846t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        A a10 = this.f35845s;
        if (a10 == null) {
            hashCode = 0;
        } else {
            hashCode = a10.hashCode();
        }
        int i11 = hashCode * 31;
        B b10 = this.f35846t;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f35845s + ", " + this.f35846t + ')';
    }
}
