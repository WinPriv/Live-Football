package ka;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultReq;
import com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultRsp;

/* loaded from: classes2.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30944a;

    /* renamed from: b, reason: collision with root package name */
    public final ib.o f30945b;

    /* loaded from: classes2.dex */
    public class a implements pg {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f30946a;

        public a(b bVar) {
            this.f30946a = bVar;
        }

        @Override // ka.pg
        public final void a() {
            ib.o oVar = ae.this.f30945b;
            String c10 = oVar.c();
            String d10 = oVar.d();
            String a10 = oVar.a();
            String b10 = oVar.b();
            String e10 = oVar.e();
            String f = oVar.f();
            String g6 = oVar.g();
            b bVar = this.f30946a;
            if (ae.f(c10, bVar.f30948a)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("switch_confirm_result_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear switch consent confirm result");
            }
            if (ae.f(d10, bVar.f30949b)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("reset_confirm_result_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear reset consent confirm result");
            }
            if (ae.f(a10, bVar.f30950c)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("location_confirm_result_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear location consent confirm result");
            }
            if (ae.f(b10, bVar.f30951d)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("legal_interest_result_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear legal interest consent confirm result");
            }
            if (ae.f(e10, bVar.f30952e)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("recommendation_switch_confirm_result_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear recommendation consent confirm result");
            }
            if (ae.f(f, bVar.f)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("main_app_track_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear mainAppTrack consent confirm result");
            }
            if (ae.f(g6, bVar.f30953g)) {
                synchronized (ib.o.f29509d) {
                    oVar.h().edit().putString("sub_app_track_key", "").commit();
                }
                n7.e("ConsentConfirmProcessor", "clear subAppTrack consent confirm result");
            }
            n7.g("ConsentConfirmProcessor", "report oaid and location switch consent cache in persistent success");
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f30948a;

        /* renamed from: b, reason: collision with root package name */
        public String f30949b;

        /* renamed from: c, reason: collision with root package name */
        public String f30950c;

        /* renamed from: d, reason: collision with root package name */
        public String f30951d;

        /* renamed from: e, reason: collision with root package name */
        public String f30952e;
        public String f;

        /* renamed from: g, reason: collision with root package name */
        public String f30953g;
    }

    /* loaded from: classes2.dex */
    public static class c implements d7<ConfirmResultRsp> {
        @Override // ka.d7
        public final void a(y6 y6Var) {
            String str;
            if (y6Var.f32210b == 200) {
                str = "send report setting consent cache in oobe processor success";
            } else {
                str = "send report setting consent cache in oobe processor failed";
            }
            n7.g("ConsentConfirmProcessor", str);
        }
    }

    public ae(Context context) {
        ib.o oVar;
        this.f30944a = context.getApplicationContext();
        synchronized (ib.o.f29508c) {
            if (ib.o.f29507b == null) {
                ib.o.f29507b = new ib.o(context);
            }
            oVar = ib.o.f29507b;
        }
        this.f30945b = oVar;
    }

    public static ConfirmResultReq a(ApiStatisticsReq apiStatisticsReq, String str) {
        ConfirmResultReq confirmResultReq = null;
        if (!TextUtils.isEmpty(str)) {
            confirmResultReq = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str, ConfirmResultReq.class, new Class[0]);
        }
        if (confirmResultReq == null || confirmResultReq.a() == null) {
            confirmResultReq = new ConfirmResultReq();
        }
        if (confirmResultReq.a().size() >= 25) {
            confirmResultReq.a().remove(0);
        }
        confirmResultReq.a().add(apiStatisticsReq);
        return confirmResultReq;
    }

    public static void d(ConfirmResultReq confirmResultReq, ConfirmResultReq confirmResultReq2) {
        if (confirmResultReq2 != null && confirmResultReq2.a() != null) {
            confirmResultReq.a().addAll(confirmResultReq2.a());
        }
    }

    public static boolean f(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            return true;
        }
        return false;
    }

    public final void b() {
        n7.e("ConsentConfirmProcessor", "report oaid consent cache in oobe processor");
        Context context = this.f30944a;
        if (com.huawei.openalliance.ad.ppskit.utils.z1.P(context)) {
            n7.i("ConsentConfirmProcessor", "cache consent result must in persistent processor");
        } else {
            c7.l(context).k("reportSettingConfirmResult", null, new c(), ConfirmResultRsp.class);
        }
    }

    public final void c(int i10, String str) {
        String str2;
        String str3;
        String str4;
        boolean z10;
        if (TextUtils.isEmpty(str)) {
            str3 = "ConsentConfirmProcessor";
            str4 = s.f.b("consent result is empty: ", str);
        } else {
            if (!com.huawei.openalliance.ad.ppskit.utils.z1.P(this.f30944a)) {
                String M = com.huawei.openalliance.ad.ppskit.utils.z1.M(this.f30944a);
                n7.e("SystemUtil", "process: " + M);
                if (!TextUtils.equals(M, "com.huawei.hwid.oobe") && !TextUtils.equals(M, "com.huawei.hms.oobe") && !TextUtils.equals(M, "com.huawei.hwid.tv.oobe")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    str3 = "ConsentConfirmProcessor";
                    str4 = "cache consent result must in persistent/oobe processor";
                }
            }
            ApiStatisticsReq apiStatisticsReq = (ApiStatisticsReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str, ApiStatisticsReq.class, new Class[0]);
            if (apiStatisticsReq == null) {
                str3 = "ConsentConfirmProcessor";
                str4 = "consent result parse failed";
            } else {
                if (ib.r.d(this.f30944a)) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                apiStatisticsReq.l(str2);
                n7.e("ConsentConfirmProcessor", "consent type is: " + i10);
                switch (i10) {
                    case 1:
                        ib.o oVar = this.f30945b;
                        String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar.c()));
                        if (q10 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar.h().edit().putString("switch_confirm_result_key", q10).commit();
                            }
                            return;
                        }
                        return;
                    case 2:
                        ib.o oVar2 = this.f30945b;
                        String q11 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar2.d()));
                        if (q11 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar2.h().edit().putString("reset_confirm_result_key", q11).commit();
                            }
                            return;
                        }
                        return;
                    case 3:
                        ib.o oVar3 = this.f30945b;
                        String q12 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar3.a()));
                        if (q12 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar3.h().edit().putString("location_confirm_result_key", q12).commit();
                            }
                            return;
                        }
                        return;
                    case 4:
                        ib.o oVar4 = this.f30945b;
                        String bool = Boolean.TRUE.toString();
                        oVar4.getClass();
                        if (bool != null) {
                            synchronized (ib.o.f29509d) {
                                oVar4.h().edit().putString("legal_interest_click_next", bool).commit();
                            }
                        }
                        h(apiStatisticsReq);
                        ib.o oVar5 = this.f30945b;
                        String q13 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar5.b()));
                        if (q13 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar5.h().edit().putString("legal_interest_result_key", q13).commit();
                            }
                            return;
                        }
                        return;
                    case 5:
                        ib.o oVar6 = this.f30945b;
                        String bool2 = Boolean.TRUE.toString();
                        oVar6.getClass();
                        if (bool2 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar6.h().edit().putString("legal_interest_open_oaid", bool2).commit();
                            }
                        }
                        h(apiStatisticsReq);
                        ib.o oVar7 = this.f30945b;
                        String q14 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar7.b()));
                        if (q14 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar7.h().edit().putString("legal_interest_result_key", q14).commit();
                            }
                            return;
                        }
                        return;
                    case 6:
                        ib.o oVar8 = this.f30945b;
                        oVar8.getClass();
                        synchronized (ib.o.f29509d) {
                            oVar8.h().edit().putInt("legal_interest_more_info_kit_ver", 30465300).commit();
                        }
                        return;
                    case 7:
                        ib.o oVar9 = this.f30945b;
                        String q15 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar9.e()));
                        if (q15 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar9.h().edit().putString("recommendation_switch_confirm_result_key", q15).commit();
                            }
                            return;
                        }
                        return;
                    case 8:
                        ib.o oVar10 = this.f30945b;
                        String q16 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar10.f()));
                        if (q16 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar10.h().edit().putString("main_app_track_key", q16).commit();
                            }
                            return;
                        }
                        return;
                    case 9:
                        ib.o oVar11 = this.f30945b;
                        String q17 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a(apiStatisticsReq, oVar11.g()));
                        if (q17 != null) {
                            synchronized (ib.o.f29509d) {
                                oVar11.h().edit().putString("sub_app_track_key", q17).commit();
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
        n7.i(str3, str4);
    }

    public final boolean e(int i10, ApiStatisticsReq apiStatisticsReq) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("consent_result_type", Integer.valueOf(i10));
        contentValues.put("consent_result", com.huawei.openalliance.ad.ppskit.utils.y0.q(null, apiStatisticsReq));
        Context context = this.f30944a;
        Uri I = com.huawei.openalliance.ad.ppskit.utils.z1.I(context, "/consent_result/update");
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.g(context, I)) {
            n7.g("ConsentConfirmProcessor", "provider uri invalid.");
            return false;
        }
        if (context.getContentResolver().update(I, contentValues, null, null) <= 0) {
            return false;
        }
        return true;
    }

    public final void g() {
        boolean z10;
        Context context = this.f30944a;
        boolean R = com.huawei.openalliance.ad.ppskit.utils.z1.R(context);
        n7.e("ConsentConfirmProcessor", "oobe: " + R);
        if (R) {
            n7.e("ConsentConfirmProcessor", "not report consent result in oobe");
            return;
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.z1.P(context)) {
            n7.i("ConsentConfirmProcessor", "report consent result must in persistent processor");
            return;
        }
        b bVar = new b();
        ib.o oVar = this.f30945b;
        bVar.f30948a = oVar.c();
        bVar.f30949b = oVar.d();
        bVar.f30950c = oVar.a();
        bVar.f30951d = oVar.b();
        bVar.f30952e = oVar.e();
        bVar.f = oVar.f();
        bVar.f30953g = oVar.g();
        if (TextUtils.isEmpty(bVar.f30948a) && TextUtils.isEmpty(bVar.f30949b) && TextUtils.isEmpty(bVar.f30950c) && TextUtils.isEmpty(bVar.f30951d) && TextUtils.isEmpty(bVar.f30952e) && TextUtils.isEmpty(bVar.f) && TextUtils.isEmpty(bVar.f30953g)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ConfirmResultReq confirmResultReq = new ConfirmResultReq();
            ConfirmResultReq confirmResultReq2 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30948a, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq3 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30949b, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq4 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30950c, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq5 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30951d, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq6 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30952e, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq7 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f, ConfirmResultReq.class, new Class[0]);
            ConfirmResultReq confirmResultReq8 = (ConfirmResultReq) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, bVar.f30953g, ConfirmResultReq.class, new Class[0]);
            d(confirmResultReq, confirmResultReq2);
            d(confirmResultReq, confirmResultReq3);
            d(confirmResultReq, confirmResultReq4);
            d(confirmResultReq, confirmResultReq5);
            d(confirmResultReq, confirmResultReq6);
            d(confirmResultReq, confirmResultReq7);
            d(confirmResultReq, confirmResultReq8);
            if (confirmResultReq.a() != null && confirmResultReq.a().size() != 0) {
                n7.e("ConsentConfirmProcessor", "report oaid and location switch consent cache in persistent");
                new v(context).k(context.getPackageName(), "3.4.65.300", confirmResultReq, new a(bVar));
            } else {
                n7.e("ConsentConfirmProcessor", "oaid and location switch consent has no cache");
            }
        }
    }

    public final void h(ApiStatisticsReq apiStatisticsReq) {
        String str;
        try {
            Context context = this.f30944a;
            int i10 = ib.r.f29513a;
            Pair<String, Boolean> b10 = ib.r.b(context, context.getPackageName());
            if (b10 == null) {
                return;
            }
            apiStatisticsReq.j((String) b10.first);
            if (((Boolean) b10.second).booleanValue()) {
                str = "0";
            } else {
                str = "1";
            }
            apiStatisticsReq.l(str);
        } catch (ib.s unused) {
            n7.g("ConsentConfirmProcessor", "cache legal interest result failed");
        }
    }
}
