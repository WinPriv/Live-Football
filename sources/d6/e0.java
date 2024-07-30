package d6;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: UriUtil.java */
/* loaded from: classes2.dex */
public final class e0 {
    public static int[] a(String str) {
        boolean z10;
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static String b(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb2.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    public static String c(String str, String str2) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a10 = a(str2);
        if (a10[0] != -1) {
            sb2.append(str2);
            b(sb2, a10[1], a10[2]);
            return sb2.toString();
        }
        int[] a11 = a(str);
        if (a10[3] == 0) {
            sb2.append((CharSequence) str, 0, a11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (a10[2] == 0) {
            sb2.append((CharSequence) str, 0, a11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i11 = a10[1];
        if (i11 != 0) {
            int i12 = a11[0] + 1;
            sb2.append((CharSequence) str, 0, i12);
            sb2.append(str2);
            return b(sb2, a10[1] + i12, i12 + a10[2]);
        }
        if (str2.charAt(i11) == '/') {
            sb2.append((CharSequence) str, 0, a11[1]);
            sb2.append(str2);
            int i13 = a11[1];
            return b(sb2, i13, a10[2] + i13);
        }
        int i14 = a11[0] + 2;
        int i15 = a11[1];
        if (i14 < i15 && i15 == a11[2]) {
            sb2.append((CharSequence) str, 0, i15);
            sb2.append('/');
            sb2.append(str2);
            int i16 = a11[1];
            return b(sb2, i16, a10[2] + i16 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, a11[2] - 1);
        if (lastIndexOf == -1) {
            i10 = a11[1];
        } else {
            i10 = lastIndexOf + 1;
        }
        sb2.append((CharSequence) str, 0, i10);
        sb2.append(str2);
        return b(sb2, a11[1], i10 + a10[2]);
    }

    public static Uri d(String str, String str2) {
        return Uri.parse(c(str, str2));
    }
}
