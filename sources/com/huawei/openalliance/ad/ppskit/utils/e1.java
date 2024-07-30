package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import java.lang.reflect.Method;
import ka.n7;

/* loaded from: classes2.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f22840a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22841b;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f22841b = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f22840a = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            n7.j("MIdentifierManager", "reflect exception, %s", e10.getClass().getSimpleName());
        }
    }
}
