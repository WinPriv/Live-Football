package i7;

import javax.annotation.CheckForNull;

/* compiled from: Objects.java */
/* loaded from: classes2.dex */
public final class g {
    public static boolean a(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != str2.charAt(i10) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String c(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String d(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
