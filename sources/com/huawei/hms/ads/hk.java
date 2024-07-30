package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public enum hk implements hm {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    private static boolean B;

    /* renamed from: com.huawei.hms.ads.hk$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hk.values().length];
            Code = iArr;
            try {
                iArr[hk.VIDEO_CONTROLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hk.CLOSE_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[hk.NOT_VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[hk.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        B = false;
        B = hb.Code(hb.f21707m);
    }

    public static FriendlyObstructionPurpose Code(hk hkVar) {
        if (!B) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hkVar.ordinal()];
        if (i10 == 1) {
            return FriendlyObstructionPurpose.VIDEO_CONTROLS;
        }
        if (i10 == 2) {
            return FriendlyObstructionPurpose.CLOSE_AD;
        }
        if (i10 == 3) {
            return FriendlyObstructionPurpose.NOT_VISIBLE;
        }
        if (i10 != 4) {
            return null;
        }
        return FriendlyObstructionPurpose.OTHER;
    }

    public static boolean Code() {
        return B;
    }
}
