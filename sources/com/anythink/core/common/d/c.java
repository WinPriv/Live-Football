package com.anythink.core.common.d;

import android.content.Context;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f5384c;

    private c(Context context) {
        super(context);
        this.f5382b = 1;
    }

    public static c a(Context context) {
        if (f5384c == null) {
            synchronized (c.class) {
                if (f5384c == null) {
                    f5384c = new c(context);
                }
            }
        }
        return f5384c;
    }
}
