package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import c3.i;
import com.bumptech.glide.i;
import com.huawei.openalliance.ad.constant.av;
import d3.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public static volatile boolean A;

    /* renamed from: z, reason: collision with root package name */
    public static volatile b f19716z;

    /* renamed from: s, reason: collision with root package name */
    public final b3.d f19717s;

    /* renamed from: t, reason: collision with root package name */
    public final c3.h f19718t;

    /* renamed from: u, reason: collision with root package name */
    public final h f19719u;

    /* renamed from: v, reason: collision with root package name */
    public final b3.b f19720v;

    /* renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.n f19721w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.c f19722x;
    public final ArrayList y = new ArrayList();

    /* compiled from: Glide.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, a3.o oVar, c3.h hVar, b3.d dVar, b3.b bVar, com.bumptech.glide.manager.n nVar, com.bumptech.glide.manager.c cVar, int i10, c cVar2, q.b bVar2, List list, ArrayList arrayList, n3.a aVar, i iVar) {
        this.f19717s = dVar;
        this.f19720v = bVar;
        this.f19718t = hVar;
        this.f19721w = nVar;
        this.f19722x = cVar;
        this.f19719u = new h(context, bVar, new l(this, arrayList, aVar), new androidx.activity.n(0), cVar2, bVar2, list, oVar, iVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        c cVar;
        b3.d eVar;
        if (!A) {
            A = true;
            q.b bVar = new q.b();
            i.a aVar = new i.a();
            c cVar2 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(n3.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n3.c cVar3 = (n3.c) it.next();
                        if (hashSet.contains(cVar3.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar3);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((n3.c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((n3.c) it3.next()).b();
                }
                a.ThreadFactoryC0355a threadFactoryC0355a = new a.ThreadFactoryC0355a();
                if (d3.a.f27270u == 0) {
                    d3.a.f27270u = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = d3.a.f27270u;
                if (!TextUtils.isEmpty(av.aq)) {
                    d3.a aVar2 = new d3.a(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0355a, av.aq, false)));
                    int i12 = d3.a.f27270u;
                    a.ThreadFactoryC0355a threadFactoryC0355a2 = new a.ThreadFactoryC0355a();
                    if (!TextUtils.isEmpty("disk-cache")) {
                        d3.a aVar3 = new d3.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0355a2, "disk-cache", true)));
                        if (d3.a.f27270u == 0) {
                            d3.a.f27270u = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (d3.a.f27270u >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        a.ThreadFactoryC0355a threadFactoryC0355a3 = new a.ThreadFactoryC0355a();
                        if (!TextUtils.isEmpty("animation")) {
                            d3.a aVar4 = new d3.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(threadFactoryC0355a3, "animation", true)));
                            c3.i iVar = new c3.i(new i.a(applicationContext));
                            com.bumptech.glide.manager.e eVar2 = new com.bumptech.glide.manager.e();
                            int i13 = iVar.f3243a;
                            if (i13 > 0) {
                                cVar = cVar2;
                                eVar = new b3.j(i13);
                            } else {
                                cVar = cVar2;
                                eVar = new b3.e();
                            }
                            b3.i iVar2 = new b3.i(iVar.f3245c);
                            c3.g gVar = new c3.g(iVar.f3244b);
                            a3.o oVar = new a3.o(gVar, new c3.f(applicationContext), aVar3, aVar2, new d3.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, d3.a.f27269t, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.ThreadFactoryC0355a(), "source-unlimited", false))), aVar4);
                            List emptyList = Collections.emptyList();
                            i iVar3 = new i(aVar);
                            b bVar2 = new b(applicationContext, oVar, gVar, eVar, iVar2, new com.bumptech.glide.manager.n(null, iVar3), eVar2, 4, cVar, bVar, emptyList, arrayList, generatedAppGlideModule, iVar3);
                            applicationContext.registerComponentCallbacks(bVar2);
                            f19716z = bVar2;
                            A = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f19716z == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f19716z == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f19716z;
    }

    public static com.bumptech.glide.manager.n c(Context context) {
        if (context != null) {
            return b(context).f19721w;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @Deprecated
    public static o e(Activity activity) {
        return c(activity).b(activity);
    }

    public final void d(o oVar) {
        synchronized (this.y) {
            if (this.y.contains(oVar)) {
                this.y.remove(oVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        t3.l.a();
        ((t3.i) this.f19718t).e(0L);
        this.f19717s.b();
        this.f19720v.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        t3.l.a();
        synchronized (this.y) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
            }
        }
        c3.g gVar = (c3.g) this.f19718t;
        gVar.getClass();
        if (i10 >= 40) {
            gVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (gVar) {
                j10 = gVar.f35421b;
            }
            gVar.e(j10 / 2);
        }
        this.f19717s.a(i10);
        this.f19720v.a(i10);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
