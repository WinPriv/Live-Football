package ka;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a extends j1.a {

    /* renamed from: ka.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0419a implements Runnable {
        public RunnableC0419a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.getClass();
            String o = com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.build.version.emui");
            if (o == null) {
                o = com.huawei.openalliance.ad.constant.w.aU;
            }
            ((com.huawei.openalliance.ad.ppskit.utils.q1) aVar.f29569u).H(o);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.getClass();
            String o = com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.build.version.magic");
            if (o == null) {
                o = com.huawei.openalliance.ad.constant.w.aU;
            }
            ((com.huawei.openalliance.ad.ppskit.utils.q1) aVar.f29569u).I(o);
        }
    }

    public a(Context context) {
        super(context);
    }

    @Override // j1.a, ka.l
    public final boolean a(Context context) {
        try {
            int i10 = Settings.Secure.getInt(context.getContentResolver(), "display_notch_status");
            n7.c("BaseHwnDeviceImpl", "isNotchEnable, displayNotch: %s", Integer.valueOf(i10));
            if (i10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            n7.e("BaseHwnDeviceImpl", "isNotchEnable err:".concat(th.getClass().getSimpleName()));
            if (Build.VERSION.SDK_INT >= 26 && e(null) > 0) {
                return true;
            }
            return false;
        }
    }

    @Override // ka.l
    public final boolean d() {
        String o = com.huawei.openalliance.ad.ppskit.utils.z1.o(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(o)) {
            return "cn".equalsIgnoreCase(o);
        }
        String o6 = com.huawei.openalliance.ad.ppskit.utils.z1.o(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP);
        if (!TextUtils.isEmpty(o6)) {
            return o6.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String x10 = com.huawei.openalliance.ad.ppskit.utils.z1.x();
        if (!TextUtils.isEmpty(x10)) {
            return "cn".equalsIgnoreCase(x10);
        }
        return false;
    }

    @Override // j1.a, ka.l
    public final String e() {
        String M = ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).M();
        if (TextUtils.isEmpty(M)) {
            M = com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.build.version.emui");
            if (M == null) {
                M = com.huawei.openalliance.ad.constant.w.aU;
            }
            ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).H(M);
        } else if (com.huawei.openalliance.ad.ppskit.utils.c2.a("getEmuiVersionName")) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new RunnableC0419a(), 2);
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, M)) {
            return null;
        }
        return M;
    }

    @Override // j1.a, ka.l
    public final String i() {
        String O = ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).O();
        if (TextUtils.isEmpty(O)) {
            O = com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.build.version.magic");
            if (O == null) {
                O = com.huawei.openalliance.ad.constant.w.aU;
            }
            ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).I(O);
        } else if (com.huawei.openalliance.ad.ppskit.utils.c2.a("getMagicuiVersionName")) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new b(), 2);
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, O)) {
            return null;
        }
        return O;
    }
}
