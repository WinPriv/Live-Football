package com.huawei.hms.ads;

/* loaded from: classes2.dex */
public abstract class jf {
    public static boolean B(String str) {
        Integer b10 = androidx.transition.n.b(14, 0, str);
        if (b10 == null || 1 != b10.intValue()) {
            return false;
        }
        return true;
    }

    public static int C(String str) {
        Integer b10 = androidx.transition.n.b(15, 0, str);
        if (b10 != null) {
            return b10.intValue();
        }
        return 1;
    }

    public static boolean Code(String str) {
        Integer b10 = androidx.transition.n.b(2, 0, str);
        if (b10 == null || b10.intValue() == 0) {
            return false;
        }
        return true;
    }

    public static int D(String str) {
        Integer b10 = androidx.transition.n.b(1, 1, str);
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }

    public static boolean F(String str) {
        Integer b10 = androidx.transition.n.b(0, 1, str);
        if (b10 == null || 1 != b10.intValue()) {
            return false;
        }
        return true;
    }

    public static boolean I(String str) {
        Integer b10 = androidx.transition.n.b(9, 0, str);
        if (b10 != null && 1 != b10.intValue()) {
            return false;
        }
        return true;
    }

    public static boolean L(String str) {
        Integer b10 = androidx.transition.n.b(2, 1, str);
        if (b10 != null && b10.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static int S(String str) {
        Integer b10 = androidx.transition.n.b(20, 0, str);
        if (b10 != null) {
            return b10.intValue();
        }
        return 1;
    }

    public static boolean V(String str) {
        Integer b10 = androidx.transition.n.b(0, 0, str);
        if (b10 != null && 1 != b10.intValue()) {
            return false;
        }
        return true;
    }

    public static boolean Z(String str) {
        Integer b10 = androidx.transition.n.b(12, 0, str);
        if (b10 == null || 1 != b10.intValue()) {
            return false;
        }
        return true;
    }

    public static int a(String str) {
        Integer b10 = androidx.transition.n.b(3, 1, str);
        if (b10 == null) {
            return 0;
        }
        return b10.intValue();
    }

    public static boolean b(String str) {
        Integer b10 = androidx.transition.n.b(4, 1, str);
        if (b10 != null && b10.intValue() == 1) {
            return true;
        }
        return false;
    }
}
