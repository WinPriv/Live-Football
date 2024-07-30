package com.anythink.expressad.foundation.h;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;
import java.util.Set;

/* loaded from: classes.dex */
public final class x {
    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return Uri.parse(str).getQueryParameterNames().size();
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("n_logo=0")) {
                    return str;
                }
                Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() != 0) {
                    return str.concat("&n_logo=0");
                }
                return str.concat("?n_logo=0");
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
