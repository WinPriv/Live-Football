package ka;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LocalChannelInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class p extends r {
    public p(Context context) {
        super(context);
    }

    public static void s(o oVar, DelayInfo delayInfo) {
        if (delayInfo != null) {
            oVar.D = delayInfo.x();
            oVar.E = delayInfo.w();
            oVar.f31577z = delayInfo.b();
            oVar.B = delayInfo.v();
            oVar.C = delayInfo.k();
            oVar.f31529b0 = delayInfo.d();
            oVar.f31532c0 = delayInfo.g();
            oVar.f31535d0 = delayInfo.n();
            oVar.f31538e0 = delayInfo.m();
            oVar.f31539f0 = delayInfo.y();
            oVar.f31542g0 = delayInfo.z();
            oVar.f31545h0 = delayInfo.A();
            oVar.f31547i0 = delayInfo.I();
            oVar.f31551k0 = delayInfo.a();
            List<String> r10 = delayInfo.r();
            if (!androidx.transition.n.M(r10)) {
                oVar.f31559p = r10.toString();
                oVar.F = String.valueOf(r10.size());
            }
            List<String> s10 = delayInfo.s();
            if (!androidx.transition.n.M(s10)) {
                oVar.f31561q = s10.toString();
                oVar.U = String.valueOf(s10.size());
            }
            oVar.V = String.valueOf(delayInfo.u());
            oVar.W = String.valueOf(delayInfo.B());
            oVar.Y = String.valueOf(delayInfo.C());
            oVar.Z = String.valueOf(delayInfo.D());
            Integer G = delayInfo.G();
            if (G != null) {
                oVar.f31526a0 = String.valueOf(G);
            }
            oVar.N0 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, delayInfo.E());
            oVar.S = delayInfo.F();
            oVar.Q0 = delayInfo.H();
        }
    }

    public final void g(int i10, long j10, String str, String str2, String str3, String str4) {
        String str5;
        try {
            n7.e("AnalysisReport", "onAidlCalledResult:" + str2);
            if (TextUtils.isEmpty(str2)) {
                n7.g("AnalysisReport", "onAidlCalledResult, exceptionType is null");
                return;
            }
            int i11 = 0;
            o c10 = c("", false);
            if (c10 == null) {
                return;
            }
            boolean equals = "43".equals(str2);
            Context context = this.f31722a;
            if (equals) {
                if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.d(new com.huawei.openalliance.ad.ppskit.utils.a(context.getApplicationContext()));
                    str5 = androidx.activity.n.f517x;
                } else {
                    str5 = null;
                }
                c10.I0 = str5;
            }
            c10.f31525a = str2;
            c10.f31577z = j10;
            c10.y = str3;
            c10.f31565s = str4;
            c10.G = com.huawei.openalliance.ad.ppskit.utils.i2.p(context);
            c10.b(i10);
            ke keVar = new ke(context, new sh(context, i11), null);
            if (!com.huawei.openalliance.ad.ppskit.utils.m.Z(context) || !"43".equals(str2)) {
                keVar.t(str, c10, false, true);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onAidlCalledResult:", "AnalysisReport");
        }
    }

    public final void h(int i10, ContentRecord contentRecord, String str) {
        try {
            o e10 = e(contentRecord, str);
            if (e10 == null) {
                return;
            }
            e10.f31525a = "136";
            e10.L = i10;
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, e10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onAdRequestSuccess:", "AnalysisReport");
        }
    }

    public final void i(int i10, String str, ContentRecord contentRecord, boolean z10, String str2) {
        String str3;
        Context context = this.f31722a;
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onImageLoadFailedEvent, contentRecord is null.");
                return;
            }
            o e10 = e(contentRecord, contentRecord.h1());
            r.b(context, e10);
            r.d(context, e10);
            if (e10 == null) {
                return;
            }
            e10.f31525a = "104";
            e10.f31563r = contentRecord.m3();
            e10.L = i10;
            e10.D = str;
            if (z10) {
                str3 = "exsplash";
            } else {
                str3 = "normal";
            }
            e10.E = str3;
            e10.F = str2;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), e10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onImageLoadFailedEvent:", "AnalysisReport");
        }
    }

    public final void j(long j10) {
        int i10 = 0;
        try {
            o c10 = c("", true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "143";
            c10.D = String.valueOf(j10);
            c10.F = "hiad_recd";
            Context context = this.f31722a;
            new ke(context, new sh(context, i10), null).t(c10.f31552l, c10, false, false);
        } catch (Throwable th) {
            n7.h("AnalysisReport", "onDbSizeReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public final void k(ContentRecord contentRecord, int i10, int i11, String str, boolean z10) {
        String str2;
        try {
            int z02 = contentRecord.z0();
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "108";
            f.f31567t = str;
            f.D = String.valueOf(i10);
            f.E = String.valueOf(contentRecord.A1());
            f.F = String.valueOf(i11);
            if (z10) {
                str2 = "exsplash";
            } else {
                str2 = "normal";
            }
            f.U = str2;
            if ((contentRecord.h0() != null && contentRecord.h0().A() == null) || (contentRecord.f0() != null && (contentRecord.f0().l() == 0 || contentRecord.f0().m() == 0))) {
                f.L = 1;
            }
            Context context = this.f31722a;
            ke keVar = new ke(context, zh.a(z02, context), null);
            keVar.f31382b = contentRecord;
            keVar.t(contentRecord.h1(), f, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onContentOrrentationError:", "AnalysisReport");
        }
    }

    public final void l(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            n7.g("AnalysisReport", "onAppInstalled, contentRecord is null ");
            return;
        }
        try {
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "50";
            f.f31565s = String.valueOf(Process.myPid());
            if (!TextUtils.isEmpty(str)) {
                f.D = str;
            }
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), contentRecord).t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onAppInstalled:", "AnalysisReport");
        }
    }

    public final void m(String str, ContentRecord contentRecord, String str2, w wVar) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onFullScreenNotifyAction, contentRecord is null.");
                return;
            }
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            if (n7.d()) {
                n7.c("AnalysisReport", "onFullScreenNotifyAction, extraStr1: %s", str2);
            }
            if (wVar != null) {
                if (n7.d()) {
                    n7.c("AnalysisReport", "onFullScreenNotifyAction, extraStr2: %s, extraStr3: %s", wVar.f32042e, wVar.f);
                }
                c10.E = wVar.f32042e;
                c10.F = wVar.f;
            }
            c10.f31525a = "126";
            c10.D = str2;
            c10.b(contentRecord.z0());
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.R = contentRecord.i();
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onFullScreenNotifyAction:", "AnalysisReport");
        }
    }

    public final void n(String str, String str2, int i10, String str3, int i11, boolean z10, boolean z11) {
        try {
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "135";
            c10.f31559p = str3;
            c10.f31567t = str2;
            c10.b(i10);
            c10.L = i11;
            if (z11) {
                c10.D = "1";
            } else {
                c10.D = "0";
            }
            if (z10) {
                c10.E = "1";
            } else {
                c10.E = "0";
            }
            Context context = this.f31722a;
            new ke(context, zh.a(i10, context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onAdRequestSuccess:", "AnalysisReport");
        }
    }

    public final void o(String str, String str2, LocalChannelInfo localChannelInfo) {
        String str3;
        if (localChannelInfo == null) {
            n7.g("AnalysisReport", "onInstallDialogAction, channelInfo is null");
            return;
        }
        o c10 = c(str, true);
        if (c10 == null) {
            return;
        }
        c10.f31525a = str2;
        JSONObject a10 = localChannelInfo.a();
        if (a10 != null) {
            c10.f31559p = a10.optString("slotId");
            c10.f31561q = a10.optString("contentId");
            c10.b(a10.optInt("adType", -1));
            if (a10.length() > 0) {
                a10.remove("contentId");
                a10.remove("slotId");
                a10.remove(LocalChannelInfo.KEY_REPORT_COUNT);
                a10.remove("adType");
                a10.remove(LocalChannelInfo.KEY_DELETE_UNINSTALL);
                a10.remove(LocalChannelInfo.KEY_CHANNEL_INFO);
                a10.remove(LocalChannelInfo.KEY_CLICK_TIMESTAMP);
                a10.remove(LocalChannelInfo.KEY_INSTALL_TIMESTAMP);
                if (a10.length() > 0) {
                    str3 = a10.toString();
                    c10.f31565s = com.huawei.openalliance.ad.ppskit.utils.y1.n(str3);
                }
            }
            str3 = "";
            c10.f31565s = com.huawei.openalliance.ad.ppskit.utils.y1.n(str3);
        }
        Context context = this.f31722a;
        new ke(context, new sh(context, 0), null).t(c10.f31552l, c10, true, false);
    }

    public final void p(String str, String str2, ContentRecord contentRecord, String str3, int i10, String str4, String str5, String str6) {
        Context context = this.f31722a;
        try {
            o e10 = e(contentRecord, str);
            if (e10 == null) {
                return;
            }
            e10.f31525a = "88";
            e10.J = str3;
            e10.f31565s = str4;
            e10.L = i10;
            e10.D = com.huawei.openalliance.ad.ppskit.utils.i2.r(context);
            e10.E = com.huawei.openalliance.ad.ppskit.utils.i2.s(context);
            e10.F = str2;
            e10.U = str6;
            e10.V = str5;
            if (n7.d()) {
                n7.c("AnalysisReport", "onAgApiCalled additionInfo: %s apiName: %s, statusCode: %s", str4, str3, Integer.valueOf(i10));
            }
            new ke(context, zh.a(e10.f31569u.intValue(), context), contentRecord).t(str, e10, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onAgApiCalled:", "AnalysisReport");
        }
    }

    public final void q(String str, w wVar, int i10, boolean z10, String str2, String str3) {
        o c10;
        String str4;
        Context context = this.f31722a;
        try {
            if ((ConfigSpHandler.b(context).m() || 101 != i10) && (c10 = c(str, true)) != null) {
                c10.f31525a = "107";
                c10.b(wVar.f32041d);
                c10.f31567t = wVar.f32038a;
                c10.f31559p = wVar.f32039b;
                c10.f31561q = wVar.f32040c;
                c10.L = i10;
                c10.D = str2;
                c10.E = str3;
                if (z10) {
                    str4 = "exsplash";
                } else {
                    str4 = "normal";
                }
                c10.F = str4;
                new ke(context, zh.a(wVar.f32041d, context), null).t(str, c10, false, false);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onRecordSpareAdFailed:", "AnalysisReport");
        }
    }

    public final void r(Throwable th) {
        Context context = this.f31722a;
        try {
            o c10 = c("", true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "1";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th.getClass().getSimpleName());
            sb2.append(",");
            sb2.append(th.getMessage());
            sb2.append(",");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb2.append(stackTraceElement.toString());
                sb2.append(",");
            }
            c10.f31565s = sb2.toString();
            c10.b(-1);
            new ke(context, zh.a(-1, context), null).t(context.getPackageName(), c10, false, true);
        } catch (Throwable th2) {
            e0.i.p(th2, "onAnalysis:", "AnalysisReport");
        }
    }

    public final void t(ContentRecord contentRecord, String str, String str2) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onArContentFormatFailed, contentRecord is null.");
                return;
            }
            o v3 = v(contentRecord, str, str2);
            if (v3 == null) {
                return;
            }
            v3.f31525a = "97";
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, v3, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onArContentFormatFailed:", "AnalysisReport");
        }
    }

    public final void u(ContentRecord contentRecord, String str, String str2) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onArLandingPageAction, contentRecord is null.");
                return;
            }
            o v3 = v(contentRecord, str, str2);
            if (v3 == null) {
                return;
            }
            v3.f31525a = "98";
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, v3, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onArLandingPageAction:", "AnalysisReport");
        }
    }

    public final o v(ContentRecord contentRecord, String str, String str2) {
        o c10 = c(str, true);
        if (c10 == null) {
            return null;
        }
        c10.b(contentRecord.z0());
        c10.f31559p = contentRecord.p2();
        c10.f31561q = contentRecord.h();
        c10.R = contentRecord.i();
        c10.f31565s = str2;
        return c10;
    }
}
