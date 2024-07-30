package org.jsoup.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;

/* loaded from: classes2.dex */
public final class StringUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f33947a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f33948b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f33949c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f33950d = Pattern.compile("[\\x00-\\x1f]*");

    /* renamed from: e, reason: collision with root package name */
    public static final a f33951e = new a();

    /* loaded from: classes2.dex */
    public static class StringJoiner {

        /* renamed from: b, reason: collision with root package name */
        public final String f33953b;

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public StringBuilder f33952a = StringUtil.borrowBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f33954c = true;

        public StringJoiner(String str) {
            this.f33953b = str;
        }

        public StringJoiner add(Object obj) {
            Validate.notNull(this.f33952a);
            if (!this.f33954c) {
                this.f33952a.append(this.f33953b);
            }
            this.f33952a.append(obj);
            this.f33954c = false;
            return this;
        }

        public StringJoiner append(Object obj) {
            Validate.notNull(this.f33952a);
            this.f33952a.append(obj);
            return this;
        }

        public String complete() {
            String releaseBuilder = StringUtil.releaseBuilder(this.f33952a);
            this.f33952a = null;
            return releaseBuilder;
        }
    }

    /* loaded from: classes2.dex */
    public class a extends ThreadLocal<Stack<StringBuilder>> {
        @Override // java.lang.ThreadLocal
        public final Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    public static void appendNormalisedWhitespace(StringBuilder sb2, String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (isActuallyWhitespace(codePointAt)) {
                if ((!z10 || z11) && !z12) {
                    sb2.append(' ');
                    z12 = true;
                }
            } else if (!isInvisibleChar(codePointAt)) {
                sb2.appendCodePoint(codePointAt);
                z12 = false;
                z11 = true;
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder borrowBuilder() {
        Stack<StringBuilder> stack = f33951e.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return stack.pop();
    }

    public static boolean in(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean inSorted(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isActuallyWhitespace(int i10) {
        if (i10 != 32 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 160) {
            return false;
        }
        return true;
    }

    public static boolean isAscii(String str) {
        Validate.notNull(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (!isWhitespace(str.codePointAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInvisibleChar(int i10) {
        if (i10 != 8203 && i10 != 173) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.codePointAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(int i10) {
        if (i10 != 32 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13) {
            return false;
        }
        return true;
    }

    public static String join(Collection<?> collection, String str) {
        return join(collection.iterator(), str);
    }

    public static String normaliseWhitespace(String str) {
        StringBuilder borrowBuilder = borrowBuilder();
        appendNormalisedWhitespace(borrowBuilder, str, false);
        return releaseBuilder(borrowBuilder);
    }

    public static String padding(int i10) {
        return padding(i10, 30);
    }

    public static String releaseBuilder(StringBuilder sb2) {
        Validate.notNull(sb2);
        String sb3 = sb2.toString();
        if (sb2.length() > 8192) {
            sb2 = new StringBuilder(8192);
        } else {
            sb2.delete(0, sb2.length());
        }
        Stack<StringBuilder> stack = f33951e.get();
        stack.push(sb2);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb3;
    }

    public static String resolve(String str, String str2) {
        Pattern pattern = f33950d;
        String replaceAll = pattern.matcher(str).replaceAll("");
        String replaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return resolve(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(replaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f33949c.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    public static boolean startsWithNewline(String str) {
        if (str == null || str.length() == 0 || str.charAt(0) != '\n') {
            return false;
        }
        return true;
    }

    public static String join(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        stringJoiner.add(obj);
        while (it.hasNext()) {
            stringJoiner.add(it.next());
        }
        return stringJoiner.complete();
    }

    public static String padding(int i10, int i11) {
        Validate.isTrue(i10 >= 0, "width must be >= 0");
        Validate.isTrue(i11 >= -1);
        if (i11 != -1) {
            i10 = Math.min(i10, i11);
        }
        if (i10 < 21) {
            return f33947a[i10];
        }
        char[] cArr = new char[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            cArr[i12] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static URL resolve(URL url, String str) throws MalformedURLException {
        String replaceAll = f33950d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = f33948b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(replaceFirst, "#");
            l10.append(url2.getRef());
            replaceFirst = l10.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    public static String join(String[] strArr, String str) {
        return join(Arrays.asList(strArr), str);
    }
}
