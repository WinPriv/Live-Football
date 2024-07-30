package com.huawei.openalliance.ad.ppskit.views;

import android.view.View;
import ka.hj;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComplianceView f23396s;

    public c(ComplianceView complianceView) {
        this.f23396s = complianceView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ComplianceView complianceView = this.f23396s;
        if (complianceView.H != null) {
            if (com.huawei.openalliance.ad.ppskit.utils.d0.n(complianceView.getContext(), complianceView.H.h())) {
                complianceView.getClass();
            }
            hj hjVar = complianceView.K;
            if (hjVar != null) {
                hjVar.a();
            }
        }
    }
}
