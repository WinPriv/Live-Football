package v7;

import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f35992a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f35993b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f35992a = str;
        this.f35993b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f35992a.equals(cVar.f35992a) && this.f35993b.equals(cVar.f35993b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35993b.hashCode() + (this.f35992a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f35992a + ", properties=" + this.f35993b.values() + "}";
    }
}
