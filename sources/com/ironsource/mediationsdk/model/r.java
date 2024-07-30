package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<Placement> f25719a;

    /* renamed from: b, reason: collision with root package name */
    public e f25720b;

    /* renamed from: c, reason: collision with root package name */
    public int f25721c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25722d;

    /* renamed from: e, reason: collision with root package name */
    public int f25723e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f25724g;

    /* renamed from: h, reason: collision with root package name */
    public int f25725h;

    /* renamed from: i, reason: collision with root package name */
    public int f25726i;

    /* renamed from: j, reason: collision with root package name */
    public int f25727j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25728k;

    /* renamed from: l, reason: collision with root package name */
    public long f25729l;

    /* renamed from: m, reason: collision with root package name */
    public Placement f25730m;

    /* renamed from: n, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f25731n;

    public r() {
        this.f25719a = new ArrayList<>();
        this.f25720b = new e();
    }

    public final Placement a() {
        Iterator<Placement> it = this.f25719a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f25730m;
    }

    public r(int i10, boolean z10, int i11, int i12, int i13, e eVar, com.ironsource.mediationsdk.utils.c cVar, int i14, boolean z11, long j10) {
        this.f25719a = new ArrayList<>();
        this.f25721c = i10;
        this.f25722d = z10;
        this.f25723e = i11;
        this.f25725h = i12;
        this.f25720b = eVar;
        this.f25726i = i13;
        this.f25731n = cVar;
        this.f25727j = i14;
        this.f25728k = z11;
        this.f25729l = j10;
    }
}
