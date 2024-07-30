package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.media.Position;
import com.vungle.warren.model.Advertisement;

/* loaded from: classes2.dex */
public enum ht implements hm {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL(Advertisement.KEY_POSTROLL),
    STANDALONE("standalone");

    private static boolean B;
    private final String C;

    /* renamed from: com.huawei.hms.ads.ht$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[ht.values().length];
            Code = iArr;
            try {
                iArr[ht.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[ht.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[ht.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[ht.STANDALONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        B = false;
        B = hb.Code("com.iab.omid.library.huawei.adsession.media.Position");
    }

    ht(String str) {
        this.C = str;
    }

    public static Position Code(ht htVar) {
        if (!B) {
            return null;
        }
        int i10 = AnonymousClass1.Code[htVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return Position.PREROLL;
        }
        if (i10 == 3) {
            return Position.POSTROLL;
        }
        if (i10 != 4) {
            return null;
        }
        return Position.STANDALONE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.C;
    }

    public static boolean Code() {
        return B;
    }
}
