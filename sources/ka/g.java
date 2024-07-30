package ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.huawei.android.util.HwNotchSizeUtil;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.f0;

/* loaded from: classes2.dex */
public final class g extends ka.a {

    /* renamed from: v, reason: collision with root package name */
    public static g f31197v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f31198w = new byte[0];

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.o(g.this);
        }
    }

    public g(Context context) {
        super(context);
    }

    public static void o(g gVar) {
        gVar.getClass();
        String o = com.huawei.openalliance.ad.ppskit.utils.z1.o("hw_sc.build.platform.version");
        if (o == null) {
            o = com.huawei.openalliance.ad.constant.w.aU;
        }
        ((com.huawei.openalliance.ad.ppskit.utils.q1) gVar.f29569u).K(o);
    }

    @Override // j1.a, ka.l
    public final boolean b() {
        try {
            Object obj = this.f29568t;
            if (((Context) obj) == null) {
                return false;
            }
            Class<?> cls = Class.forName(a0.a.L((Context) obj).e());
            return ((Boolean) cls.getMethod("getHwMeteredHint", Context.class).invoke(cls.newInstance(), (Context) this.f29568t)).booleanValue();
        } catch (Throwable th) {
            e0.i.p(th, "getMeteredWifiStatus ", "HwDeviceImpl");
            return false;
        }
    }

    @Override // ka.l
    public final boolean c() {
        return "156".equals(com.huawei.openalliance.ad.ppskit.utils.z1.o("ro.config.hw_optb"));
    }

    @Override // j1.a, ka.l
    public final int e(ViewGroup viewGroup) {
        try {
            if (HwNotchSizeUtil.hasNotchInScreen()) {
                int[] notchSize = HwNotchSizeUtil.getNotchSize();
                if (notchSize.length >= 2) {
                    return notchSize[1];
                }
                return 0;
            }
            return 0;
        } catch (Throwable th) {
            e0.i.p(th, "getNotchHeight error:", "HwDeviceImpl");
            return 0;
        }
    }

    @Override // j1.a, ka.l
    public final String f() {
        String Q = ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).Q();
        if (TextUtils.isEmpty(Q)) {
            Q = com.huawei.openalliance.ad.ppskit.utils.z1.o("hw_sc.build.platform.version");
            if (Q == null) {
                Q = com.huawei.openalliance.ad.constant.w.aU;
            }
            ((com.huawei.openalliance.ad.ppskit.utils.q1) this.f29569u).K(Q);
        } else if (com.huawei.openalliance.ad.ppskit.utils.c2.a("getHosVersionName")) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(), 2);
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, Q)) {
            return null;
        }
        return Q;
    }

    @Override // j1.a, ka.l
    public final boolean g() {
        return !TextUtils.isEmpty(f());
    }

    @Override // j1.a, ka.l
    public final Integer h() {
        return Integer.valueOf(f0.a.f22843a);
    }

    @Override // j1.a, ka.l
    public final boolean j() {
        return com.huawei.openalliance.ad.ppskit.utils.m.F((Context) this.f29568t);
    }

    @Override // j1.a, ka.l
    public final String k() {
        return com.huawei.openalliance.ad.ppskit.utils.z1.o(CountryCodeBean.VENDOR_SYSTEMPROP);
    }

    @Override // j1.a, ka.l
    public final String l() {
        return com.huawei.openalliance.ad.ppskit.utils.z1.o(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP);
    }
}
