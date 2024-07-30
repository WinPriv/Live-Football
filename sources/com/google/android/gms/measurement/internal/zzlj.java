package com.google.android.gms.measurement.internal;

import a3.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.huawei.openalliance.ad.constant.w;
import com.ironsource.adapters.facebook.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlj extends zzku {
    public zzlj(zzlh zzlhVar) {
        super(zzlhVar);
    }

    public static final void zzA(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str, Object obj) {
        List zzp = zzfsVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 < zzp.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i10)).zzg())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            zzfsVar.zzj(i10, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    public static final boolean zzB(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotNull(zzqVar);
        if (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) {
            return false;
        }
        return true;
    }

    public static final com.google.android.gms.internal.measurement.zzfx zzC(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    public static final Object zzD(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        com.google.android.gms.internal.measurement.zzfx zzC = zzC(zzftVar, str);
        if (zzC != null) {
            if (zzC.zzy()) {
                return zzC.zzh();
            }
            if (zzC.zzw()) {
                return Long.valueOf(zzC.zzd());
            }
            if (zzC.zzu()) {
                return Double.valueOf(zzC.zza());
            }
            if (zzC.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfx> zzi = zzC.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi) {
                    if (zzfxVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar2 : zzfxVar.zzi()) {
                            if (zzfxVar2.zzy()) {
                                bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                            } else if (zzfxVar2.zzw()) {
                                bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                            } else if (zzfxVar2.zzu()) {
                                bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzE(StringBuilder sb2, int i10, List list) {
        String str;
        String str2;
        Long l10;
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it.next();
            if (zzfxVar != null) {
                zzG(sb2, i11);
                sb2.append("param {\n");
                Double d10 = null;
                if (zzfxVar.zzx()) {
                    str = this.zzt.zzj().zze(zzfxVar.zzg());
                } else {
                    str = null;
                }
                zzJ(sb2, i11, "name", str);
                if (zzfxVar.zzy()) {
                    str2 = zzfxVar.zzh();
                } else {
                    str2 = null;
                }
                zzJ(sb2, i11, "string_value", str2);
                if (zzfxVar.zzw()) {
                    l10 = Long.valueOf(zzfxVar.zzd());
                } else {
                    l10 = null;
                }
                zzJ(sb2, i11, "int_value", l10);
                if (zzfxVar.zzu()) {
                    d10 = Double.valueOf(zzfxVar.zza());
                }
                zzJ(sb2, i11, "double_value", d10);
                if (zzfxVar.zzc() > 0) {
                    zzE(sb2, i11, zzfxVar.zzi());
                }
                zzG(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zzF(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        zzG(sb2, i10);
        sb2.append("filter {\n");
        if (zzemVar.zzh()) {
            zzJ(sb2, i10, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            zzJ(sb2, i10, "param_name", this.zzt.zzj().zze(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                zzG(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzJ(sb2, i11, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzJ(sb2, i11, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzJ(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzG(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzG(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzG(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            zzK(sb2, i10 + 1, "number_filter", zzemVar.zzc());
        }
        zzG(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzG(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String zzH(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzI(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar) {
        Integer num;
        Integer num2;
        Long l10;
        if (zzgiVar == null) {
            return;
        }
        zzG(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            zzG(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l11 : zzgiVar.zzi()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            zzG(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l12 : zzgiVar.zzk()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            zzG(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                if (zzfrVar.zzh()) {
                    num2 = Integer.valueOf(zzfrVar.zza());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(w.bE);
                if (zzfrVar.zzg()) {
                    l10 = Long.valueOf(zzfrVar.zzb());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            zzG(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzj()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                if (zzgkVar.zzi()) {
                    num = Integer.valueOf(zzgkVar.zzb());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzG(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzJ(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzG(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzK(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        String str2;
        if (zzerVar == null) {
            return;
        }
        zzG(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            if (zzm != 1) {
                if (zzm != 2) {
                    if (zzm != 3) {
                        if (zzm != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            zzJ(sb2, i10, "comparison_type", str2);
        }
        if (zzerVar.zzi()) {
            zzJ(sb2, i10, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            zzJ(sb2, i10, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            zzJ(sb2, i10, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            zzJ(sb2, i10, "max_comparison_value", zzerVar.zzd());
        }
        zzG(sb2, i10);
        sb2.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i10 = 0; i10 < zzgcVar.zzb(); i10++) {
            if (str.equals(zzgcVar.zzap(i10).zzf())) {
                return i10;
            }
        }
        return -1;
    }

    public static zzmh zzm(zzmh zzmhVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzll {
        com.google.android.gms.internal.measurement.zzkn zza = com.google.android.gms.internal.measurement.zzkn.zza();
        if (zza != null) {
            return zzmhVar.zzaz(bArr, zza);
        }
        return zzmhVar.zzay(bArr);
    }

    public static List zzs(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzw(List list, int i10) {
        if (i10 < list.size() * 64) {
            if (((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean zzy(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final long zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzf(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long zzf(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzt.zzv().zzg();
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            l.x(this.zzt, "Failed to get MD5");
            return 0L;
        }
        return zzlp.zzp(zzF.digest(bArr));
    }

    public final Bundle zzh(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z10) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(zzh((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public final Parcelable zzi(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzt.zzaA().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzau zzj(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        String str;
        Object obj;
        Bundle zzh = zzh(zzaaVar.zze(), true);
        if (zzh.containsKey("_o") && (obj = zzh.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String zzb = zzhc.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzau(zzb, new zzas(zzh), str2, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzft zzl(zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
        zze.zzl(zzapVar.zze);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
            zze2.zzj(next);
            Object zzf = zzapVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzu(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzft) zze.zzaD();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        Long l10;
        Long l11;
        Double d10;
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder j10 = a.j("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                zzG(j10, 1);
                j10.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    zzJ(j10, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                if (this.zzt.zzf().zzs(zzgdVar.zzy(), zzeg.zzao) && zzgdVar.zzbo()) {
                    zzJ(j10, 1, "session_stitching_token", zzgdVar.zzL());
                }
                zzJ(j10, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    zzJ(j10, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    zzJ(j10, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    zzJ(j10, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    zzJ(j10, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                zzJ(j10, 1, "gmp_app_id", zzgdVar.zzG());
                zzJ(j10, 1, "admob_app_id", zzgdVar.zzx());
                zzJ(j10, 1, "app_id", zzgdVar.zzy());
                zzJ(j10, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    zzJ(j10, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                zzJ(j10, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    zzJ(j10, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                zzJ(j10, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    zzJ(j10, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    zzJ(j10, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    zzJ(j10, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    zzJ(j10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    zzJ(j10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                zzJ(j10, 1, "app_instance_id", zzgdVar.zzz());
                zzJ(j10, 1, "resettable_device_id", zzgdVar.zzK());
                zzJ(j10, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    zzJ(j10, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                zzJ(j10, 1, com.anythink.expressad.foundation.g.a.f9771bd, zzgdVar.zzI());
                zzJ(j10, 1, "device_model", zzgdVar.zzD());
                zzJ(j10, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    zzJ(j10, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    zzJ(j10, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    zzJ(j10, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                zzJ(j10, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    zzJ(j10, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    zzJ(j10, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpz.zzc();
                if (this.zzt.zzf().zzs(null, zzeg.zzaE) && zzgdVar.zzbq()) {
                    zzJ(j10, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<com.google.android.gms.internal.measurement.zzgm> zzP = zzgdVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzP) {
                        if (zzgmVar != null) {
                            zzG(j10, 2);
                            j10.append("user_property {\n");
                            if (zzgmVar.zzs()) {
                                l10 = Long.valueOf(zzgmVar.zzc());
                            } else {
                                l10 = null;
                            }
                            zzJ(j10, 2, "set_timestamp_millis", l10);
                            zzJ(j10, 2, "name", this.zzt.zzj().zzf(zzgmVar.zzf()));
                            zzJ(j10, 2, "string_value", zzgmVar.zzg());
                            if (zzgmVar.zzr()) {
                                l11 = Long.valueOf(zzgmVar.zzb());
                            } else {
                                l11 = null;
                            }
                            zzJ(j10, 2, "int_value", l11);
                            if (zzgmVar.zzq()) {
                                d10 = Double.valueOf(zzgmVar.zza());
                            } else {
                                d10 = null;
                            }
                            zzJ(j10, 2, "double_value", d10);
                            zzG(j10, 2);
                            j10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : zzN) {
                        if (zzfpVar != null) {
                            zzG(j10, 2);
                            j10.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                zzJ(j10, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                zzJ(j10, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            zzI(j10, 2, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                zzI(j10, 2, "previous_data", zzfpVar.zze());
                            }
                            zzG(j10, 2);
                            j10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzft> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzft zzftVar : zzO) {
                        if (zzftVar != null) {
                            zzG(j10, 2);
                            j10.append("event {\n");
                            zzJ(j10, 2, "name", this.zzt.zzj().zzd(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                zzJ(j10, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                zzJ(j10, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                zzJ(j10, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                zzE(j10, 2, zzftVar.zzi());
                            }
                            zzG(j10, 2);
                            j10.append("}\n");
                        }
                    }
                }
                zzG(j10, 1);
                j10.append("}\n");
            }
        }
        j10.append("}\n");
        return j10.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzek zzekVar) {
        if (zzekVar == null) {
            return "null";
        }
        StringBuilder j10 = a.j("\nevent_filter {\n");
        if (zzekVar.zzp()) {
            zzJ(j10, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
        }
        zzJ(j10, 0, "event_name", this.zzt.zzj().zzd(zzekVar.zzg()));
        String zzH = zzH(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!zzH.isEmpty()) {
            zzJ(j10, 0, "filter_type", zzH);
        }
        if (zzekVar.zzo()) {
            zzK(j10, 1, "event_count_filter", zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            j10.append("  filters {\n");
            Iterator it = zzekVar.zzh().iterator();
            while (it.hasNext()) {
                zzF(j10, 2, (com.google.android.gms.internal.measurement.zzem) it.next());
            }
        }
        zzG(j10, 1);
        j10.append("}\n}\n");
        return j10.toString();
    }

    public final String zzq(com.google.android.gms.internal.measurement.zzet zzetVar) {
        if (zzetVar == null) {
            return "null";
        }
        StringBuilder j10 = a.j("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            zzJ(j10, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        zzJ(j10, 0, "property_name", this.zzt.zzj().zzf(zzetVar.zze()));
        String zzH = zzH(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!zzH.isEmpty()) {
            zzJ(j10, 0, "filter_type", zzH);
        }
        zzF(j10, 1, zzetVar.zzb());
        j10.append("}\n");
        return j10.toString();
    }

    public final List zzr(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzt.zzaA().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzt.zzaA().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(zzt((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map zzt(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzt(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzt(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzfw zzfwVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
                    }
                }
            }
            zzfwVar.zzb(arrayList);
            return;
        }
        this.zzt.zzaA().zzd().zzb("Ignoring invalid (type) event param value", obj);
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzgl zzglVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzt.zzaA().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzx(long j10, long j11) {
        if (j10 != 0 && j11 > 0 && Math.abs(this.zzt.zzax().currentTimeMillis() - j10) <= j11) {
            return false;
        }
        return true;
    }

    public final byte[] zzz(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzt.zzaA().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}
