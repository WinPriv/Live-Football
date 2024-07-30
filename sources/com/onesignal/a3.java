package com.onesignal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OSTriggerController.java */
/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f26663a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f26664b = new ConcurrentHashMap<>();

    public a3(v0 v0Var) {
        this.f26663a = new m0(v0Var);
    }

    public static boolean a(Number number, Number number2, int i10) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    if (doubleValue2 > doubleValue) {
                        return true;
                    }
                    return false;
                case 1:
                    if (doubleValue2 < doubleValue) {
                        return true;
                    }
                    return false;
                case 2:
                    if (doubleValue2 == doubleValue) {
                        return true;
                    }
                    return false;
                case 3:
                    if (doubleValue2 != doubleValue) {
                        return true;
                    }
                    return false;
                case 4:
                    if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                        return true;
                    }
                    return false;
                case 5:
                    if (doubleValue2 > doubleValue || doubleValue2 == doubleValue) {
                        return true;
                    }
                    return false;
                case 6:
                case 7:
                case 8:
                    e3.b(3, "Attempted to use an invalid operator with a numeric value: ".concat(com.ironsource.adapters.facebook.a.f(i10)), null);
                    return false;
                default:
                    return false;
            }
        }
        throw null;
    }

    public static boolean b(String str, String str2, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    e3.b(3, "Attempted to use an invalid operator for a string trigger comparison: ".concat(com.ironsource.adapters.facebook.a.f(i10)), null);
                    return false;
                }
                return !str.equals(str2);
            }
            return str.equals(str2);
        }
        throw null;
    }
}
