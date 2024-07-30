package gb;

import android.content.Context;
import com.hihonor.android.fsm.HwFoldScreenManagerEx;
import com.huawei.hms.ads.cm;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class h0 {
    public static boolean a(Context context) {
        return "1".equalsIgnoreCase(f0.a(context).f28584b);
    }

    public static boolean b(Context context) {
        int i10;
        try {
            i10 = cm.Code(context).S();
        } catch (Throwable th) {
            if (z.a(context) / z.k(context) > 1.5f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            ex.I("DeviceUtil", "getFoldableStatus %s", th.getClass().getSimpleName());
        }
        if (i10 != 1) {
            return false;
        }
        return true;
    }

    public static int c(Context context) {
        Integer num;
        Integer num2;
        int i10;
        m b10 = m.b(context);
        synchronized (b10.f28595b) {
            b10.g();
            num = b10.f28596c.f28603w;
            num2 = null;
            if (num == null) {
                num = null;
            }
        }
        if (num != null) {
            synchronized (b10.f28595b) {
                b10.g();
                Integer num3 = b10.f28596c.f28603w;
                if (num3 != null) {
                    num2 = num3;
                }
            }
            return num2.intValue();
        }
        f0 a10 = f0.a(context);
        if ("4".equalsIgnoreCase(a10.f28584b)) {
            i10 = 8;
        } else if ("1".equalsIgnoreCase(a10.f28584b)) {
            i10 = 5;
        } else {
            i10 = 4;
        }
        synchronized (b10.f28595b) {
            b10.g();
            b10.f28596c.f28603w = Integer.valueOf(i10);
            b10.c(b10.f28596c);
        }
        return i10;
    }

    public static boolean d() {
        try {
            if (z.f()) {
                return HwFoldScreenManagerEx.isFoldable();
            }
            return com.huawei.android.fsm.HwFoldScreenManagerEx.isFoldable();
        } catch (Throwable th) {
            ex.I("DeviceUtil", "isFoldablePhone exception: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean e(Context context) {
        Boolean bool;
        Boolean bool2;
        m b10 = m.b(context);
        synchronized (b10.f28595b) {
            b10.g();
            bool = b10.f28596c.f28601u;
            bool2 = null;
            if (bool == null) {
                bool = null;
            }
        }
        if (bool != null) {
            synchronized (b10.f28595b) {
                b10.g();
                Boolean bool3 = b10.f28596c.f28601u;
                if (bool3 != null) {
                    bool2 = bool3;
                }
            }
            return bool2.booleanValue();
        }
        boolean equalsIgnoreCase = "4".equalsIgnoreCase(f0.a(f0.a(context).f28583a).f28584b);
        synchronized (b10.f28595b) {
            b10.g();
            b10.f28596c.f28601u = Boolean.valueOf(equalsIgnoreCase);
            b10.c(b10.f28596c);
        }
        return equalsIgnoreCase;
    }
}
