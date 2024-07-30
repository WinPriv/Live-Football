package com.anythink.core.common.k;

/* loaded from: classes.dex */
public final class r {
    private static String a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int abs = Math.abs(length2 - length);
        StringBuilder sb2 = new StringBuilder(str);
        for (int i10 = 0; i10 < abs; i10++) {
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
