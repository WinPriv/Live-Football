package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.ErrorType;

/* loaded from: classes2.dex */
public enum hj implements hm {
    GENERIC("generic"),
    VIDEO("video");

    private static final boolean I = hb.Code(hb.f21706l);
    private final String Z;

    /* renamed from: com.huawei.hms.ads.hj$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hj.values().length];
            Code = iArr;
            try {
                iArr[hj.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hj.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    hj(String str) {
        this.Z = str;
    }

    public static ErrorType Code(hj hjVar) {
        if (!I) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hjVar.ordinal()];
        if (i10 == 1) {
            return ErrorType.GENERIC;
        }
        if (i10 != 2) {
            return null;
        }
        return ErrorType.VIDEO;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.Z;
    }

    public static boolean Code() {
        return I;
    }
}
