package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC05501h extends C0849Dw implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"y4Urxqcv9RCHCbRsxOihNkmZ9cqKDFdZ", "LGqXjwU2H5uaBf0UptGCT7ZDInUwl5IV", "fkBbKznr2zH2OwfKJXQ1DdYWN1N", "HFNULQ3MobNCNeOVkX9dtbi8574Dr14V", "KPqvTm6ScHx6bbBibk9kuRT9nwj9YcDc", "WIY3Unb14PjE3ayNyWd6XWPIVw0Az9uS", "ZZL8YXP6wYj9", "tbuIO4j0iRDkkCNXzrivmX4Au5offJfR"};
    public int A00;
    public C1343Xk A01;
    public OJ A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-53, -26, -39, -24, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -26, -28, -15, -104, -21, -19, -24, -24, -25, -22, -20, -21, -104, -60, -31, -26, -35, -39, -22, -60, -39, -15, -25, -19, -20, -59, -39, -26, -39, -33, -35, -22};
    }

    static {
        A0A();
    }

    public ViewOnTouchListenerC05501h(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public ViewOnTouchListenerC05501h(C1316Wj c1316Wj, AttributeSet attributeSet) {
        super(c1316Wj, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public ViewOnTouchListenerC05501h(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i10) {
        int i11 = this.A00 - i10;
        int delta = this.A02.A7E(i11);
        int scrollX = this.A06;
        if (i11 > scrollX) {
            return A08(this.A05, delta);
        }
        if (i11 < (-scrollX)) {
            return A07(this.A05, delta);
        }
        return this.A05;
    }

    private int A07(int i10, int i11) {
        return Math.max(i10 - i11, 0);
    }

    private int A08(int i10, int i11) {
        return Math.min(i10 + i11, getItemCount() - 1);
    }

    public void A22(int i10, boolean z10) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i10;
        if (z10) {
            A1W(i10);
        } else {
            A1V(i10);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0D();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int action = motionEvent.getActionMasked();
        if (action == 1 || action == 6 || action == 3 || action == 4) {
            if (this.A04) {
                int rawX2 = A06(rawX);
                A22(rawX2, true);
            }
            this.A03 = true;
            this.A04 = false;
            return true;
        }
        if (action == 0 || action == 5 || (this.A03 && action == 2)) {
            this.A00 = rawX;
            String[] strArr = A08;
            String str = strArr[5];
            String str2 = strArr[4];
            int action2 = str.charAt(14);
            int rawX3 = str2.charAt(14);
            if (action2 == rawX3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[5] = "MxKeEan5PHYt2nmJnSz3xsZ38eI3mGgL";
            strArr2[4] = "utg9fSYK4sdWKYxBX5KGIJ2pCeKuK2tx";
            if (this.A03) {
                this.A03 = false;
            }
            this.A04 = true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C0849Dw
    public void setLayoutManager(C4T c4t) {
        if (c4t instanceof C1343Xk) {
            super.setLayoutManager(c4t);
            this.A01 = (C1343Xk) c4t;
            return;
        }
        throw new IllegalArgumentException(A09(0, 50, 58));
    }

    public void setSnapDelegate(OJ oj) {
        this.A02 = oj;
    }
}
