package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.Owner;

/* loaded from: classes2.dex */
public enum ho implements hm {
    NATIVE(com.anythink.expressad.foundation.g.a.f.f9813a),
    JAVASCRIPT("javascript"),
    NONE("none");

    private static boolean Z;
    private final String B;

    /* renamed from: com.huawei.hms.ads.ho$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[ho.values().length];
            Code = iArr;
            try {
                iArr[ho.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[ho.JAVASCRIPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[ho.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Z = false;
        Z = hb.Code(hb.o);
    }

    ho(String str) {
        this.B = str;
    }

    public static Owner Code(ho hoVar) {
        if (!Z) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hoVar.ordinal()];
        if (i10 == 1) {
            return Owner.NATIVE;
        }
        if (i10 == 2) {
            return Owner.JAVASCRIPT;
        }
        if (i10 != 3) {
            return null;
        }
        return Owner.NONE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.B;
    }

    public static boolean Code() {
        return Z;
    }
}
