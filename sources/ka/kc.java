package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.PPSFullScreenNotifyActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;

/* loaded from: classes2.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31374a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentRecord f31375b;

    /* renamed from: c, reason: collision with root package name */
    public AppInfo f31376c;

    /* renamed from: d, reason: collision with root package name */
    public gj f31377d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31378e = false;
    public final int f;

    public kc(Context context, ContentRecord contentRecord, int i10) {
        this.f31374a = context;
        this.f31375b = contentRecord;
        this.f = i10;
        this.f31376c = contentRecord.j0();
    }

    public final void a(int i10) {
        String str;
        z6.f aVar;
        ContentRecord contentRecord = this.f31375b;
        if (contentRecord == null) {
            return;
        }
        AppInfo appInfo = this.f31376c;
        if (appInfo != null) {
            str = appInfo.getPackageName();
        } else {
            str = null;
        }
        Context context = this.f31374a;
        if (a0.a.t0(context, str)) {
            aVar = new ra.m();
        } else {
            aVar = new ra.a();
        }
        if (aVar.e(context, this.f31376c, contentRecord, 1)) {
            if (!this.f31378e) {
                if (this.f31377d != null) {
                    w wVar = new w();
                    wVar.f32042e = com.huawei.openalliance.ad.ppskit.utils.y1.d(Integer.valueOf(this.f));
                    wVar.f = com.huawei.openalliance.ad.ppskit.utils.y1.d(Integer.valueOf(i10));
                    ((PPSFullScreenNotifyActivity) this.f31377d).c("1", wVar);
                }
                this.f31378e = true;
            }
            PersistentMessageCenter.getInstance().notifyMessage(context.getPackageName(), "com.huawei.hms.pps.action.OPEN_IN_ADREWARD", new Intent("com.huawei.hms.pps.action.OPEN_IN_ADREWARD"));
        }
    }

    public final void b(String str, w wVar) {
        gj gjVar = this.f31377d;
        if (gjVar != null) {
            ((PPSFullScreenNotifyActivity) gjVar).c(str, wVar);
            ((PPSFullScreenNotifyActivity) this.f31377d).d();
        }
    }

    public final void c() {
        gj gjVar = this.f31377d;
        if (gjVar != null) {
            ((PPSFullScreenNotifyActivity) gjVar).d();
        }
    }
}
