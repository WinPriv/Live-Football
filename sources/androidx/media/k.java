package androidx.media;

import android.text.TextUtils;

/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f2090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2092c;

    public k(String str, int i10, int i11) {
        this.f2090a = str;
        this.f2091b = i10;
        this.f2092c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        int i10 = this.f2092c;
        String str = this.f2090a;
        int i11 = this.f2091b;
        if (i11 >= 0 && kVar.f2091b >= 0) {
            if (TextUtils.equals(str, kVar.f2090a) && i11 == kVar.f2091b && i10 == kVar.f2092c) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(str, kVar.f2090a) && i10 == kVar.f2092c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m0.b.b(this.f2090a, Integer.valueOf(this.f2092c));
    }
}
