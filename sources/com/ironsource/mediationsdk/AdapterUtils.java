package com.ironsource.mediationsdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes2.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Activity activity, int i10) {
        if (activity == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - activity is null, returning dpSize", 3);
            return i10;
        }
        return (int) TypedValue.applyDimension(1, i10, activity.getResources().getDisplayMetrics());
    }

    public static String getScreenSizeParams(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f10, f / f10);
        float f11 = displayMetrics.xdpi;
        float f12 = displayMetrics.widthPixels / f11;
        float f13 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return "smallestWidth = " + min + " diagonalInches = " + Math.sqrt((f13 * f13) + (f12 * f12)) + " smallScreenDpApi =  " + activity.getResources().getConfiguration().smallestScreenWidthDp;
    }

    public static boolean isLargeScreen(Activity activity) {
        if (activity == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - activity is null", 3);
            return false;
        }
        if (activity.getResources().getConfiguration().smallestScreenWidthDp < 600) {
            return false;
        }
        return true;
    }
}
