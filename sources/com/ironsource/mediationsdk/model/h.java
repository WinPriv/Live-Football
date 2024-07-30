package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public e f25665a;

    /* renamed from: b, reason: collision with root package name */
    public long f25666b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<i> f25667c;

    /* renamed from: d, reason: collision with root package name */
    public i f25668d;

    /* renamed from: e, reason: collision with root package name */
    public int f25669e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f25670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25671h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25672i;

    /* renamed from: j, reason: collision with root package name */
    public long f25673j;

    public h() {
        this.f25665a = new e();
        this.f25667c = new ArrayList<>();
    }

    public final i a() {
        Iterator<i> it = this.f25667c.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f25668d;
    }

    public h(int i10, long j10, e eVar, int i11, com.ironsource.mediationsdk.utils.c cVar, int i12, boolean z10, boolean z11, long j11) {
        this.f25667c = new ArrayList<>();
        this.f25666b = j10;
        this.f25665a = eVar;
        this.f25669e = i11;
        this.f = i12;
        this.f25670g = cVar;
        this.f25671h = z10;
        this.f25672i = z11;
        this.f25673j = j11;
    }

    public final i a(String str) {
        Iterator<i> it = this.f25667c.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
