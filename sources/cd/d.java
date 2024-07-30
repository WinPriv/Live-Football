package cd;

/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public class d extends c {
    public static String Z0(String str) {
        zc.d.d(str, "<this>");
        zc.d.d(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            zc.d.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
