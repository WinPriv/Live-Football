package com.huawei.openalliance.ad.ppskit.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.n;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.ArrayList;
import ka.c7;
import ka.n7;

/* loaded from: classes2.dex */
public class AgProtocolActivity extends SafeActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final ArrayList f22316v;

    /* renamed from: s, reason: collision with root package name */
    public String f22317s;

    /* renamed from: t, reason: collision with root package name */
    public int f22318t;

    /* renamed from: u, reason: collision with root package name */
    public String f22319u;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            AgProtocolActivity agProtocolActivity = AgProtocolActivity.this;
            Intent intent = agProtocolActivity.getIntent();
            try {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT);
                agProtocolActivity.f22318t = intent.getIntExtra("pendingIntent.type", 6);
                agProtocolActivity.f22317s = intent.getStringExtra("task.pkg");
                agProtocolActivity.f22319u = intent.getStringExtra(ba.M);
                AgProtocolActivity.b(agProtocolActivity);
                int i11 = agProtocolActivity.f22318t;
                if (i11 == 6) {
                    i10 = 101;
                } else if (i11 == 8888) {
                    i10 = 102;
                } else {
                    i10 = 100;
                }
                int i12 = i10;
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putInt("agd.extra.bundle.requestcode", i12);
                intent2.putExtra("agd.extra.bundle", bundle);
                if (AgProtocolActivity.f22316v.contains(agProtocolActivity.getPackageName())) {
                    intent2.putExtra("agd.extra.autofinish", 1);
                }
                n7.e("resolution", "resolution type=" + agProtocolActivity.f22318t);
                AgProtocolActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), i12, intent2, 0, 0, 0);
            } catch (Throwable th) {
                n7.e("resolution", " startIntentSenderForResult error:e=".concat(th.getClass().getName()));
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f22316v = arrayList;
        arrayList.add(w.cp);
    }

    public static void b(AgProtocolActivity agProtocolActivity) {
        Context applicationContext = agProtocolActivity.getApplicationContext();
        int i10 = agProtocolActivity.f22318t;
        String str = agProtocolActivity.f22317s;
        String str2 = agProtocolActivity.f22319u;
        AnalysisEventReport analysisEventReport = new AnalysisEventReport();
        analysisEventReport.c(i10);
        analysisEventReport.h(str);
        analysisEventReport.j(str2);
        analysisEventReport.l("openAgProtocolActivity");
        c7.l(applicationContext).k(cy.I, y0.q(null, analysisEventReport), null, null);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        String str2;
        int i12;
        super.onActivityResult(i10, i11, intent);
        n7.e("resolution", "requestCode=" + i10 + "resultCode=" + i11);
        if (100 == i10) {
            if (1001 == i11) {
                n7.e("resolution", "AG agree protocol");
                n.G(this, 1001, this.f22317s, this.f22319u);
            } else {
                n7.e("resolution", "AG disagree protocol");
                str = this.f22317s;
                str2 = this.f22319u;
                i12 = 1002;
                n.G(this, i12, str, str2);
            }
        } else {
            if (101 == i10) {
                str = this.f22317s;
                str2 = this.f22319u;
                i12 = 1003;
            } else if (102 == i10) {
                if (i11 == -1) {
                    n7.e("resolution", "install hiapp");
                }
                str = this.f22317s;
                str2 = this.f22319u;
                i12 = 1005;
            }
            n.G(this, i12, str, str2);
        }
        finish();
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p2.d(new a());
    }
}
