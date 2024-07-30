package g2;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class f0<V> {

    /* renamed from: a, reason: collision with root package name */
    public final V f28396a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f28397b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(h hVar) {
        this.f28396a = hVar;
        this.f28397b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        V v3 = this.f28396a;
        if (v3 != null && v3.equals(f0Var.f28396a)) {
            return true;
        }
        Throwable th = this.f28397b;
        if (th == null || f0Var.f28397b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28396a, this.f28397b});
    }

    public f0(Throwable th) {
        this.f28397b = th;
        this.f28396a = null;
    }
}
