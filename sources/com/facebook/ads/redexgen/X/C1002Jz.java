package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1002Jz {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<C1002Jz> A02 = new ThreadLocal<>();
    public final C0986Ji A00 = new C0986Ji();

    public static C0986Ji A00() {
        return A02().A00;
    }

    public static C0986Ji A01(C1001Jy c1001Jy) {
        C0986Ji currentStackTraces = new C0986Ji(A00());
        currentStackTraces.add(c1001Jy);
        return currentStackTraces;
    }

    public static C1002Jz A02() {
        C1002Jz c1002Jz = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (c1002Jz == null) {
            C1002Jz c1002Jz2 = new C1002Jz();
            A02.set(c1002Jz2);
            return c1002Jz2;
        }
        return c1002Jz;
    }

    public static void A03(AbstractRunnableC0997Ju abstractRunnableC0997Ju) {
        C0986Ji A05 = abstractRunnableC0997Ju.A05();
        if (A05 != null) {
            C0986Ji createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A05);
        }
    }

    public static void A04(AbstractRunnableC0997Ju abstractRunnableC0997Ju) {
        C0986Ji A05 = abstractRunnableC0997Ju.A05();
        if (A05 != null) {
            C0986Ji createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(A05);
        }
    }
}
