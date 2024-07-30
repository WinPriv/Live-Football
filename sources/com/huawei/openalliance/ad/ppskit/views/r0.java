package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import ka.eb;
import ka.n7;
import ka.oc;

/* loaded from: classes2.dex */
public final class r0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23544s;

    public r0(PPSRewardView pPSRewardView) {
        this.f23544s = pPSRewardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        eb ebVar = PPSRewardView.T0;
        PPSRewardView pPSRewardView = this.f23544s;
        pPSRewardView.b(true);
        if (!pPSRewardView.f23256l0) {
            pPSRewardView.f23253i0 = true;
        }
        pPSRewardView.W();
        pPSRewardView.F.setVisibility(8);
        pPSRewardView.setBottomViewVisibility(8);
        PPSRewardEndCardView pPSRewardEndCardView = pPSRewardView.T;
        if (pPSRewardEndCardView != null && (view2 = pPSRewardEndCardView.y) != null) {
            view2.setVisibility(8);
        }
        if (pPSRewardView.B != null) {
            long h10 = pPSRewardView.B.h();
            if (pPSRewardView.A != null) {
                pPSRewardView.K(Long.valueOf(h10), Integer.valueOf(pPSRewardView.A.H), 1);
            }
        }
        oc ocVar = pPSRewardView.y;
        if (ocVar != null) {
            ocVar.q(24, pPSRewardView.M0);
            pPSRewardView.M0 = null;
        }
        oc ocVar2 = pPSRewardView.y;
        if (ocVar2 != null) {
            ContentRecord contentRecord = (ContentRecord) ocVar2.f32660t;
            if (contentRecord == null) {
                n7.g("event", "onAdClickPlay, ad data is null");
            } else {
                androidx.activity.n.P(ocVar2.f31607v, "reportClickPlayEvent", androidx.activity.n.y(contentRecord));
            }
        }
    }
}
