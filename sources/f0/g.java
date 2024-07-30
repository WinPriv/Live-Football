package f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import e0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f27913a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor<?> f27914b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f27915c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f27916d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f27914b = constructor;
        f27913a = cls;
        f27915c = method2;
        f27916d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f27915c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // f0.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f27914b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0365d c0365d : cVar.f27621a) {
            int i11 = c0365d.f;
            File d10 = m.d(context);
            if (d10 != null) {
                try {
                    if (m.b(d10, resources, i11)) {
                        try {
                            fileInputStream = new FileInputStream(d10);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0365d.f27626e, c0365d.f27623b, c0365d.f27624c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    d10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f27913a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f27916d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // f0.l
    public final Typeface b(Context context, k0.m[] mVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f27914b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        q.i iVar = new q.i();
        for (k0.m mVar : mVarArr) {
            Uri uri = mVar.f30274a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, mVar.f30275b, mVar.f30276c, mVar.f30277d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f27913a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f27916d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
