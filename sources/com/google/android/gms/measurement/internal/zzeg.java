package com.google.android.gms.measurement.internal;

import com.anythink.core.common.b.g;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.exoplayer.d;
import com.anythink.expressad.exoplayer.f;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.internal.measurement.zzrg;
import com.google.android.gms.internal.measurement.zzrj;
import com.google.android.gms.internal.measurement.zzrm;
import com.google.android.gms.internal.measurement.zzrp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeg {
    public static final zzef zzA;
    public static final zzef zzB;
    public static final zzef zzC;
    public static final zzef zzD;
    public static final zzef zzE;
    public static final zzef zzF;
    public static final zzef zzG;
    public static final zzef zzH;
    public static final zzef zzI;
    public static final zzef zzJ;
    public static final zzef zzK;
    public static final zzef zzL;
    public static final zzef zzM;
    public static final zzef zzN;
    public static final zzef zzO;
    public static final zzef zzP;
    public static final zzef zzQ;
    public static final zzef zzR;
    public static final zzef zzS;
    public static final zzef zzT;
    public static final zzef zzU;
    public static final zzef zzV;
    public static final zzef zzW;
    public static final zzef zzX;
    public static final zzef zzY;
    public static final zzef zzZ;
    public static final zzef zzaA;
    public static final zzef zzaB;
    public static final zzef zzaC;
    public static final zzef zzaD;
    public static final zzef zzaE;
    public static final zzef zzaF;
    public static final zzef zzaG;
    public static final zzef zzaH;
    public static final zzef zzaI;
    public static final zzef zzaa;
    public static final zzef zzab;
    public static final zzef zzac;
    public static final zzef zzad;
    public static final zzef zzae;
    public static final zzef zzaf;
    public static final zzef zzag;
    public static final zzef zzah;
    public static final zzef zzai;
    public static final zzef zzaj;
    public static final zzef zzak;
    public static final zzef zzal;
    public static final zzef zzam;
    public static final zzef zzan;
    public static final zzef zzao;
    public static final zzef zzap;
    public static final zzef zzaq;
    public static final zzef zzar;
    public static final zzef zzas;
    public static final zzef zzat;
    public static final zzef zzau;
    public static final zzef zzav;
    public static final zzef zzaw;
    public static final zzef zzax;
    public static final zzef zzay;
    public static final zzef zzaz;
    public static final zzef zzh;
    public static final zzef zzi;
    public static final zzef zzj;
    public static final zzef zzk;
    public static final zzef zzl;
    public static final zzef zzm;
    public static final zzef zzn;
    public static final zzef zzo;
    public static final zzef zzp;
    public static final zzef zzq;
    public static final zzef zzr;
    public static final zzef zzs;
    public static final zzef zzt;
    public static final zzef zzu;
    public static final zzef zzv;
    public static final zzef zzw;
    public static final zzef zzx;
    public static final zzef zzy;
    public static final zzef zzz;
    private static final List zzaJ = Collections.synchronizedList(new ArrayList());
    private static final Set zzaK = Collections.synchronizedSet(new HashSet());
    public static final zzef zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return Long.valueOf(zzoj.zzb());
        }
    });
    public static final zzef zzb = zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzaz
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return Long.valueOf(zzoj.zzc());
        }
    });
    public static final zzef zzc = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return Long.valueOf(zzoj.zzn());
        }
    });
    public static final zzef zzd = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbx
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return Long.valueOf(zzoj.zze());
        }
    });
    public static final zzef zze = zza("measurement.config.url_scheme", "https", "https", new zzec() { // from class: com.google.android.gms.measurement.internal.zzcj
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return zzoj.zzM();
        }
    });
    public static final zzef zzf = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzec() { // from class: com.google.android.gms.measurement.internal.zzcv
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return zzoj.zzL();
        }
    });
    public static final zzef zzg = zza("measurement.upload.max_bundles", 100, 100, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdh
        @Override // com.google.android.gms.measurement.internal.zzec
        public final Object zza() {
            zzef zzefVar = zzeg.zza;
            return Integer.valueOf((int) zzoj.zzy());
        }
    });

    static {
        Integer valueOf = Integer.valueOf(b.aX);
        zzh = zza("measurement.upload.max_batch_size", valueOf, valueOf, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzG());
            }
        });
        zzi = zza("measurement.upload.max_bundle_size", valueOf, valueOf, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzx());
            }
        });
        zzj = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzB());
            }
        });
        Integer valueOf2 = Integer.valueOf(g.j.f5109p);
        zzk = zza("measurement.upload.max_events_per_day", valueOf2, valueOf2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzC());
            }
        });
        zzl = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzA());
            }
        });
        Integer valueOf3 = Integer.valueOf(d.f7614b);
        zzm = zza("measurement.upload.max_public_events_per_day", valueOf3, valueOf3, new zzec() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzD());
            }
        });
        zzn = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzz());
            }
        });
        zzo = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzF());
            }
        });
        zzp = zza("measurement.store.max_stored_events_per_app", valueOf2, valueOf2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzh());
            }
        });
        zzq = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzec() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return zzoj.zzN();
            }
        });
        zzr = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzu());
            }
        });
        zzs = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzax
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzJ());
            }
        });
        zzt = zza("measurement.upload.interval", 3600000L, 3600000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzw());
            }
        });
        zzu = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzo());
            }
        });
        zzv = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbb
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzf());
            }
        });
        zzw = zza("measurement.upload.minimum_delay", 500L, 500L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzm());
            }
        });
        zzx = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzl());
            }
        });
        zzy = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzr());
            }
        });
        zzz = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzp());
            }
        });
        zzA = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzv());
            }
        });
        zzB = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzI());
            }
        });
        zzC = zza("measurement.upload.retry_count", 6, 6, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzH());
            }
        });
        zzD = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzE());
            }
        });
        zzE = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzg());
            }
        });
        zzF = zza("measurement.audience.filter_result_max_count", 200, 200, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzj());
            }
        });
        zzG = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzH = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzI = zza("measurement.upload.max_public_event_params", 25, 25, null);
        Long valueOf4 = Long.valueOf(f.f7962a);
        zzJ = zza("measurement.service_client.idle_disconnect_millis", valueOf4, valueOf4, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzq());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzK = zza("measurement.test.boolean_flag", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqc.zzg());
            }
        });
        zzL = zza("measurement.test.string_flag", "---", "---", new zzec() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return zzqc.zzf();
            }
        });
        zzM = zza("measurement.test.long_flag", -1L, -1L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzqc.zzd());
            }
        });
        zzN = zza("measurement.test.int_flag", -2, -2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzqc.zzc());
            }
        });
        Double valueOf5 = Double.valueOf(-3.0d);
        zzO = zza("measurement.test.double_flag", valueOf5, valueOf5, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Double.valueOf(zzqc.zzb());
            }
        });
        zzP = zza("measurement.experiment.max_ids", 50, 50, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzi());
            }
        });
        zzQ = zza("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzk());
            }
        });
        zzR = zza("measurement.max_bundles_per_iteration", 100, 100, new zzec() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzoj.zzd());
            }
        });
        zzS = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzec() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzs());
            }
        });
        Long valueOf6 = Long.valueOf(g.e.f5059a);
        zzT = zza("measurement.redaction.app_instance_id.ttl", valueOf6, valueOf6, new zzec() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Long.valueOf(zzoj.zzt());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzU = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqf.zzc());
            }
        });
        zzV = zza("measurement.quality.checksum", bool, bool, null);
        zzW = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzoy.zze());
            }
        });
        zzX = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzoy.zzd());
            }
        });
        zzY = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzoy.zzf());
            }
        });
        zzZ = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrm.zzc());
            }
        });
        zzaa = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpt.zzc());
            }
        });
        zzab = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpw.zzc());
            }
        });
        zzac = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrj.zzd());
            }
        });
        zzad = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrp.zzc());
            }
        });
        zzae = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzos.zzd());
            }
        });
        zzaf = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzph.zzd());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrg.zzc());
            }
        });
        zzah = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Integer.valueOf((int) zzom.zzb());
            }
        });
        zzai = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzod.zzc());
            }
        });
        zzaj = zza("measurement.service.click_identifier_control", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzog.zzc());
            }
        });
        zzak = zza("measurement.service.store_null_safelist", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzop.zzd());
            }
        });
        zzal = zza("measurement.service.store_safelist", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzop.zze());
            }
        });
        zzam = zza("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqu.zze());
            }
        });
        zzan = zza("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqu.zzd());
            }
        });
        zzao = zza("measurement.session_stitching_token_enabled", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqu.zzf());
            }
        });
        zzap = zza("measurement.sgtm.client.dev", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrd.zzd());
            }
        });
        zzaq = zza("measurement.sgtm.service", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzrd.zze());
            }
        });
        zzar = zza("measurement.redaction.retain_major_os_version", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzql.zzc());
            }
        });
        zzas = zza("measurement.redaction.scion_payload_generator", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzql.zzd());
            }
        });
        zzat = zza("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpk.zzd());
            }
        });
        zzau = zza("measurement.sessionid.enable_client_session_id", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqr.zzd());
            }
        });
        zzav = zza("measurement.sfmc.client", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzra.zzd());
            }
        });
        zzaw = zza("measurement.sfmc.service", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzra.zze());
            }
        });
        zzax = zza("measurement.gmscore_feature_tracking", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpn.zzd());
            }
        });
        zzay = zza("measurement.fix_health_monitor_stack_trace", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpe.zzd());
            }
        });
        zzaz = zza("measurement.item_scoped_custom_parameters.client", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpq.zzd());
            }
        });
        zzaA = zza("measurement.item_scoped_custom_parameters.service", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzpq.zze());
            }
        });
        zzaB = zza("measurement.remove_app_background.client", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqo.zzd());
            }
        });
        zzaC = zza("measurement.rb.attribution.service", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqi.zzc());
            }
        });
        zzaD = zza("measurement.collection.client.log_target_api_version", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzd());
            }
        });
        zzaE = zza("measurement.collection.service.log_target_api_version", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                return Boolean.valueOf(zzpz.zze());
            }
        });
        zzaF = zza("measurement.client.deep_link_referrer_fix", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                return Boolean.valueOf(zzpb.zzd());
            }
        });
        zzaG = zza("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                return Boolean.valueOf(zzqx.zzc());
            }
        });
        zzaH = zza("measurement.link_sst_to_sid", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                zzef zzefVar = zzeg.zza;
                return Boolean.valueOf(zzqu.zzg());
            }
        });
        zzaI = zza("measurement.client.ad_id_consent_fix", bool2, bool2, new zzec() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // com.google.android.gms.measurement.internal.zzec
            public final Object zza() {
                return Boolean.valueOf(zzov.zzd());
            }
        });
    }

    public static zzef zza(String str, Object obj, Object obj2, zzec zzecVar) {
        zzef zzefVar = new zzef(str, obj, obj2, zzecVar, null);
        zzaJ.add(zzefVar);
        return zzefVar;
    }
}
