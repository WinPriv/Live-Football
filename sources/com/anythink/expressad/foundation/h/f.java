package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static String f10120a = "DomainSameSDKTool";

    private static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            o.b(f10120a, th.getMessage(), th);
            return false;
        }
    }
}
