package com.google.android.gms.measurement.internal;

import a3.l;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfy extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzga zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            l.x(zzgaVar.zzt, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfy zzfyVar = (zzfy) obj;
        boolean z10 = this.zza;
        if (z10 != zzfyVar.zza) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        long j10 = this.zzc;
        long j11 = zzfyVar.zzc;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.zzb.zzt.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzaA().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfw) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            l.x(zzgaVar.zzt, "Tasks index overflow");
        }
    }
}
