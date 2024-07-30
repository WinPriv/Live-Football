package ia;

import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public d f29441a = d.IDLE;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f29442b = new byte[0];

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29443a;

        static {
            int[] iArr = new int[d.values().length];
            f29443a = iArr;
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29443a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29443a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29443a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f29442b) {
            int i10 = a.f29443a[this.f29441a.ordinal()];
            z10 = true;
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean b(d dVar) {
        boolean z10;
        synchronized (this.f29442b) {
            if (this.f29441a == dVar) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c(d dVar) {
        synchronized (this.f29442b) {
            if (this.f29441a != d.END) {
                ex.V("MediaState", "switchToState: %s", dVar);
                this.f29441a = dVar;
            }
        }
    }

    public final boolean d(d dVar) {
        return !b(dVar);
    }

    public final String toString() {
        String dVar;
        synchronized (this.f29442b) {
            dVar = this.f29441a.toString();
        }
        return dVar;
    }
}
