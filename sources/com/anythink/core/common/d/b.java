package com.anythink.core.common.d;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    protected static volatile a f5383c;

    private b(Context context) {
        super(context);
        this.f5382b = 2;
    }

    public static a a(Context context) {
        if (f5383c == null) {
            synchronized (a.class) {
                if (f5383c == null) {
                    f5383c = new b(context);
                }
            }
        }
        return f5383c;
    }
}
