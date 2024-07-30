package com.huawei.openalliance.ad.compliance;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.eu;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.views.PPSBaseDialogContentView;
import gb.u;
import gb.w0;

/* loaded from: classes2.dex */
public class ComplianceView extends PPSBaseDialogContentView {
    public View E;
    public TextView F;
    public RelativeLayout G;
    public AdContentData H;
    public TextView I;
    public eu J;
    public ImageView K;

    public ComplianceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void b() {
        boolean z10;
        try {
            ex.V("ComplianceView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.A), Integer.valueOf(this.B));
            if (this.f23802x != null && this.f23801w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            this.f23798t.setPadding(this.A, 0, this.B, 0);
            this.f23798t.requestLayout();
            this.f23798t.getViewTreeObserver().addOnGlobalLayoutListener(this.D);
        } catch (Throwable th) {
            ex.I("ComplianceView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_compliance_choice_view, this);
        this.f23798t = inflate.findViewById(R.id.compliance_view_root);
        this.E = inflate.findViewById(R.id.why_this_ad_line);
        this.F = (TextView) inflate.findViewById(R.id.compliance_info);
        this.G = (RelativeLayout) inflate.findViewById(R.id.why_this_ad_btn);
        this.f23799u = inflate.findViewById(R.id.compliance_scrollview);
        this.I = (TextView) inflate.findViewById(R.id.why_this_ad_tv);
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void e(Context context) {
        ImageView imageView = (ImageView) findViewById(R.id.right_arrow);
        this.K = imageView;
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_right_arrow);
            if (u.k()) {
                this.K.setImageBitmap(w0.k(drawable));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAdContentData(com.huawei.openalliance.ad.inter.data.AdContentData r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r4.H = r5
            android.view.View r5 = r4.E
            r0 = 0
            java.lang.String r1 = "ComplianceView"
            if (r5 == 0) goto L33
            android.widget.RelativeLayout r5 = r4.G
            if (r5 != 0) goto L11
            goto L33
        L11:
            java.lang.Boolean r5 = r4.C
            if (r5 == 0) goto L1e
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L1e
            java.lang.String r5 = "not need show why this ad"
            goto L35
        L1e:
            android.view.View r5 = r4.E
            r5.setVisibility(r0)
            android.widget.RelativeLayout r5 = r4.G
            r5.setVisibility(r0)
            android.widget.RelativeLayout r5 = r4.G
            ba.a r2 = new ba.a
            r2.<init>(r4)
            r5.setOnClickListener(r2)
            goto L38
        L33:
            java.lang.String r5 = "partingLine or whyThisAdClick view not init"
        L35:
            com.huawei.hms.ads.ex.V(r1, r5)
        L38:
            com.huawei.openalliance.ad.inter.data.AdContentData r5 = r4.H
            if (r5 == 0) goto L86
            java.util.List r5 = r5.i0()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            boolean r3 = androidx.transition.n.h(r5)
            if (r3 == 0) goto L51
            java.lang.String r5 = "complianceInfo is null"
            com.huawei.hms.ads.ex.V(r1, r5)
            goto L86
        L51:
            int r1 = r5.size()
            if (r0 >= r1) goto L7f
            int r1 = r5.size()
            int r1 = r1 + (-1)
            if (r0 == r1) goto L6f
            java.lang.Object r1 = r5.get(r0)
            com.huawei.hms.ads.AdvertiserInfo r1 = (com.huawei.hms.ads.AdvertiserInfo) r1
            java.lang.String r1 = r1.getValue()
            r2.append(r1)
            java.lang.String r1 = ", "
            goto L79
        L6f:
            java.lang.Object r1 = r5.get(r0)
            com.huawei.hms.ads.AdvertiserInfo r1 = (com.huawei.hms.ads.AdvertiserInfo) r1
            java.lang.String r1 = r1.getValue()
        L79:
            r2.append(r1)
            int r0 = r0 + 1
            goto L51
        L7f:
            android.widget.TextView r5 = r4.F
            if (r5 == 0) goto L86
            r5.setText(r2)
        L86:
            r4.b()
            android.content.Context r5 = r4.getContext()
            boolean r5 = gb.r0.p(r5)
            if (r5 == 0) goto La6
            android.widget.TextView r5 = r4.F
            if (r5 == 0) goto La6
            android.widget.TextView r0 = r4.I
            if (r0 == 0) goto La6
            r0 = 1
            r1 = 1105199104(0x41e00000, float:28.0)
            r5.setTextSize(r0, r1)
            android.widget.TextView r5 = r4.I
            r5.setTextSize(r0, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.compliance.ComplianceView.setAdContentData(com.huawei.openalliance.ad.inter.data.AdContentData):void");
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public void setViewClickListener(eu euVar) {
        this.J = euVar;
    }
}
