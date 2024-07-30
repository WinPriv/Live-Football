package lc;

import a3.l;

/* loaded from: classes2.dex */
public final class c implements Comparable<c> {

    /* renamed from: s, reason: collision with root package name */
    public String f32601s;

    /* renamed from: t, reason: collision with root package name */
    public String f32602t;

    /* renamed from: u, reason: collision with root package name */
    public long f32603u;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
        if (this.f32603u > cVar.f32603u) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && (this == obj || this.f32601s.equals(((c) obj).f32601s))) {
            return true;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        try {
            return Integer.parseInt(this.f32601s);
        } catch (Throwable th) {
            th.printStackTrace();
            return super.hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c.class.getSimpleName());
        sb2.append(" [ id: ");
        sb2.append(this.f32601s);
        sb2.append(", value: ");
        sb2.append(this.f32602t);
        sb2.append(", timeStamp: ");
        return l.n(sb2, this.f32603u, " ]");
    }
}
