package l1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.hamkho.livefoot.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f32312d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f32313e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f32316c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f32315b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f32314a = new HashMap();

    public a(Context context) {
        this.f32316c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f32312d == null) {
            synchronized (f32313e) {
                if (f32312d == null) {
                    f32312d = new a(context);
                }
            }
        }
        return f32312d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f32316c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f32315b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (m1.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f32314a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a10 = bVar.a();
                    if (!a10.isEmpty()) {
                        for (Class<? extends b<?>> cls2 : a10) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.b(this.f32316c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new c(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
