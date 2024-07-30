package ka;

import android.content.Context;
import com.huawei.hms.safetydetect.userdetect.innersdk.UserDetectInnerAPI;
import com.huawei.hms.safetydetect.userdetect.innersdk.UserDetectInnerCallback;
import com.huawei.openalliance.ad.ppskit.beans.metadata.RiskToken;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class qh {

    /* renamed from: c, reason: collision with root package name */
    public static qh f31693c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f31694d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final UserDetectInnerAPI f31695a = new UserDetectInnerAPI();

    /* renamed from: b, reason: collision with root package name */
    public final Context f31696b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31697s;

        /* renamed from: ka.qh$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0430a implements UserDetectInnerCallback {
        }

        public a(String str) {
            this.f31697s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qh qhVar = qh.this;
            try {
                qhVar.f31695a.getRiskTokenCache(this.f31697s, qhVar.f31696b, new C0430a());
            } catch (Throwable th) {
                n7.h("UserDetectionManager", "getRiskToken encounter exception: %s", th.getClass().getSimpleName());
            }
        }
    }

    public qh(Context context) {
        this.f31696b = context.getApplicationContext();
        ConfigSpHandler.b(context);
        new HashMap();
    }

    public final String c(String str) {
        Integer num;
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31696b);
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, false);
            if (!a0.a.e0(K)) {
                num = com.huawei.openalliance.ad.ppskit.utils.y1.q(K.get("riskTokenTimeout"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() >= 0) {
                if (num.intValue() > 1000) {
                    j10 = 1000;
                } else {
                    j10 = num.intValue();
                }
            }
            j10 = 500;
        }
        if (j10 == 0) {
            return null;
        }
        RiskToken riskToken = new RiskToken();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str), 2);
        if (!countDownLatch.await(j10, TimeUnit.MILLISECONDS)) {
            n7.e("UserDetectionManager", "CountDownLatch returns false");
        }
        if (n7.d()) {
            n7.c("UserDetectionManager", "getRiskToken duration: %s ms, riskToken: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), com.huawei.openalliance.ad.ppskit.utils.y1.j(riskToken.toString()));
        }
        String b10 = riskToken.b();
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new rh(this, riskToken.a(), b10, str), 2);
        return b10;
    }
}
