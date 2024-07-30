package qa;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.ppskit.download.DownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import ka.n7;
import ka.o7;
import ka.v5;
import qa.e;

/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final Context f34732s;

    /* renamed from: t, reason: collision with root package name */
    public final b f34733t;

    /* renamed from: u, reason: collision with root package name */
    public DownloadTask f34734u;

    /* renamed from: v, reason: collision with root package name */
    public WeakReference<c> f34735v;
    public int y;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34736w = false;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f34737x = new byte[0];

    /* renamed from: z, reason: collision with root package name */
    public boolean f34738z = true;

    public g(b bVar) {
        this.f34733t = bVar;
        this.f34732s = bVar.f34719a;
    }

    public final c a(DownloadTask downloadTask, File file) {
        String s10;
        int i10;
        Integer q10;
        c cVar = null;
        try {
            if (!TextUtils.isEmpty(downloadTask.b0())) {
                int c02 = downloadTask.c0();
                b bVar = this.f34733t;
                String d02 = downloadTask.d0();
                Context context = bVar.f34719a;
                if (context != null && (q10 = n.q(4, 0, com.huawei.openalliance.ad.ppskit.handlers.l.d(context).J(d02))) != null) {
                    i10 = q10.intValue();
                } else {
                    i10 = 5;
                }
                if (c02 < i10) {
                    n7.e("DownloadWorker", "create connection with redirected url");
                    s10 = downloadTask.b0();
                    n7.c("DownloadWorker", "url: %s", y1.j(s10));
                    cVar = c.d(downloadTask.O(), this.f34732s, s10);
                    return b(cVar, downloadTask, file);
                }
            }
            if (downloadTask.a0() && !TextUtils.isEmpty(downloadTask.w())) {
                n7.e("DownloadWorker", "create connection with safe url");
                s10 = downloadTask.w();
                downloadTask.K(null);
                downloadTask.P(0);
            } else {
                n7.e("DownloadWorker", "create connection with normal url");
                s10 = downloadTask.s();
            }
            n7.c("DownloadWorker", "url: %s", y1.j(s10));
            cVar = c.d(downloadTask.O(), this.f34732s, s10);
            return b(cVar, downloadTask, file);
        } catch (IOException e10) {
            downloadTask.C(1);
            throw e10;
        } catch (IllegalStateException e11) {
            n.D(cVar);
            throw e11;
        } catch (KeyStoreException e12) {
            n.D(cVar);
            throw e12;
        } catch (NoSuchAlgorithmException e13) {
            n.D(cVar);
            throw e13;
        } catch (v5 e14) {
            n.D(cVar);
            throw e14;
        }
    }

    public final c b(c cVar, DownloadTask downloadTask, File file) {
        int i10;
        Integer q10;
        n7.e("DownloadWorker", "checkConn start");
        try {
            long a10 = e.a(cVar);
            if (downloadTask.L() > 0 && a10 > 0 && downloadTask.L() != a10) {
                n7.c("DownloadWorker", "task size:%s, header size:%s", Long.valueOf(downloadTask.L()), Long.valueOf(a10));
                n7.e("DownloadWorker", "checkConn - may be hijacked, switch to safe url");
                cVar = e(cVar, downloadTask, file);
            }
            n7.e("DownloadWorker", "checkConn end");
            return cVar;
        } catch (e.a e10) {
            downloadTask.P(downloadTask.c0() + 1);
            downloadTask.K(e10.f34730s);
            String d02 = downloadTask.d0();
            Context context = this.f34733t.f34719a;
            if (context != null && (q10 = n.q(4, 0, com.huawei.openalliance.ad.ppskit.handlers.l.d(context).J(d02))) != null) {
                i10 = q10.intValue();
            } else {
                i10 = 5;
            }
            n7.h("DownloadWorker", "checkConn - url is redirected [count: %d, max: %d]", Integer.valueOf(downloadTask.c0()), Integer.valueOf(i10));
            if (!TextUtils.isEmpty(downloadTask.b0()) && downloadTask.c0() <= i10) {
                n7.e("DownloadWorker", "checkConn - connect with redirected url");
                n.D(cVar);
                return a(downloadTask, file);
            }
            return e(cVar, downloadTask, file);
        }
    }

    public final void c(DownloadTask downloadTask, long j10, long j11, DownloadBlockInfo downloadBlockInfo) {
        if (j10 == 0) {
            n7.g("DownloadWorker", "speed log - no start time");
            return;
        }
        HashMap hashMap = d0.f22830a;
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = currentTimeMillis - j10;
        if (j12 > 0) {
            if (!downloadTask.Z()) {
                if (downloadBlockInfo == null) {
                    downloadBlockInfo = new DownloadBlockInfo();
                }
                downloadBlockInfo.a(j10);
                downloadBlockInfo.c(currentTimeMillis);
                downloadBlockInfo.e(j11);
                downloadTask.m(downloadBlockInfo);
                downloadTask.e();
            }
            long j13 = (((j11 * 100) * 1000) / j12) / 100;
            n7.f("DownloadWorker", "download complete - total time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s)", Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j13));
            o7 a10 = o7.a();
            Object[] objArr = {Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j13), Integer.valueOf(k1.f(this.f34732s))};
            if (a10.f31596a != null) {
                a10.b("DownloadWorker", String.format(Locale.ENGLISH, "download complete - total time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s), network type: %d", objArr));
                return;
            }
            return;
        }
        n7.g("DownloadWorker", "speed log - duration <= 0");
    }

    public final void d(boolean z10) {
        b bVar = this.f34733t;
        if (z10) {
            try {
                bVar.i(this.f34734u);
            } catch (Throwable unused) {
                n7.i("DownloadWorker", "call manager.onDownloadFail Exception");
            }
        }
        try {
            if (i() && this.f34734u.Y() == 1) {
                this.f34734u.F(0);
            }
            this.f34734u.q(null);
            bVar.b(this.f34734u);
            this.f34734u = null;
        } catch (Throwable unused2) {
            n7.i("DownloadWorker", "run Exception");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r10.createNewFile() != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qa.c e(qa.c r8, com.huawei.openalliance.ad.ppskit.download.DownloadTask r9, java.io.File r10) {
        /*
            r7 = this;
            java.lang.String r0 = "DownloadWorker"
            java.lang.String r1 = "checkConn - try Safe Url"
            ka.n7.e(r0, r1)
            boolean r1 = r9.a0()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L5f
            java.lang.String r1 = r9.w()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5f
            r1 = 0
            boolean r5 = r10.exists()     // Catch: java.lang.Exception -> L36 java.io.IOException -> L39
            if (r5 != 0) goto L28
            boolean r5 = r10.createNewFile()     // Catch: java.lang.Exception -> L36 java.io.IOException -> L39
            if (r5 == 0) goto L28
            goto L34
        L28:
            boolean r5 = r10.delete()     // Catch: java.lang.Exception -> L36 java.io.IOException -> L39
            if (r5 == 0) goto L40
            boolean r5 = r10.createNewFile()     // Catch: java.lang.Exception -> L36 java.io.IOException -> L39
            if (r5 == 0) goto L40
        L34:
            r5 = 1
            goto L41
        L36:
            java.lang.String r5 = "reCreateFile Exception"
            goto L3b
        L39:
            java.lang.String r5 = "reCreateFile IOException"
        L3b:
            java.lang.String r6 = "FileUtil"
            ka.n7.g(r6, r5)
        L40:
            r5 = r1
        L41:
            if (r5 == 0) goto L5f
            java.lang.String r5 = "checkConn - switch to safe url ok"
            ka.n7.e(r0, r5)
            androidx.transition.n.D(r8)
            r9.t(r3)
            r9.z(r3)
            r9.x()
            r9.K(r2)
            r9.P(r1)
            qa.c r2 = r7.a(r9, r10)
            goto L76
        L5f:
            java.lang.String r1 = "checkConn - fail to switch to safe url, stop downloading"
            ka.n7.e(r0, r1)
            r0 = 3
            r9.C(r0)
            long r0 = r10.length()
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 > 0) goto L73
            com.huawei.openalliance.ad.ppskit.utils.x.n(r10)
        L73:
            androidx.transition.n.D(r8)
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.g.e(qa.c, com.huawei.openalliance.ad.ppskit.download.DownloadTask, java.io.File):qa.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:3:0x0003, B:6:0x0046, B:8:0x0051, B:11:0x005f, B:13:0x006b, B:16:0x0037, B:18:0x003d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:3:0x0003, B:6:0x0046, B:8:0x0051, B:11:0x005f, B:13:0x006b, B:16:0x0037, B:18:0x003d), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.huawei.openalliance.ad.ppskit.download.DownloadTask r9) {
        /*
            r8 = this;
            java.lang.String r0 = "DownloadWorker"
            r1 = 1
            java.lang.String r2 = "takeTask, taskId:%s, priority:%s, seqNum:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r9.W()     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L6f
            int r4 = r9.T()     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L6f
            r3[r1] = r4     // Catch: java.lang.Throwable -> L6f
            long r6 = r9.V()     // Catch: java.lang.Throwable -> L6f
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L6f
            r6 = 2
            r3[r6] = r4     // Catch: java.lang.Throwable -> L6f
            ka.n7.c(r0, r2, r3)     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            r9.m(r2)     // Catch: java.lang.Throwable -> L6f
            qa.b r2 = r8.f34733t     // Catch: java.lang.Throwable -> L6f
            android.content.Context r3 = r2.f34719a     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.k1.g(r3)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L37
            r3 = 5
            goto L46
        L37:
            boolean r3 = r9.X()     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L4e
            android.content.Context r3 = r2.f34719a     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.k1.e(r3)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L4e
            r3 = 6
        L46:
            r9.C(r3)     // Catch: java.lang.Throwable -> L6f
            r2.i(r9)     // Catch: java.lang.Throwable -> L6f
            r2 = r5
            goto L4f
        L4e:
            r2 = r1
        L4f:
            if (r2 != 0) goto L5f
            java.lang.String r2 = "executeTask, network error, taskId:%s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r9.W()     // Catch: java.lang.Throwable -> L6f
            r3[r5] = r4     // Catch: java.lang.Throwable -> L6f
            ka.n7.c(r0, r2, r3)     // Catch: java.lang.Throwable -> L6f
            return r5
        L5f:
            r9.q(r8)     // Catch: java.lang.Throwable -> L6f
            r9.F(r6)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r8.j(r9)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto La2
            r8.j(r9)     // Catch: java.lang.Throwable -> L6f
            goto La2
        L6f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "executeTask Exception, taskId:"
            r2.<init>(r3)
            java.lang.String r9 = r9.W()
            java.lang.String r9 = com.huawei.openalliance.ad.ppskit.utils.y1.j(r9)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            ka.n7.i(r0, r9)
            ka.n7.a()
            boolean r9 = r8.i()
            if (r9 != 0) goto L9c
            r2 = 100
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L97
            goto L9c
        L97:
            java.lang.String r9 = "exception occur when wait for sync cancel"
            ka.n7.i(r0, r9)
        L9c:
            boolean r9 = r8.i()
            r5 = r9 ^ 1
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.g.f(com.huawei.openalliance.ad.ppskit.download.DownloadTask):boolean");
    }

    public final boolean g(DownloadTask downloadTask, File file) {
        n7.e("DownloadWorker", "download complete");
        if (!i()) {
            boolean g6 = downloadTask.g();
            b bVar = this.f34733t;
            if (g6 && !x.j(downloadTask.B(), file)) {
                n7.g("DownloadWorker", "onDownloadCompleted, check file sha256 failed");
                boolean h10 = h(downloadTask, file);
                if (!h10) {
                    x.n(file);
                    downloadTask.C(4);
                    bVar.i(downloadTask);
                }
                return h10;
            }
            String k10 = downloadTask.k();
            if (TextUtils.isEmpty(k10)) {
                k10 = "normal";
            }
            if (x.h(this.f34732s, file, downloadTask.E(), downloadTask.i(), k10)) {
                n7.e("DownloadWorker", "download success");
                bVar.e(downloadTask, 100);
                bVar.h(downloadTask);
                return false;
            }
            bVar.i(downloadTask);
            return false;
        }
        if (downloadTask.Z()) {
            n7.e("DownloadWorker", "onDownloadCompleted - task is cancelled");
            x.n(file);
            downloadTask.t(0L);
            return false;
        }
        return false;
    }

    public final boolean h(DownloadTask downloadTask, File file) {
        if (downloadTask.a0() || TextUtils.isEmpty(downloadTask.w()) || !k1.e(this.f34732s)) {
            return false;
        }
        downloadTask.x();
        downloadTask.t(0L);
        downloadTask.z(0L);
        downloadTask.K(null);
        downloadTask.P(0);
        x.n(file);
        b bVar = this.f34733t;
        bVar.getClass();
        if (!downloadTask.Z()) {
            if (n7.d()) {
                n7.c("DownloadManager", "onDownloadSwitchSafeUrl, taskId:%s", downloadTask.W());
            }
            a<T> aVar = bVar.f34722d;
            if (aVar != 0) {
                aVar.g(downloadTask);
            }
        }
        return true;
    }

    public final synchronized boolean i() {
        return this.f34736w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x028a, code lost:
    
        ka.n7.g("DownloadWorker", "downloading, check file size failed");
        r0 = h(r36, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0295, code lost:
    
        if (r0 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0297, code lost:
    
        com.huawei.openalliance.ad.ppskit.utils.x.n(r10);
        r36.C(3);
        r35.f34733t.i(r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a3, code lost:
    
        androidx.transition.n.D(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023e, code lost:
    
        ka.n7.e("DownloadWorker", "download canceled");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x03b3: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:948), block:B:228:0x03b3 */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.io.RandomAccessFile, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(com.huawei.openalliance.ad.ppskit.download.DownloadTask r36) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.g.j(com.huawei.openalliance.ad.ppskit.download.DownloadTask):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        n7.f("DownloadWorker", "[%s] running...", this);
        this.f34734u = null;
        boolean z10 = false;
        while (true) {
            synchronized (this.f34737x) {
            }
            try {
                synchronized (this) {
                    while (((BlockingQueue) this.f34733t.f34723e.f32659s).size() > 0 && !k1.g(this.f34733t.f34719a)) {
                        wait(1000L);
                    }
                }
                this.y = 0;
                this.f34738z = true;
                DownloadTask f = this.f34733t.f();
                this.f34734u = f;
                if (f != null) {
                    z10 = false;
                    do {
                        synchronized (this) {
                            if (z10) {
                                long pow = (long) (Math.pow(2.0d, this.y - 1) * 500.0d);
                                n7.i("DownloadWorker", "retry, interval:" + pow + ", count:" + this.y);
                                wait(pow);
                            }
                        }
                        z10 = f(this.f34734u);
                        if (!z10) {
                            break;
                        }
                        i10 = this.y;
                        this.y = i10 + 1;
                    } while (i10 < 3);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            if (this.f34734u != null) {
                d(z10);
            }
        }
    }

    public final String toString() {
        return "DownloadWorker";
    }
}
