package d0;

import a3.k;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.huawei.openalliance.ad.constant.w;
import e0.f;
import java.io.File;
import java.util.WeakHashMap;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f27248a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f27249b = new Object();

    /* compiled from: ContextCompat.java */
    /* renamed from: d0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0353a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            if ((i10 & 4) == 0 || str != null) {
                registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
                return registerReceiver;
            }
            Object obj = a.f27248a;
            String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (a0.a.A0(context, str2) == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
            }
            throw new RuntimeException(k.l("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }

        public static ComponentName b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            if (!j0.a.c() && TextUtils.equals(w.cx, str)) {
                if (new b0.w(context).f2771b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList b(int i10, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (e0.f.f27635c) {
            SparseArray<f.c> sparseArray = e0.f.f27634b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f27637b.equals(resources.getConfiguration()) && ((theme == null && cVar.f27638c == 0) || (theme != null && cVar.f27638c == theme.hashCode()))) {
                    colorStateList2 = cVar.f27636a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z10 = true;
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (i11 < 28 || i11 > 31) {
                z10 = false;
            }
            if (!z10) {
                try {
                    colorStateList = e0.b.a(resources, resources.getXml(i10), theme);
                } catch (Exception e10) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
                }
            }
            if (colorStateList != null) {
                synchronized (e0.f.f27635c) {
                    WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = e0.f.f27634b;
                    SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(dVar, sparseArray2);
                    }
                    sparseArray2.append(i10, new f.c(colorStateList, dVar.f27639a.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return f.b.b(resources, i10, theme);
        }
        return colorStateList2;
    }
}
