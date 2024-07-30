package com.vungle.warren.utility;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public class VungleUrlUtility {
    private static final String TAG = "VungleUrlUtility";

    public static boolean isVungleUrl(String str) {
        try {
            return new URL(str).getHost().toLowerCase().contains(".vungle.com");
        } catch (MalformedURLException e10) {
            Log.e(TAG, e10.getMessage());
            return false;
        }
    }
}
