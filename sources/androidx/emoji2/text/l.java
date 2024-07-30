package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class l extends f.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1656d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1657a;

        /* renamed from: b, reason: collision with root package name */
        public final k0.f f1658b;

        /* renamed from: c, reason: collision with root package name */
        public final a f1659c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f1660d;

        /* renamed from: e, reason: collision with root package name */
        public Handler f1661e;
        public Executor f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f1662g;

        /* renamed from: h, reason: collision with root package name */
        public f.h f1663h;

        public b(Context context, k0.f fVar) {
            a aVar = l.f1656d;
            this.f1660d = new Object();
            if (context != null) {
                this.f1657a = context.getApplicationContext();
                this.f1658b = fVar;
                this.f1659c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            synchronized (this.f1660d) {
                this.f1663h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1660d) {
                this.f1663h = null;
                Handler handler = this.f1661e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1661e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1662g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f1662g = null;
            }
        }

        public final void c() {
            synchronized (this.f1660d) {
                if (this.f1663h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1662g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new androidx.activity.b(this, 3));
            }
        }

        public final k0.m d() {
            try {
                a aVar = this.f1659c;
                Context context = this.f1657a;
                k0.f fVar = this.f1658b;
                aVar.getClass();
                k0.l a10 = k0.e.a(context, fVar);
                int i10 = a10.f30272a;
                if (i10 == 0) {
                    k0.m[] mVarArr = a10.f30273b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(a3.l.j("fetchFonts failed (", i10, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public l(Context context, k0.f fVar) {
        super(new b(context, fVar));
    }
}
