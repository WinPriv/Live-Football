package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1204Rx extends C4H<C1169Qo> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1029Lc A03;
    public C1137Pi A04;
    public String A05;
    public List<OM> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C6G A09;
    public final C1316Wj A0A;
    public final IT A0B;
    public final C1228Sw A0C;
    public final L6 A0D;
    public final AnonymousClass96 A0E;
    public final IX A0F;

    public C1204Rx(C1316Wj c1316Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C1228Sw c1228Sw, InterfaceC1029Lc interfaceC1029Lc, String str, AnonymousClass96 anonymousClass96, @Nullable IX ix) {
        this.A0A = c1316Wj;
        this.A0B = it;
        this.A0C = c1228Sw;
        this.A09 = c1228Sw.A10();
        this.A04 = c1228Sw.A1A();
        this.A0D = c1228Sw.A19();
        this.A03 = interfaceC1029Lc;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A05 = str;
        this.A0E = anonymousClass96;
        this.A0F = ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1169Qo A06(ViewGroup viewGroup, int i10) {
        return new C1169Qo(NA.A00(new NU(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1169Qo c1169Qo, int i10) {
        OM om = this.A06.get(i10);
        c1169Qo.A0m(this.A04);
        c1169Qo.A0l(om, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A07();
        }
    }

    public final void A0G(C1137Pi c1137Pi) {
        this.A04 = c1137Pi;
    }
}
