package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class RX extends NR {

    @Nullable
    public static RX A0S;
    public static byte[] A0T;
    public static String[] A0U = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass18 A0A;
    public C1056Me A0B;
    public C1057Mf A0C;

    @Nullable
    public C1206Rz A0D;
    public NV A0E;
    public C1080Nc A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final View A0M;
    public final AbstractC05230f A0N;
    public final C0954Ib A0O;
    public final NF A0P;
    public final NG A0Q;
    public final IX A0R;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0T, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A0T = new byte[]{36};
    }

    static {
        A0K();
        A0X = (int) (Kd.A02 * 26.0f);
        A0V = (int) (Kd.A02 * 4.0f);
        A0Z = (int) (Kd.A02 * 8.0f);
        A0W = C2U.A01(-1, 77);
        A0Y = (int) (Kd.A02 * 12.0f);
        A0S = null;
    }

    public RX(NV nv) {
        super(nv, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0E = nv;
        this.A0A = this.A0E.A04();
        this.A0O = new C0954Ib(nv.A04().A0U(), nv.A06());
        this.A0R = this.A0E.A0A();
        IX ix = this.A0R;
        if (ix != null) {
            LE.A0K(ix);
        }
        this.A0M = this.A0E.A03();
        this.A0N = C05240g.A01(nv.A05(), nv.A06(), nv.A04().A0U(), KM.A00(nv.A04().A0O().A0F().A05()), new HashMap(), false, true);
        NP.A00(nv.A05(), this, nv.A04().A0O().A0D().A07());
        setupLayoutConfiguration(false);
        A0G();
        A0C();
        postDelayed(new C1184Rd(this), 1000L);
        A0J();
        this.A0P = new C1183Rc(this);
        this.A0Q = new NG(nv, this.A0A, this.A0E.A02() instanceof P1 ? (P1) this.A0E.A02() : null, this.A0E.A09(), this.A0P, this.A09, this.A0F, this.A0R, this.A0M);
    }

    private void A0B() {
        LE.A0J(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        LE.A0R(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0C() {
        LE.A0J(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        LE.A0K(this.A07);
        A0H();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0D() {
        View view = this.A0M;
        if (view != null) {
            LE.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(NR.A09, NR.A09);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(NR.A08, this.A05, NR.A08, NR.A08);
            addView(this.A0M, layoutParams);
        }
    }

    private void A0E() {
        IX ix = this.A0R;
        if (ix != null) {
            LE.A0J(ix);
            IX ix2 = this.A0R;
            int i10 = A0Y;
            ix2.setPadding(i10, i10, i10, i10);
            this.A0R.A06(-1, A0W);
            this.A0R.setTranslationY(gl.Code);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0X);
            if (this.A0H) {
                layoutParams.addRule(8, this.A06.getId());
            } else {
                String[] strArr = A0U;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0U;
                strArr2[3] = "zjul6o0OG2Ezis8Q";
                strArr2[0] = "LmcEL";
                layoutParams.addRule(12);
            }
            addView(this.A0R, layoutParams);
        }
    }

    private void A0F() {
        AbstractC1028Lb A08 = this.A0E.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A0H || A08.A05()) ? false : true);
    }

    private void A0G() {
        this.A06 = this.A0E.A02();
        LE.A0J(this.A06);
        LE.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        LE.A0K(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i10 = A0Z;
        layoutParams2.setMargins(i10, i10 / 2, i10, this.A0R == null ? i10 : A0X);
        addView(this.A09, layoutParams2);
        LE.A0K(this.A09);
        NV nv = this.A0E;
        this.A0F = new C1080Nc(nv, nv.A04().A0O().A0F().A04(), getColors(), new C1182Rb(this));
        LE.A0G(1001, this.A0F);
        addView(this.A0F);
        A0I();
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.A03 * 4) / 5);
        if (A0e()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.addRule(12);
            LinearLayout linearLayout = this.A07;
            String[] strArr = A0U;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            linearLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A03 + 1, 0, 0);
        }
        this.A07.setTranslationY(gl.Code);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0I() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A09.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A0J() {
        A0E();
        A0D();
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str) {
        C1206Rz c1206Rz;
        LE.A0J(this.A0D);
        RZ rz = new RZ(this);
        if (this.A0E.A05().A0C() == null) {
            this.A0E.A05().A0D().A86();
        }
        if (IE.A02(this.A0E.A05()) || this.A0E.A05().A0C() == null) {
            c1206Rz = new C1206Rz(this.A0E.A05(), rz);
        } else {
            c1206Rz = new C1206Rz(this.A0E.A05(), this.A0E.A05().A0C(), rz);
        }
        this.A0D = c1206Rz;
        setUpBrowserControls(this.A0D);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z10) {
        ObjectAnimator objectAnimator;
        int i10;
        int i11;
        long j10;
        int i12;
        this.A0H = z10;
        postDelayed(new RY(this, z10), 250L);
        ObjectAnimator browserTransAnim = null;
        String A0A = A0A(0, 1, 39);
        if (z10) {
            C1080Nc c1080Nc = this.A0F;
            objectAnimator = ObjectAnimator.ofFloat(c1080Nc, A0A, c1080Nc.getY(), this.A03 / 5);
        } else {
            objectAnimator = null;
        }
        LinearLayout linearLayout = this.A07;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i13 = this.A03;
        if (z10) {
            i13 /= 5;
        }
        fArr[1] = i13;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0A, fArr);
        ofFloat.setDuration(500L);
        int i14 = (this.A03 / 2) - (this.A01 / 2);
        View view = this.A06;
        float[] fArr2 = new float[2];
        fArr2[0] = view.getY();
        fArr2[1] = (z10 || this.A0G) ? gl.Code : i14;
        ObjectAnimator mediaProgressbarTransAnim = ObjectAnimator.ofFloat(view, A0A, fArr2);
        mediaProgressbarTransAnim.setDuration(500L);
        IX ix = this.A0R;
        int mediaProgressbarHeight = ix == null ? 0 : ix.getHeight();
        if (z10) {
            int mediaViewTop = this.A02;
            String[] strArr = A0U;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0U;
                strArr2[7] = "g83HcTndNM";
                strArr2[4] = "KO02it";
                i10 = (mediaViewTop / 5) - mediaProgressbarHeight;
            }
            throw new RuntimeException();
        }
        i10 = (this.A03 - A0X) - A0Z;
        IX ix2 = this.A0R;
        if (ix2 != null) {
            float[] fArr3 = new float[2];
            fArr3[0] = ix2.getY();
            String[] strArr3 = A0U;
            if (strArr3[6].length() == strArr3[1].length()) {
                A0U[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                fArr3[1] = i10;
                browserTransAnim = ObjectAnimator.ofFloat(ix2, A0A, fArr3);
            }
            throw new RuntimeException();
        }
        int[] iArr = new int[2];
        iArr[0] = this.A06.getHeight();
        if (z10) {
            i11 = this.A03 / 5;
        } else {
            i11 = this.A01;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new NY(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, mediaProgressbarTransAnim, duration);
        if (objectAnimator != null) {
            j10 = 500;
            objectAnimator.setDuration(500L);
            i12 = 1;
            animatorSet.playTogether(objectAnimator);
        } else {
            j10 = 500;
            i12 = 1;
        }
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(j10);
            Animator[] animatorArr = new Animator[i12];
            animatorArr[0] = browserTransAnim;
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new NZ(this, z10));
        animatorSet.start();
    }

    private void A0Q(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        LE.A0J(this.A06);
        this.A06 = this.A0E.A02();
        LE.A0K(this.A06);
        if (this.A0H) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A03 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0C();
        }
        this.A06.setTranslationY(gl.Code);
        String[] strArr = A0U;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0U;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A06, 1, layoutParams);
        A0B();
        A0I();
    }

    private boolean A0R() {
        if (this.A0A.A0O().A0D().A0A()) {
            boolean z10 = this.A0J;
            String[] strArr = A0U;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z10 && !this.A0L && !this.A0K) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0W() {
        super.A0W();
        A0S = null;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0X() {
        AbstractC1028Lb A08 = this.A0E.A08();
        if (A08 != null) {
            A08.setPageDetailsVisible((A0e() || A08.A05()) ? false : true);
        }
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0Y() {
        if (this.A0E.A08() != null) {
            AbstractC1028Lb A08 = this.A0E.A08();
            String[] strArr = A0U;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            A08.setPageDetailsVisible(false);
        }
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0Z() {
        this.A0K = false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0a() {
        this.A0K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.facebook.ads.redexgen.X.NR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(com.facebook.ads.redexgen.X.C1B r4, java.lang.String r5, double r6, @androidx.annotation.Nullable android.os.Bundle r8) {
        /*
            r3 = this;
            super.A0b(r4, r5, r6, r8)
            com.facebook.ads.redexgen.X.1I r0 = r4.A0E()
            java.lang.String r1 = r0.A05()
            if (r1 == 0) goto L17
            java.lang.String r0 = r1.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L37
        L17:
            android.widget.LinearLayout r1 = r3.A08
            r0 = 8
            com.facebook.ads.redexgen.X.LE.A0N(r1, r0)
        L1e:
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            int r0 = r3.A04
            double r1 = (double) r0
            double r1 = r1 / r6
            int r0 = (int) r1
            r3.A01 = r0
        L2b:
            boolean r0 = r3.A0G
            if (r0 == 0) goto L34
            int r0 = r3.A02
        L31:
            r3.A01 = r0
            return
        L34:
            int r0 = r3.A01
            goto L31
        L37:
            android.widget.TextView r0 = r3.A09
            r0.setText(r1)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RX.A0b(com.facebook.ads.redexgen.X.1B, java.lang.String, double, android.os.Bundle):void");
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0d(boolean z10) {
        if (A0e()) {
            A0P(false);
            return true;
        }
        if (!A0R()) {
            return false;
        }
        this.A0Q.A07(this);
        return true;
    }

    public final boolean A0e() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0e()) {
            return 3;
        }
        if (this.A0K) {
            return 2;
        }
        if (this.A0A.A0O().A0D().A0A()) {
            return 1;
        }
        if (!this.A0J) {
            return super.getCloseButtonStyle();
        }
        if (A0U[5].charAt(10) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0U;
        strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
        strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
        return 4;
    }

    private String getUrl() {
        return this.A0E.A04().A0O().A0F().A05();
    }

    @Override // com.facebook.ads.redexgen.X.NR, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0Q(A0e());
        A0J();
        setupLayoutConfiguration(A0e());
        A0H();
    }

    private void setUpBrowserControls(C1206Rz c1206Rz) {
        LE.A0J(this.A0B);
        this.A0B = new C1056Me(this.A0E.A05(), c1206Rz);
        c1206Rz.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        LE.A0K(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C1181Ra(this));
        this.A0B.setOnTouchListener(new NX(this));
        this.A07.addView(this.A0B, layoutParams);
        LE.A0J(this.A0C);
        this.A0C = new C1057Mf(this.A0E.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0V));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0G = getResources().getConfiguration().orientation == 2;
        this.A05 = this.A0E.A08() == null ? 0 : this.A0E.A08().getToolbarHeight();
        this.A0H = z10;
        this.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.A03 = this.A02 + (this.A0G ? 0 : this.A05);
        this.A01 = this.A02;
    }
}
