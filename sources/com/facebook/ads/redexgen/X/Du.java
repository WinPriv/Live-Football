package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Du extends XR {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public Du(AnonymousClass59 anonymousClass59) {
        super(anonymousClass59);
    }

    @Override // com.facebook.ads.redexgen.X.XR, com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void A3s(String str) {
        if (this.A00.get() == null) {
            return;
        }
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        anonymousClass59.A0D(str);
        String A02 = EnumC1124Ov.A08.A02();
        String rewardedVideoError = EnumC1124Ov.A09.A02();
        if (str.equals(A02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XR, com.facebook.ads.redexgen.X.InterfaceC1029Lc
    public final void A3t(String str, C8M c8m) {
        super.A3t(str, c8m);
    }
}
