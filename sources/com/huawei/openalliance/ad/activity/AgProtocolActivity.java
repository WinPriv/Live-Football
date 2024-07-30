package com.huawei.openalliance.ad.activity;

import a3.l;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.appmarket.service.externalservice.activityresult.IActivityResult;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import gb.c0;
import gb.w;
import j7.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class AgProtocolActivity extends c {

    /* renamed from: w, reason: collision with root package name */
    public static final ArrayList f21933w;

    /* renamed from: s, reason: collision with root package name */
    public String f21934s;

    /* renamed from: t, reason: collision with root package name */
    public int f21935t;

    /* renamed from: u, reason: collision with root package name */
    public String f21936u;

    /* renamed from: v, reason: collision with root package name */
    public final b f21937v = new b(this);

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            AgProtocolActivity agProtocolActivity = AgProtocolActivity.this;
            Intent intent = agProtocolActivity.getIntent();
            if (intent != null) {
                try {
                    PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT);
                    agProtocolActivity.f21935t = intent.getIntExtra("pendingIntent.type", 6);
                    agProtocolActivity.f21934s = intent.getStringExtra("task.pkg");
                    agProtocolActivity.f21936u = intent.getStringExtra(ba.M);
                    cz.Code(agProtocolActivity.getApplicationContext(), agProtocolActivity.f21935t, agProtocolActivity.f21934s, agProtocolActivity.f21936u, "openAgProtocolActivity");
                    int i11 = agProtocolActivity.f21935t;
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
                    b bVar = agProtocolActivity.f21937v;
                    bVar.getClass();
                    bundle.putBinder("agd.extra.bundle.binder", bVar);
                    bundle.putInt("agd.extra.bundle.requestcode", i12);
                    intent2.putExtra("agd.extra.bundle", bundle);
                    if (AgProtocolActivity.f21933w.contains(agProtocolActivity.getPackageName())) {
                        intent2.putExtra("agd.extra.autofinish", 1);
                    }
                    ex.V("resolution", "resolution type=" + agProtocolActivity.f21935t);
                    AgProtocolActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), i12, intent2, 0, 0, 0);
                } catch (Throwable th) {
                    ex.V("resolution", "startIntentSenderForResult error:e=".concat(th.getClass().getName()));
                    agProtocolActivity.finish();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends IActivityResult.a {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<AgProtocolActivity> f21939a;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f21940s;

            public a(int i10) {
                this.f21940s = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AgProtocolActivity agProtocolActivity;
                WeakReference<AgProtocolActivity> weakReference = b.this.f21939a;
                if (weakReference == null) {
                    agProtocolActivity = null;
                } else {
                    agProtocolActivity = weakReference.get();
                }
                if (agProtocolActivity != null) {
                    agProtocolActivity.onActivityResult(this.f21940s, 0, null);
                }
            }
        }

        public b(AgProtocolActivity agProtocolActivity) {
            this.f21939a = new WeakReference<>(agProtocolActivity);
        }

        @Override // com.huawei.appmarket.service.externalservice.activityresult.IActivityResult
        public final void onActivityCancel(int i10) {
            ex.V("resolution", "onActivityCancel requestCode=" + i10);
            w.b(new a(i10));
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f21933w = arrayList;
        arrayList.add(com.huawei.openalliance.ad.constant.w.cp);
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        String str2;
        int i12;
        super.onActivityResult(i10, i11, intent);
        StringBuilder r10 = l.r("requestCode=", i10, "resultCode=", i11, " appPackageName=");
        r10.append(this.f21934s);
        ex.V("resolution", r10.toString());
        if (100 == i10) {
            if (1001 == i11) {
                ex.V("resolution", "AG agree protocol");
                r.e(this, 1001, this.f21934s, this.f21936u);
            } else {
                ex.V("resolution", "AG disagree protocol");
                str = this.f21934s;
                str2 = this.f21936u;
                i12 = 1002;
                r.e(this, i12, str, str2);
            }
        } else {
            if (101 == i10) {
                ex.V("resolution", "syncAgResolutionStatus:101");
                str = this.f21934s;
                str2 = this.f21936u;
                i12 = 1003;
            } else if (102 == i10) {
                if (i11 == -1) {
                    ex.V("resolution", "install hiapp");
                    str = this.f21934s;
                    str2 = this.f21936u;
                    i12 = 1004;
                } else {
                    ex.V("resolution", "install hiapp, user cancel");
                    str = this.f21934s;
                    str2 = this.f21936u;
                    i12 = 1005;
                }
            }
            r.e(this, i12, str, str2);
        }
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0.c(new a());
    }
}
