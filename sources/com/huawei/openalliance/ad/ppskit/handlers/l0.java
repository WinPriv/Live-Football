package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l0 f22606c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22607d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22608a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final Context f22609b;

    public l0(Context context) {
        this.f22609b = context.createDeviceProtectedStorageContext();
    }

    public static l0 a(Context context) {
        if (f22606c == null) {
            synchronized (f22607d) {
                if (f22606c == null) {
                    f22606c = new l0(context);
                }
            }
        }
        return f22606c;
    }
}
