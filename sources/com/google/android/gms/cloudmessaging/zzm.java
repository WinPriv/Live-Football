package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.anythink.basead.b.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final class zzm implements ServiceConnection {
    zzn zzc;
    final /* synthetic */ zzs zzf;

    @GuardedBy("this")
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = zzm.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.zze.get(i10);
                if (zzpVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                zzmVar.zze.remove(i10);
                zzmVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzpVar.zzc(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzpVar.zza(data);
                return true;
            }
        }
    }));

    @GuardedBy("this")
    final Queue<zzp<?>> zzd = new ArrayDeque();

    @GuardedBy("this")
    final SparseArray<zzp<?>> zze = new SparseArray<>();

    public /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.zzf = zzsVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = zzm.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzmVar.zzc = new zzn(iBinder2);
                            zzmVar.zza = 2;
                            zzmVar.zzc();
                        } catch (RemoteException e10) {
                            zzmVar.zza(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzm.this.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i10, String str) {
        zzb(i10, str, null);
    }

    public final synchronized void zzb(int i10, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i11 = this.zza;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
            zzq zzqVar = new zzq(i10, str, th);
            Iterator<zzp<?>> it = this.zzd.iterator();
            while (it.hasNext()) {
                it.next().zzc(zzqVar);
            }
            this.zzd.clear();
            for (int i12 = 0; i12 < this.zze.size(); i12++) {
                this.zze.valueAt(i12).zzc(zzqVar);
            }
            this.zze.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final void zzc() {
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzp<?> poll;
                final zzm zzmVar = zzm.this;
                while (true) {
                    synchronized (zzmVar) {
                        if (zzmVar.zza != 2) {
                            return;
                        }
                        if (zzmVar.zzd.isEmpty()) {
                            zzmVar.zzf();
                            return;
                        } else {
                            poll = zzmVar.zzd.poll();
                            zzmVar.zze.put(poll.zza, poll);
                            zzs.zze(zzmVar.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzm.this.zze(poll.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context zza = zzs.zza(zzmVar.zzf);
                    Messenger messenger = zzmVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zzb());
                    bundle.putString(a.C0052a.A, zza.getPackageName());
                    bundle.putBundle("data", poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzmVar.zzc.zza(obtain);
                    } catch (RemoteException e10) {
                        zzmVar.zza(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i10) {
        zzp<?> zzpVar = this.zze.get(i10);
        if (zzpVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.zze.remove(i10);
            zzpVar.zzc(new zzq(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
        }
    }

    public final synchronized boolean zzg(zzp<?> zzpVar) {
        boolean z10;
        int i10 = this.zza;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                this.zzd.add(zzpVar);
                zzc();
                return true;
            }
            this.zzd.add(zzpVar);
            return true;
        }
        this.zzd.add(zzpVar);
        if (this.zza == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.getInstance().bindService(zzs.zza(this.zzf), intent, this, 1)) {
                zza(0, "Unable to bind to service");
            } else {
                zzs.zze(this.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e10) {
            zzb(0, "Unable to bind to service", e10);
        }
        return true;
    }
}
