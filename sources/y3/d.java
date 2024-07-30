package y3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final List<m> f36616a;

    public d(ArrayList arrayList) {
        this.f36616a = arrayList;
    }

    @Override // y3.j
    public final List<m> a() {
        return this.f36616a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f36616a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f36616a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f36616a + "}";
    }
}
