package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultReq;
import com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultRsp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e1 extends y {

    /* loaded from: classes2.dex */
    public class a implements pg {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.huawei.android.hms.ppskit.a f31114a;

        public a(com.huawei.android.hms.ppskit.a aVar) {
            this.f31114a = aVar;
        }

        @Override // ka.pg
        public final void a() {
            ConfirmResultRsp confirmResultRsp = new ConfirmResultRsp();
            confirmResultRsp.a();
            y.d(this.f31114a, e1.this.f32203a, 200, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, confirmResultRsp));
        }
    }

    public e1() {
        super("reportconfirmresult");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean h10 = com.huawei.openalliance.ad.ppskit.utils.y1.h(str3);
        String str4 = this.f32203a;
        if (h10) {
            n7.i("CmdReportConfirmResult", "confirmResult req is empty, please check it!");
            y.d(aVar, str4, -1, "");
            return;
        }
        ConfirmResultReq confirmResultReq = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str3, ConfirmResultReq.class, new Class[0]);
        if (confirmResultReq != null && confirmResultReq.a() != null) {
            v vVar = new v(context);
            String j10 = com.huawei.openalliance.ad.ppskit.utils.o2.j(context, str);
            if (!TextUtils.isEmpty(str) && oa.j.b(str, j10)) {
                if (confirmResultReq.a().get(0) != null) {
                    try {
                        String optString = new JSONObject(confirmResultReq.a().get(0).m()).optString("fast_app_package");
                        if (!TextUtils.isEmpty(optString)) {
                            str = optString;
                        }
                    } catch (JSONException unused) {
                        n7.g("CmdReportConfirmResult", "get pkgName failed, params is not valid json");
                    }
                }
                n7.c("CmdReportConfirmResult", "fast app set app package name: %s", str);
            } else {
                n7.c("CmdReportConfirmResult", "app set app package name: %s", str);
            }
            vVar.k(str, str2, confirmResultReq, new a(aVar));
            return;
        }
        y.d(aVar, str4, -1, "");
    }
}
