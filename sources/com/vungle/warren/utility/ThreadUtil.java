package com.vungle.warren.utility;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class ThreadUtil {
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    public static boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public static void runOnUiThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }
}
