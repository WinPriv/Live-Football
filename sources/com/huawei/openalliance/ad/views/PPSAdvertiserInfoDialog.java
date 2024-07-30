package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;
import com.huawei.openalliance.ad.compliance.ComplianceView;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.h0;
import gb.r0;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PPSAdvertiserInfoDialog extends RelativeLayout {
    public final int[] A;
    public ComplianceView B;
    public ComplianceView C;
    public ComplianceView D;
    public ImageView E;
    public ImageView F;
    public ImageView G;
    public Context H;

    /* renamed from: s, reason: collision with root package name */
    public int f23760s;

    /* renamed from: t, reason: collision with root package name */
    public int f23761t;

    /* renamed from: u, reason: collision with root package name */
    public int f23762u;

    /* renamed from: v, reason: collision with root package name */
    public int f23763v;

    /* renamed from: w, reason: collision with root package name */
    public RelativeLayout f23764w;

    /* renamed from: x, reason: collision with root package name */
    public View f23765x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f23766z;

    /* loaded from: classes2.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<View> f23767s;

        public a(RelativeLayout relativeLayout) {
            this.f23767s = new WeakReference<>(relativeLayout);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            View view2 = this.f23767s.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    public PPSAdvertiserInfoDialog(Context context, int[] iArr, int[] iArr2) {
        super(context);
        int[] copyOf;
        if (iArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(iArr, iArr.length);
        }
        this.f23766z = copyOf;
        int[] copyOf2 = iArr2 != null ? Arrays.copyOf(iArr2, iArr2.length) : null;
        this.A = copyOf2;
        LayoutInflater.from(context).inflate(R.layout.hiad_advertiser_info_dialog, this);
        Context applicationContext = context.getApplicationContext();
        this.H = applicationContext;
        this.f23760s = gb.z.h(applicationContext);
        this.f23761t = gb.z.d(this.H);
        this.f23762u = gb.u.r(this.H);
        this.f23763v = r0.i(this.H, 22.0f);
        this.f23764w = (RelativeLayout) findViewById(R.id.haid_advertiser_info_dialog_root);
        this.f23765x = findViewById(R.id.margin_view);
        this.y = findViewById(R.id.anchor_view);
        this.B = (ComplianceView) findViewById(R.id.top_advertiser_view);
        this.E = (ImageView) findViewById(R.id.top_advertiser_iv);
        this.C = (ComplianceView) findViewById(R.id.bottom_advertiser_view);
        this.F = (ImageView) findViewById(R.id.bottom_advertiser_iv);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23764w.setForceDarkAllowed(false);
        }
        RelativeLayout relativeLayout = this.f23764w;
        relativeLayout.setOnClickListener(new a(relativeLayout));
        if (b() && gb.u.k()) {
            int i10 = (this.f23760s - copyOf[0]) - copyOf2[0];
            copyOf[0] = i10;
            ex.V("PPSAdvertiserInfoDialog", "rtl mAnchorViewLoc[x,y]= %d, %d", Integer.valueOf(i10), Integer.valueOf(copyOf[1]));
        }
        a();
    }

    public final void a() {
        boolean z10;
        int i10;
        ComplianceView complianceView;
        ImageView imageView;
        boolean z11;
        boolean z12;
        RelativeLayout.LayoutParams layoutParams;
        int i11;
        ImageView imageView2;
        float f;
        int i12;
        if (!b()) {
            c();
            return;
        }
        RelativeLayout relativeLayout = this.f23764w;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        ComplianceView complianceView2 = this.D;
        int[] iArr = this.A;
        int[] iArr2 = this.f23766z;
        if (complianceView2 != null) {
            complianceView2.d(iArr2, iArr);
        }
        if (!b()) {
            c();
        } else {
            if ((iArr[1] / 2) + iArr2[1] <= this.f23761t / 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = 8;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (z10) {
                i13 = 0;
            }
            this.B.setVisibility(i10);
            this.E.setVisibility(i10);
            this.F.setVisibility(i13);
            this.C.setVisibility(i13);
            if (z10) {
                complianceView = this.C;
            } else {
                complianceView = this.B;
            }
            this.D = complianceView;
            if (z10) {
                imageView = this.F;
            } else {
                imageView = this.E;
            }
            this.G = imageView;
            if (complianceView == null) {
                layoutParams = null;
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) complianceView.getLayoutParams();
                boolean a10 = h0.a(this.H);
                if ("0".equalsIgnoreCase(gb.f0.a(this.H).f28584b) && (1 == (i11 = this.f23762u) || 9 == i11)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (h0.d() && h0.b(this.H)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z10) {
                    int q10 = r0.q(this.H);
                    if (cl.Code(this.H).Code(this.H)) {
                        q10 = Math.max(q10, cl.Code(this.H).Code(this.f23764w));
                    }
                    layoutParams2.setMargins(0, q10, 0, 0);
                } else if (a10 || z11 || z12) {
                    layoutParams2.setMargins(0, 0, 0, Math.max(r0.i(this.H, 40.0f), gb.u.m(this.H)));
                }
                layoutParams = layoutParams2;
            }
            ComplianceView complianceView3 = this.D;
            if (complianceView3 != null && layoutParams != null) {
                complianceView3.setLayoutParams(layoutParams);
            }
        }
        if (!b()) {
            c();
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f23765x.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.width = iArr2[0];
                layoutParams4.height = iArr2[1];
                this.f23765x.setLayoutParams(layoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = this.y.getLayoutParams();
            if (layoutParams5 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams6.width = iArr[0];
                layoutParams6.height = iArr[1];
                this.y.setLayoutParams(layoutParams6);
            }
        }
        if (!b()) {
            c();
        } else {
            int i14 = r0.i(this.H, 36.0f);
            int i15 = this.f23763v;
            int i16 = (this.f23760s - i15) - i14;
            int i17 = ((iArr[0] / 2) + iArr2[0]) - (i14 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 <= i16) {
                i16 = i15;
            }
            if (gb.u.k()) {
                imageView2 = this.G;
                f = -i16;
            } else {
                imageView2 = this.G;
                f = i16;
            }
            imageView2.setX(f);
        }
        if (!b()) {
            c();
            return;
        }
        ex.V("PPSAdvertiserInfoDialog", "getRealOrientation orientation %s", Integer.valueOf(this.f23762u));
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.D.getLayoutParams();
        int abs = Math.abs((int) this.G.getX());
        int i18 = r0.i(this.H, 36.0f);
        int i19 = (i18 >> 1) + abs;
        double d10 = i18 * 0.5d;
        int viewWidthPercent = (int) (((1.0f - this.D.getViewWidthPercent()) * this.f23760s * 0.5d) + r0.i(this.H, 16.0f) + d10);
        int viewWidthPercent2 = (int) (((((this.D.getViewWidthPercent() * 0.5d) + 0.5d) * this.f23760s) - r0.i(this.H, 16.0f)) - d10);
        ex.Code("PPSAdvertiserInfoDialog", "locationX: %s, locationX2: %s", Integer.valueOf(viewWidthPercent), Integer.valueOf(viewWidthPercent2));
        ex.Code("PPSAdvertiserInfoDialog", "curImgX: %s, curImgWidth: %s, curImgCenter: %s", Integer.valueOf(abs), Integer.valueOf(i18), Integer.valueOf(i19));
        int i20 = this.f23762u;
        if (1 != i20 && 9 != i20) {
            layoutParams7.removeRule(14);
            this.D.setLayoutParams(layoutParams7);
            int i21 = this.f23760s;
            if (i19 >= i21 / 3) {
                if (i19 < (i21 * 2) / 3) {
                    i12 = i19 - (this.D.getViewWith() >> 1);
                } else {
                    i12 = (r0.i(this.H, 16.0f) + (abs + i18)) - this.D.getViewWith();
                }
                this.D.setPaddingStart(i12);
            }
        } else if (i19 < viewWidthPercent) {
            ex.Code("PPSAdvertiserInfoDialog", "curImgCenter < locationX");
            layoutParams7.removeRule(14);
            this.D.setLayoutParams(layoutParams7);
        } else {
            if (i19 > viewWidthPercent2) {
                ex.Code("PPSAdvertiserInfoDialog", "curImgCenter > locationX2");
                layoutParams7.removeRule(14);
                this.D.setLayoutParams(layoutParams7);
                int i22 = (r0.i(this.H, 16.0f) + (abs + i18)) - this.D.getViewWith();
                ex.Code("PPSAdvertiserInfoDialog", "paddingStart: %s", Integer.valueOf(i22));
                this.D.setPaddingStart(i22);
                return;
            }
            ex.Code("PPSAdvertiserInfoDialog", "locationX =< curImgCenter =< locationX2");
            layoutParams7.addRule(14);
            this.D.setLayoutParams(layoutParams7);
            return;
        }
        i12 = abs - r0.i(this.H, 16.0f);
        this.D.setPaddingStart(i12);
    }

    public final boolean b() {
        boolean z10;
        boolean z11;
        int[] iArr = this.f23766z;
        if (iArr != null && iArr.length == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr2 = this.A;
        if (iArr2 != null && iArr2.length == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return true;
        }
        return false;
    }

    public final void c() {
        RelativeLayout relativeLayout = this.f23764w;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public PPSBaseDialogContentView getBottomDialogView() {
        return this.C;
    }

    public PPSBaseDialogContentView getTopDialogView() {
        return this.B;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    public void setAdContent(AdContentData adContentData) {
        this.D.setAdContentData(adContentData);
        a();
    }

    public void setScreenHeight(int i10) {
        if (i10 > 0) {
            this.f23761t = i10;
        }
    }

    public void setScreenWidth(int i10) {
        if (i10 > 0) {
            this.f23760s = i10;
        }
    }

    @Override // android.view.View
    public RelativeLayout getRootView() {
        return this.f23764w;
    }
}
