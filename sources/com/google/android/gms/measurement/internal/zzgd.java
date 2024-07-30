package com.google.android.gms.measurement.internal;

import a3.k;
import a3.l;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgd implements zzgy {
    private static volatile zzgd zzd;
    private zzek zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    protected Boolean zza;
    protected Boolean zzb;
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfi zzl;
    private final zzet zzm;
    private final zzga zzn;
    private final zzkp zzo;
    private final zzlp zzp;
    private final zzeo zzq;
    private final Clock zzr;
    private final zziz zzs;
    private final zzik zzt;
    private final zzd zzu;
    private final zzio zzv;
    private final String zzw;
    private zzem zzx;
    private zzjz zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzgd(zzhi zzhiVar) {
        long currentTimeMillis;
        Bundle bundle;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzed.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhiVar.zzb;
        this.zzg = zzhiVar.zzc;
        this.zzh = zzhiVar.zzd;
        this.zzi = zzhiVar.zzh;
        this.zzE = zzhiVar.zze;
        this.zzw = zzhiVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l10 = zzhiVar.zzi;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzag(this);
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzw();
        this.zzl = zzfiVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzm = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.zzp = zzlpVar;
        this.zzq = new zzeo(new zzhh(zzhiVar, this));
        this.zzu = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.zzs = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.zzt = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.zzo = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.zzv = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.zzn = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.zzg;
        boolean z10 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzq = zzq();
            if (zzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzt.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzij(zzq);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    l.A(zzq.zzt, "Registered activity lifecycle callback");
                }
            }
        } else {
            k.q(this, "Application context is not an Application");
        }
        zzgaVar.zzp(new zzgc(this, zzhiVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzgd zzgdVar, zzhi zzhiVar) {
        zzgdVar.zzaB().zzg();
        zzgdVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.zzz = zzaoVar;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.zzf);
        zzekVar.zzb();
        zzgdVar.zzA = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.zzx = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.zzy = zzjzVar;
        zzgdVar.zzp.zzx();
        zzgdVar.zzl.zzx();
        zzgdVar.zzA.zzc();
        zzer zzi = zzgdVar.zzaA().zzi();
        zzgdVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.zzf)) {
            if (zzgdVar.zzv().zzaf(zzl)) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgdVar.zzG != zzgdVar.zzH.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.zzG), Integer.valueOf(zzgdVar.zzH.get()));
        }
        zzgdVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgw zzgwVar) {
        if (zzgwVar != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (zzfVar.zze()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzgx zzgxVar) {
        if (zzgxVar != null) {
            if (zzgxVar.zzy()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgxVar.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgd.class) {
                if (zzd == null) {
                    zzd = new zzgd(new zzhi(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    public final /* synthetic */ void zzC(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            zzm().zzn.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzaA().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlp zzv = zzv();
                    zzgd zzgdVar = zzv.zzt;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzlp zzv2 = zzv();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = zzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    zzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                zzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        }
                        return;
                    }
                    zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            zzaA().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (this.zzk.zzr() && !((Boolean) zzb.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzio zzr = zzr();
            zzr.zzv();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzt.zze.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzlp zzv = zzv();
                zzh().zzt.zzk.zzh();
                URL zzE = zzv.zzE(79000L, zzl, (String) zzb.first, zzm().zzo.zza() - 1);
                if (zzE != null) {
                    zzio zzr2 = zzr();
                    zzgb zzgbVar = new zzgb(this);
                    zzr2.zzg();
                    zzr2.zzv();
                    Preconditions.checkNotNull(zzE);
                    Preconditions.checkNotNull(zzgbVar);
                    zzr2.zzt.zzaB().zzo(new zzin(zzr2, zzl, zzE, null, null, zzgbVar));
                    return;
                }
                return;
            }
            k.q(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaB().zzg();
        this.zzF = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0095, code lost:
    
        if (r8.zzl() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzH(com.google.android.gms.internal.measurement.zzcl r8) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgd.zzH(com.google.android.gms.internal.measurement.zzcl):void");
    }

    public final boolean zzI() {
        if (this.zzE != null && this.zzE.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzJ() {
        if (zza() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    public final boolean zzM() {
        boolean z10;
        if (this.zzB) {
            zzaB().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z11 = true;
                if (zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlp.zzal(this.zze) && zzlp.zzam(this.zze, false)))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzY(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z11 = false;
                    }
                    this.zzC = Boolean.valueOf(z11);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean zzd2 = zzm().zzd();
        if (zzd2 != null) {
            if (zzd2.booleanValue()) {
                return 0;
            }
            return 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzt.zzj;
        Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (zzk != null) {
            if (zzk.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.zzE == null || this.zzE.booleanValue()) {
            return 0;
        }
        return 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzet zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzga zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzab zzay() {
        return this.zzj;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzk;
    }

    @Pure
    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzek zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzem zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzeo zzj() {
        return this.zzq;
    }

    public final zzet zzl() {
        zzet zzetVar = this.zzm;
        if (zzetVar != null && zzetVar.zzy()) {
            return zzetVar;
        }
        return null;
    }

    @Pure
    public final zzfi zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    public final zzga zzo() {
        return this.zzn;
    }

    @Pure
    public final zzik zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzio zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zziz zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjz zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzkp zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzlp zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
