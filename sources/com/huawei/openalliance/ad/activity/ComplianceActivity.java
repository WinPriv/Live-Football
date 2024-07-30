package com.huawei.openalliance.ad.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.AdvertiserInfo;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.activity.a;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.utils.SafeIntent;
import com.huawei.openalliance.ad.views.PPSBaseDialogContentView;
import gb.b;
import java.util.List;
import x9.e;

/* loaded from: classes2.dex */
public class ComplianceActivity extends a {
    public static e N;
    public boolean L;
    public final AdContentData M = new AdContentData();

    public static void m(Context context, View view, AdContentData adContentData, boolean z10) {
        if (view == null) {
            return;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            ex.V("ComplianceActivity", "startFeedbackActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int[] iArr3 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a.b(view, context, iArr2));
            n(context, iArr, iArr3, adContentData, z10);
        } catch (Throwable th) {
            ex.I("ComplianceActivity", "start Activity error: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(android.content.Context r2, int[] r3, int[] r4, com.huawei.openalliance.ad.inter.data.AdContentData r5, boolean r6) {
        /*
            boolean r0 = androidx.activity.n.o()
            if (r0 == 0) goto Le
            java.lang.String r0 = "ComplianceActivity"
            java.lang.String r1 = "repeat click too fast"
            com.huawei.hms.ads.ex.V(r0, r1)
            goto L10
        Le:
            if (r5 != 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L16
            return
        L16:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.huawei.openalliance.ad.activity.ComplianceActivity> r1 = com.huawei.openalliance.ad.activity.ComplianceActivity.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "anchor_location"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "anchor_size"
            r0.putExtra(r3, r4)
            r3 = 65536(0x10000, float:9.1835E-41)
            r0.setFlags(r3)
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 != 0) goto L35
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r3)
        L35:
            java.lang.String r3 = r5.l0()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L43
            java.lang.String r3 = r5.k0()
        L43:
            java.lang.String r4 = "why_this_ad_url"
            r0.putExtra(r4, r3)
            java.util.List r3 = r5.i0()
            java.lang.String r3 = gb.b.p(r3)
            java.lang.String r4 = "compliance"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "show_why_this_Ad"
            r0.putExtra(r3, r6)
            android.content.ClipData r3 = com.huawei.openalliance.ad.constant.w.cH
            r0.setClipData(r3)
            gb.u.f(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.activity.ComplianceActivity.n(android.content.Context, int[], int[], com.huawei.openalliance.ad.inter.data.AdContentData, boolean):void");
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final boolean a() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra(ba.ay);
        String stringExtra2 = safeIntent.getStringExtra(ba.az);
        boolean isEmpty = TextUtils.isEmpty(stringExtra2);
        AdContentData adContentData = this.M;
        if (!isEmpty) {
            adContentData.s((List) b.o(List.class, stringExtra2, AdvertiserInfo.class));
        }
        this.L = safeIntent.getBooleanExtra(ba.aA, false);
        adContentData.F(stringExtra);
        return super.a();
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final void c() {
        this.F = (RelativeLayout) findViewById(R.id.compliance_activity_root);
        this.G = findViewById(R.id.margin_view);
        this.H = findViewById(R.id.compliance_anchor_view);
        this.f21954z = (PPSBaseDialogContentView) findViewById(R.id.top_compliance_view);
        this.C = (ImageView) findViewById(R.id.top_compliance_iv);
        this.A = (PPSBaseDialogContentView) findViewById(R.id.bottom_compliance_view);
        this.D = (ImageView) findViewById(R.id.bottom_compliance_iv);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final void f() {
        b();
        this.B.d(this.f21952w, this.f21953x);
        this.B.setShowWhyThisAd(this.L);
        this.B.setAdContentData(this.M);
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void finish() {
        super.finish();
        e eVar = N;
        if (eVar != null) {
            eVar.V();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final int i() {
        return R.layout.hiad_activity_compliance;
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = this.F;
        if (relativeLayout != null && this.f21954z != null && this.A != null) {
            relativeLayout.setOnClickListener(new x9.a(this));
            this.f21954z.setViewClickListener(new x9.b(this));
            this.A.setViewClickListener(new x9.c(this));
        }
        e eVar = N;
        if (eVar != null) {
            eVar.Code();
        }
    }
}
