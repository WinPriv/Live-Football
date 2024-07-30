package com.huawei.hms.framework.common.grs;

import com.huawei.hms.framework.common.StringUtils;
import com.ironsource.adapters.facebook.a;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GrsUtils {
    private static final int GRS_KEY_INDEX = 1;
    private static final int GRS_PATH_INDEX = 2;
    private static final String GRS_SCHEMA = "grs://";
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 3;
    private static final String SEPARATOR = "/";

    public static String fixResult(String[] strArr, String str) {
        if (strArr.length > 2) {
            if (str.endsWith(SEPARATOR)) {
                StringBuilder j10 = a.j(str);
                j10.append(strArr[2]);
                return j10.toString();
            }
            StringBuilder l10 = a.l(str, SEPARATOR);
            l10.append(strArr[2]);
            return l10.toString();
        }
        return str;
    }

    public static boolean isGRSSchema(String str) {
        if (str != null && str.startsWith(GRS_SCHEMA)) {
            return true;
        }
        return false;
    }

    public static String[] parseGRSSchema(String str) {
        String[] split = StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf(GRS_SCHEMA) + 6).split(SEPARATOR, 3);
        if (split.length == 1) {
            return new String[]{split[0], "ROOT"};
        }
        return split;
    }

    public static String[] parseParams(String str) {
        if (str.endsWith(SEPARATOR)) {
            str = StringUtils.substring(str, str.indexOf(GRS_SCHEMA), str.length() - 1);
        }
        return parseGRSSchema(str);
    }
}
