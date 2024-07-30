package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1162Qh extends AbstractC06294l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};

    @DoNotStrip
    public AbstractC1136Ph A00;
    public C1137Pi A01;

    @Nullable
    public C1137Pi A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C1316Wj A08;
    public final AbstractC07288q A09;

    public C1162Qh(AbstractC07288q abstractC07288q, SparseBooleanArray sparseBooleanArray, C1137Pi c1137Pi, int i10, int i11, int i12, int i13, C1316Wj c1316Wj) {
        super(abstractC07288q);
        this.A08 = c1316Wj;
        this.A09 = abstractC07288q;
        this.A07 = sparseBooleanArray;
        this.A01 = c1137Pi;
        this.A03 = i10;
        this.A04 = i11;
        this.A05 = i12;
        this.A06 = i13;
    }

    private void A08(IT it, L6 l62, String str, OM om) {
        if (this.A07.get(om.A02())) {
            return;
        }
        C1137Pi c1137Pi = this.A02;
        if (c1137Pi != null) {
            c1137Pi.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C1164Qj(this, str, om, it, om.A04(), l62);
        this.A02 = new C1137Pi(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C1163Qi(this, om));
    }

    public final void A0l(OM om, IT it, C6G c6g, L6 l62, String str) {
        int A02 = om.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        int rightMargin = A02 == 0 ? this.A04 : this.A05;
        int position = this.A06;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A04 : this.A05, 0);
        String imageUrl = om.A03().A0D().A07();
        String A08 = om.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(imageUrl);
            this.A09.setVideoUrl(c6g.A0S(A08));
        } else {
            this.A09.setImageUrl(imageUrl);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(om.A03().A0E().A06(), om.A03().A0E().A01());
        this.A09.setCTAInfo(om.A03().A0F(), om.A04());
        this.A09.A0k(om.A04());
        A08(it, l62, str, om);
    }
}
