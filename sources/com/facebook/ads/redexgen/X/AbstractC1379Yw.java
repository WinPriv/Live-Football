package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1379Yw extends C4H<SN> {
    public static final int A05 = (int) (Kd.A02 * 4.0f);

    @Nullable
    public AnonymousClass17 A00;
    public final List<C1228Sw> A01;
    public final int A02;
    public final C1316Wj A03;

    @DoNotStrip
    public final AbstractC1136Ph A04 = new C1381Yy(this);

    public AbstractC1379Yw(C1A c1a, List<C1228Sw> list, C1316Wj c1316Wj) {
        this.A03 = c1316Wj;
        this.A02 = c1a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        marginLayoutParams.setMargins(i11, 0, i10 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        C1228Sw c1228Sw = this.A01.get(i10);
        C0970Ir adCoverImage = c1228Sw.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1195Ro A04 = new AsyncTaskC1195Ro(imageView, this.A03).A04();
            A04.A06(new C1380Yx(this, i10, c1228Sw));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void A0E(SN sn, int i10) {
        sn.A0l().setLayoutParams(A02(i10));
    }
}
