package com.anythink.expressad.out;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10467a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10468b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10469c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10470d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10471e = 5;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f10472g;

    public i(int i10, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            this.f = i11;
                            this.f10472g = 0;
                            return;
                        }
                        return;
                    }
                    this.f = 50;
                    this.f10472g = 320;
                    return;
                }
                if (com.anythink.expressad.foundation.h.k.f(com.anythink.core.common.b.n.a().g()) < 720) {
                    this.f = 50;
                    this.f10472g = 320;
                    return;
                } else {
                    this.f = 90;
                    this.f10472g = 728;
                    return;
                }
            }
            this.f = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
            this.f10472g = 300;
            return;
        }
        this.f = 90;
        this.f10472g = 320;
    }

    private void c() {
        if (com.anythink.expressad.foundation.h.k.f(com.anythink.core.common.b.n.a().g()) < 720) {
            this.f = 50;
            this.f10472g = 320;
        } else {
            this.f = 90;
            this.f10472g = 728;
        }
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.f10472g;
    }
}
