package com.ironsource.mediationsdk.model;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25697a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25698b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25699c;

    /* renamed from: d, reason: collision with root package name */
    public o f25700d;

    /* renamed from: e, reason: collision with root package name */
    public int f25701e;
    public int f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f25702a = true;

        /* renamed from: b, reason: collision with root package name */
        public boolean f25703b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f25704c = false;

        /* renamed from: d, reason: collision with root package name */
        public o f25705d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f25706e = 0;
        public int f = 0;

        public final a a(boolean z10, int i10) {
            this.f25704c = z10;
            this.f = i10;
            return this;
        }

        public final a a(boolean z10, o oVar, int i10) {
            this.f25703b = z10;
            if (oVar == null) {
                oVar = o.PER_DAY;
            }
            this.f25705d = oVar;
            this.f25706e = i10;
            return this;
        }

        public final n a() {
            return new n(this.f25702a, this.f25703b, this.f25704c, this.f25705d, this.f25706e, this.f);
        }
    }

    public n(boolean z10, boolean z11, boolean z12, o oVar, int i10, int i11) {
        this.f25697a = z10;
        this.f25698b = z11;
        this.f25699c = z12;
        this.f25700d = oVar;
        this.f25701e = i10;
        this.f = i11;
    }
}
