package com.google.android.gms.measurement.internal;

import a3.k;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzga extends zzgx {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    private zzfz zzb;
    private zzfz zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    public zzga(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzfx(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzfx(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzga zzgaVar) {
        boolean z10 = zzgaVar.zzj;
        return false;
    }

    private final void zzt(zzfy zzfyVar) {
        synchronized (this.zzh) {
            this.zzd.add(zzfyVar);
            zzfz zzfzVar = this.zzb;
            if (zzfzVar == null) {
                zzfz zzfzVar2 = new zzfz(this, "Measurement Worker", this.zzd);
                this.zzb = zzfzVar2;
                zzfzVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzfzVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zzaz() {
        if (Thread.currentThread() == this.zzc) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object zzd(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzt.zzaB().zzp(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.zzt.zzaA().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzt.zzaA().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zzg() {
        if (Thread.currentThread() == this.zzb) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfy zzfyVar = new zzfy(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                k.q(this.zzt, "Callable skipped the worker queue.");
            }
            zzfyVar.run();
        } else {
            zzt(zzfyVar);
        }
        return zzfyVar;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfy zzfyVar = new zzfy(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzfyVar.run();
        } else {
            zzt(zzfyVar);
        }
        return zzfyVar;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzfy zzfyVar = new zzfy(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            this.zze.add(zzfyVar);
            zzfz zzfzVar = this.zzc;
            if (zzfzVar == null) {
                zzfz zzfzVar2 = new zzfz(this, "Measurement Network", this.zze);
                this.zzc = zzfzVar2;
                zzfzVar2.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            } else {
                zzfzVar.zza();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfy(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfy(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        if (Thread.currentThread() == this.zzb) {
            return true;
        }
        return false;
    }
}
