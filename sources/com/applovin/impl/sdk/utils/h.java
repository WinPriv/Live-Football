package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Point> f19407a = CollectionUtils.map(2);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f19408a;

        /* renamed from: b, reason: collision with root package name */
        int f19409b;

        /* renamed from: c, reason: collision with root package name */
        int f19410c;

        /* renamed from: d, reason: collision with root package name */
        int f19411d;

        /* renamed from: com.applovin.impl.sdk.utils.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0224a {

            /* renamed from: a, reason: collision with root package name */
            private int f19412a;

            /* renamed from: b, reason: collision with root package name */
            private int f19413b;

            /* renamed from: c, reason: collision with root package name */
            private int f19414c;

            /* renamed from: d, reason: collision with root package name */
            private int f19415d;

            public C0224a a(int i10) {
                this.f19412a = i10;
                return this;
            }

            public C0224a b(int i10) {
                this.f19413b = i10;
                return this;
            }

            public C0224a c(int i10) {
                this.f19414c = i10;
                return this;
            }

            public C0224a d(int i10) {
                this.f19415d = i10;
                return this;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb2.append(this.f19412a);
                sb2.append(", topRight=");
                sb2.append(this.f19413b);
                sb2.append(", bottomLeft=");
                sb2.append(this.f19414c);
                sb2.append(", bottomRight=");
                return com.ironsource.adapters.facebook.a.i(sb2, this.f19415d, ")");
            }

            public a a() {
                return new a(this.f19412a, this.f19413b, this.f19414c, this.f19415d);
            }
        }

        public a(int i10, int i11, int i12, int i13) {
            this.f19408a = i10;
            this.f19409b = i11;
            this.f19410c = i12;
            this.f19411d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f19409b;
        }

        public int c() {
            return this.f19410c;
        }

        public int d() {
            return this.f19411d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a(this) && a() == aVar.a() && b() == aVar.b() && c() == aVar.c() && d() == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return d() + ((c() + ((b() + ((a() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + a() + ", topRight=" + b() + ", bottomLeft=" + c() + ", bottomRight=" + d() + ")";
        }

        public int a() {
            return this.f19408a;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static Point a(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        Map<Integer, Point> map = f19407a;
        if (map.containsKey(Integer.valueOf(orientation))) {
            return map.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        map.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static a a(Context context, com.applovin.impl.sdk.p pVar) {
        a aVar = null;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ee)).booleanValue() && k()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVar = new a.C0224a().a(a(0, defaultDisplay)).b(a(1, defaultDisplay)).c(a(3, defaultDisplay)).d(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVar;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner == null) {
            return -1;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
