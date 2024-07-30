package gb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.hihonor.android.os.Build;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import gb.m;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28648a = 0;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f28649s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f28650t;

        public a(Context context, Integer num) {
            this.f28649s = context;
            this.f28650t = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m b10 = m.b(this.f28649s);
            Integer num = this.f28650t;
            synchronized (b10.f28595b) {
                b10.g();
                m.b bVar = b10.f28596c;
                if (bVar != null) {
                    bVar.B = num;
                    b10.c(bVar);
                }
            }
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        int d10 = d(context);
        int h10 = h(context);
        if (d10 <= h10) {
            return h10;
        }
        return d10;
    }

    public static DisplayMetrics b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context == null) {
            return displayMetrics;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return displayMetrics;
        }
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int c(int i10, int i11) {
        float f;
        float f10;
        int i12;
        int min = Math.min(90, Math.round(i11 * 0.15f));
        if (i10 <= 432) {
            f = i10;
            f10 = 0.15625f;
        } else {
            if (i10 <= 526) {
                i12 = 68;
            } else if (i10 <= 632) {
                f = i10;
                f10 = 0.12820514f;
            } else if (i10 <= 655) {
                i12 = 81;
            } else {
                f = i10;
                f10 = 0.12362637f;
            }
            return Math.max(Math.min(i12, min), 50);
        }
        i12 = Math.round(f * f10);
        return Math.max(Math.min(i12, min), 50);
    }

    public static int d(Context context) {
        if (context == null) {
            return 0;
        }
        return b(context).heightPixels;
    }

    public static void e(Context context, com.huawei.openalliance.ad.inter.data.j jVar) {
        if (jVar == null) {
            return;
        }
        String i10 = jVar.i();
        if (TextUtils.isEmpty(i10)) {
            i10 = jVar.h();
        }
        r0.l(context, i10);
    }

    public static boolean f() {
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase(com.huawei.openalliance.ad.constant.w.bo) || Build.VERSION.SDK_INT < 31) {
                return false;
            }
            if (Build.VERSION.MAGIC_SDK_INT < 33) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            Log.e("z", "isHonor6UpPhone Error:".concat(th.getClass().getSimpleName()));
            return false;
        }
    }

    public static boolean g(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                try {
                    String string = Settings.Global.getString(context.getContentResolver(), "ex_splash_block_list");
                    if ((!TextUtils.isEmpty(string) && Arrays.asList(string.split(com.huawei.openalliance.ad.constant.w.aG)).contains(packageName)) || Settings.Global.getInt(context.getContentResolver(), "ex_splash_func_status", 0) == 0) {
                        return false;
                    }
                    String string2 = Settings.Global.getString(context.getContentResolver(), "ex_splash_list");
                    if (TextUtils.isEmpty(string2)) {
                        return false;
                    }
                    return Arrays.asList(string2.split(com.huawei.openalliance.ad.constant.w.aG)).contains(packageName);
                } catch (Throwable th) {
                    e0.i.q(th, "exception happen: ", "z");
                }
            }
        }
        return false;
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        return b(context).widthPixels;
    }

    public static String i() {
        return Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
    }

    public static int j(int i10, Context context) {
        Configuration configuration;
        int i11;
        if (context == null) {
            return 0;
        }
        DisplayMetrics b10 = b(context);
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        int j10 = u.j(context);
        if (i10 == 0) {
            i10 = configuration.orientation;
        }
        int i12 = b10.heightPixels;
        int i13 = b10.widthPixels;
        if (i12 > i13) {
            i11 = i12;
        } else {
            i11 = i13;
        }
        if (i12 >= i13) {
            i12 = i13;
        }
        if (i10 == 1) {
            i12 = i11 - j10;
        }
        return Math.round(i12 / b10.density);
    }

    public static int k(Context context) {
        if (context == null) {
            return 0;
        }
        int d10 = d(context);
        int h10 = h(context);
        if (d10 > h10) {
            return h10;
        }
        return d10;
    }

    public static float l(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                return displayMetrics.density;
            }
            return gl.Code;
        } catch (RuntimeException | Exception unused) {
            ex.I("z", "getDensity fail");
            return gl.Code;
        }
    }

    public static int m(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "secure_gesture_navigation", 0);
        } catch (Throwable th) {
            e0.i.q(th, "exception happen: ", "z");
            return 0;
        }
    }

    public static Integer n(Context context) {
        Integer num;
        m b10 = m.b(context);
        synchronized (b10.f28595b) {
            b10.g();
            m.b bVar = b10.f28596c;
            if (bVar == null) {
                num = null;
            } else {
                num = bVar.B;
            }
        }
        if (num == null) {
            num = a0.a.i(context, context.getApplicationContext().getPackageName(), "hw_ads_sdk_type");
            if (ex.Code()) {
                ex.Code("HiAdTools", "sdkType:%s", num);
            }
            c0.c(new a(context, num));
        }
        return num;
    }
}
