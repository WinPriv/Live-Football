package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import ka.n7;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static t f22624d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22625e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22626a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22627b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public Map<String, String> f22628c;

    public t(Context context) {
        try {
            this.f22626a = context.getApplicationContext().getSharedPreferences("hiad_user_tags_sp", 0);
        } catch (Throwable th) {
            try {
                n7.h("UserTagSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
            } finally {
                this.f22626a = null;
            }
        }
    }

    public static t a(Context context) {
        t tVar;
        synchronized (f22625e) {
            if (f22624d == null) {
                f22624d = new t(context);
            }
            tVar = f22624d;
        }
        return tVar;
    }
}
