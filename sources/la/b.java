package la;

import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.ComplianceActivity;

/* loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComplianceActivity f32567s;

    public b(ComplianceActivity complianceActivity) {
        this.f32567s = complianceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f32567s.finish();
    }
}
