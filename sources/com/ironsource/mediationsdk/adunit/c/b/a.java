package com.ironsource.mediationsdk.adunit.c.b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0328a f25185a;

    /* renamed from: b, reason: collision with root package name */
    public long f25186b;

    /* renamed from: c, reason: collision with root package name */
    public long f25187c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0328a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(EnumC0328a enumC0328a, long j10, long j11) {
        this.f25185a = enumC0328a;
        this.f25186b = j10;
        this.f25187c = j11;
    }

    public final boolean a() {
        EnumC0328a enumC0328a = this.f25185a;
        if (enumC0328a != EnumC0328a.MANUAL && enumC0328a != EnumC0328a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        EnumC0328a enumC0328a = this.f25185a;
        if (enumC0328a != EnumC0328a.AUTOMATIC_LOAD_AFTER_CLOSE && enumC0328a != EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW) {
            return false;
        }
        return true;
    }
}
