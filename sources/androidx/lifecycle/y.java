package androidx.lifecycle;

import b1.a;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2011a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f2012b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a f2013c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class c {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class d extends zc.e implements yc.l<b1.a, a0> {

        /* renamed from: s, reason: collision with root package name */
        public static final d f2014s = new d();

        @Override // yc.l
        public final a0 invoke(b1.a aVar) {
            zc.d.d(aVar, "$this$initializer");
            return new a0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.isEmpty() == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.x a(b1.d r7) {
        /*
            androidx.lifecycle.y$b r0 = androidx.lifecycle.y.f2011a
            java.util.LinkedHashMap r7 = r7.f2797a
            java.lang.Object r0 = r7.get(r0)
            i1.d r0 = (i1.d) r0
            if (r0 == 0) goto L92
            androidx.lifecycle.y$c r1 = androidx.lifecycle.y.f2012b
            java.lang.Object r1 = r7.get(r1)
            androidx.lifecycle.j0 r1 = (androidx.lifecycle.j0) r1
            if (r1 == 0) goto L8a
            androidx.lifecycle.y$a r2 = androidx.lifecycle.y.f2013c
            java.lang.Object r2 = r7.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.h0 r3 = androidx.lifecycle.h0.f1972a
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L82
            i1.b r0 = r0.getSavedStateRegistry()
            i1.b$b r0 = r0.b()
            boolean r3 = r0 instanceof androidx.lifecycle.z
            r4 = 0
            if (r3 == 0) goto L38
            androidx.lifecycle.z r0 = (androidx.lifecycle.z) r0
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L7a
            androidx.lifecycle.a0 r1 = b(r1)
            java.util.LinkedHashMap r3 = r1.f1941d
            java.lang.Object r3 = r3.get(r7)
            androidx.lifecycle.x r3 = (androidx.lifecycle.x) r3
            if (r3 != 0) goto L79
            java.lang.Class<? extends java.lang.Object>[] r3 = androidx.lifecycle.x.f
            r0.b()
            android.os.Bundle r3 = r0.f2017c
            if (r3 == 0) goto L57
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L58
        L57:
            r3 = r4
        L58:
            android.os.Bundle r5 = r0.f2017c
            if (r5 == 0) goto L5f
            r5.remove(r7)
        L5f:
            android.os.Bundle r5 = r0.f2017c
            if (r5 == 0) goto L6b
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L6b
            goto L6c
        L6b:
            r6 = 0
        L6c:
            if (r6 == 0) goto L70
            r0.f2017c = r4
        L70:
            androidx.lifecycle.x r3 = androidx.lifecycle.x.a.a(r3, r2)
            java.util.LinkedHashMap r0 = r1.f1941d
            r0.put(r7, r3)
        L79:
            return r3
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L8a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L92:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.y.a(b1.d):androidx.lifecycle.x");
    }

    public static final a0 b(j0 j0Var) {
        b1.a aVar;
        zc.d.d(j0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        zc.f.f37365a.getClass();
        Class<?> a10 = new zc.c(a0.class).a();
        if (a10 != null) {
            arrayList.add(new b1.e(a10));
            Object[] array = arrayList.toArray(new b1.e[0]);
            if (array != null) {
                b1.e[] eVarArr = (b1.e[]) array;
                b1.b bVar = new b1.b((b1.e[]) Arrays.copyOf(eVarArr, eVarArr.length));
                i0 viewModelStore = j0Var.getViewModelStore();
                zc.d.c(viewModelStore, "owner.viewModelStore");
                if (j0Var instanceof g) {
                    aVar = ((g) j0Var).getDefaultViewModelCreationExtras();
                    zc.d.c(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
                } else {
                    aVar = a.C0029a.f2798b;
                }
                return (a0) new g0(viewModelStore, bVar, aVar).b(a0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        zc.d.e(nullPointerException);
        throw nullPointerException;
    }
}
