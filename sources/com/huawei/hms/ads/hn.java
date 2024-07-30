package com.huawei.hms.ads;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.iab.omid.library.huawei.adsession.ImpressionType;

/* loaded from: classes2.dex */
public enum hn implements hm {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(CallMraidJS.f7002c),
    AUDIBLE("audible"),
    OTHER("other");

    private static boolean D;
    private final String L;

    /* renamed from: com.huawei.hms.ads.hn$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hn.values().length];
            Code = iArr;
            try {
                iArr[hn.DEFINED_BY_JAVASCRIPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hn.UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[hn.LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[hn.BEGIN_TO_RENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Code[hn.ONE_PIXEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Code[hn.VIEWABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Code[hn.AUDIBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Code[hn.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        D = false;
        D = hb.Code(hb.f21708n);
    }

    hn(String str) {
        this.L = str;
    }

    public static ImpressionType Code(hn hnVar) {
        if (!D) {
            return null;
        }
        switch (AnonymousClass1.Code[hnVar.ordinal()]) {
            case 1:
                return ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return ImpressionType.UNSPECIFIED;
            case 3:
                return ImpressionType.LOADED;
            case 4:
                return ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return ImpressionType.ONE_PIXEL;
            case 6:
                return ImpressionType.VIEWABLE;
            case 7:
                return ImpressionType.AUDIBLE;
            case 8:
                return ImpressionType.OTHER;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.L;
    }

    public static boolean Code() {
        return D;
    }
}
