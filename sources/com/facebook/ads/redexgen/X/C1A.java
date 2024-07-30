package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A extends ViewOnTouchListenerC05501h implements OJ {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC1034Lh A04;
    public boolean A05;
    public final A2 A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C1A(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c1316Wj, new OG(), new OF());
        A02();
    }

    public C1A(C1316Wj c1316Wj, AttributeSet attributeSet) {
        super(c1316Wj, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c1316Wj, new OG(), new OF());
        A02();
    }

    public C1A(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c1316Wj, new OG(), new OF());
        A02();
    }

    private int A00(int i10) {
        int i11 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i12 = (measuredWidth - spacing) - i11;
        int itemSize = getAdapter().A0D();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i10) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i10;
            }
            int spacing3 = numFullItems * i11;
            spacing2 = (int) ((i12 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        LE.A0K(this);
    }

    private void A04(int i10, int i11) {
        if (i10 == this.A03 && i11 == this.A02) {
            return;
        }
        this.A03 = i10;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i11;
        if (this.A04 != null) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.facebook.ads.redexgen.X.ViewOnTouchListenerC05501h
    public final void A22(int i10, boolean z10) {
        super.A22(i10, z10);
        A04(i10, 0);
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final int A7E(int i10) {
        int abs = Math.abs(i10);
        int scrollXAbs = ((ViewOnTouchListenerC05501h) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int i11 = this.A01;
        if (i11 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (abs / i11);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C0849Dw, android.view.View
    public final void onMeasure(int i10, int i11) {
        int itemSize;
        int itemSize2;
        super.onMeasure(i10, i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i12 = (int) Kd.A02;
            int verticalPadding = ID.A0D(getContext());
            itemSize = (i12 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            itemSize = Math.round(verticalPadding2 / 1.91f);
        }
        int height = View.MeasureSpec.getMode(i11);
        if (height == Integer.MIN_VALUE) {
            int verticalPadding3 = View.MeasureSpec.getSize(i11);
            itemSize = Math.min(verticalPadding3, itemSize);
        } else if (height == 1073741824) {
            itemSize = View.MeasureSpec.getSize(i11);
        }
        int itemSize3 = itemSize - paddingTop;
        if (this.A05) {
            int verticalPadding4 = C1031Le.A09;
            itemSize2 = Math.min(verticalPadding4, itemSize3);
        } else {
            itemSize2 = A00(itemSize3);
        }
        int verticalPadding5 = itemSize2 + paddingTop;
        setMeasuredDimension(getMeasuredWidth(), verticalPadding5);
        if (!this.A05) {
            int verticalPadding6 = this.A00;
            setChildWidth((verticalPadding6 * 2) + itemSize2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0849Dw
    public void setAdapter(@Nullable C4H c4h) {
        this.A06.A2L(c4h == null ? -1 : c4h.hashCode());
        super.setAdapter(c4h);
    }

    public void setChildSpacing(int i10) {
        this.A00 = i10;
    }

    public void setChildWidth(int i10) {
        this.A01 = i10;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i11 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i12 = i11 - pageWidth2;
        A2 a22 = this.A06;
        int pageWidth3 = this.A01;
        a22.A2M((i12 - pageWidth3) / 2);
        A2 a23 = this.A06;
        int pageWidth4 = this.A01;
        a23.A2K(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i10) {
        A22(i10, false);
    }

    public void setOnPageChangedListener(InterfaceC1034Lh interfaceC1034Lh) {
        this.A04 = interfaceC1034Lh;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
