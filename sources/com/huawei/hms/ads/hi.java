package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.CreativeType;

/* loaded from: classes2.dex */
public enum hi implements hm {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(com.anythink.expressad.exoplayer.k.o.f9069b);

    private static boolean C;
    private final String S;

    /* renamed from: com.huawei.hms.ads.hi$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hi.values().length];
            Code = iArr;
            try {
                iArr[hi.DEFINED_BY_JAVASCRIPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hi.HTML_DISPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[hi.NATIVE_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[hi.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Code[hi.AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        C = false;
        C = hb.Code(hb.f21705k);
    }

    hi(String str) {
        this.S = str;
    }

    public static CreativeType Code(hi hiVar) {
        if (!C) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hiVar.ordinal()];
        if (i10 == 1) {
            return CreativeType.DEFINED_BY_JAVASCRIPT;
        }
        if (i10 == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i10 == 3) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i10 == 4) {
            return CreativeType.VIDEO;
        }
        if (i10 != 5) {
            return null;
        }
        return CreativeType.AUDIO;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.S;
    }

    public static boolean Code() {
        return C;
    }
}
