package com.onesignal;

import com.onesignal.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OSObservable.java */
/* loaded from: classes2.dex */
public final class d2<ObserverType, StateType> {

    /* renamed from: a, reason: collision with root package name */
    public final String f26727a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26728b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26729c;

    /* compiled from: OSObservable.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Method f26730s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f26731t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Object f26732u;

        public a(Method method, Object obj, Object obj2) {
            this.f26730s = method;
            this.f26731t = obj;
            this.f26732u = obj2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f26730s.invoke(this.f26731t, this.f26732u);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    public d2(String str, boolean z10) {
        this.f26727a = str;
        this.f26729c = z10;
    }

    public final boolean a(StateType statetype) {
        Iterator it = this.f26728b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.f26727a, statetype.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.f26729c) {
                        j.a aVar = j.f26866b;
                        a aVar2 = new a(declaredMethod, next, statetype);
                        aVar.getClass();
                        int c10 = s.f.c(j.f26865a);
                        if (c10 != 0) {
                            if (c10 == 1) {
                                new wc.a(new i(aVar2)).start();
                            }
                        } else {
                            OSUtils.s(aVar2);
                        }
                    } else {
                        try {
                            declaredMethod.invoke(next, statetype);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                    z10 = true;
                } catch (NoSuchMethodException e12) {
                    e12.printStackTrace();
                }
            }
        }
        return z10;
    }
}
