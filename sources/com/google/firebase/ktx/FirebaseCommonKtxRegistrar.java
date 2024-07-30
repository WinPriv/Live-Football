package com.google.firebase.ktx;

import androidx.activity.n;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import k8.f;
import s7.e;
import s7.l;
import s7.u;
import s7.v;

/* compiled from: Firebase.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements e {

        /* renamed from: s, reason: collision with root package name */
        public static final a<T> f21267s = new a<>();

        @Override // s7.e
        public final Object d(v vVar) {
            Object d10 = vVar.d(new u<>(r7.a.class, Executor.class));
            zc.d.c(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return a0.a.I0((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements e {

        /* renamed from: s, reason: collision with root package name */
        public static final b<T> f21268s = new b<>();

        @Override // s7.e
        public final Object d(v vVar) {
            Object d10 = vVar.d(new u<>(r7.c.class, Executor.class));
            zc.d.c(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return a0.a.I0((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements e {

        /* renamed from: s, reason: collision with root package name */
        public static final c<T> f21269s = new c<>();

        @Override // s7.e
        public final Object d(v vVar) {
            Object d10 = vVar.d(new u<>(r7.b.class, Executor.class));
            zc.d.c(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return a0.a.I0((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements e {

        /* renamed from: s, reason: collision with root package name */
        public static final d<T> f21270s = new d<>();

        @Override // s7.e
        public final Object d(v vVar) {
            Object d10 = vVar.d(new u<>(r7.d.class, Executor.class));
            zc.d.c(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return a0.a.I0((Executor) d10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<s7.b<?>> getComponents() {
        s7.b[] bVarArr = new s7.b[5];
        bVarArr[0] = f.a("fire-core-ktx", "unspecified");
        u uVar = new u(r7.a.class, dd.a.class);
        u[] uVarArr = new u[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            if (uVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, uVarArr);
        l lVar = new l((u<?>) new u(r7.a.class, Executor.class), 1, 0);
        if (!hashSet.contains(lVar.f35241a)) {
            hashSet2.add(lVar);
            bVarArr[1] = new s7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, a.f21267s, hashSet3);
            u uVar3 = new u(r7.c.class, dd.a.class);
            u[] uVarArr2 = new u[0];
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            hashSet4.add(uVar3);
            for (u uVar4 : uVarArr2) {
                if (uVar4 == null) {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(hashSet4, uVarArr2);
            l lVar2 = new l((u<?>) new u(r7.c.class, Executor.class), 1, 0);
            if (!hashSet4.contains(lVar2.f35241a)) {
                hashSet5.add(lVar2);
                bVarArr[2] = new s7.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, b.f21268s, hashSet6);
                u uVar5 = new u(r7.b.class, dd.a.class);
                u[] uVarArr3 = new u[0];
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                HashSet hashSet9 = new HashSet();
                hashSet7.add(uVar5);
                for (u uVar6 : uVarArr3) {
                    if (uVar6 == null) {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(hashSet7, uVarArr3);
                l lVar3 = new l((u<?>) new u(r7.b.class, Executor.class), 1, 0);
                if (!hashSet7.contains(lVar3.f35241a)) {
                    hashSet8.add(lVar3);
                    bVarArr[3] = new s7.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, c.f21269s, hashSet9);
                    u uVar7 = new u(r7.d.class, dd.a.class);
                    u[] uVarArr4 = new u[0];
                    HashSet hashSet10 = new HashSet();
                    HashSet hashSet11 = new HashSet();
                    HashSet hashSet12 = new HashSet();
                    hashSet10.add(uVar7);
                    for (u uVar8 : uVarArr4) {
                        if (uVar8 == null) {
                            throw new NullPointerException("Null interface");
                        }
                    }
                    Collections.addAll(hashSet10, uVarArr4);
                    l lVar4 = new l((u<?>) new u(r7.d.class, Executor.class), 1, 0);
                    if (!hashSet10.contains(lVar4.f35241a)) {
                        hashSet11.add(lVar4);
                        bVarArr[4] = new s7.b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, d.f21270s, hashSet12);
                        return n.F0(bVarArr);
                    }
                    throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
