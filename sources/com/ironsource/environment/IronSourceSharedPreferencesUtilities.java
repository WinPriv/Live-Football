package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class IronSourceSharedPreferencesUtilities {
    public static String getDefaultSharedPrefName(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + "_preferences";
    }

    public static int getIntFromDefaultSharedPrefs(Context context, String str, int i10) {
        String defaultSharedPrefName = getDefaultSharedPrefName(context, "");
        if (context == null) {
            return i10;
        }
        return context.getSharedPreferences(defaultSharedPrefName, 0).getInt(str, i10);
    }

    public static String getStringFromDefaultSharedPrefs(Context context, String str, String str2) {
        return getStringFromSharedPrefs(context, getDefaultSharedPrefName(context, ""), str, str2);
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2, String str3) {
        if (context == null) {
            return str3;
        }
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveIntToSharedPrefs(Context context, String str, String str2, int i10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i10);
        edit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
