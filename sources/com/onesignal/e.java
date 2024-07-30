package com.onesignal;

import android.content.Context;
import android.os.Process;
import android.util.Log;

/* compiled from: AndroidSupportV4Compat.java */
/* loaded from: classes2.dex */
public final class e {
    public static int a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }
}
