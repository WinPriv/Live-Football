package n5;

import java.util.Arrays;

/* compiled from: BaseUrl.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33352c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33353d;

    public b(int i10, int i11, String str, String str2) {
        this.f33350a = str;
        this.f33351b = str2;
        this.f33352c = i10;
        this.f33353d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f33352c == bVar.f33352c && this.f33353d == bVar.f33353d && i7.g.a(this.f33350a, bVar.f33350a) && i7.g.a(this.f33351b, bVar.f33351b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33350a, this.f33351b, Integer.valueOf(this.f33352c), Integer.valueOf(this.f33353d)});
    }
}
