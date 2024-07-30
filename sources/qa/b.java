package qa;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.download.DownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.x;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ka.n7;
import ka.s5;

/* loaded from: classes2.dex */
public class b<T extends DownloadTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34719a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f34720b;

    /* renamed from: c, reason: collision with root package name */
    public String f34721c;

    /* renamed from: d, reason: collision with root package name */
    public qa.a<T> f34722d;

    /* renamed from: e, reason: collision with root package name */
    public m3.b f34723e;
    public Integer f;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final DownloadTask f34724s;

        /* renamed from: t, reason: collision with root package name */
        public final Context f34725t;

        public a(Context context, s5 s5Var) {
            this.f34725t = context;
            this.f34724s = s5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DownloadTask downloadTask = this.f34724s;
            if (downloadTask == null) {
                return;
            }
            String I = downloadTask.I();
            Context context = this.f34725t;
            x.e(context, I);
            x.e(context, downloadTask.E());
        }
    }

    public b(Context context) {
        this.f34719a = context.getApplicationContext();
    }

    public final T a(String str) {
        m3.b bVar = this.f34723e;
        bVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (n7.d()) {
            n7.c("DownloadQueue", "takeTask, workingQueue.size:%s, waitingQueue.size:%s, idleQueue.size:%s", Integer.valueOf(((Queue) bVar.f32661u).size()), Integer.valueOf(((BlockingQueue) bVar.f32659s).size()), Integer.valueOf(((Queue) bVar.f32660t).size()));
        }
        DownloadTask h10 = m3.b.h((Queue) bVar.f32661u, str);
        if (h10 == null && (h10 = m3.b.h((BlockingQueue) bVar.f32659s, str)) == null) {
            return (T) m3.b.h((Queue) bVar.f32660t, str);
        }
        return (T) h10;
    }

    public final void b(T t10) {
        if (t10 != null) {
            if (n7.d()) {
                n7.c("DownloadManager", "onDownloadCompleted, taskId:%s, priority:", t10.W(), Integer.valueOf(t10.T()));
            }
            ((Queue) this.f34723e.f32661u).remove(t10);
        }
    }

    public final void c(s5 s5Var) {
        boolean Z = s5Var.Z();
        s5Var.v(false);
        boolean l10 = this.f34723e.l(s5Var);
        if (n7.d()) {
            n7.c("DownloadQueue", "resumeTask, succ:%s, taskId:%s", Boolean.valueOf(l10), s5Var.f31794t);
        }
        if (n7.d()) {
            n7.c("DownloadManager", "resumeTask, succ:%s, taskId:%s", Boolean.valueOf(l10), s5Var.f31794t);
        }
        if (l10) {
            s5Var.y(1);
            s5Var.M(0);
            if (!s5Var.Z()) {
                if (n7.d()) {
                    n7.c("DownloadManager", "onDownloadResumed, taskId:%s", s5Var.f31794t);
                }
                qa.a<T> aVar = this.f34722d;
                if (aVar != null) {
                    aVar.e(s5Var);
                    return;
                }
                return;
            }
            return;
        }
        s5Var.v(Z);
    }

    public final void d() {
        if (this.f34723e == null) {
            this.f34723e = new m3.b(2);
        }
        this.f34720b = Executors.newFixedThreadPool(1, new d());
        this.f34720b.execute(new g(this));
    }

    public final void e(T t10, int i10) {
        if (t10 != null && !t10.Z()) {
            if (n7.d() && i10 % 10 == 0) {
                n7.c("DownloadManager", "onDownloadProgress, progress:%s, taskId:%s", Integer.valueOf(i10), t10.W());
            }
            t10.J(i10);
            qa.a<T> aVar = this.f34722d;
            if (aVar != null) {
                aVar.d(t10);
            }
        }
    }

    public final T f() {
        m3.b bVar = this.f34723e;
        bVar.getClass();
        try {
            if (n7.d()) {
                n7.c("DownloadQueue", "takeTask, workingQueue.size:%s, waitingQueue.size:%s, idleQueue.size:%s", Integer.valueOf(((Queue) bVar.f32661u).size()), Integer.valueOf(((BlockingQueue) bVar.f32659s).size()), Integer.valueOf(((Queue) bVar.f32660t).size()));
            }
            T t10 = (T) ((BlockingQueue) bVar.f32659s).take();
            if (!((Queue) bVar.f32661u).offer(t10)) {
                n7.e("DownloadQueue", "taskTask - workingQueue fail to offer ");
            }
            if (n7.d()) {
                n7.c("DownloadQueue", "takeTask, task:%s", t10);
                return t10;
            }
            return t10;
        } catch (Throwable th) {
            n7.i("DownloadQueue", "takeTask:".concat(th.getClass().getSimpleName()));
            return null;
        }
    }

    public final void g(T t10) {
        if (t10 != null && !t10.Z()) {
            if (n7.d()) {
                n7.c("DownloadManager", "onDownloadStart, taskId:%s", t10.W());
            }
            t10.y(2);
            qa.a<T> aVar = this.f34722d;
            if (aVar != null) {
                aVar.c(t10);
            }
        }
    }

    public final void h(T t10) {
        if (t10 != null && !t10.Z()) {
            if (n7.d()) {
                n7.c("DownloadManager", "onDownloadSuccess, taskId:%s", t10.W());
            }
            this.f34723e.m(t10);
            qa.a<T> aVar = this.f34722d;
            if (aVar != null) {
                aVar.f(t10);
            }
        }
    }

    public final void i(T t10) {
        if (t10 != null && !t10.Z()) {
            if (n7.d()) {
                n7.c("DownloadManager", "onDownloadFail, taskId:%s", t10.W());
            }
            if (t10.f() == 1) {
                if (!x.q(t10.I()) && !x.o(this.f34719a, t10.E())) {
                    t10.J(0);
                } else {
                    this.f34723e.m(t10);
                }
            }
            t10.y(4);
            qa.a<T> aVar = this.f34722d;
            if (aVar != null) {
                aVar.a(t10);
            }
        }
    }
}
