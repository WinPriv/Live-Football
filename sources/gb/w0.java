package gb;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.dt;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.constant.bw;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28642a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f28643b = new HashMap();

    public static void a(String str) {
        synchronized (f28642a) {
            Set set = (Set) f28643b.get(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).Code();
                }
            }
            synchronized (f28642a) {
                if (!TextUtils.isEmpty(str)) {
                    f28643b.remove(str);
                }
            }
        }
    }

    public static int b(InputStream inputStream) {
        int i10 = 4;
        String str = null;
        if (inputStream != null) {
            try {
                try {
                    byte[] bArr = new byte[4];
                    if (inputStream.read(bArr, 0, 4) > 0) {
                        str = androidx.transition.n.f(bArr);
                    }
                } catch (IOException unused) {
                    ex.Z("FileUtil", "fail to read file header");
                }
            } catch (Resources.NotFoundException unused2) {
                ex.Z("ImageUtil", "resId is not found");
                return 100;
            }
        }
        if (!com.huawei.openalliance.ad.constant.w.an.equals(str)) {
            if (str != null) {
                i10 = 2;
            } else {
                i10 = 100;
            }
        }
        return i10;
    }

    public static Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            ex.V("ImageUtil", "BitmapDrawable");
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 1;
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 1;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth > 0) {
            i10 = intrinsicWidth;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Closeable] */
    public static Pair<Drawable, String> d(BitmapFactory.Options options, String str, Context context) {
        ?? r10;
        InputStream inputStream;
        InputStream inputStream2;
        String concat;
        String simpleName;
        Uri parse;
        ContentResolver contentResolver;
        InputStream inputStream3 = null;
        try {
            try {
                parse = Uri.parse(str);
                contentResolver = context.getContentResolver();
                inputStream2 = contentResolver.openInputStream(parse);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
            inputStream = null;
            inputStream2 = null;
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            r10 = 0;
            androidx.transition.n.g(inputStream3);
            androidx.transition.n.g(r10);
            throw th;
        }
        try {
            if (b(inputStream2) != 4) {
                inputStream = contentResolver.openInputStream(parse);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (decodeStream == null) {
                        ex.V("ImageUtil", "Image decode fail");
                        m.b(context).e(0);
                    }
                    Pair<Drawable, String> pair = new Pair<>(new BitmapDrawable(context.getResources(), decodeStream), null);
                    androidx.transition.n.g(inputStream2);
                    androidx.transition.n.g(inputStream);
                    return pair;
                } catch (FileNotFoundException e12) {
                    e = e12;
                    concat = "loadFromProvider FileNotFoundException";
                    simpleName = e.getClass().getSimpleName();
                    ex.I("ImageUtil", "lfP ".concat(simpleName));
                    androidx.transition.n.g(inputStream2);
                    androidx.transition.n.g(inputStream);
                    return new Pair<>(null, concat);
                } catch (Exception e13) {
                    e = e13;
                    concat = "loadFromProvider ".concat(e.getClass().getSimpleName());
                    simpleName = e.getClass().getSimpleName();
                    ex.I("ImageUtil", "lfP ".concat(simpleName));
                    androidx.transition.n.g(inputStream2);
                    androidx.transition.n.g(inputStream);
                    return new Pair<>(null, concat);
                }
            }
            Pair<Drawable, String> pair2 = new Pair<>(new dt(context, str), null);
            androidx.transition.n.g(inputStream2);
            return pair2;
        } catch (FileNotFoundException e14) {
            e = e14;
            inputStream = null;
        } catch (Exception e15) {
            e = e15;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            str = null;
            inputStream3 = inputStream2;
            r10 = str;
            androidx.transition.n.g(inputStream3);
            androidx.transition.n.g(r10);
            throw th;
        }
    }

    public static void e(Context context, SourceParam sourceParam, j jVar) {
        f(context.getApplicationContext(), sourceParam, jVar, null, null);
    }

    public static void f(Context context, SourceParam sourceParam, j jVar, String str, String str2) {
        if (context != null) {
            context = context.getApplicationContext();
        }
        Context context2 = context;
        if (sourceParam != null && sourceParam.a() != null) {
            ex.V("ImageUtil", "load: " + androidx.transition.n.e(sourceParam.a()));
            c0.c(new u0(context2, sourceParam, jVar, str, str2));
            return;
        }
        jVar.Code();
        m(context2, 1, sourceParam, "url is null");
    }

    public static void g(String str, Drawable drawable) {
        synchronized (f28642a) {
            Set set = (Set) f28643b.get(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).Code(str, drawable);
                }
            }
            synchronized (f28642a) {
                if (!TextUtils.isEmpty(str)) {
                    f28643b.remove(str);
                }
            }
        }
    }

    public static void h(String str, j jVar) {
        if (jVar != null && !TextUtils.isEmpty(str)) {
            synchronized (f28642a) {
                HashMap hashMap = f28643b;
                Set set = (Set) hashMap.get(str);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(str, set);
                }
                set.add(jVar);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:31|32|33|(1:35)(2:67|(1:69)(2:70|(1:72)(6:73|(1:75)|76|77|39|(6:41|109|49|50|51|52)(1:60))))|36|37|38|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        com.huawei.hms.ads.ex.I("ImageUtil", "OOM read image");
        r10 = r3;
        r3 = "OOM read image";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        r10 = "loadImageFromDisk ".concat(r7.getClass().getSimpleName());
        e0.i.q(r7, "loadImageFromDisk ", "ImageUtil");
        r6 = r3;
        r3 = r10;
        r10 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(android.content.Context r7, com.huawei.openalliance.ad.beans.inner.SourceParam r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.w0.i(android.content.Context, com.huawei.openalliance.ad.beans.inner.SourceParam, java.lang.String, java.lang.String):boolean");
    }

    public static Pair<Drawable, String> j(BitmapFactory.Options options, String str, Context context) {
        String str2;
        BitmapDrawable bitmapDrawable = null;
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), Integer.parseInt(str.substring(bw.RES.toString().length())), options);
            if (decodeResource == null) {
                ex.V("ImageUtil", "Image decode fail");
                m.b(context).e(0);
            }
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), decodeResource);
            str2 = null;
            bitmapDrawable = bitmapDrawable2;
        } catch (Resources.NotFoundException e10) {
            ex.I("ImageUtil", "loadImage ".concat(e10.getClass().getSimpleName()));
            str2 = "loadResImg Resources.NotFoundException";
        } catch (NumberFormatException e11) {
            ex.I("ImageUtil", "loadImage ".concat(e11.getClass().getSimpleName()));
            str2 = "loadResImg NumberFormatException";
        }
        return new Pair<>(bitmapDrawable, str2);
    }

    public static Bitmap k(Drawable drawable) {
        Bitmap c10;
        if (drawable == null || (c10 = c(drawable)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(c10, 0, 0, c10.getWidth(), c10.getHeight(), matrix, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static Pair<Drawable, String> l(BitmapFactory.Options options, String str, Context context) {
        InputStream inputStream;
        String concat;
        String substring = str.substring(bw.ASSET.toString().length());
        ?? r32 = 0;
        BitmapDrawable bitmapDrawable = null;
        try {
            try {
                inputStream = context.getAssets().open(substring);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (decodeStream == null) {
                        ex.V("ImageUtil", "Image decode fail");
                        m.b(context).e(0);
                    }
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), decodeStream);
                    androidx.transition.n.g(inputStream);
                    concat = null;
                    bitmapDrawable = bitmapDrawable2;
                } catch (IOException e10) {
                    e = e10;
                    concat = "loadAssetImg ".concat(e.getClass().getSimpleName());
                    ex.I("ImageUtil", "lAI ".concat(e.getClass().getSimpleName()));
                    androidx.transition.n.g(inputStream);
                    return new Pair<>(bitmapDrawable, concat);
                }
            } catch (Throwable th) {
                th = th;
                r32 = substring;
                androidx.transition.n.g(r32);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            androidx.transition.n.g(r32);
            throw th;
        }
        return new Pair<>(bitmapDrawable, concat);
    }

    public static void m(Context context, int i10, SourceParam sourceParam, String str) {
        if (sourceParam != null && sourceParam.g() != null) {
            cz.Code(context, i10, str, sourceParam.g());
        }
    }
}
