package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import j0.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements l1.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f1631b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1612a;

        public b(Context context) {
            this.f1612a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(this, hVar, threadPoolExecutor, 0));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                int i10 = j0.i.f29566a;
                i.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f1619j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f.a().c();
                }
                i.a.b();
            } catch (Throwable th) {
                int i11 = j0.i.f29566a;
                i.a.b();
                throw th;
            }
        }
    }

    @Override // l1.b
    public final List<Class<? extends l1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // l1.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (f.f1619j == null) {
            synchronized (f.f1618i) {
                if (f.f1619j == null) {
                    f.f1619j = new f(aVar);
                }
            }
        }
        l1.a c10 = l1.a.c(context);
        c10.getClass();
        synchronized (l1.a.f32313e) {
            try {
                obj = c10.f32314a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.i lifecycle = ((androidx.lifecycle.m) obj).getLifecycle();
        lifecycle.a(new androidx.lifecycle.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void f() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                lifecycle.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
