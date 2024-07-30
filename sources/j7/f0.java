package j7;

import javax.annotation.CheckForNull;

/* compiled from: Hashing.java */
/* loaded from: classes2.dex */
public final class f0 {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static int b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int c(@CheckForNull Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return b(hashCode);
    }
}
