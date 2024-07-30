package com.vungle.warren.model;

import m8.n;
import m8.p;
import m8.q;

/* loaded from: classes2.dex */
public class JsonUtil {
    public static boolean getAsBoolean(n nVar, String str, boolean z10) {
        if (hasNonNull(nVar, str)) {
            return nVar.j().s(str).e();
        }
        return z10;
    }

    public static int getAsInt(n nVar, String str, int i10) {
        if (hasNonNull(nVar, str)) {
            return nVar.j().s(str).h();
        }
        return i10;
    }

    public static q getAsObject(n nVar, String str) {
        if (hasNonNull(nVar, str)) {
            return nVar.j().s(str).j();
        }
        return null;
    }

    public static String getAsString(n nVar, String str, String str2) {
        if (hasNonNull(nVar, str)) {
            return nVar.j().s(str).m();
        }
        return str2;
    }

    public static boolean hasNonNull(n nVar, String str) {
        if (nVar == null || (nVar instanceof p) || !(nVar instanceof q)) {
            return false;
        }
        q j10 = nVar.j();
        if (!j10.v(str) || j10.s(str) == null) {
            return false;
        }
        n s10 = j10.s(str);
        s10.getClass();
        if (s10 instanceof p) {
            return false;
        }
        return true;
    }
}
