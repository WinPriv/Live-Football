package f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import e0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f27908a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f27909b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f27910c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f27911d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f27912e = false;

    public static boolean g(boolean z10, String str, int i10, Object obj) {
        h();
        try {
            return ((Boolean) f27910c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f27912e) {
            return;
        }
        f27912e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f27909b = constructor;
        f27908a = cls;
        f27910c = method2;
        f27911d = method;
    }

    @Override // f0.l
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        h();
        try {
            Object newInstance = f27909b.newInstance(new Object[0]);
            for (d.C0365d c0365d : cVar.f27621a) {
                File d10 = m.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!m.b(d10, resources, c0365d.f)) {
                        return null;
                    }
                    if (!g(c0365d.f27624c, d10.getPath(), c0365d.f27623b, newInstance)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f27908a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f27911d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // f0.l
    public Typeface b(Context context, k0.m[] mVarArr, int i10) {
        File file;
        String readlink;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i10, mVarArr).f30274a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface c10 = c(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return c10;
                    }
                    Typeface c102 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c102;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
