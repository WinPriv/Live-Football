package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Mq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1068Mq extends RelativeLayout {
    public static InterfaceC1029Lc A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public XU A00;
    public C1316Wj A01;
    public C05390w A02;

    @Nullable
    public C1204Rx A03;

    @Nullable
    public NH A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, Ascii.SYN, 19, Ascii.EM, Ascii.ETB, 9, Ascii.DLE, -60, -14, 5, Ascii.CAN, Ascii.CR, Ascii.SUB, 9, -60, Ascii.SUB, Ascii.CR, 9, Ascii.ESC, -60, 5, 8, 9, Ascii.DC4, Ascii.CAN, 9, Ascii.SYN, -60, Ascii.CR, Ascii.ETB, Ascii.DC2, -53, Ascii.CAN, -60, 7, Ascii.SYN, 9, 5, Ascii.CAN, 9, 8, -60, Ascii.DC4, Ascii.SYN, 19, Ascii.DC4, 9, Ascii.SYN, Ascii.DLE, Ascii.GS, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (Kd.A02 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (Kd.A02 * 15.0f);
        A05 = new C1203Rw();
    }

    public C1068Mq(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A01 = c1316Wj;
        this.A02 = new C05390w(c1316Wj);
        LE.A0K(this.A02);
        this.A00 = new C0850Dx();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<OM> A01(AnonymousClass18 anonymousClass18) {
        if (anonymousClass18 == null) {
            return new ArrayList<>();
        }
        List<C1B> A0c = anonymousClass18.A0c();
        ArrayList<OM> arrayList = new ArrayList<>(A0c.size());
        for (int i10 = 0; i10 < A0c.size(); i10++) {
            arrayList.add(new OM(i10, A0c.size(), A0c.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C1228Sw c1228Sw, int i10) {
        ArrayList<OM> A01 = A01(c1228Sw.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C1204Rx(this.A01, A01, c1228Sw.A0z(), this.A01.A00().A08(), c1228Sw, A05, c1228Sw.A0z().A0U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i10 - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(c1228Sw, A01);
    }

    public final void A06(C1137Pi c1137Pi) {
        C1204Rx c1204Rx = this.A03;
        if (c1204Rx != null) {
            c1204Rx.A0G(c1137Pi);
        } else {
            this.A01.A06().A8u(A00(51, 7, 29), C06977l.A1u, new C06987m(A00(0, 51, 45)));
        }
        this.A02.A22(c1137Pi);
    }

    public static InterfaceC1029Lc getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C1204Rx c1204Rx;
        if (z10 && (c1204Rx = this.A03) != null) {
            c1204Rx.A0F((i12 - i10) - A08, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        NH nh = this.A04;
        if (nh != null) {
            nh.A00(i10);
        }
    }

    private void setupDotsLayout(C1228Sw c1228Sw, ArrayList<OM> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new C1202Rv(this));
        this.A04 = new NH(this.A01, c1228Sw.A0z().A0N().A01(), arrayList.size());
        LE.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
