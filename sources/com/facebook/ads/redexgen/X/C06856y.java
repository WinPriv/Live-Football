package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06856y extends C1063Ml {
    public int A00;
    public boolean A01;
    public final C8O<C6v> A02;
    public final C8O<C06836s> A03;
    public final C8O<KV> A04;
    public final C8O<C06826r> A05;
    public final C8O<C0992Jp> A06;
    public final C8O<C0987Jj> A07;
    public final C8O<C0984Jg> A08;
    public final C8O<JO> A09;
    public final C8O<JN> A0A;
    public final P1 A0B;
    public final K2 A0C;
    public final JP A0D;

    public C06856y(C1316Wj c1316Wj, IT it, P1 p12, String str) {
        this(c1316Wj, it, p12, new ArrayList(), str);
    }

    public C06856y(C1316Wj c1316Wj, IT it, P1 p12, String str, @Nullable Bundle bundle) {
        this(c1316Wj, it, p12, new ArrayList(), str, bundle, null);
    }

    public C06856y(C1316Wj c1316Wj, IT it, P1 p12, String str, @Nullable Map<String, String> extraParams) {
        this(c1316Wj, it, p12, new ArrayList(), str, null, extraParams);
    }

    public C06856y(C1316Wj c1316Wj, IT it, P1 p12, List<C2A> list, String str) {
        super(c1316Wj, it, p12, list, str, !p12.A0h(), new MC(c1316Wj, p12));
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.6z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(JQ jq) {
                C06856y.this.A0Z();
            }
        };
        this.A07 = new C1127Oy(this);
        this.A03 = new C1126Ox(this);
        this.A04 = new C1125Ow(this);
        this.A05 = new C1109Og(this);
        this.A02 = new OI(this);
        this.A06 = new OH(this);
        this.A09 = new C1079Nb(this);
        this.A0A = new NN(this);
        this.A08 = new P0(this);
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.71
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(K5 k52) {
                P1 p13;
                C06856y c06856y = C06856y.this;
                p13 = c06856y.A0B;
                c06856y.A00 = p13.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = p12;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C06856y(C1316Wj c1316Wj, IT it, P1 p12, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(c1316Wj, it, p12, list, str, !p12.A0h(), bundle, map, new MC(c1316Wj, p12));
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.6z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(JQ jq) {
                C06856y.this.A0Z();
            }
        };
        this.A07 = new C1127Oy(this);
        this.A03 = new C1126Ox(this);
        this.A04 = new C1125Ow(this);
        this.A05 = new C1109Og(this);
        this.A02 = new OI(this);
        this.A06 = new OH(this);
        this.A09 = new C1079Nb(this);
        this.A0A = new NN(this);
        this.A08 = new P0(this);
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.71
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(K5 k52) {
                P1 p13;
                C06856y c06856y = C06856y.this;
                p13 = c06856y.A0B;
                c06856y.A00 = p13.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = p12;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        C1128Oz c1128Oz = new C1128Oz(this);
        if (this.A0B.A0l()) {
            L8.A00(c1128Oz);
        } else {
            this.A0B.getStateHandler().post(c1128Oz);
        }
    }
}
