package ka;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;

/* loaded from: classes2.dex */
public final class vi extends ui implements View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public TextView f32035t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f32036u;

    /* renamed from: v, reason: collision with root package name */
    public va.g f32037v;

    public vi(Context context) {
        super(context);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        va.g gVar = this.f32037v;
        if (gVar != null) {
            if (view == this.f32035t) {
                gVar.getClass();
            } else if (view == this.f32036u) {
                PPSArActivity pPSArActivity = (PPSArActivity) gVar;
                if (pPSArActivity.f22377v != null) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setFlags(268435456);
                    intent.setData(Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, pPSArActivity.f22377v.getPackageName(), null));
                    pPSArActivity.startActivity(intent);
                }
            } else {
                return;
            }
            dismiss();
        }
    }

    @Override // ka.ui, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hiad_dialog_permission_setting);
        this.f32035t = (TextView) findViewById(R.id.permission_setting_cancel);
        this.f32036u = (TextView) findViewById(R.id.permission_setting_go);
        TextView textView = this.f32035t;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f32036u;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
    }
}
