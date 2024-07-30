package com.huawei.openalliance.ad.ppskit.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdvertiserInfo;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSBaseDialogContentView;
import com.huawei.openalliance.ad.ppskit.views.PPSRewardWebView;
import java.util.List;
import ka.jj;
import ka.n7;
import ka.q7;
import la.c;
import la.d;

/* loaded from: classes2.dex */
public class ComplianceActivity extends BaseDialogActivity {
    public static q7 N;
    public final AdContentData L = new AdContentData();
    public boolean M;

    public static void v(Context context, View view, AdContentData adContentData) {
        boolean z10;
        if (Math.abs(System.currentTimeMillis() - a0.a.f11h0) >= 500 && Math.abs(System.currentTimeMillis() - a0.a.f12i0) >= 1500) {
            a0.a.f11h0 = System.currentTimeMillis();
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            n7.e("ComplianceActivity", "repeat click too fast");
            return;
        }
        if (adContentData != null && view != null) {
            try {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                n7.f("ComplianceActivity", "startFeedbackActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                view.getViewTreeObserver().addOnGlobalLayoutListener(new BaseDialogActivity.c(view, context, iArr2));
                int[] iArr3 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                Intent intent = new Intent(context, (Class<?>) ComplianceActivity.class);
                intent.putExtra(ba.as, iArr);
                intent.putExtra(ba.at, iArr3);
                intent.setFlags(com.anythink.expressad.exoplayer.b.aX);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                String i10 = adContentData.i();
                if (TextUtils.isEmpty(i10)) {
                    i10 = adContentData.h();
                }
                intent.putExtra(ba.ay, i10);
                intent.putExtra(ba.az, y0.q(null, adContentData.q()));
                intent.putExtra(ba.aA, true);
                intent.setClipData(oa.a.f33785b);
                z1.r(context, intent);
            } catch (Throwable th) {
                n7.h("ComplianceActivity", "start Activity error: %s", th.getClass().getSimpleName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void finish() {
        q7 q7Var = N;
        if (q7Var != null) {
            ((PPSRewardWebView.a) q7Var).getClass();
            n7.b("PPSRewardWebView", "activity finish callback");
            jj.a().f = false;
        }
        super.finish();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity
    public final int l() {
        return R.layout.hiad_compliance_activity;
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity
    public final void m() {
        this.G = (RelativeLayout) findViewById(R.id.compliance_activity_adcore);
        this.H = findViewById(R.id.margin_view);
        this.I = findViewById(R.id.compliance_anchor_view);
        this.A = (PPSBaseDialogContentView) findViewById(R.id.top_compliance_view);
        this.D = (ImageView) findViewById(R.id.top_compliance_iv);
        this.B = (PPSBaseDialogContentView) findViewById(R.id.bottom_compliance_view);
        this.E = (ImageView) findViewById(R.id.bottom_compliance_iv);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b A[ADDED_TO_REGION] */
    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.ComplianceActivity.o():void");
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null && this.A != null && this.B != null) {
            relativeLayout.setOnClickListener(new la.b(this));
            this.A.setViewClickListener(new c(this));
            this.B.setViewClickListener(new d(this));
        }
        q7 q7Var = N;
        if (q7Var != null) {
            ((PPSRewardWebView.a) q7Var).getClass();
            n7.b("PPSRewardWebView", "activity show callback");
            jj.a().f = true;
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity
    public final boolean p() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra(ba.ay);
        String stringExtra2 = safeIntent.getStringExtra(ba.az);
        boolean isEmpty = TextUtils.isEmpty(stringExtra2);
        AdContentData adContentData = this.L;
        if (!isEmpty) {
            adContentData.F((List) y0.o(null, stringExtra2, List.class, AdvertiserInfo.class));
        }
        this.M = safeIntent.getBooleanExtra(ba.aA, false);
        adContentData.P(stringExtra);
        return super.p();
    }
}
