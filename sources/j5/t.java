package j5;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: MediaPeriodId.java */
/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29837c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29839e;

    public t(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public final boolean a() {
        if (this.f29836b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f29835a.equals(tVar.f29835a) && this.f29836b == tVar.f29836b && this.f29837c == tVar.f29837c && this.f29838d == tVar.f29838d && this.f29839e == tVar.f29839e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f29835a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29836b) * 31) + this.f29837c) * 31) + ((int) this.f29838d)) * 31) + this.f29839e;
    }

    public t(t tVar) {
        this.f29835a = tVar.f29835a;
        this.f29836b = tVar.f29836b;
        this.f29837c = tVar.f29837c;
        this.f29838d = tVar.f29838d;
        this.f29839e = tVar.f29839e;
    }

    public t(Object obj, int i10, int i11, long j10, int i12) {
        this.f29835a = obj;
        this.f29836b = i10;
        this.f29837c = i11;
        this.f29838d = j10;
        this.f29839e = i12;
    }
}
