package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected d f21854a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21855b;

    /* renamed from: c, reason: collision with root package name */
    private final c f21856c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21857d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f21858e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private final GrsBaseInfo f21859g;

    /* renamed from: h, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.c f21860h;

    public a(String str, int i10, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.f21855b = str;
        this.f21856c = cVar;
        this.f21857d = i10;
        this.f21858e = context;
        this.f = str2;
        this.f21859g = grsBaseInfo;
        this.f21860h = cVar2;
    }

    public Context a() {
        return this.f21858e;
    }

    public c b() {
        return this.f21856c;
    }

    public String c() {
        return this.f21855b;
    }

    public int d() {
        return this.f21857d;
    }

    public String e() {
        return this.f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.f21860h;
    }

    public Callable<d> g() {
        return new f(this.f21855b, this.f21857d, this.f21856c, this.f21858e, this.f, this.f21859g, this.f21860h);
    }
}
