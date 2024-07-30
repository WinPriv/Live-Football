package i7;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: MoreObjects.java */
/* loaded from: classes2.dex */
public final class f {
    public static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(int i10, int i11) {
        String g6;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                g6 = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            g6 = g("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(g6);
    }

    public static void c(@CheckForNull Object obj, @CheckForNull String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void d(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(a(i10, i11, "index"));
        }
    }

    public static void e(int i10, int i11, int i12) {
        String a10;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                a10 = g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                a10 = a(i11, i12, "end index");
            }
        } else {
            a10 = a(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void f(boolean z10, @CheckForNull String str) {
        if (z10) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static String g(@CheckForNull String str, @CheckForNull Object... objArr) {
        int indexOf;
        String str2;
        String sb2;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb4);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + String.valueOf(sb4).length() + 9);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = str.indexOf("%s", i12)) != -1) {
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}
