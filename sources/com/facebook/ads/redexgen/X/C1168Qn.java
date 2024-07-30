package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Qn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168Qn extends C4H<C1162Qh> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    @Nullable
    public InterfaceC1029Lc A04;
    public String A05;
    public List<OM> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C6G A09;
    public final C1316Wj A0A;
    public final IT A0B;
    public final L6 A0C;
    public final C1176Qv A0D;
    public final C1137Pi A0E;

    public C1168Qn(C1316Wj c1316Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C6G c6g, C1137Pi c1137Pi, L6 l62, InterfaceC1029Lc interfaceC1029Lc, String str, int i10, int i11, int i12, int i13, C1176Qv c1176Qv) {
        this.A0A = c1316Wj;
        this.A0B = it;
        this.A09 = c6g;
        this.A0E = c1137Pi;
        this.A0C = l62;
        this.A04 = interfaceC1029Lc;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A05 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0D = c1176Qv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1162Qh A06(ViewGroup viewGroup, int i10) {
        return new C1162Qh(C1086Ni.A00(new NU(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1162Qh c1162Qh, int i10) {
        c1162Qh.A0l(this.A06.get(i10), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
