package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class TV implements HM {
    public static String[] A05 = {"JbcDsPAiqgb9rsViVRKehTXv1iFS9Alt", "AfEyeuF2jCfkWNmIQlP22Iq9vQ5XDBZo", "cIPTiq2qkEqnYzKxb3sH3HOJO6VigB4N", "bIuwftDwBGArWYVN2grLSP1kPnHfbgfq", "1GGMxn0jatOJtlepcpEnLiyqpa0L6Zpp", "dBndgbsmlMbgteIClih73P1Nf1skDdlq", "kMZcBPwOEd1j6nxu2sFbdi5kLjNzhQnH", "M7tzCbQcNsxxyZ9EacAqZIMXmH340eiG"};
    public long A00;
    public long A01;
    public C9T A02 = C9T.A04;
    public boolean A03;
    public final H9 A04;

    public TV(H9 h92) {
        this.A04 = h92;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A57();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            long A7F = A7F();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            A02(A7F);
            this.A03 = false;
        }
    }

    public final void A02(long j10) {
        this.A01 = j10;
        if (this.A03) {
            this.A00 = this.A04.A57();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T A7C() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long A7F() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A57 = this.A04.A57();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
            long positionUs = this.A00;
            long j10 = A57 - positionUs;
            if (this.A02.A01 == 1.0f) {
                long A00 = AnonymousClass92.A00(j10);
                if (A05[3].charAt(4) != 'j') {
                    A05[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                    return elapsedSinceBaseMs + A00;
                }
                A05[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                return elapsedSinceBaseMs + A00;
            }
            long positionUs2 = this.A02.A00(j10);
            return elapsedSinceBaseMs + positionUs2;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T AEX(C9T c9t) {
        if (this.A03) {
            A02(A7F());
        }
        this.A02 = c9t;
        return c9t;
    }
}
