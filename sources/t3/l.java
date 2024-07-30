package t3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f35429a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f35430b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f35431c;

    /* compiled from: Util.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35432a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f35432a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35432a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35432a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f35432a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35432a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        boolean z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f35431c == null) {
            synchronized (l.class) {
                if (f35431c == null) {
                    f35431c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f35431c;
    }

    public static int f(int i10, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (i10 * 31) + hashCode;
    }

    public static int g(int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return (i10 * 31) + i11;
    }

    public static boolean h(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (i11 <= 0 && i11 != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }
}
