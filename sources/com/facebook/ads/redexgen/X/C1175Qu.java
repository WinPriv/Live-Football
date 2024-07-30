package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Qu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1175Qu extends C4H<C1169Qo> {
    public int A00;
    public int A01;
    public int A02;

    @Nullable
    public InterfaceC1029Lc A03;
    public String A04;
    public List<OM> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AnonymousClass18 A07;
    public final C6G A08;
    public final C1316Wj A09;
    public final IT A0A;
    public final L6 A0B;
    public final C1176Qv A0C;
    public final IX A0D;
    public final C1137Pi A0E;

    public C1175Qu(C1316Wj c1316Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C6G c6g, C1137Pi c1137Pi, L6 l62, InterfaceC1029Lc interfaceC1029Lc, String str, C1176Qv c1176Qv, IX ix) {
        this.A09 = c1316Wj;
        this.A0A = it;
        this.A08 = c6g;
        this.A0E = c1137Pi;
        this.A0B = l62;
        this.A03 = interfaceC1029Lc;
        this.A07 = anonymousClass18;
        this.A05 = list;
        this.A04 = str;
        this.A0C = c1176Qv;
        this.A0D = ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    @Nullable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1169Qo A06(ViewGroup viewGroup, int i10) {
        InterfaceC1029Lc interfaceC1029Lc = this.A03;
        if (interfaceC1029Lc == null || this.A00 == 0) {
            return null;
        }
        return new C1169Qo(NA.A01(new NU(this.A09, this.A0A, interfaceC1029Lc, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1169Qo c1169Qo, int i10) {
        c1169Qo.A0l(this.A05.get(i10), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
    }
}
