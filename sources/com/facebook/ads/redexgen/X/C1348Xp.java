package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1348Xp implements InterfaceC05973e {
    public final /* synthetic */ E0 A00;
    public final /* synthetic */ C3Z A01;

    public C1348Xp(E0 e02, C3Z c3z) {
        this.A00 = e02;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05973e
    public final Object A4D(int i10) {
        C3X compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05973e
    public final List<Object> A5M(String str, int i10) {
        List<C3X> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05973e
    public final Object A5N(int i10) {
        C3X compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05973e
    public final boolean AD2(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
