package ka;

import android.content.Context;
import android.util.Base64;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes2.dex */
public final class jc {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final ContentRecord f31326s;

        /* renamed from: t, reason: collision with root package name */
        public final Context f31327t;

        public a(Context context, ContentRecord contentRecord) {
            this.f31326s = contentRecord;
            if (context != null) {
                this.f31327t = context.getApplicationContext();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f31327t;
            if (context != null) {
                p pVar = new p(context);
                ContentRecord contentRecord = this.f31326s;
                if (contentRecord != null) {
                    try {
                        o f = pVar.f(contentRecord);
                        if (f != null) {
                            n7.f("AnalysisReport", "onWechatAppOpen, contentId: %s", contentRecord.h());
                            if (n7.d()) {
                                n7.c("AnalysisReport", "onWechatAppOpen, appId: %s, path: %s", contentRecord.L1(), contentRecord.K1());
                            }
                            f.f31525a = "163";
                            f.D = contentRecord.L1();
                            Context context2 = pVar.f31722a;
                            new ke(context2, zh.a(f.f31569u.intValue(), context2), contentRecord).p(f.f31552l, f, false, true);
                        }
                    } catch (Throwable th) {
                        n7.h("AnalysisReport", "onWechatAppOpen ex: %s", th.getClass().getSimpleName());
                    }
                }
            }
        }
    }

    public static boolean a(Context context, ContentRecord contentRecord) {
        if (androidx.transition.n.X(contentRecord.q0()) != 2 && !com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            return false;
        }
        return true;
    }

    public static boolean b(String str, String str2, boolean z10) {
        String str3;
        if (z10) {
            str3 = "SHA256withRSA/PSS";
        } else {
            str3 = "SHA256withRSA";
        }
        try {
            Signature signature = Signature.getInstance(str3);
            signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA67s2IdcCvkfndK4BoR5JXuOkfzYM7z9y81CX++F2zFYW70OTbcBxweuaR3kRKW7bAGFLJ+D70Ih2NuZP1ZYoSrcft/bs6kZQEzm7PowrO3AGe7fQbRy2ayf2AQGhEe6xMTheH0TkaE0d+zW3ZneJ9O8KNkWACA4IUxwke1I/gc8JwjQlIL2+cfsgjUpVflJEzUFuADdJh57QgTYc7yt8bISmo4L9PmivOrQsIpD3DPYGqi9RCmGoQ8npEfXwy72FKy2aDBIkoNsgzwsBt1CcUY5dSEuodkiWXtaYUMcypaTf9pgCp35AWwQJcSeP7rGENbYhdesFs3maK8SYsYOUfZ0WgaukdS9gmXJ8gPwIMW4QDoDa+r5KK0MnvZWvg3pcbX/H2IwghnMWwsRRDLIJiP5sKiE7NW8Ld4z1sYOmLj42/WLoezKGK3Ul7z0pBvWH8DgklMzqsEc5E7Zf4rSWcNlYhywMhGwd2PWgYWta2nM+cjbJ6yLdcn9Tk1cnWhFFAgMBAAE=", 2))));
            signature.update(androidx.transition.n.O(str));
            return signature.verify(Base64.decode(str2.getBytes("UTF-8"), 2));
        } catch (Exception e10) {
            n7.j("LandingPagePresenter", "verify error: %s", e10.getClass().getSimpleName());
            return false;
        }
    }

    public static void c(Context context, ContentRecord contentRecord) {
        if (context != null && contentRecord != null && androidx.transition.n.K()) {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, ConfigSpHandler.b(context).n());
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = contentRecord.L1();
            req.path = contentRecord.K1();
            req.miniprogramType = 0;
            boolean sendReq = createWXAPI.sendReq(req);
            n7.f("LandingPagePresenter", "openWxApp, id: %s, path: %s, ret: %s", com.huawei.openalliance.ad.ppskit.utils.y1.w(contentRecord.L1()), androidx.transition.n.u(contentRecord.K1()), Boolean.valueOf(sendReq));
            if (sendReq) {
                com.huawei.openalliance.ad.ppskit.utils.p2.b(new a(context, contentRecord));
            }
        }
    }
}
