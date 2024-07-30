package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<InterstitialPlacement> f25679a;

    /* renamed from: b, reason: collision with root package name */
    public e f25680b;

    /* renamed from: c, reason: collision with root package name */
    public int f25681c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25682d;

    /* renamed from: e, reason: collision with root package name */
    public int f25683e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public String f25684g;

    /* renamed from: h, reason: collision with root package name */
    public String f25685h;

    /* renamed from: i, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f25686i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25687j;

    /* renamed from: k, reason: collision with root package name */
    public long f25688k;

    /* renamed from: l, reason: collision with root package name */
    public InterstitialPlacement f25689l;

    public k() {
        this.f25679a = new ArrayList<>();
        this.f25680b = new e();
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f25679a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f25689l;
    }

    public k(int i10, boolean z10, int i11, e eVar, com.ironsource.mediationsdk.utils.c cVar, int i12, boolean z11, long j10) {
        this.f25679a = new ArrayList<>();
        this.f25681c = i10;
        this.f25682d = z10;
        this.f25683e = i11;
        this.f25680b = eVar;
        this.f25686i = cVar;
        this.f = i12;
        this.f25687j = z11;
        this.f25688k = j10;
    }
}
