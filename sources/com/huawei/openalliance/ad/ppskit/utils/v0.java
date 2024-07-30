package com.huawei.openalliance.ad.ppskit.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ka.a6;
import ka.n7;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f23046a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23047b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f23048c = new HashMap();

    public static int a(InputStream inputStream) {
        String str = null;
        try {
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[4];
                    if (inputStream.read(bArr, 0, 4) > 0) {
                        str = androidx.transition.n.w(bArr);
                    }
                } catch (IOException unused) {
                    n7.i("FileUtil", "fail to read file header");
                }
            }
        } catch (Resources.NotFoundException unused2) {
            n7.i("ImageUtil", "resId is not found");
        }
        if (com.huawei.openalliance.ad.constant.w.an.equals(str)) {
            return 4;
        }
        if (str != null) {
            return 2;
        }
        return 100;
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            n7.e("ImageUtil", "BitmapDrawable");
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

    public static Rect c(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Rect(0, 0, options.outWidth, options.outHeight);
    }

    public static Pair<Drawable, String> d(Context context, String str, String str2) {
        String str3;
        Drawable drawable;
        Pair<Drawable, String> f;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Drawable drawable2 = null;
        try {
            options.inJustDecodeBounds = false;
            if (str.startsWith("res://")) {
                f = o(options, str, context);
                drawable = (Drawable) f.first;
            } else if (str.startsWith("asset://")) {
                f = m(options, str, context);
                drawable = (Drawable) f.first;
            } else if (str.startsWith("content://")) {
                f = e(options, str, context);
                drawable = (Drawable) f.first;
            } else {
                f = f(options, str, context, str2);
                drawable = (Drawable) f.first;
            }
        } catch (OutOfMemoryError unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            str3 = (String) f.second;
        } catch (OutOfMemoryError unused2) {
            drawable2 = drawable;
            str3 = "OOM read image";
            n7.g("ImageUtil", "OOM read image");
            drawable = drawable2;
            return new Pair<>(drawable, str3);
        } catch (Throwable th2) {
            th = th2;
            drawable2 = drawable;
            String concat = "loadImageFromDisk ".concat(th.getClass().getSimpleName());
            e0.i.p(th, "loadImageFromDisk ", "ImageUtil");
            str3 = concat;
            drawable = drawable2;
            return new Pair<>(drawable, str3);
        }
        return new Pair<>(drawable, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Closeable] */
    public static Pair<Drawable, String> e(BitmapFactory.Options options, String str, Context context) {
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
            androidx.transition.n.D(inputStream3);
            androidx.transition.n.D(r10);
            throw th;
        }
        try {
            if (k(inputStream2) != 4) {
                inputStream = contentResolver.openInputStream(parse);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (decodeStream == null) {
                        n7.e("ImageUtil", "Image decode fail");
                        com.huawei.openalliance.ad.ppskit.handlers.l.d(context).M(context.getPackageName());
                    }
                    Pair<Drawable, String> pair = new Pair<>(new BitmapDrawable(context.getResources(), decodeStream), null);
                    androidx.transition.n.D(inputStream2);
                    androidx.transition.n.D(inputStream);
                    return pair;
                } catch (FileNotFoundException e12) {
                    e = e12;
                    concat = "loadFromProvider FileNotFoundException";
                    simpleName = e.getClass().getSimpleName();
                    n7.g("ImageUtil", "lfP ".concat(simpleName));
                    androidx.transition.n.D(inputStream2);
                    androidx.transition.n.D(inputStream);
                    return new Pair<>(null, concat);
                } catch (Exception e13) {
                    e = e13;
                    concat = "loadFromProvider ".concat(e.getClass().getSimpleName());
                    simpleName = e.getClass().getSimpleName();
                    n7.g("ImageUtil", "lfP ".concat(simpleName));
                    androidx.transition.n.D(inputStream2);
                    androidx.transition.n.D(inputStream);
                    return new Pair<>(null, concat);
                }
            }
            Pair<Drawable, String> pair2 = new Pair<>(new a6(context, str), null);
            androidx.transition.n.D(inputStream2);
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
            androidx.transition.n.D(inputStream3);
            androidx.transition.n.D(r10);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    public static Pair<Drawable, String> f(BitmapFactory.Options options, String str, Context context, String str2) {
        InputStream inputStream;
        InputStream inputStream2;
        String concat;
        String simpleName;
        try {
            try {
                File l10 = x.l(context, str, str2);
                if (l10 == null) {
                    return new Pair<>(null, "File is null");
                }
                Uri fromFile = Uri.fromFile(l10);
                ContentResolver contentResolver = context.getContentResolver();
                inputStream2 = contentResolver.openInputStream(fromFile);
                try {
                    if (a(inputStream2) != 4) {
                        inputStream = contentResolver.openInputStream(fromFile);
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                            if (decodeStream == null) {
                                n7.e("ImageUtil", "Image decode fail");
                                com.huawei.openalliance.ad.ppskit.handlers.l.d(context).M(context.getPackageName());
                            }
                            return new Pair<>(new BitmapDrawable(context.getResources(), decodeStream), null);
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            concat = "loadDiskImg FileNotFoundException";
                            simpleName = e.getClass().getSimpleName();
                            str = inputStream;
                            n7.g("ImageUtil", "lfP ".concat(simpleName));
                            androidx.transition.n.D(inputStream2);
                            androidx.transition.n.D(str);
                            return new Pair<>(null, concat);
                        } catch (Throwable th) {
                            th = th;
                            concat = "loadDiskImg ".concat(th.getClass().getSimpleName());
                            simpleName = th.getClass().getSimpleName();
                            str = inputStream;
                            n7.g("ImageUtil", "lfP ".concat(simpleName));
                            androidx.transition.n.D(inputStream2);
                            androidx.transition.n.D(str);
                            return new Pair<>(null, concat);
                        }
                    }
                    Pair<Drawable, String> pair = new Pair<>(new a6(context, l10.getCanonicalPath()), null);
                    androidx.transition.n.D(inputStream2);
                    return pair;
                } catch (FileNotFoundException e11) {
                    e = e11;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } finally {
                androidx.transition.n.D(inputStream2);
                androidx.transition.n.D(str);
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            inputStream = null;
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            inputStream2 = null;
        }
    }

    public static void g(Context context, SourceParam sourceParam, n1 n1Var, String str, String str2) {
        if (sourceParam.r() == null) {
            if (n1Var != null) {
                n1Var.a();
            }
            n(context, 1, sourceParam, "url is null", null);
        } else {
            n7.e("ImageUtil", "load: " + y1.j(sourceParam.r()));
            p2.a(new s0(context, sourceParam, n1Var, str, str2), 2);
        }
    }

    public static void h(String str, Drawable drawable) {
        synchronized (f23047b) {
            Set set = (Set) f23048c.get(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n1) it.next()).a(str, drawable);
                }
            }
            synchronized (f23047b) {
                if (!TextUtils.isEmpty(str)) {
                    f23048c.remove(str);
                }
            }
        }
    }

    public static void i(String str, n1 n1Var) {
        if (n1Var != null && !TextUtils.isEmpty(str)) {
            synchronized (f23047b) {
                HashMap hashMap = f23048c;
                Set set = (Set) hashMap.get(str);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(str, set);
                }
                set.add(n1Var);
            }
        }
    }

    public static boolean j(Context context, String str, String str2, String str3, SourceParam sourceParam) {
        r0 r0Var;
        Drawable q10 = q(str);
        if (q10 != null) {
            n7.e("ImageUtil", "get drawable from cache");
            h(str, q10);
        } else {
            if (!y1.t(str2)) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "normal";
                }
                Pair<Drawable, String> d10 = d(context, str2, str3);
                Drawable drawable = (Drawable) d10.first;
                sourceParam.u((String) d10.second);
                if (drawable != null) {
                    n7.e("ImageUtil", "get drawable from disk");
                    synchronized (r0.f23005c) {
                        if (r0.f23004b == null) {
                            r0.f23004b = new r0();
                        }
                        r0Var = r0.f23004b;
                    }
                    String Q = androidx.transition.n.Q(str);
                    r0Var.getClass();
                    try {
                        r0Var.f23006a.put(Q, new WeakReference(drawable));
                    } catch (Throwable th) {
                        n7.g("r0", "put cache encounter: ".concat(th.getClass().getSimpleName()));
                        r0Var.a();
                    }
                    h(str, drawable);
                }
            }
            return false;
        }
        return true;
    }

    public static int k(InputStream inputStream) {
        String str = null;
        try {
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[4];
                    if (inputStream.read(bArr, 0, 4) > 0) {
                        str = androidx.transition.n.w(bArr);
                    }
                } catch (IOException unused) {
                    n7.i("FileUtil", "fail to read file header");
                }
            }
        } catch (Resources.NotFoundException unused2) {
            n7.i("ImageUtil", "resId is not found");
        }
        if (com.huawei.openalliance.ad.constant.w.an.equals(str)) {
            return 4;
        }
        if (str != null) {
            return 2;
        }
        return 100;
    }

    public static Bitmap l(Drawable drawable) {
        Bitmap b10;
        if (drawable == null || (b10 = b(drawable)) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(b10, 0, 0, b10.getWidth(), b10.getHeight(), matrix, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static Pair<Drawable, String> m(BitmapFactory.Options options, String str, Context context) {
        InputStream inputStream;
        String substring = str.substring(8);
        ?? r32 = 0;
        try {
            try {
                inputStream = context.getAssets().open(substring);
                try {
                    if (a(inputStream) != 4) {
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (decodeStream == null) {
                            n7.e("ImageUtil", "Image decode fail");
                            com.huawei.openalliance.ad.ppskit.handlers.l.d(context).M(context.getPackageName());
                        }
                        Pair<Drawable, String> pair = new Pair<>(new BitmapDrawable(context.getResources(), decodeStream), null);
                        androidx.transition.n.D(inputStream);
                        return pair;
                    }
                    Pair<Drawable, String> pair2 = new Pair<>(new a6(context, str), null);
                    androidx.transition.n.D(inputStream);
                    return pair2;
                } catch (IOException unused) {
                    n7.g("ImageUtil", "loadAssetImg IOException");
                    androidx.transition.n.D(inputStream);
                    return new Pair<>(null, "loadAssetImg IOException");
                }
            } catch (Throwable th) {
                th = th;
                r32 = substring;
                androidx.transition.n.D(r32);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            androidx.transition.n.D(r32);
            throw th;
        }
    }

    public static void n(Context context, int i10, SourceParam sourceParam, String str, String str2) {
        if (sourceParam != null && sourceParam.w() != null) {
            new ka.p(context).i(i10, str, sourceParam.w(), true, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static Pair<Drawable, String> o(BitmapFactory.Options options, String str, Context context) {
        InputStream inputStream;
        String str2 = "loadImage NumberFormatException";
        Resources resources = context.getResources();
        ?? r42 = 0;
        try {
            try {
                int parseInt = Integer.parseInt(str.substring(6));
                inputStream = resources.openRawResource(parseInt);
                try {
                    if (a(inputStream) != 4) {
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), parseInt, options);
                        if (decodeResource == null) {
                            n7.e("ImageUtil", "Image decode fail");
                            com.huawei.openalliance.ad.ppskit.handlers.l.d(context).M(context.getPackageName());
                        }
                        Pair<Drawable, String> pair = new Pair<>(new BitmapDrawable(context.getResources(), decodeResource), null);
                        androidx.transition.n.D(inputStream);
                        return pair;
                    }
                    Pair<Drawable, String> pair2 = new Pair<>(new a6(context, str), null);
                    androidx.transition.n.D(inputStream);
                    return pair2;
                } catch (Resources.NotFoundException unused) {
                    str2 = "loadImage Resources.NotFoundException";
                    n7.g("ImageUtil", "loadImage NotFoundException");
                    androidx.transition.n.D(inputStream);
                    return new Pair<>(null, str2);
                } catch (NumberFormatException unused2) {
                    n7.g("ImageUtil", "loadImage NumberFormatException");
                    androidx.transition.n.D(inputStream);
                    return new Pair<>(null, str2);
                }
            } catch (Throwable th) {
                th = th;
                r42 = resources;
                androidx.transition.n.D(r42);
                throw th;
            }
        } catch (Resources.NotFoundException unused3) {
            inputStream = null;
        } catch (NumberFormatException unused4) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            androidx.transition.n.D(r42);
            throw th;
        }
    }

    public static void p(String str) {
        synchronized (f23047b) {
            Set set = (Set) f23048c.get(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n1) it.next()).a();
                }
            }
            synchronized (f23047b) {
                if (!TextUtils.isEmpty(str)) {
                    f23048c.remove(str);
                }
            }
        }
    }

    public static Drawable q(String str) {
        r0 r0Var;
        synchronized (r0.f23005c) {
            if (r0.f23004b == null) {
                r0.f23004b = new r0();
            }
            r0Var = r0.f23004b;
        }
        String Q = androidx.transition.n.Q(str);
        r0Var.getClass();
        try {
            WeakReference<Drawable> weakReference = r0Var.f23006a.get(Q);
            if (weakReference != null) {
                return weakReference.get();
            }
        } catch (Throwable th) {
            e0.i.p(th, "get cache encounter: ", "r0");
        }
        return null;
    }
}
