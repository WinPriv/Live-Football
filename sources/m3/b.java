package m3;

import a3.x;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.n;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.download.DownloadListener;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.DownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import h3.e;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;
import ka.n7;
import ka.p9;
import ka.s5;
import y2.g;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public class b implements c, id.a {

    /* renamed from: s, reason: collision with root package name */
    public Object f32659s;

    /* renamed from: t, reason: collision with root package name */
    public Object f32660t;

    /* renamed from: u, reason: collision with root package name */
    public Object f32661u;

    public b(int i10) {
        if (i10 == 3) {
            this.f32661u = new HashMap();
            return;
        }
        this.f32659s = new PriorityBlockingQueue();
        this.f32660t = new ConcurrentLinkedQueue();
        this.f32661u = new ConcurrentLinkedQueue();
    }

    public static DownloadTask h(Queue queue, String str) {
        if (n7.d()) {
            n7.c("DownloadQueue", "findTaskFromQueue, taskId:%s", str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            DownloadTask downloadTask = (DownloadTask) it.next();
            if (str.equals(downloadTask.W())) {
                return downloadTask;
            }
        }
        return null;
    }

    public final com.huawei.openalliance.ad.download.DownloadTask a(String str) {
        d0.b bVar = (d0.b) this.f32661u;
        bVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean Code = ex.Code();
        Object obj = bVar.f27251t;
        if (Code) {
            ex.Code("DownloadQueue", "findTask, workingQueue.size:%s", Integer.valueOf(((Queue) obj).size()));
        }
        Queue<com.huawei.openalliance.ad.download.DownloadTask> queue = (Queue) obj;
        if (ex.Code()) {
            ex.Code("DownloadQueue", "findTaskFromQueue, taskId:%s", str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.huawei.openalliance.ad.download.DownloadTask downloadTask : queue) {
            if (str.equals(downloadTask.h())) {
                return downloadTask;
            }
        }
        return null;
    }

    public final void b(AppDownloadTask appDownloadTask) {
        d0.b bVar = (d0.b) this.f32661u;
        if (appDownloadTask == null) {
            bVar.getClass();
        } else {
            Queue queue = (Queue) bVar.f27251t;
            if (!queue.contains(appDownloadTask)) {
                queue.offer(appDownloadTask);
            }
        }
        if (ex.Code()) {
            ex.Code("DownloadManager", "addTask, task:%s, priority:%s", appDownloadTask.h(), Integer.valueOf(appDownloadTask.b()));
        }
    }

    public final boolean c(com.huawei.openalliance.ad.download.DownloadTask downloadTask) {
        boolean z10 = false;
        if (downloadTask == null) {
            return false;
        }
        Queue queue = (Queue) ((d0.b) this.f32661u).f27251t;
        if (queue.contains(downloadTask)) {
            queue.remove(downloadTask);
            z10 = true;
        }
        ex.V("DownloadManager", "removeTask, succ:" + z10);
        if (z10) {
            g(downloadTask);
        }
        return true;
    }

    public final void d() {
        ex.V("DownloadManager", "cancelAllDownload");
        Iterator it = ((Queue) ((d0.b) this.f32661u).f27251t).iterator();
        while (it.hasNext()) {
            g((com.huawei.openalliance.ad.download.DownloadTask) it.next());
        }
        ((Queue) ((d0.b) this.f32661u).f27251t).clear();
    }

    public final void e(com.huawei.openalliance.ad.download.DownloadTask downloadTask) {
        boolean z10;
        if (downloadTask == null) {
            return;
        }
        Queue queue = (Queue) ((d0.b) this.f32661u).f27251t;
        if (queue.contains(downloadTask)) {
            queue.remove(downloadTask);
            z10 = true;
        } else {
            z10 = false;
        }
        ex.V("DownloadManager", "deleteTask, succ:%s, taskId:%s", Boolean.valueOf(z10), downloadTask.h());
    }

    @Override // m3.c
    public final x f(x xVar, g gVar) {
        Drawable drawable = (Drawable) xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c) this.f32660t).f(e.b(((BitmapDrawable) drawable).getBitmap(), (b3.d) this.f32659s), gVar);
        }
        if (drawable instanceof l3.c) {
            return ((c) this.f32661u).f(xVar, gVar);
        }
        return null;
    }

    public final void g(com.huawei.openalliance.ad.download.DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (ex.Code()) {
            ex.Code("DownloadManager", "onDownloadDeleted, taskId:%s", downloadTask.h());
        }
        Object obj = this.f32660t;
        if (((DownloadListener) obj) != null) {
            ((DownloadListener) obj).onDownloadDeleted(downloadTask);
        }
    }

    public final void i(long j10) {
        Object obj = this.f32660t;
        if (((ContentRecord) obj) != null) {
            ((ContentRecord) obj).s2(j10);
        }
    }

    public final void j(Context context, long j10, long j11) {
        String str;
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        if (contentRecord != null && contentRecord.Y0()) {
            if (j10 >= j11) {
                str = "complete";
                if (k("complete")) {
                    return;
                }
            } else {
                long j12 = j11 / 4;
                if (j10 > 3 * j12) {
                    str = cp.Z;
                    if (k(cp.Z)) {
                        return;
                    }
                } else if (j10 > j11 / 2) {
                    str = "midpoint";
                    if (k("midpoint")) {
                        return;
                    }
                } else if (j10 > j12) {
                    str = cp.V;
                    if (k(cp.V)) {
                        return;
                    }
                } else if (j10 > 0) {
                    str = "start";
                    if (k("start")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            n.I(context, (ContentRecord) this.f32660t, str);
            ((Map) this.f32661u).put(str, Boolean.TRUE);
        }
    }

    public final boolean k(String str) {
        if (((Map) this.f32661u).containsKey(str) && ((Boolean) ((Map) this.f32661u).get(str)).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean l(s5 s5Var) {
        boolean z10;
        if (((Queue) this.f32661u).contains(s5Var)) {
            z10 = false;
        } else if (!((BlockingQueue) this.f32659s).contains(s5Var)) {
            z10 = ((BlockingQueue) this.f32659s).offer(s5Var);
            if (z10) {
                ((Queue) this.f32660t).remove(s5Var);
            }
        } else {
            z10 = true;
        }
        if (n7.d()) {
            n7.c("DownloadQueue", "addTask, succ:%s, taskId:%s, priority:%s, seqNum:%s", Boolean.valueOf(z10), s5Var.f31794t, Integer.valueOf(s5Var.T()), Long.valueOf(s5Var.V()));
        }
        return z10;
    }

    public final boolean m(DownloadTask downloadTask) {
        if (n7.d()) {
            n7.c("DownloadQueue", "addIdleTask, task:%s", downloadTask);
        }
        if (downloadTask == null || ((Queue) this.f32660t).contains(downloadTask)) {
            return false;
        }
        return ((Queue) this.f32660t).offer(downloadTask);
    }

    public p9 n() {
        return (p9) this.f32659s;
    }

    @Override // id.a
    public final Object newInstance() {
        try {
            Object obj = this.f32659s;
            return ((Class) obj).cast(((Method) this.f32660t).invoke(null, (Class) obj, (Integer) this.f32661u));
        } catch (Exception e10) {
            throw new r2.a(e10);
        }
    }

    public final String o() {
        View view;
        Object n10 = n();
        if (n10 instanceof View) {
            view = (View) n10;
        } else {
            view = null;
        }
        int[] v3 = z1.v(view);
        return String.format("%s,%s", Integer.valueOf(v3[0]), Integer.valueOf(v3[1]));
    }

    public /* synthetic */ b(Context context) {
        this.f32659s = context.getApplicationContext();
    }

    public /* synthetic */ b(b3.d dVar, a aVar, l3.d dVar2) {
        this.f32659s = dVar;
        this.f32660t = aVar;
        this.f32661u = dVar2;
    }

    public b(Class cls) {
        this.f32659s = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            this.f32660t = declaredMethod;
            try {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                this.f32661u = (Integer) declaredMethod2.invoke(null, Object.class);
            } catch (IllegalAccessException e10) {
                throw new r2.a(e10);
            } catch (NoSuchMethodException e11) {
                throw new r2.a(e11);
            } catch (RuntimeException e12) {
                throw new r2.a(e12);
            } catch (InvocationTargetException e13) {
                throw new r2.a(e13);
            }
        } catch (NoSuchMethodException e14) {
            throw new r2.a(e14);
        } catch (RuntimeException e15) {
            throw new r2.a(e15);
        }
    }
}
