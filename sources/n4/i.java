package n4;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import k4.i0;

/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f33328a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f33329b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f33330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33331d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33332e;

    public i(String str, i0 i0Var, i0 i0Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        d6.a.a(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f33328a = str;
            i0Var.getClass();
            this.f33329b = i0Var;
            i0Var2.getClass();
            this.f33330c = i0Var2;
            this.f33331d = i10;
            this.f33332e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f33331d == iVar.f33331d && this.f33332e == iVar.f33332e && this.f33328a.equals(iVar.f33328a) && this.f33329b.equals(iVar.f33329b) && this.f33330c.equals(iVar.f33330c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33330c.hashCode() + ((this.f33329b.hashCode() + e0.i.b(this.f33328a, (((this.f33331d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f33332e) * 31, 31)) * 31);
    }
}
