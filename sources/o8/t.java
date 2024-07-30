package o8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes2.dex */
public final class t {

    /* compiled from: ReflectionAccessFilterHelper.java */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33771a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: o8.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0449a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f33772b;

            public C0449a(Method method) {
                this.f33772b = method;
            }

            @Override // o8.t.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f33772b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* loaded from: classes2.dex */
        public class b extends a {
            @Override // o8.t.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
        static {
            /*
                int r0 = o8.p.f33749a
                r1 = 9
                r2 = 1
                r3 = 0
                if (r0 < r1) goto La
                r0 = r2
                goto Lb
            La:
                r0 = r3
            Lb:
                if (r0 == 0) goto L21
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
                o8.t$a$a r1 = new o8.t$a$a     // Catch: java.lang.NoSuchMethodException -> L21
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L21
                goto L22
            L21:
                r1 = 0
            L22:
                if (r1 != 0) goto L29
                o8.t$a$b r1 = new o8.t$a$b
                r1.<init>()
            L29:
                o8.t.a.f33771a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o8.t.a.<clinit>():void");
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static int a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a10 = ((m8.w) it.next()).a();
            if (a10 != 2) {
                return a10;
            }
        }
        return 1;
    }
}
