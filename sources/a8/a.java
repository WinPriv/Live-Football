package a8;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes2.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f357a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f358b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f357a = str;
            this.f358b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // a8.m
    public final List<String> a() {
        return this.f358b;
    }

    @Override // a8.m
    public final String b() {
        return this.f357a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f357a.equals(mVar.b()) && this.f358b.equals(mVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f357a.hashCode() ^ 1000003) * 1000003) ^ this.f358b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f357a + ", usedDates=" + this.f358b + "}";
    }
}
