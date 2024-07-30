package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes2.dex */
public final class o {
    public static o f;

    /* renamed from: a, reason: collision with root package name */
    public int f25948a;

    /* renamed from: b, reason: collision with root package name */
    public int f25949b;

    /* renamed from: c, reason: collision with root package name */
    public int f25950c = 1;

    /* renamed from: d, reason: collision with root package name */
    public int f25951d;

    /* renamed from: e, reason: collision with root package name */
    public final com.ironsource.sdk.g.d f25952e;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25953a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f25953a = iArr;
            try {
                iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25953a[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25953a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25953a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private o() {
        this.f25948a = 1;
        this.f25949b = 1;
        this.f25951d = 1;
        com.ironsource.sdk.g.d dVar = new com.ironsource.sdk.g.d();
        this.f25952e = dVar;
        int i10 = this.f25948a;
        this.f25948a = i10;
        dVar.b(i10);
        int i11 = this.f25949b;
        this.f25949b = i11;
        dVar.a(i11);
        int i12 = this.f25951d;
        this.f25951d = i12;
        dVar.c(i12);
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (f == null) {
                f = new o();
            }
            oVar = f;
        }
        return oVar;
    }

    public final synchronized int b(int i10) {
        IronSource.AD_UNIT ad_unit;
        if (i10 == 0) {
            ad_unit = IronSource.AD_UNIT.OFFERWALL;
        } else if (i10 == 1) {
            ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        } else if (i10 != 2) {
            ad_unit = i10 != 3 ? null : IronSource.AD_UNIT.BANNER;
        } else {
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return b(ad_unit);
    }

    public final synchronized void a(int i10) {
        IronSource.AD_UNIT ad_unit;
        if (i10 == 0) {
            ad_unit = IronSource.AD_UNIT.OFFERWALL;
        } else if (i10 == 1) {
            ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        } else if (i10 != 2) {
            ad_unit = i10 != 3 ? null : IronSource.AD_UNIT.BANNER;
        } else {
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        a(ad_unit);
    }

    public final synchronized int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i10 = a.f25953a[ad_unit.ordinal()];
        if (i10 == 1) {
            return this.f25950c;
        }
        if (i10 == 2) {
            return this.f25948a;
        }
        if (i10 == 3) {
            return this.f25949b;
        }
        if (i10 != 4) {
            return -1;
        }
        return this.f25951d;
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        int i10 = a.f25953a[ad_unit.ordinal()];
        if (i10 == 1) {
            this.f25950c++;
            return;
        }
        if (i10 == 2) {
            int i11 = this.f25948a + 1;
            this.f25948a = i11;
            this.f25952e.b(i11);
        } else if (i10 == 3) {
            int i12 = this.f25949b + 1;
            this.f25949b = i12;
            this.f25952e.a(i12);
        } else {
            if (i10 == 4) {
                int i13 = this.f25951d + 1;
                this.f25951d = i13;
                this.f25952e.c(i13);
            }
        }
    }
}
