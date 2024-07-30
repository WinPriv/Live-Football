package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfz extends Thread {
    final /* synthetic */ zzga zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzfz(zzga zzgaVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzgaVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfz zzfzVar;
        zzfz zzfzVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzga zzgaVar = this.zza;
                zzfzVar = zzgaVar.zzb;
                if (this != zzfzVar) {
                    zzfzVar2 = zzgaVar.zzc;
                    if (this == zzfzVar2) {
                        zzgaVar.zzc = null;
                    } else {
                        zzgaVar.zzt.zzaA().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    zzgaVar.zzb = null;
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzt.zzaA().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i10;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfy zzfyVar = (zzfy) this.zzc.poll();
                if (zzfyVar != null) {
                    if (true != zzfyVar.zza) {
                        i10 = 10;
                    } else {
                        i10 = threadPriority;
                    }
                    Process.setThreadPriority(i10);
                    zzfyVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzga.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
