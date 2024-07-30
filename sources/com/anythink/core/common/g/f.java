package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.e.an;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5900e = 1;

    /* renamed from: a, reason: collision with root package name */
    String f5901a;

    /* renamed from: b, reason: collision with root package name */
    int f5902b;

    /* renamed from: c, reason: collision with root package name */
    String f5903c;

    /* renamed from: d, reason: collision with root package name */
    int f5904d;
    private an f;

    private f(String str) {
        this.f5904d = 0;
        this.f5901a = str;
    }

    public static f b(String str) {
        return new f(str);
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f5901a;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        an anVar;
        if (1 == this.f5904d && ErrorCode.httpStatuException.equals(adError.getCode()) && (anVar = this.f) != null) {
            anVar.a(adError.getPlatformCode());
            this.f.b(adError.getPlatformMSG());
            com.anythink.core.common.j.c.a(this.f);
        }
    }

    private f(String str, int i10, String str2) {
        this(str);
        this.f5904d = 1;
        this.f5902b = i10;
        this.f5903c = str2;
    }

    public static f a(String str, int i10, String str2) {
        return new f(str, i10, str2);
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        an anVar;
        if (1 != this.f5904d || (anVar = this.f) == null) {
            return null;
        }
        anVar.a("200");
        com.anythink.core.common.j.c.a(this.f);
        return null;
    }

    public final void a(an anVar) {
        this.f = anVar;
    }
}
