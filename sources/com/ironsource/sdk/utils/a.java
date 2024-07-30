package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static a f26561g;

    /* renamed from: a, reason: collision with root package name */
    public String f26562a = h.h();

    /* renamed from: b, reason: collision with root package name */
    public String f26563b = h.g();

    /* renamed from: c, reason: collision with root package name */
    public String f26564c = h.i();

    /* renamed from: d, reason: collision with root package name */
    public String f26565d = h.e();

    /* renamed from: e, reason: collision with root package name */
    public int f26566e = h.f();
    public String f;

    public a(Context context) {
        this.f = h.i(context);
    }

    public static a a(Context context) {
        if (f26561g == null) {
            f26561g = new a(context);
        }
        return f26561g;
    }

    public static float b(Context context) {
        return h.l(context);
    }

    public static void a() {
        f26561g = null;
    }
}
