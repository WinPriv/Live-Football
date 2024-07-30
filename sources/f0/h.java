package f0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import e0.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class h extends f {
    public final Class<?> f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f27917g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f27918h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f27919i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f27920j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f27921k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f27922l;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m(cls);
            method3 = n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.f27917g = constructor;
        this.f27918h = method2;
        this.f27919i = method3;
        this.f27920j = method4;
        this.f27921k = method;
        this.f27922l = method5;
    }

    public static Method m(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // f0.f, f0.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        FontVariationAxis[] fromFontVariationSettings;
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f27917g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0365d c0365d : cVar.f27621a) {
            String str = c0365d.f27622a;
            int i11 = c0365d.f27626e;
            int i12 = c0365d.f27623b;
            boolean z10 = c0365d.f27624c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0365d.f27625d);
            if (!i(context, obj, str, i11, i12, z10 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f27921k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    @Override // f0.f, f0.l
    public final Typeface b(Context context, k0.m[] mVarArr, int i10) {
        Object obj;
        Typeface j10;
        boolean z10;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            k0.m f = f(i10, mVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.f30274a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.f30276c).setItalic(f.f30277d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (k0.m mVar : mVarArr) {
                if (mVar.f30278e == 0) {
                    Uri uri = mVar.f30274a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, m.e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f27917g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = mVarArr.length;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                Method method = this.f27921k;
                if (i11 < length) {
                    k0.m mVar2 = mVarArr[i11];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f30274a);
                    if (byteBuffer != null) {
                        try {
                            z10 = ((Boolean) this.f27919i.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f30275b), null, Integer.valueOf(mVar2.f30276c), Integer.valueOf(mVar2.f30277d ? 1 : 0))).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        }
                        z11 = true;
                    }
                    i11++;
                    z11 = z11;
                } else {
                    if (!z11) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                            return null;
                        }
                    }
                    if (!k(obj) || (j10 = j(obj)) == null) {
                        return null;
                    }
                    return Typeface.create(j10, i10);
                }
            }
        }
    }

    @Override // f0.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f27917g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f27921k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f27918h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27922l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f27920j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f27918h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public Method o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
