package c3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.huawei.hms.ads.gl;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3245c;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f3246e;

        /* renamed from: a, reason: collision with root package name */
        public final Context f3247a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityManager f3248b;

        /* renamed from: c, reason: collision with root package name */
        public final b f3249c;

        /* renamed from: d, reason: collision with root package name */
        public final float f3250d;

        static {
            int i10;
            if (Build.VERSION.SDK_INT < 26) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            f3246e = i10;
        }

        public a(Context context) {
            this.f3250d = f3246e;
            this.f3247a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f3248b = activityManager;
            this.f3249c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.f3250d = gl.Code;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f3251a;

        public b(DisplayMetrics displayMetrics) {
            this.f3251a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i10;
        float f;
        boolean z10;
        Context context = aVar.f3247a;
        ActivityManager activityManager = aVar.f3248b;
        if (activityManager.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f3245c = i10;
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (activityManager.isLowRamDevice()) {
            f = 0.33f;
        } else {
            f = 0.4f;
        }
        int round = Math.round(memoryClass * f);
        DisplayMetrics displayMetrics = aVar.f3249c.f3251a;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = aVar.f3250d;
        int round2 = Math.round(f10 * f11);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f3244b = round3;
            this.f3243a = round2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f3244b = Math.round(2.0f * f12);
            this.f3243a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f3244b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f3243a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i10));
            sb2.append(", memory class limited? ");
            if (i12 > round) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }
}
