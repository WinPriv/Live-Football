package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import c8.a;
import com.applovin.exoplayer2.a.l;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import e0.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import k4.w;
import r7.c;
import r7.d;
import s7.b;
import s7.h;
import s7.p;
import s7.s;
import s7.u;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final p<ScheduledExecutorService> f21263a = new p<>(new s(1));

    /* renamed from: b, reason: collision with root package name */
    public static final p<ScheduledExecutorService> f21264b = new p<>(new a() { // from class: t7.i
        @Override // c8.a
        public final Object get() {
            p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f21263a;
            return new g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f21266d.get());
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final p<ScheduledExecutorService> f21265c = new p<>(new a() { // from class: t7.j
        @Override // c8.a
        public final Object get() {
            p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f21263a;
            return new g(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f21266d.get());
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final p<ScheduledExecutorService> f21266d = new p<>(new h(1));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        b[] bVarArr = new b[4];
        u uVar = new u(r7.a.class, ScheduledExecutorService.class);
        int i10 = 0;
        u[] uVarArr = {new u(r7.a.class, ExecutorService.class), new u(r7.a.class, Executor.class)};
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
        bVarArr[0] = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new w(i10), hashSet3);
        u uVar3 = new u(r7.b.class, ScheduledExecutorService.class);
        u[] uVarArr2 = {new u(r7.b.class, ExecutorService.class), new u(r7.b.class, Executor.class)};
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
        bVarArr[1] = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new l(i10), hashSet6);
        u uVar5 = new u(c.class, ScheduledExecutorService.class);
        u[] uVarArr3 = {new u(c.class, ExecutorService.class), new u(c.class, Executor.class)};
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
        bVarArr[2] = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i(), hashSet9);
        u uVar7 = new u(d.class, Executor.class);
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
        bVarArr[3] = new b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new com.ironsource.adapters.facebook.a(), hashSet12);
        return Arrays.asList(bVarArr);
    }
}
