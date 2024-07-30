package com.anythink.core.common.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f5574a;

    /* renamed from: b, reason: collision with root package name */
    private String f5575b;

    /* renamed from: c, reason: collision with root package name */
    private int f5576c;

    public d(String str, String str2, int i10) {
        this.f5574a = str;
        this.f5575b = str2;
        this.f5576c = i10;
    }

    private String b() {
        return this.f5574a;
    }

    private int c() {
        return this.f5576c;
    }

    public final String a() {
        return this.f5575b;
    }

    public final boolean a(ai aiVar) {
        if (aiVar != null) {
            int i10 = aiVar.f5485a;
            if (i10 != 2) {
                return i10 == 3 && aiVar.c() == this.f5576c;
            }
            return aiVar.t().equals(this.f5574a);
        }
        return false;
    }
}
