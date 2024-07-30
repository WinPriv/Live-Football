package ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import java.util.HashMap;
import ka.vf;

/* loaded from: classes2.dex */
public final class oc extends m3.b {
    public boolean A;
    public boolean B;
    public int C;
    public int D;

    /* renamed from: v, reason: collision with root package name */
    public final Context f31607v;

    /* renamed from: w, reason: collision with root package name */
    public ua.b f31608w;

    /* renamed from: x, reason: collision with root package name */
    public va.e f31609x;
    public final p y;

    /* renamed from: z, reason: collision with root package name */
    public final v f31610z;

    public oc(Context context, aj ajVar) {
        super(3);
        this.A = false;
        this.B = false;
        this.f31607v = context;
        this.f32659s = ajVar;
        this.y = new p(context);
        this.f31610z = new v(context);
    }

    public final void p(int i10, MaterialClickInfo materialClickInfo) {
        String str;
        View view;
        if (this.f31608w == null) {
            return;
        }
        n7.b("RewardAdPresenter", "begin to deal click");
        HashMap hashMap = new HashMap();
        MetaData g6 = this.f31608w.g();
        String str2 = "";
        if (g6 == null) {
            str = "";
        } else {
            str = g6.f0();
        }
        hashMap.put("appId", str);
        MetaData g10 = this.f31608w.g();
        if (g10 != null) {
            str2 = g10.j();
        }
        hashMap.put("thirdId", str2);
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        Context context = this.f31607v;
        ii N = a0.a.N(context, contentRecord, hashMap, true);
        if (N instanceof ab.f) {
            N.f31311e = false;
        }
        if (N.a()) {
            vf.a aVar = new vf.a();
            aVar.f32023c = N.d();
            aVar.f32024d = Integer.valueOf(i10);
            aVar.f32025e = materialClickInfo;
            ContentRecord contentRecord2 = (ContentRecord) this.f32660t;
            Object obj = (p9) this.f32659s;
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                view = null;
            }
            androidx.activity.n.N(context, contentRecord2, com.huawei.openalliance.ad.ppskit.utils.z1.v(view), new vf(aVar));
            va.e eVar = this.f31609x;
            if (eVar != null) {
                PPSRewardActivity.l(PPSRewardActivity.this, 8, -1, -1);
            }
        }
    }

    public final void q(int i10, MaterialClickInfo materialClickInfo) {
        View view;
        vf.a aVar = new vf.a();
        aVar.f32023c = com.huawei.openalliance.ad.constant.v.B;
        aVar.f32024d = Integer.valueOf(i10);
        aVar.f32025e = materialClickInfo;
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        Object obj = (p9) this.f32659s;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        androidx.activity.n.N(this.f31607v, contentRecord, com.huawei.openalliance.ad.ppskit.utils.z1.v(view), new vf(aVar));
    }

    public final void r(long j10, int i10) {
        ContentRecord contentRecord;
        if (this.A && this.B) {
            return;
        }
        if (i10 == -2) {
            this.B = true;
        } else {
            this.A = true;
        }
        p pVar = this.y;
        if (pVar != null && (contentRecord = (ContentRecord) this.f32660t) != null) {
            this.A = true;
            try {
                o f = pVar.f(contentRecord);
                if (f != null) {
                    f.f31525a = "142";
                    f.B = j10;
                    VideoInfo h02 = contentRecord.h0();
                    if (h02 != null) {
                        w8 b10 = w8.b();
                        String a10 = h02.a();
                        b10.getClass();
                        long a11 = w8.a(a10);
                        f.B = h02.m();
                        f.C = a11;
                    }
                    f.D = com.huawei.openalliance.ad.ppskit.utils.y1.d(Integer.valueOf(i10));
                    n7.e("AnalysisReport", "adType is " + f.f31569u);
                    Context context = pVar.f31722a;
                    new ke(context, zh.a(f.f31569u.intValue(), context), contentRecord).t(f.f31552l, f, false, true);
                }
            } catch (Throwable th) {
                e0.i.p(th, "onRewardAdPopUpReport:", "AnalysisReport");
            }
        }
    }

    public final void s(String str) {
        boolean z10 = false;
        if (!TextUtils.isEmpty(str)) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case 48694:
                    if (str.equals("127")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 48695:
                    if (str.equals("128")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 48696:
                    if (str.equals("129")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 48718:
                    if (str.equals("130")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                    z10 = true;
                    break;
            }
        }
        if (!z10) {
            n7.g("RewardAdPresenter", "invalid parameter");
            return;
        }
        n7.e("RewardAdPresenter", "report Type is ".concat(str));
        this.f31610z.n((ContentRecord) this.f32660t, str);
    }

    public final void t() {
        com.huawei.openalliance.ad.ppskit.utils.p2.b(new mc(this));
    }
}
