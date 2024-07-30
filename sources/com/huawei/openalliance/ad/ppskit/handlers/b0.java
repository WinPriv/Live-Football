package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import ka.n7;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static b0 f22505d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22506e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22507a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22508b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public List<String> f22509c;

    public b0(Context context) {
        try {
            this.f22507a = context.getApplicationContext().getSharedPreferences("hiad_audids", 0);
        } catch (Throwable th) {
            try {
                n7.h("AudIdSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
            } finally {
                this.f22507a = null;
            }
        }
    }

    public static b0 a(Context context) {
        b0 b0Var;
        synchronized (f22506e) {
            if (f22505d == null) {
                f22505d = new b0(context);
            }
            b0Var = f22505d;
        }
        return b0Var;
    }
}
