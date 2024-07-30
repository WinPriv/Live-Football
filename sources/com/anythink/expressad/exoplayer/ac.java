package com.anythink.expressad.exoplayer;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f7261a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f7262b;

    /* renamed from: c, reason: collision with root package name */
    public static final ac f7263c;

    /* renamed from: d, reason: collision with root package name */
    public static final ac f7264d;

    /* renamed from: e, reason: collision with root package name */
    public static final ac f7265e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7266g;

    static {
        ac acVar = new ac(0L, 0L);
        f7261a = acVar;
        f7262b = new ac(Long.MAX_VALUE, Long.MAX_VALUE);
        f7263c = new ac(Long.MAX_VALUE, 0L);
        f7264d = new ac(0L, Long.MAX_VALUE);
        f7265e = acVar;
    }

    public ac(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.a(z10);
        com.anythink.expressad.exoplayer.k.a.a(j11 >= 0);
        this.f = j10;
        this.f7266g = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ac.class == obj.getClass()) {
            ac acVar = (ac) obj;
            if (this.f == acVar.f && this.f7266g == acVar.f7266g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f) * 31) + ((int) this.f7266g);
    }
}
