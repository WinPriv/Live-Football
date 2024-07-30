package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.vungle.warren.model.Advertisement;

/* loaded from: classes2.dex */
public enum hy implements hm {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");

    private static boolean B;
    private final String C;

    /* renamed from: com.huawei.hms.ads.hy$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hy.values().length];
            Code = iArr;
            try {
                iArr[hy.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hy.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[hy.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[hy.STANDALONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        B = false;
        B = hb.Code("com.iab.omid.library.huawei.adsession.media.Position");
    }

    hy(String str) {
        this.C = str;
    }

    public static Position Code(hy hyVar) {
        if (!B) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hyVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                return Position.POSTROLL;
            }
            if (i10 != 4) {
                return null;
            }
            return Position.STANDALONE;
        }
        return Position.PREROLL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.C;
    }

    public static boolean Code() {
        return B;
    }
}
