package com.huawei.hms.ads;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.iab.omid.library.huawei.adsession.media.PlayerState;

/* loaded from: classes2.dex */
public enum hx implements hm {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(CallMraidJS.f7005g),
    FULLSCREEN("fullscreen");

    private static boolean C;
    private final String S;

    /* renamed from: com.huawei.hms.ads.hx$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hx.values().length];
            Code = iArr;
            try {
                iArr[hx.MINIMIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hx.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[hx.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[hx.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Code[hx.FULLSCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        C = false;
        C = hb.Code("com.iab.omid.library.huawei.adsession.media.PlayerState");
    }

    hx(String str) {
        this.S = str;
    }

    public static PlayerState Code(hx hxVar) {
        if (!C) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hxVar.ordinal()];
        if (i10 == 1) {
            return PlayerState.MINIMIZED;
        }
        if (i10 == 2) {
            return PlayerState.COLLAPSED;
        }
        if (i10 == 3) {
            return PlayerState.NORMAL;
        }
        if (i10 == 4) {
            return PlayerState.EXPANDED;
        }
        if (i10 != 5) {
            return null;
        }
        return PlayerState.FULLSCREEN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.S;
    }

    public static boolean Code() {
        return C;
    }
}
