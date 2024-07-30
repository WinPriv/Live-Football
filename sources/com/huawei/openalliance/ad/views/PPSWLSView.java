package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.splash.ChoicesView;
import com.huawei.hms.ads.splash.R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class PPSWLSView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public PPSSplashLabelView f24019s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f24020t;

    /* renamed from: u, reason: collision with root package name */
    public ChoicesView f24021u;

    /* renamed from: v, reason: collision with root package name */
    public fs f24022v;

    /* renamed from: w, reason: collision with root package name */
    public WeakReference<PPSLinkedView> f24023w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f24024x;
    public Integer y;

    /* renamed from: z, reason: collision with root package name */
    public View.OnClickListener f24025z;

    public PPSWLSView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.hiad_wls_view, this);
        ChoicesView choicesView = (ChoicesView) findViewById(R.id.splash_why_this_ad);
        this.f24021u = choicesView;
        choicesView.setVisibility(8);
        PPSSplashLabelView pPSSplashLabelView = (PPSSplashLabelView) findViewById(R.id.hiad_ad_label_wls);
        this.f24019s = pPSSplashLabelView;
        pPSSplashLabelView.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.hiad_ad_source_wls);
        this.f24020t = textView;
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PPSLinkedView getPpsLinkedView() {
        WeakReference<PPSLinkedView> weakReference = this.f24023w;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (gb.h0.d() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
    
        if (r14 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.huawei.openalliance.ad.inter.data.AdContentData r13, boolean r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSWLSView.a(com.huawei.openalliance.ad.inter.data.AdContentData, boolean, int, int, boolean):void");
    }

    public int[] getChoiceViewLoc() {
        boolean z10;
        ChoicesView choicesView = this.f24021u;
        int i10 = gb.u.f28631a;
        if (choicesView != null && choicesView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return new int[0];
        }
        int[] iArr = new int[2];
        choicesView.getLocationInWindow(iArr);
        return iArr;
    }

    public int[] getChoiceViewSize() {
        boolean z10;
        ChoicesView choicesView = this.f24021u;
        int i10 = gb.u.f28631a;
        if (choicesView != null && choicesView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return new int[0];
        }
        return new int[]{choicesView.getMeasuredWidth(), choicesView.getMeasuredHeight()};
    }

    public void setAdMediator(fs fsVar) {
        this.f24022v = fsVar;
    }

    public void setChoiceViewOnClickListener(View.OnClickListener onClickListener) {
        this.f24025z = onClickListener;
    }

    public void setPpsLinkedView(PPSLinkedView pPSLinkedView) {
        this.f24023w = new WeakReference<>(pPSLinkedView);
    }
}
