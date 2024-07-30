package com.huawei.hms.ads;

import com.iab.omid.library.huawei.adsession.media.InteractionType;

/* loaded from: classes2.dex */
public enum hr implements hm {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    private static boolean Z;
    String I;

    /* renamed from: com.huawei.hms.ads.hr$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[hr.values().length];
            Code = iArr;
            try {
                iArr[hr.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[hr.INVITATION_ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        Z = false;
        Z = hb.Code("com.iab.omid.library.huawei.adsession.media.InteractionType");
    }

    hr(String str) {
        this.I = str;
    }

    public static InteractionType Code(hr hrVar) {
        if (!Z) {
            return null;
        }
        int i10 = AnonymousClass1.Code[hrVar.ordinal()];
        if (i10 == 1) {
            return InteractionType.CLICK;
        }
        if (i10 != 2) {
            return null;
        }
        return InteractionType.INVITATION_ACCEPTED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.I;
    }

    public static boolean Code() {
        return Z;
    }
}
