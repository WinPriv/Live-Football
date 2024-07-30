package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1169Qo extends AbstractC06294l {

    @Nullable
    @DoNotStrip
    public AbstractC1136Ph A00;
    public C1137Pi A01;

    @Nullable
    public C1137Pi A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C1316Wj A05;
    public final C07368y A06;

    public C1169Qo(C07368y c07368y, SparseBooleanArray sparseBooleanArray, C1137Pi c1137Pi, int i10, C1316Wj c1316Wj) {
        super(c07368y);
        this.A05 = c1316Wj;
        this.A06 = c07368y;
        this.A04 = sparseBooleanArray;
        this.A01 = c1137Pi;
        this.A03 = i10;
    }

    private void A08(IT it, L6 l62, String str, OM om) {
        if (this.A04.get(om.A02())) {
            return;
        }
        C1137Pi c1137Pi = this.A02;
        if (c1137Pi != null) {
            c1137Pi.A0V();
            this.A02 = null;
        }
        this.A00 = new C1171Qq(this, str, om, it, om.A04(), l62);
        this.A02 = new C1137Pi(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new C1170Qp(this, om));
    }

    public final void A0l(OM om, IT it, C6G c6g, L6 l62, String str, int i10, int i11, int i12) {
        int A02 = om.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(A02));
        this.A06.setupNativeCtaExtension(om);
        ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(i10, -2);
        int i13 = A02 == 0 ? i12 : i11;
        if (A02 < this.A03 - 1) {
            i12 = i11;
        }
        params.setMargins(i13, 0, i12, 0);
        String A07 = om.A03().A0D().A07();
        String A08 = om.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c6g.A0S(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(params);
        this.A06.A0j(om.A04());
        A08(it, l62, str, om);
    }

    public final void A0m(C1137Pi c1137Pi) {
        this.A01 = c1137Pi;
    }
}
