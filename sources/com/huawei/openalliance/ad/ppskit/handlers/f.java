package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static f f22531c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22532d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22533a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final Context f22534b;

    public f(Context context) {
        this.f22534b = context.getApplicationContext().createDeviceProtectedStorageContext();
    }

    public static f a(Context context) {
        f fVar;
        synchronized (f22532d) {
            if (f22531c == null) {
                f22531c = new f(context);
            }
            fVar = f22531c;
        }
        return fVar;
    }

    public final SharedPreferences b() {
        return this.f22534b.getSharedPreferences("hiad_report", 4);
    }
}
