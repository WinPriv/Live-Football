package androidx.activity.result;

import a3.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.e;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public Random f534a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f535b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f536c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f537d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<String> f538e = new ArrayList<>();
    public final transient HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f539g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f540h = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.a<O> f541a;

        /* renamed from: b, reason: collision with root package name */
        public final e.a<?, O> f542b;

        public a(e.a aVar, androidx.activity.result.a aVar2) {
            this.f541a = aVar2;
            this.f542b = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final i f543a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<k> f544b = new ArrayList<>();

        public b(i iVar) {
            this.f543a = iVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        androidx.activity.result.a<O> aVar;
        String str = (String) this.f535b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar2 = (a) this.f.get(str);
        if (aVar2 != null && (aVar = aVar2.f541a) != 0 && this.f538e.contains(str)) {
            aVar.a(aVar2.f542b.c(i11, intent));
            this.f538e.remove(str);
            return true;
        }
        this.f539g.remove(str);
        this.f540h.putParcelable(str, new ActivityResult(i11, intent));
        return true;
    }

    public abstract void b(int i10, e.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final c c(final String str, m mVar, final e.a aVar, final androidx.activity.result.a aVar2) {
        i lifecycle = mVar.getLifecycle();
        if (!lifecycle.b().a(i.c.STARTED)) {
            e(str);
            HashMap hashMap = this.f537d;
            b bVar = (b) hashMap.get(str);
            if (bVar == null) {
                bVar = new b(lifecycle);
            }
            k kVar = new k() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.k
                public final void c(m mVar2, i.b bVar2) {
                    boolean equals = i.b.ON_START.equals(bVar2);
                    String str2 = str;
                    e eVar = e.this;
                    if (equals) {
                        HashMap hashMap2 = eVar.f;
                        e.a aVar3 = aVar;
                        a aVar4 = aVar2;
                        hashMap2.put(str2, new e.a(aVar3, aVar4));
                        HashMap hashMap3 = eVar.f539g;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            aVar4.a(obj);
                        }
                        Bundle bundle = eVar.f540h;
                        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                        if (activityResult != null) {
                            bundle.remove(str2);
                            aVar4.a(aVar3.c(activityResult.f521s, activityResult.f522t));
                            return;
                        }
                        return;
                    }
                    if (i.b.ON_STOP.equals(bVar2)) {
                        eVar.f.remove(str2);
                    } else if (i.b.ON_DESTROY.equals(bVar2)) {
                        eVar.f(str2);
                    }
                }
            };
            bVar.f543a.a(kVar);
            bVar.f544b.add(kVar);
            hashMap.put(str, bVar);
            return new c(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + mVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final d d(String str, e.a aVar, androidx.activity.result.a aVar2) {
        e(str);
        this.f.put(str, new a(aVar, aVar2));
        HashMap hashMap = this.f539g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            aVar2.a(obj);
        }
        Bundle bundle = this.f540h;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar2.a(aVar.c(activityResult.f521s, activityResult.f522t));
        }
        return new d(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.f536c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f534a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + com.anythink.expressad.exoplayer.b.aX;
            HashMap hashMap2 = this.f535b;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f534a.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f538e.contains(str) && (num = (Integer) this.f536c.remove(str)) != null) {
            this.f535b.remove(num);
        }
        this.f.remove(str);
        HashMap hashMap = this.f539g;
        if (hashMap.containsKey(str)) {
            StringBuilder s10 = l.s("Dropping pending result for request ", str, ": ");
            s10.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", s10.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f540h;
        if (bundle.containsKey(str)) {
            StringBuilder s11 = l.s("Dropping pending result for request ", str, ": ");
            s11.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", s11.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f537d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<k> arrayList = bVar.f544b;
            Iterator<k> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f543a.c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
