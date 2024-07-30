package s7;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: Dependency.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final u<?> f35241a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35243c;

    public l(int i10, int i11, Class cls) {
        this((u<?>) u.a(cls), i10, i11);
    }

    public static l a(Class<?> cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f35241a.equals(lVar.f35241a) || this.f35242b != lVar.f35242b || this.f35243c != lVar.f35243c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f35241a.hashCode() ^ 1000003) * 1000003) ^ this.f35242b) * 1000003) ^ this.f35243c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f35241a);
        sb2.append(", type=");
        int i10 = this.f35242b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f35243c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(a3.l.i("Unsupported injection: ", i11));
                }
            } else {
                str2 = IronSourceConstants.EVENTS_PROVIDER;
            }
        } else {
            str2 = "direct";
        }
        return a3.l.p(sb2, str2, "}");
    }

    public l(u<?> uVar, int i10, int i11) {
        this.f35241a = uVar;
        this.f35242b = i10;
        this.f35243c = i11;
    }
}
