package com.vungle.warren.utility;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.utility.ActivityManager;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public class ExternalRouter {
    public static final String TAG = "ExternalRouter";

    private static Intent getIntentFromUrl(String str, boolean z10) {
        Intent intent = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                intent = Intent.parseUri(str, 0);
            }
            if (intent != null && z10) {
                intent.setFlags(268435456);
            }
        } catch (URISyntaxException e10) {
            Log.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
        }
        return intent;
    }

    public static boolean launch(String str, String str2, Context context, ActivityManager.LeftApplicationCallback leftApplicationCallback, boolean z10, PresenterAdOpenCallback presenterAdOpenCallback) {
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || context == null) {
            return false;
        }
        try {
            ActivityManager.startWhenForeground(context, getIntentFromUrl(str, z10), getIntentFromUrl(str2, z10), leftApplicationCallback, presenterAdOpenCallback);
            return true;
        } catch (Exception e10) {
            String str3 = TAG;
            Log.e(str3, "Error while opening url" + e10.getLocalizedMessage());
            Log.d(str3, "Cannot open url " + str2);
            return false;
        }
    }
}
