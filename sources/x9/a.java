package x9;

import android.view.View;
import com.huawei.openalliance.ad.activity.ComplianceActivity;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComplianceActivity f36508s;

    public a(ComplianceActivity complianceActivity) {
        this.f36508s = complianceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f36508s.finish();
    }
}
