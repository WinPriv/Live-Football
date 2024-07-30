package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f24421a;

    public static DeviceCategory a() {
        int currentModeType = f24421a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f24421a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
