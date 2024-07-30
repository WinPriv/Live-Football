package jc;

import android.content.Context;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.f1;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.security.SecureRandom;
import java.util.Map;
import ka.n7;
import ka.ue;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f30199b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f30200a;

    public static a b(Context context) {
        if (f30199b == null) {
            synchronized (a.class) {
                if (f30199b == null) {
                    f30199b = new a(context.getApplicationContext(), 0);
                }
            }
        }
        return f30199b;
    }

    public String a(String str, String str2) {
        return a0.a.K(this.f30200a).a(str, str2);
    }

    public void c() {
        long j10;
        int i10;
        int intValue;
        ConfigSpHandler b10 = ConfigSpHandler.b(this.f30200a);
        synchronized (b10.f22478a) {
            j10 = b10.s().getLong("kit_config_refresh_last_time", 0L);
        }
        synchronized (b10.f22478a) {
            i10 = b10.s().getInt("kit_config_refresh_interval", 360);
        }
        if (System.currentTimeMillis() - j10 > i10 * w.f22171t) {
            ConfigSpHandler b11 = ConfigSpHandler.b(this.f30200a);
            synchronized (b11.f22478a) {
                Integer num = 30;
                Map<String, String> u2 = b11.u(false);
                if (u2 != null && u2.get("kitConfigRandom") != null && ((num = y1.q(u2.get("kitConfigRandom"))) == null || num.intValue() <= 0)) {
                    num = 30;
                }
                intValue = num.intValue();
            }
            long nextInt = new SecureRandom().nextInt(intValue * w.f22171t);
            n7.c("KitConfigProcessor", "request kit config random : %s", Long.valueOf(nextInt));
            f1.a(new ue(this), nextInt);
            return;
        }
        if (n7.d()) {
            n7.b("KitConfigProcessor", "request kit config too quickly");
        }
    }

    public /* synthetic */ a(Context context, int i10) {
        if (i10 != 1) {
            this.f30200a = context;
        } else {
            this.f30200a = context.getApplicationContext().createDeviceProtectedStorageContext();
        }
    }
}
