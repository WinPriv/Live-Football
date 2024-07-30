package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.a0;
import com.onesignal.m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: OSSyncService.java */
/* loaded from: classes2.dex */
public final class s2 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f27022e = new Object();
    public static s2 f;

    /* renamed from: d, reason: collision with root package name */
    public Long f27023d = 0L;

    /* compiled from: OSSyncService.java */
    /* loaded from: classes2.dex */
    public static class a extends c {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<Service> f27024s;

        public a(Service service) {
            this.f27024s = new WeakReference<>(service);
        }

        @Override // com.onesignal.s2.c
        public final void a() {
            e3.b(6, "LegacySyncRunnable:Stopped", null);
            WeakReference<Service> weakReference = this.f27024s;
            if (weakReference.get() != null) {
                weakReference.get().stopSelf();
            }
        }
    }

    /* compiled from: OSSyncService.java */
    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<JobService> f27025s;

        /* renamed from: t, reason: collision with root package name */
        public final JobParameters f27026t;

        public b(JobService jobService, JobParameters jobParameters) {
            this.f27025s = new WeakReference<>(jobService);
            this.f27026t = jobParameters;
        }

        @Override // com.onesignal.s2.c
        public final void a() {
            e3.b(6, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + s2.c().f26885a, null);
            boolean z10 = s2.c().f26885a;
            s2.c().f26885a = false;
            WeakReference<JobService> weakReference = this.f27025s;
            if (weakReference.get() != null) {
                weakReference.get().jobFinished(this.f27026t, z10);
            }
        }
    }

    /* compiled from: OSSyncService.java */
    /* loaded from: classes2.dex */
    public static abstract class c implements Runnable {

        /* compiled from: OSSyncService.java */
        /* loaded from: classes2.dex */
        public class a implements a0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BlockingQueue f27027a;

            public a(ArrayBlockingQueue arrayBlockingQueue) {
                this.f27027a = arrayBlockingQueue;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            
                r2 = r2;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.onesignal.a0.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(com.onesignal.a0.d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L3
                    goto L8
                L3:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L8:
                    java.util.concurrent.BlockingQueue r0 = r1.f27027a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onesignal.s2.c.a.a(com.onesignal.a0$d):void");
            }

            @Override // com.onesignal.a0.b
            public final a0.f getType() {
                return a0.f.SYNC_SERVICE;
            }
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (k0.f26884c) {
                s2.c().f27023d = 0L;
            }
            if (e3.s() == null) {
                a();
                return;
            }
            e3.f26752d = e3.q();
            b4.b().q();
            b4.a().q();
            b4.c().q();
            boolean z10 = false;
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                a0.d(e3.f26748b, false, false, new a(arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof a0.d) {
                    b4.f((a0.d) take);
                }
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            b4.b().A(true);
            b4.a().A(true);
            b4.c().A(true);
            m m10 = e3.m();
            m10.getClass();
            if (!e3.o) {
                m.c a10 = m10.f26910b.a();
                if (a10.d() >= a10.f26915a) {
                    z10 = true;
                }
                if (z10) {
                    a10.l();
                }
            }
            a();
        }
    }

    public static s2 c() {
        if (f == null) {
            synchronized (f27022e) {
                if (f == null) {
                    f = new s2();
                }
            }
        }
        return f;
    }

    public final void d(Context context, long j10) {
        Object obj = k0.f26884c;
        synchronized (obj) {
            if (this.f27023d.longValue() != 0) {
                e3.f26775w.getClass();
                if (System.currentTimeMillis() + j10 > this.f27023d.longValue()) {
                    e3.b(7, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f27023d, null);
                    return;
                }
            }
            if (j10 < com.anythink.expressad.exoplayer.f.f7962a) {
                j10 = 5000;
            }
            synchronized (obj) {
                b(context, j10);
                e3.f26775w.getClass();
                this.f27023d = Long.valueOf(System.currentTimeMillis() + j10);
            }
        }
    }
}
