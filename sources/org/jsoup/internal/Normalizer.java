package org.jsoup.internal;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class Normalizer {
    public static String lowerCase(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }

    public static String normalize(String str, boolean z10) {
        return z10 ? lowerCase(str) : normalize(str);
    }
}
