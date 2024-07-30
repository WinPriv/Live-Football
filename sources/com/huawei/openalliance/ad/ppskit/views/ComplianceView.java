package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.hj;
import ka.n7;

/* loaded from: classes2.dex */
public class ComplianceView extends PPSBaseDialogContentView {
    public View E;
    public TextView F;
    public RelativeLayout G;
    public AdContentData H;
    public ImageView I;
    public TextView J;
    public hj K;

    public ComplianceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public final void a() {
        boolean z10;
        try {
            n7.f("ComplianceView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.f23170z), Integer.valueOf(this.A));
            if (this.f23168w != null && this.f23167v != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            this.f23164s.setPadding(this.f23170z, 0, this.A, 0);
            this.f23164s.requestLayout();
            this.f23164s.getViewTreeObserver().addOnGlobalLayoutListener(this.C);
        } catch (Throwable th) {
            n7.h("ComplianceView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public final void b(Context context) {
        try {
            View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_compliance_choice_view, this);
            this.f23164s = inflate.findViewById(R.id.compliance_view_root);
            this.E = inflate.findViewById(R.id.why_this_ad_line);
            this.F = (TextView) inflate.findViewById(R.id.compliance_info);
            this.G = (RelativeLayout) inflate.findViewById(R.id.why_this_ad_btn);
            this.f23165t = inflate.findViewById(R.id.compliance_scrollview);
            this.J = (TextView) inflate.findViewById(R.id.why_this_ad_tv);
        } catch (Throwable th) {
            n7.h("ComplianceView", "initView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public final void c() {
        ImageView imageView = (ImageView) findViewById(R.id.right_arrow);
        this.I = imageView;
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_right_arrow);
            if (z1.D()) {
                this.I.setImageBitmap(com.huawei.openalliance.ad.ppskit.utils.v0.l(drawable));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            android.view.View r0 = r5.E
            r1 = 0
            java.lang.String r2 = "ComplianceView"
            if (r0 == 0) goto L2e
            android.widget.RelativeLayout r0 = r5.G
            if (r0 != 0) goto Lc
            goto L2e
        Lc:
            java.lang.Boolean r0 = r5.B
            if (r0 == 0) goto L19
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L19
            java.lang.String r0 = "not need show why this ad"
            goto L30
        L19:
            android.view.View r0 = r5.E
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r5.G
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r5.G
            com.huawei.openalliance.ad.ppskit.views.c r3 = new com.huawei.openalliance.ad.ppskit.views.c
            r3.<init>(r5)
            r0.setOnClickListener(r3)
            goto L33
        L2e:
            java.lang.String r0 = "partingLine or whyThisAdClick view not init"
        L30:
            ka.n7.e(r2, r0)
        L33:
            com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData r0 = r5.H
            if (r0 == 0) goto L81
            java.util.List r0 = r0.q()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            boolean r4 = androidx.transition.n.M(r0)
            if (r4 == 0) goto L4c
            java.lang.String r0 = "complianceInfo is null"
            ka.n7.e(r2, r0)
            goto L81
        L4c:
            int r2 = r0.size()
            if (r1 >= r2) goto L7a
            int r2 = r0.size()
            int r2 = r2 + (-1)
            if (r1 == r2) goto L6a
            java.lang.Object r2 = r0.get(r1)
            com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo r2 = (com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo) r2
            java.lang.String r2 = r2.getValue()
            r3.append(r2)
            java.lang.String r2 = ", "
            goto L74
        L6a:
            java.lang.Object r2 = r0.get(r1)
            com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo r2 = (com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo) r2
            java.lang.String r2 = r2.getValue()
        L74:
            r3.append(r2)
            int r1 = r1 + 1
            goto L4c
        L7a:
            android.widget.TextView r0 = r5.F
            if (r0 == 0) goto L81
            r0.setText(r3)
        L81:
            r5.a()
            android.content.Context r0 = r5.getContext()
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.d0.v(r0)
            if (r0 == 0) goto La1
            android.widget.TextView r0 = r5.F
            if (r0 == 0) goto La1
            android.widget.TextView r1 = r5.J
            if (r1 == 0) goto La1
            r1 = 1
            r2 = 1105199104(0x41e00000, float:28.0)
            r0.setTextSize(r1, r2)
            android.widget.TextView r0 = r5.J
            r0.setTextSize(r1, r2)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.ComplianceView.e():void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public void setAdContentData(AdContentData adContentData) {
        if (adContentData == null) {
            return;
        }
        this.H = adContentData;
        e();
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public void setContentInfo(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        AdContentData adContentData = new AdContentData();
        this.H = adContentData;
        adContentData.F(contentRecord.J1());
        this.H.P(contentRecord.i1());
        e();
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView
    public void setViewClickListener(hj hjVar) {
        this.K = hjVar;
    }
}
