package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0903Ga extends IOException {
    public final int A00;
    public final GU A01;

    public C0903Ga(IOException iOException, GU gu, int i10) {
        super(iOException);
        this.A01 = gu;
        this.A00 = i10;
    }

    public C0903Ga(String str, GU gu, int i10) {
        super(str);
        this.A01 = gu;
        this.A00 = i10;
    }

    public C0903Ga(String str, IOException iOException, GU gu, int i10) {
        super(str, iOException);
        this.A01 = gu;
        this.A00 = i10;
    }
}
