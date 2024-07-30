package w3;

import a3.l;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f36071a;

    public b(String str) {
        if (str != null) {
            this.f36071a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f36071a.equals(((b) obj).f36071a);
    }

    public final int hashCode() {
        return this.f36071a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l.p(new StringBuilder("Encoding{name=\""), this.f36071a, "\"}");
    }
}
