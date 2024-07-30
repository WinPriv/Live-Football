package com.anythink.expressad.foundation.h;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10225a = "StringUtils";

    public static boolean a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return true;
        }
        return false;
    }
}
