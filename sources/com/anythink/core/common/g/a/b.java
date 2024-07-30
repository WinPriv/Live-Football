package com.anythink.core.common.g.a;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    String f5834a;

    /* renamed from: c, reason: collision with root package name */
    int f5836c;

    /* renamed from: k, reason: collision with root package name */
    private final String f5837k = "b";

    /* renamed from: b, reason: collision with root package name */
    boolean f5835b = true;

    public b(String str, int i10) {
        this.f5836c = 1;
        this.f5834a = str;
        if (i10 == 1000) {
            this.f5836c = 1;
        } else if (i10 == 1001) {
            this.f5836c = 2;
        }
    }

    @Override // com.anythink.core.common.g.a.c
    public final int c() {
        return this.f5836c;
    }

    @Override // com.anythink.core.common.g.a.c
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.g.a.c
    public final byte[] e() {
        if (!TextUtils.isEmpty(this.f5834a)) {
            return c.a(this.f5834a);
        }
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a.c
    public final boolean f() {
        return this.f5835b;
    }

    @Override // com.anythink.core.common.g.a.c
    public final void a(String str, String str2, String str3, int i10) {
    }
}
