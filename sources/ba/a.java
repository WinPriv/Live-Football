package ba;

import android.view.View;
import com.huawei.hms.ads.eu;
import com.huawei.openalliance.ad.compliance.ComplianceView;
import gb.r0;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComplianceView f3180s;

    public a(ComplianceView complianceView) {
        this.f3180s = complianceView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ComplianceView complianceView = this.f3180s;
        if (complianceView.H != null) {
            r0.l(complianceView.getContext(), complianceView.H.k0());
            eu euVar = complianceView.J;
            if (euVar != null) {
                euVar.Code();
            }
        }
    }
}
