package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.huawei.hms.ads.gl;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1576k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1577a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1578b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1579c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1580d;

    /* renamed from: e, reason: collision with root package name */
    public int f1581e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1582g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1583h;

    /* renamed from: i, reason: collision with root package name */
    public String f1584i;

    /* renamed from: j, reason: collision with root package name */
    public String f1585j;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
            /*
                Method dump skipped, instructions count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        public static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        public static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        public static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f1577a = -1;
        this.f1579c = null;
        this.f1580d = null;
        this.f1581e = 0;
        this.f = 0;
        this.f1582g = null;
        this.f1583h = f1576k;
        this.f1584i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f10 = 0.5f * f;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f12, gl.Code, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, gl.Code, gl.Code, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1581e = i10;
            iconCompat.f1578b = str;
            iconCompat.f1585j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f1577a;
        if (i10 == -1) {
            return a.a(this.f1578b);
        }
        if (i10 == 2) {
            return this.f1581e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i10 = this.f1577a;
        if (i10 == -1) {
            return a.d(this.f1578b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f1578b);
    }

    public final String toString() {
        String str;
        if (this.f1577a == -1) {
            return String.valueOf(this.f1578b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1577a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1577a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1578b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1578b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1585j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1581e);
                if (this.f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1578b);
                break;
        }
        if (this.f1582g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1582g);
        }
        if (this.f1583h != f1576k) {
            sb2.append(" mode=");
            sb2.append(this.f1583h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1579c = null;
        this.f1580d = null;
        this.f1581e = 0;
        this.f = 0;
        this.f1582g = null;
        this.f1583h = f1576k;
        this.f1584i = null;
        this.f1577a = i10;
    }
}
