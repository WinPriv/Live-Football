package com.google.android.gms.measurement.internal;

import a3.k;
import a3.l;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.anythink.expressad.exoplayer.f;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.huawei.hms.ads.ep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzik extends zzf {
    protected zzij zza;
    final zzs zzb;
    protected boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z10) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.zzt.zzK() && (bool == null || bool.booleanValue())) {
            return;
        }
        zzab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        long j10;
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                if (true != ep.Code.equals(zza)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                zzY("app", "_npa", Long.valueOf(j10), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (this.zzt.zzJ() && this.zzc) {
            this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzz();
            zzph.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
                this.zzt.zzu().zza.zza();
            }
            this.zzt.zzaB().zzp(new zzhn(this));
            return;
        }
        this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
        this.zzt.zzt().zzI();
    }

    public static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z10;
        zzha[] zzhaVarArr = {zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 < 2) {
                zzha zzhaVar = zzhaVarArr[i10];
                if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        boolean zzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (!z10 && !zzn) {
            return;
        }
        zzikVar.zzt.zzh().zzo();
    }

    public static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j10, boolean z10, boolean z11) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzc = zzikVar.zzt.zzm().zzc();
        if (j10 <= zzikVar.zzk && zzhb.zzk(zzc.zza(), zzhbVar.zza())) {
            zzikVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
            return;
        }
        zzfi zzm = zzikVar.zzt.zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        int zza = zzhbVar.zza();
        if (zzm.zzl(zza)) {
            SharedPreferences.Editor edit = zzm.zza().edit();
            edit.putString("consent_settings", zzhbVar.zzi());
            edit.putInt("consent_source", zza);
            edit.apply();
            zzikVar.zzk = j10;
            zzikVar.zzt.zzt().zzF(z10);
            if (z11) {
                zzikVar.zzt.zzt().zzu(new AtomicReference());
                return;
            }
            return;
        }
        zzikVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if ((this.zzt.zzaw().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlp.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlp zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i10++;
                if (i10 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Bundle bundle2;
        String str3;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z12 = true;
            if (z11 && this.zzd != null && !zzlp.zzaj(str2)) {
                z12 = false;
            }
            boolean z13 = z12;
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            zzM(str3, str2, j10, bundle2, z11, z13, z10, null);
            return;
        }
        this.zzt.zzs().zzx(bundle2, j10);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM("auto", str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j10, Bundle bundle) {
        boolean z10;
        zzg();
        if (this.zzd != null && !zzlp.zzaj(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzI(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void zzI(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        boolean z14;
        boolean zzb;
        long j11;
        String str4;
        Bundle[] bundleArr;
        Class<?> cls;
        String str5 = str;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzt.zzJ()) {
            List zzn = this.zzt.zzh().zzn();
            if (zzn != null && !zzn.contains(str2)) {
                this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
                return;
            }
            int i10 = 0;
            if (!this.zzf) {
                this.zzf = true;
                try {
                    if (!this.zzt.zzN()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                    } catch (Exception e10) {
                        this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.zzt.zzay();
                zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
            }
            this.zzt.zzay();
            if (z10 && zzlp.zzan(str2)) {
                this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
            }
            if (!z12) {
                this.zzt.zzay();
                if (!"_iap".equals(str2)) {
                    zzlp zzv = this.zzt.zzv();
                    int i11 = 2;
                    if (zzv.zzad("event", str2)) {
                        if (!zzv.zzaa("event", zzhc.zza, zzhc.zzb, str2)) {
                            i11 = 13;
                        } else {
                            zzv.zzt.zzf();
                            if (zzv.zzZ("event", 40, str2)) {
                                i11 = 0;
                            }
                        }
                    }
                    if (i11 != 0) {
                        this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                        zzlp zzv2 = this.zzt.zzv();
                        this.zzt.zzf();
                        String zzD = zzv2.zzD(str2, 40, true);
                        if (str2 != null) {
                            i10 = str2.length();
                        }
                        this.zzt.zzv().zzO(this.zzl, null, i11, "_ev", zzD, i10);
                        return;
                    }
                }
            }
            this.zzt.zzay();
            zzir zzj = this.zzt.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = true;
            }
            if (z10 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzlp.zzK(zzj, bundle, z13);
            boolean equals = "am".equals(str5);
            boolean zzaj = zzlp.zzaj(str2);
            if (z10 && this.zzd != null && !zzaj) {
                if (equals) {
                    z14 = true;
                } else {
                    this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                    Preconditions.checkNotNull(this.zzd);
                    this.zzd.interceptEvent(str, str2, bundle, j10);
                    return;
                }
            } else {
                z14 = equals;
            }
            if (this.zzt.zzM()) {
                int zzh = this.zzt.zzv().zzh(str2);
                if (zzh != 0) {
                    this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzlp zzv3 = this.zzt.zzv();
                    this.zzt.zzf();
                    String zzD2 = zzv3.zzD(str2, 40, true);
                    if (str2 != null) {
                        i10 = str2.length();
                    }
                    this.zzt.zzv().zzO(this.zzl, str3, zzh, "_ev", zzD2, i10);
                    return;
                }
                Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
                Preconditions.checkNotNull(zzu);
                this.zzt.zzay();
                if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    zzkn zzknVar = this.zzt.zzu().zzb;
                    long elapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                    long j12 = elapsedRealtime - zzknVar.zzb;
                    zzknVar.zzb = elapsedRealtime;
                    if (j12 > 0) {
                        this.zzt.zzv().zzI(zzu, j12);
                    }
                }
                zzos.zzc();
                if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                    if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                        zzlp zzv4 = this.zzt.zzv();
                        String string = zzu.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzln.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                            zzv4.zzt.zzm().zzp.zzb(string);
                        } else {
                            zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                        if (!TextUtils.isEmpty(zza)) {
                            zzu.putString("_ffr", zza);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzu);
                if (this.zzt.zzf().zzs(null, zzeg.zzaG)) {
                    zzb = this.zzt.zzu().zzo();
                } else {
                    zzb = this.zzt.zzm().zzm.zzb();
                }
                if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j10) && zzb) {
                    l.A(this.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                    zzY("auto", "_sid", null, this.zzt.zzax().currentTimeMillis());
                    zzY("auto", "_sno", null, this.zzt.zzax().currentTimeMillis());
                    zzY("auto", "_se", null, this.zzt.zzax().currentTimeMillis());
                    j11 = 0;
                    this.zzt.zzm().zzk.zzb(0L);
                } else {
                    j11 = 0;
                }
                if (zzu.getLong("extend_session", j11) == 1) {
                    l.A(this.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzt.zzu().zza.zzb(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(zzu.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str6 = (String) arrayList2.get(i12);
                    if (str6 != null) {
                        this.zzt.zzv();
                        Object obj = zzu.get(str6);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            zzu.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.zzt.zzv().zzt(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.zzt.zzt().zzA(new zzau(str4, new zzas(bundle3), str, j10), str3);
                    if (!z14) {
                        Iterator it = this.zze.iterator();
                        while (it.hasNext()) {
                            ((zzhg) it.next()).onEvent(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                    i13++;
                    str5 = str;
                }
                this.zzt.zzay();
                if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
                    return;
                }
                return;
            }
            return;
        }
        this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (!this.zze.add(zzhgVar)) {
            k.q(this.zzt, "OnEventListener already registered");
        }
    }

    public final void zzK(long j10) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j10));
    }

    public final void zzL(long j10, boolean z10) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzph.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzf.zzs(null, zzefVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z10) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void zzN(String str, String str2, long j10, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j10));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k.q(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgz.zza(bundle2, "name", String.class, null);
        zzgz.zza(bundle2, "value", Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) == 0) {
            if (this.zzt.zzv().zzd(string, obj) == 0) {
                Object zzB = this.zzt.zzv().zzB(string, obj);
                if (zzB == null) {
                    this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
                    return;
                }
                zzgz.zzb(bundle2, zzB);
                long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzt.zzf();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzt.zzf();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.zzt.zzaB().zzp(new zzht(this, bundle2));
                    return;
                } else {
                    this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j12));
                    return;
                }
            }
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
    }

    public final void zzR(zzhb zzhbVar, long j10) {
        zzhb zzhbVar2;
        boolean z10;
        zzhb zzhbVar3;
        boolean z11;
        boolean z12;
        zza();
        int zza = zzhbVar.zza();
        if (zza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            zzhbVar2 = this.zzi;
            z10 = false;
            if (zzhb.zzk(zza, zzhbVar2.zza())) {
                z12 = zzhbVar.zzm(this.zzi);
                zzha zzhaVar = zzha.ANALYTICS_STORAGE;
                if (zzhbVar.zzj(zzhaVar) && !this.zzi.zzj(zzhaVar)) {
                    z10 = true;
                }
                zzhb zze = zzhbVar.zze(this.zzi);
                this.zzi = zze;
                zzhbVar3 = zze;
                z11 = z10;
                z10 = true;
            } else {
                zzhbVar3 = zzhbVar;
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar3);
            return;
        }
        long andIncrement = this.zzj.getAndIncrement();
        if (z12) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzif(this, zzhbVar3, j10, andIncrement, z11, zzhbVar2));
            return;
        }
        zzig zzigVar = new zzig(this, zzhbVar3, andIncrement, z11, zzhbVar2);
        if (zza != 30 && zza != -10) {
            this.zzt.zzaB().zzp(zzigVar);
        } else {
            this.zzt.zzaB().zzq(zzigVar);
        }
    }

    public final void zzS(Bundle bundle, int i10, long j10) {
        zza();
        String zzh = zzhb.zzh(bundle);
        if (zzh != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i10), j10);
    }

    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        boolean z10;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            if (zzhfVar2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "EventInterceptor already set.");
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    public final void zzV(zzhb zzhbVar) {
        boolean z10;
        Boolean bool;
        zzg();
        if ((zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && zzhbVar.zzj(zzha.AD_STORAGE)) || this.zzt.zzt().zzM()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.zzt.zzK()) {
            this.zzt.zzG(z10);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            if (zzm.zza().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                zzaa(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z10) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.zzgd r4 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r4 = r4.zzv()
            int r4 = r4.zzl(r2)
        L15:
            r12 = r4
            goto L41
        L17:
            com.google.android.gms.measurement.internal.zzgd r4 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r4 = r4.zzv()
            java.lang.String r5 = "user property"
            boolean r7 = r4.zzad(r5, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.zzhe.zza
            r9 = 0
            boolean r7 = r4.zzaa(r5, r7, r9, r2)
            if (r7 != 0) goto L34
            r4 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.zzgd r7 = r4.zzt
            r7.zzf()
            boolean r4 = r4.zzZ(r5, r3, r2)
            if (r4 != 0) goto L40
            goto L26
        L40:
            r12 = r1
        L41:
            r4 = 1
            if (r12 == 0) goto L69
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzgd r5 = r6.zzt
            r5.zzf()
            java.lang.String r14 = r0.zzD(r2, r3, r4)
            if (r2 == 0) goto L59
            int r1 = r18.length()
        L59:
            r15 = r1
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r9 = r0.zzv()
            com.google.android.gms.measurement.internal.zzlo r10 = r6.zzl
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzO(r10, r11, r12, r13, r14, r15)
            return
        L69:
            if (r17 != 0) goto L6e
            java.lang.String r5 = "app"
            goto L70
        L6e:
            r5 = r17
        L70:
            if (r0 == 0) goto Lc5
            com.google.android.gms.measurement.internal.zzgd r7 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r7 = r7.zzv()
            int r11 = r7.zzd(r2, r0)
            if (r11 == 0) goto Lad
            com.google.android.gms.measurement.internal.zzgd r5 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r5 = r5.zzv()
            com.google.android.gms.measurement.internal.zzgd r7 = r6.zzt
            r7.zzf()
            java.lang.String r13 = r5.zzD(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L95
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L9d
        L95:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
        L9d:
            r14 = r1
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzlo r9 = r6.zzl
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.zzO(r9, r10, r11, r12, r13, r14)
            return
        Lad:
            com.google.android.gms.measurement.internal.zzgd r1 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r1 = r1.zzv()
            java.lang.Object r7 = r1.zzB(r2, r0)
            if (r7 == 0) goto Lc4
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzN(r1, r2, r3, r5)
        Lc4:
            return
        Lc5:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzN(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzX(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzY(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L65
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgd r11 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzfh r11 = r11.zzh
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.zzb(r0)
            r11 = r10
            goto L62
        L53:
            if (r11 != 0) goto L65
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfh r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L62:
            r6 = r11
            r3 = r1
            goto L67
        L65:
            r3 = r10
            r6 = r11
        L67:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L77
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            java.lang.String r10 = "User property not set since app measurement is disabled"
            a3.l.A(r9, r10)
            return
        L77:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L80
            return
        L80:
            com.google.android.gms.measurement.internal.zzlk r10 = new com.google.android.gms.measurement.internal.zzlk
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            com.google.android.gms.measurement.internal.zzjz r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzY(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (!this.zze.remove(zzhgVar)) {
            k.q(this.zzt, "OnEventListener had not been registered");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, f.f7962a, "get conditional user properties", new zzhv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzlp.zzH(list);
    }

    public final List zzt(boolean z10) {
        zza();
        l.A(this.zzt, "Getting user properties (FE)");
        if (!this.zzt.zzaB().zzs()) {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzt.zzaB().zzd(atomicReference, f.f7962a, "get user properties", new zzhr(this, atomicReference, z10));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z10) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, f.f7962a, "get user properties", new zzhx(this, atomicReference, null, str, str2, z10));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        b bVar = new b(list.size());
        for (zzlk zzlkVar : list) {
            Object zza = zzlkVar.zza();
            if (zza != null) {
                bVar.put(zzlkVar.zzb, zza);
            }
        }
        return bVar;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = zzik.this;
                            zzikVar.zzg();
                            if (!zzikVar.zzt.zzm().zzn.zzb()) {
                                long zza = zzikVar.zzt.zzm().zzo.zza();
                                zzikVar.zzt.zzm().zzo.zzb(1 + zza);
                                zzikVar.zzt.zzf();
                                if (zza >= 5) {
                                    k.q(zzikVar.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzikVar.zzt.zzm().zzn.zza(true);
                                    return;
                                } else {
                                    zzikVar.zzt.zzE();
                                    return;
                                }
                            }
                            zzikVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzt.zzg().zzv();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    zzG("auto", "_ou", bundle);
                }
            }
        }
    }
}
