package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class e2 {
    public static float a(int i10, Context context) {
        return i10 * b(context).density;
    }

    public static DisplayMetrics b(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }
}
