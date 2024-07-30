package com.google.android.gms.internal.measurement;

import a3.k;
import com.anythink.expressad.exoplayer.k.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i10, int i11, zzmi zzmiVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i10) {
        int i11 = i10 / 3;
        return (zzlf) this.zzd[i11 + i11 + 1];
    }

    private final zzmt zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzmt zzmtVar = (zzmt) this.zzd[i12];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzmt zzB = zzB(i10);
        int zzy = zzy(i10) & 1048575;
        if (!zzP(obj, i10)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i10, int i11) {
        zzmt zzB = zzB(i11);
        if (!zzT(obj, i10, i11)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i11) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder o = k.o("Field ", str, " for ", name, " not found. Known fields are ");
            o.append(arrays);
            throw new RuntimeException(o.toString());
        }
    }

    private static void zzG(Object obj) {
        if (zzS(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        if (!zzP(obj2, i10)) {
            return;
        }
        int zzy = zzy(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzy;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzmt zzB = zzB(i10);
            if (!zzP(obj, i10)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzJ(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzT(obj2, i11, i10)) {
            return;
        }
        int zzy = zzy(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = zzy;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzmt zzB = zzB(i10);
            if (!zzT(obj, i11, i10)) {
                if (!zzS(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                }
                zzK(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzJ(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = 1048575 & zzv;
        if (j10 == 1048575) {
            return;
        }
        zznu.zzq(obj, j10, (1 << (zzv >>> 20)) | zznu.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zznu.zzq(obj, zzv(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzy(i11) & 1048575, obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzoc zzocVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        if (zzP(obj, i10) == zzP(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzP(Object obj, int i10) {
        int zzv = zzv(i10);
        long j10 = zzv & 1048575;
        if (j10 == 1048575) {
            int zzy = zzy(i10);
            long j11 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (Double.doubleToRawLongBits(zznu.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zznu.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zznu.zzw(obj, j11);
                case 8:
                    Object zzf = zznu.zzf(obj, j11);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzka) {
                        if (zzka.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zznu.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzka.zzb.equals(zznu.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zznu.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zznu.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zznu.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zznu.zzc(obj, j10) & (1 << (zzv >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzQ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzP(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzR(Object obj, int i10, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i10 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        if (zznu.zzc(obj, zzv(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zznu.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i10, (String) obj);
        } else {
            zzocVar.zzd(i10, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r31, com.google.android.gms.internal.measurement.zzmf r32, com.google.android.gms.internal.measurement.zzmn r33, com.google.android.gms.internal.measurement.zzlw r34, com.google.android.gms.internal.measurement.zznk r35, com.google.android.gms.internal.measurement.zzko r36, com.google.android.gms.internal.measurement.zzmd r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zznu.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zznu.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    private final int zzo(Object obj) {
        int i10;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int i11;
        int i12;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzh;
        int zzx9;
        int zzx10;
        int i13;
        int zzy2;
        int zzx11;
        Unsafe unsafe = zzb;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i17 < this.zzc.length) {
            int zzy3 = zzy(i17);
            int[] iArr = this.zzc;
            int i19 = iArr[i17];
            int zzx12 = zzx(zzy3);
            if (zzx12 <= 17) {
                int i20 = iArr[i17 + 2];
                int i21 = i20 & i14;
                int i22 = i20 >>> 20;
                if (i21 != i18) {
                    i15 = unsafe.getInt(obj, i21);
                    i18 = i21;
                }
                i10 = 1 << i22;
            } else {
                i10 = 0;
            }
            long j10 = i14 & zzy3;
            switch (zzx12) {
                case 0:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 1:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 2:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzki.zzx(i19 << 3);
                        int i23 = zzy;
                        i11 = zzx3;
                        i12 = i23;
                        i16 = i11 + i12 + i16;
                        break;
                    }
                case 3:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j10));
                        zzx3 = zzki.zzx(i19 << 3);
                        int i232 = zzy;
                        i11 = zzx3;
                        i12 = i232;
                        i16 = i11 + i12 + i16;
                        break;
                    }
                case 4:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i12 = zzki.zzu(unsafe.getInt(obj, j10));
                        i11 = zzki.zzx(i19 << 3);
                        i16 = i11 + i12 + i16;
                        break;
                    }
                case 5:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 6:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 7:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i19 << 3);
                        zzn = zzx4 + 1;
                        i16 += zzn;
                        break;
                    }
                case 8:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzka) {
                            int i24 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzd + zzki.zzx(zzd);
                            zzx6 = zzki.zzx(i19 << 3);
                            zzn = zzx5 + zzx6;
                            i16 += zzn;
                            break;
                        } else {
                            i12 = zzki.zzw((String) object);
                            i11 = zzki.zzx(i19 << 3);
                            i16 = i11 + i12 + i16;
                            break;
                        }
                    }
                case 9:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i19, unsafe.getObject(obj, j10), zzB(i17));
                        i16 += zzn;
                        break;
                    }
                case 10:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j10);
                        int i25 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzd2 + zzki.zzx(zzd2);
                        zzx6 = zzki.zzx(i19 << 3);
                        zzn = zzx5 + zzx6;
                        i16 += zzn;
                        break;
                    }
                case 11:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i12 = zzki.zzx(unsafe.getInt(obj, j10));
                        i11 = zzki.zzx(i19 << 3);
                        i16 = i11 + i12 + i16;
                        break;
                    }
                case 12:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        i12 = zzki.zzu(unsafe.getInt(obj, j10));
                        i11 = zzki.zzx(i19 << 3);
                        i16 = i11 + i12 + i16;
                        break;
                    }
                case 13:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 14:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 15:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        int i26 = unsafe.getInt(obj, j10);
                        zzx7 = zzki.zzx(i19 << 3);
                        zzx8 = zzki.zzx((i26 >> 31) ^ (i26 + i26));
                        zzn = zzx8 + zzx7;
                        i16 += zzn;
                        break;
                    }
                case 16:
                    if ((i10 & i15) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzx5 = zzki.zzx(i19 << 3);
                        zzx6 = zzki.zzy((j11 >> 63) ^ (j11 + j11));
                        zzn = zzx5 + zzx6;
                        i16 += zzn;
                        break;
                    }
                case 17:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        zzn = zzki.zzt(i19, (zzmi) unsafe.getObject(obj, j10), zzB(i17));
                        i16 += zzn;
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i19, (List) unsafe.getObject(obj, j10), zzB(i17));
                    i16 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzn;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i27 = zzmv.zza;
                    zzh = list.size();
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j10));
                    if (zzh <= 0) {
                        break;
                    } else {
                        zzx9 = zzki.zzx(zzh);
                        zzx10 = zzki.zzx(i19 << 3);
                        i13 = zzx10 + zzx9;
                        i16 += i13 + zzh;
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i19, (List) unsafe.getObject(obj, j10), zzB(i17));
                    i16 += zzn;
                    break;
                case 50:
                    zzmd.zza(i19, unsafe.getObject(obj, j10), zzC(i17));
                    break;
                case 51:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzy2 = zzki.zzy(zzz(obj, j10));
                        zzx11 = zzki.zzx(i19 << 3);
                        int i28 = zzy2;
                        i13 = zzx11;
                        zzh = i28;
                        i16 += i13 + zzh;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzy2 = zzki.zzy(zzz(obj, j10));
                        zzx11 = zzki.zzx(i19 << 3);
                        int i282 = zzy2;
                        i13 = zzx11;
                        zzh = i282;
                        i16 += i13 + zzh;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzh = zzki.zzu(zzp(obj, j10));
                        i13 = zzki.zzx(i19 << 3);
                        i16 += i13 + zzh;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i19 << 3);
                        zzn = zzx4 + 1;
                        i16 += zzn;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzka) {
                            int i29 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx5 = zzd3 + zzki.zzx(zzd3);
                            zzx6 = zzki.zzx(i19 << 3);
                            zzn = zzx5 + zzx6;
                            i16 += zzn;
                            break;
                        } else {
                            zzh = zzki.zzw((String) object2);
                            i13 = zzki.zzx(i19 << 3);
                            i16 += i13 + zzh;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzn = zzmv.zzn(i19, unsafe.getObject(obj, j10), zzB(i17));
                        i16 += zzn;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j10);
                        int i30 = zzki.zzb;
                        int zzd4 = zzkaVar2.zzd();
                        zzx5 = zzd4 + zzki.zzx(zzd4);
                        zzx6 = zzki.zzx(i19 << 3);
                        zzn = zzx5 + zzx6;
                        i16 += zzn;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzh = zzki.zzx(zzp(obj, j10));
                        i13 = zzki.zzx(i19 << 3);
                        i16 += i13 + zzh;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzh = zzki.zzu(zzp(obj, j10));
                        i13 = zzki.zzx(i19 << 3);
                        i16 += i13 + zzh;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i19 << 3);
                        zzn = zzx2 + 4;
                        i16 += zzn;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzx = zzki.zzx(i19 << 3);
                        zzn = zzx + 8;
                        i16 += zzn;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        int zzp = zzp(obj, j10);
                        zzx7 = zzki.zzx(i19 << 3);
                        zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        zzn = zzx8 + zzx7;
                        i16 += zzn;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        long zzz = zzz(obj, j10);
                        zzx5 = zzki.zzx(i19 << 3);
                        zzx6 = zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                        zzn = zzx5 + zzx6;
                        i16 += zzn;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i19, i17)) {
                        break;
                    } else {
                        zzn = zzki.zzt(i19, (zzmi) unsafe.getObject(obj, j10), zzB(i17));
                        i16 += zzn;
                        break;
                    }
            }
            i17 += 3;
            i14 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i16 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zznu.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzjo.zzj(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzjo.zzp(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjo.zzb(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i10, zzjnVar);
                    int i22 = zzjnVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i22)) {
                            throw zzll.zzc();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i22, zzlj.zzb));
                        zzj2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object zzE = zzE(obj, i13, i17);
                    int zzo = zzjo.zzo(zzE, zzB(i17), bArr, i10, i11, zzjnVar);
                    zzM(obj, i13, i17, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzjo.zza(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, zzjnVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i10, zzjnVar);
                    int i23 = zzjnVar.zza;
                    zzlf zzA = zzA(i17);
                    if (zzA != null && !zzA.zza(i23)) {
                        zzd(obj).zzj(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzjo.zzj(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i10, zzjnVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object zzE2 = zzE(obj, i13, i17);
                    int zzn = zzjo.zzn(zzE2, zzB(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzjnVar);
                    zzM(obj, i13, i17, zzE2);
                    return zzn;
                }
                break;
        }
        return i10;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzjn zzjnVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int zzl;
        int i21 = i10;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j11);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzliVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int zzj = zzjo.zzj(bArr, i21, zzjnVar);
                    int i22 = zzjnVar.zza + zzj;
                    while (zzj < i22) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i22) {
                        return zzj;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = zzjo.zzj(bArr, i17, zzjnVar);
                            if (i12 == zzjnVar.zza) {
                                zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int zzj2 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i23 = zzjnVar.zza + zzj2;
                    while (zzj2 < i23) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i23) {
                        return zzj2;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = zzjo.zzj(bArr, i18, zzjnVar);
                            if (i12 == zzjnVar.zza) {
                                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i21)));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int zzj3 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i24 = zzjnVar.zza + zzj3;
                    while (zzj3 < i24) {
                        zzj3 = zzjo.zzm(bArr, zzj3, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj3 == i24) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar;
                    int zzm = zzjo.zzm(bArr, i21, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i11) {
                        int zzj4 = zzjo.zzj(bArr, zzm, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr, zzj4, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzjo.zzf(bArr, i21, zzliVar, zzjnVar);
                }
                if (i14 == 0) {
                    return zzjo.zzl(i12, bArr, i10, i11, zzliVar, zzjnVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int zzj5 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i25 = zzjnVar.zza + zzj5;
                    while (zzj5 < i25) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i25) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = zzjo.zzj(bArr, i19, zzjnVar);
                            if (i12 == zzjnVar.zza) {
                                zzlxVar4.zzg(zzjo.zzp(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int zzj6 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i26 = zzjnVar.zza + zzj6;
                    while (zzj6 < i26) {
                        zzlcVar.zzh(zzjo.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i26) {
                        return zzj6;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = zzjo.zzj(bArr, i20, zzjnVar);
                            if (i12 == zzjnVar.zza) {
                                zzlcVar2.zzh(zzjo.zzb(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int zzj7 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i27 = zzjnVar.zza + zzj7;
                    while (zzj7 < i27) {
                        zzj7 = zzjo.zzm(bArr, zzj7, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj7 == i27) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar;
                    int zzm2 = zzjo.zzm(bArr, i21, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i11) {
                        int zzj8 = zzjo.zzj(bArr, zzm2, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr, zzj8, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int zzj9 = zzjo.zzj(bArr, i21, zzjnVar);
                        int i28 = zzjnVar.zza;
                        if (i28 < 0) {
                            throw zzll.zzd();
                        }
                        if (i28 == 0) {
                            zzliVar.add("");
                        } else {
                            zzliVar.add(new String(bArr, zzj9, i28, zzlj.zzb));
                            zzj9 += i28;
                        }
                        while (zzj9 < i11) {
                            int zzj10 = zzjo.zzj(bArr, zzj9, zzjnVar);
                            if (i12 != zzjnVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzjo.zzj(bArr, zzj10, zzjnVar);
                            int i29 = zzjnVar.zza;
                            if (i29 < 0) {
                                throw zzll.zzd();
                            }
                            if (i29 == 0) {
                                zzliVar.add("");
                            } else {
                                zzliVar.add(new String(bArr, zzj9, i29, zzlj.zzb));
                                zzj9 += i29;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i30 = zzjnVar.zza;
                    if (i30 < 0) {
                        throw zzll.zzd();
                    }
                    if (i30 == 0) {
                        zzliVar.add("");
                    } else {
                        int i31 = zzj11 + i30;
                        if (zznz.zze(bArr, zzj11, i31)) {
                            zzliVar.add(new String(bArr, zzj11, i30, zzlj.zzb));
                            zzj11 = i31;
                        } else {
                            throw zzll.zzc();
                        }
                    }
                    while (zzj11 < i11) {
                        int zzj12 = zzjo.zzj(bArr, zzj11, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzjo.zzj(bArr, zzj12, zzjnVar);
                        int i32 = zzjnVar.zza;
                        if (i32 < 0) {
                            throw zzll.zzd();
                        }
                        if (i32 == 0) {
                            zzliVar.add("");
                        } else {
                            int i33 = zzj11 + i32;
                            if (zznz.zze(bArr, zzj11, i33)) {
                                zzliVar.add(new String(bArr, zzj11, i32, zzlj.zzb));
                                zzj11 = i33;
                            } else {
                                throw zzll.zzc();
                            }
                        }
                    }
                    return zzj11;
                }
                break;
            case 27:
                if (i14 == 2) {
                    return zzjo.zze(zzB(i15), i12, bArr, i10, i11, zzliVar, zzjnVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int zzj13 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i34 = zzjnVar.zza;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - zzj13) {
                            throw zzll.zzf();
                        }
                        if (i34 == 0) {
                            zzliVar.add(zzka.zzb);
                        } else {
                            zzliVar.add(zzka.zzl(bArr, zzj13, i34));
                            zzj13 += i34;
                        }
                        while (zzj13 < i11) {
                            int zzj14 = zzjo.zzj(bArr, zzj13, zzjnVar);
                            if (i12 != zzjnVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzjo.zzj(bArr, zzj14, zzjnVar);
                            int i35 = zzjnVar.zza;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - zzj13) {
                                    throw zzll.zzf();
                                }
                                if (i35 == 0) {
                                    zzliVar.add(zzka.zzb);
                                } else {
                                    zzliVar.add(zzka.zzl(bArr, zzj13, i35));
                                    zzj13 += i35;
                                }
                            } else {
                                throw zzll.zzd();
                            }
                        }
                        return zzj13;
                    }
                    throw zzll.zzd();
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    zzl = zzjo.zzf(bArr, i21, zzliVar, zzjnVar);
                } else if (i14 == 0) {
                    zzl = zzjo.zzl(i12, bArr, i10, i11, zzliVar, zzjnVar);
                }
                zzlf zzA = zzA(i15);
                zznk zznkVar = this.zzn;
                int i36 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar instanceof RandomAccess) {
                        int size2 = zzliVar.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size2; i38++) {
                            int intValue = ((Integer) zzliVar.get(i38)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i38 != i37) {
                                    zzliVar.set(i37, Integer.valueOf(intValue));
                                }
                                i37++;
                            } else {
                                obj2 = zzmv.zzA(obj, i13, intValue, obj2, zznkVar);
                            }
                        }
                        if (i37 != size2) {
                            zzliVar.subList(i37, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzA(obj, i13, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int zzj15 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i39 = zzjnVar.zza + zzj15;
                    while (zzj15 < i39) {
                        zzj15 = zzjo.zzj(bArr, zzj15, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj15 == i39) {
                        return zzj15;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int zzj16 = zzjo.zzj(bArr, i21, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj16 < i11) {
                        int zzj17 = zzjo.zzj(bArr, zzj16, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzjo.zzj(bArr, zzj17, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj16;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int zzj18 = zzjo.zzj(bArr, i21, zzjnVar);
                    int i40 = zzjnVar.zza + zzj18;
                    while (zzj18 < i40) {
                        zzj18 = zzjo.zzm(bArr, zzj18, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj18 == i40) {
                        return zzj18;
                    }
                    throw zzll.zzf();
                }
                if (i14 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int zzm3 = zzjo.zzm(bArr, i21, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i11) {
                        int zzj19 = zzjo.zzj(bArr, zzm3, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr, zzj19, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i14 == 3) {
                    zzmt zzB = zzB(i15);
                    int i41 = (i12 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr, i10, i11, i41, zzjnVar);
                    zzliVar.add(zzjnVar.zzc);
                    while (zzc < i11) {
                        int zzj20 = zzjo.zzj(bArr, zzc, zzjnVar);
                        if (i12 != zzjnVar.zza) {
                            return zzc;
                        }
                        zzc = zzjo.zzc(zzB, bArr, zzj20, i11, i41, zzjnVar);
                        zzliVar.add(zzjnVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i21;
    }

    private final int zzt(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzw(i10, 0);
        }
        return -1;
    }

    private final int zzu(int i10, int i11) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzw(i10, i11);
        }
        return -1;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzw(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i10) {
        return (i10 >>> 20) & p.f9095b;
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zznu.zzf(obj, j10)).longValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0037. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzx8;
        int zzx9;
        int zzx10;
        if (this.zzi) {
            Unsafe unsafe = zzb;
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
                int zzy2 = zzy(i11);
                int zzx11 = zzx(zzy2);
                int i12 = this.zzc[i11];
                int i13 = zzy2 & 1048575;
                if (zzx11 >= zzkt.zzJ.zza() && zzx11 <= zzkt.zzW.zza()) {
                    int i14 = this.zzc[i11 + 2];
                }
                long j10 = i13;
                switch (zzx11) {
                    case 0:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzy(zznu.zzd(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i11)) {
                            zzx4 = zzki.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i11)) {
                            Object zzf = zznu.zzf(obj, j10);
                            if (zzf instanceof zzka) {
                                int i15 = i12 << 3;
                                int i16 = zzki.zzb;
                                int zzd = ((zzka) zzf).zzd();
                                zzx5 = zzki.zzx(zzd) + zzd;
                                zzx6 = zzki.zzx(i15);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf);
                                zzx3 = zzki.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i11)) {
                            zzn = zzmv.zzn(i12, zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i11)) {
                            zzka zzkaVar = (zzka) zznu.zzf(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = zzki.zzb;
                            int zzd2 = zzkaVar.zzd();
                            zzx5 = zzki.zzx(zzd2) + zzd2;
                            zzx6 = zzki.zzx(i17);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzx(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i11)) {
                            zzy = zzki.zzu(zznu.zzc(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i11)) {
                            int zzc = zznu.zzc(obj, j10);
                            zzx7 = zzki.zzx(i12 << 3);
                            zzx8 = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                            zzn = zzx8 + zzx7;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i11)) {
                            long zzd3 = zznu.zzd(obj, j10);
                            zzy = zzki.zzx(i12 << 3);
                            zzx3 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i11)) {
                            zzn = zzki.zzt(i12, (zzmi) zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 19:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 20:
                        zzn = zzmv.zzl(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 21:
                        zzn = zzmv.zzw(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 22:
                        zzn = zzmv.zzj(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 23:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 24:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 25:
                        zzn = zzmv.zza(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 26:
                        zzn = zzmv.zzt(i12, (List) zznu.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 27:
                        zzn = zzmv.zzo(i12, (List) zznu.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 28:
                        zzn = zzmv.zzb(i12, (List) zznu.zzf(obj, j10));
                        i10 += zzn;
                        break;
                    case 29:
                        zzn = zzmv.zzu(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 30:
                        zzn = zzmv.zzc(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 31:
                        zzn = zzmv.zze(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 32:
                        zzn = zzmv.zzg(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 33:
                        zzn = zzmv.zzp(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 34:
                        zzn = zzmv.zzr(i12, (List) zznu.zzf(obj, j10), false);
                        i10 += zzn;
                        break;
                    case 35:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i19 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i19);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i20 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i20);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzy = zzmv.zzm((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i21 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i21);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzy = zzmv.zzx((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i22 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i22);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzy = zzmv.zzk((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i23 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i23);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i24 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i24);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i25 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i25);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i26 = zzmv.zza;
                        zzy = list.size();
                        if (zzy > 0) {
                            int i27 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i27);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzy = zzmv.zzv((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i28 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i28);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzy = zzmv.zzd((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i29 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i29);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzy = zzmv.zzf((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i30 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i30);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzy = zzmv.zzh((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i31 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i31);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzy = zzmv.zzq((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i32 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i32);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzy = zzmv.zzs((List) unsafe.getObject(obj, j10));
                        if (zzy > 0) {
                            int i33 = i12 << 3;
                            zzx9 = zzki.zzx(zzy);
                            zzx10 = zzki.zzx(i33);
                            zzx3 = zzx10 + zzx9;
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzn = zzmv.zzi(i12, (List) zznu.zzf(obj, j10), zzB(i11));
                        i10 += zzn;
                        break;
                    case 50:
                        zzmd.zza(i12, zznu.zzf(obj, j10), zzC(i11));
                        break;
                    case 51:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzy(zzz(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzy(zzz(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzu(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i12, i11)) {
                            zzx4 = zzki.zzx(i12 << 3);
                            zzn = zzx4 + 1;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i12, i11)) {
                            Object zzf2 = zznu.zzf(obj, j10);
                            if (zzf2 instanceof zzka) {
                                int i34 = i12 << 3;
                                int i35 = zzki.zzb;
                                int zzd4 = ((zzka) zzf2).zzd();
                                zzx5 = zzki.zzx(zzd4) + zzd4;
                                zzx6 = zzki.zzx(i34);
                                zzn = zzx6 + zzx5;
                                i10 += zzn;
                                break;
                            } else {
                                zzy = zzki.zzw((String) zzf2);
                                zzx3 = zzki.zzx(i12 << 3);
                                i10 += zzx3 + zzy;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzmv.zzn(i12, zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i12, i11)) {
                            zzka zzkaVar2 = (zzka) zznu.zzf(obj, j10);
                            int i36 = i12 << 3;
                            int i37 = zzki.zzb;
                            int zzd5 = zzkaVar2.zzd();
                            zzx5 = zzki.zzx(zzd5) + zzd5;
                            zzx6 = zzki.zzx(i36);
                            zzn = zzx6 + zzx5;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzx(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i12, i11)) {
                            zzy = zzki.zzu(zzp(obj, j10));
                            zzx3 = zzki.zzx(i12 << 3);
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i12, i11)) {
                            zzx2 = zzki.zzx(i12 << 3);
                            zzn = zzx2 + 4;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i12, i11)) {
                            zzx = zzki.zzx(i12 << 3);
                            zzn = zzx + 8;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i12, i11)) {
                            int zzp = zzp(obj, j10);
                            zzx7 = zzki.zzx(i12 << 3);
                            zzx8 = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                            zzn = zzx8 + zzx7;
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i12, i11)) {
                            long zzz = zzz(obj, j10);
                            zzy = zzki.zzx(i12 << 3);
                            zzx3 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                            i10 += zzx3 + zzy;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i12, i11)) {
                            zzn = zzki.zzt(i12, (zzmi) zznu.zzf(obj, j10), zzB(i11));
                            i10 += zzn;
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            return i10 + zznkVar.zza(zznkVar.zzd(obj));
        }
        return zzo(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzy = zzy(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & zzy;
            int i15 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j10));
                    byte[] bArr = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr2 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr3 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 4:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr4 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 6:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j10));
                    i12 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j10)).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j10);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 12:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 13:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr5 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 15:
                    i10 = i12 * 53;
                    zzc = zznu.zzc(obj, j10);
                    i12 = i10 + zzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zznu.zzd(obj, j10);
                    byte[] bArr6 = zzlj.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j10);
                    if (zzf2 != null) {
                        i15 = zzf2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = zznu.zzf(obj, j10).hashCode();
                    i12 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr8 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr9 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr10 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j10));
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j10)).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr11 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzp(obj, j10);
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzz(obj, j10);
                        byte[] bArr12 = zzlj.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = zznu.zzf(obj, j10).hashCode();
                        i12 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0403, code lost:
    
        if (r6 == 1048575) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0405, code lost:
    
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x040b, code lost:
    
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x040f, code lost:
    
        if (r2 >= r8.zzl) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0411, code lost:
    
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0423, code lost:
    
        if (r5 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x042a, code lost:
    
        if (r8.zzA(r4) != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x042f, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0437, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x042c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0438, code lost:
    
        if (r9 != 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x043c, code lost:
    
        if (r0 != r32) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0443, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x044a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0446, code lost:
    
        if (r0 > r32) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0448, code lost:
    
        if (r3 != r9) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x044f, code lost:
    
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x030e, code lost:
    
        if (r0 != r22) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0310, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x032c, code lost:
    
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0360, code lost:
    
        if (r0 != r15) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0388, code lost:
    
        if (r0 != r15) goto L110;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x0093. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (!zzS(obj)) {
            return;
        }
        if (obj instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj;
            zzlbVar.zzbP(Integer.MAX_VALUE);
            zzlbVar.zzb = 0;
            zzlbVar.zzbN();
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = 1048575 & zzy;
            int zzx = zzx(zzy);
            long j10 = i11;
            if (zzx != 9) {
                if (zzx != 60 && zzx != 68) {
                    switch (zzx) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzm.zza(obj, j10);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((zzmc) object).zzc();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzT(obj, this.zzc[i10], i10)) {
                    zzB(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            if (zzP(obj, i10)) {
                zzB(i10).zzf(zzb.getObject(obj, j10));
            }
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzy = zzy(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i10)) {
                        zznu.zzo(obj, j10, zznu.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i10)) {
                        zznu.zzp(obj, j10, zznu.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i10)) {
                        zznu.zzm(obj, j10, zznu.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzP(obj2, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i10)) {
                        zznu.zzq(obj, j10, zznu.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i10)) {
                        zznu.zzr(obj, j10, zznu.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzmv.zza;
                    zznu.zzs(obj, j10, zzmd.zzb(zznu.zzf(obj, j10), zznu.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i11, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i11, i10)) {
                        zznu.zzs(obj, j10, zznu.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (!this.zzh) {
            return;
        }
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e8, code lost:
    
        if (r0 != r24) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ea, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02fd, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0329, code lost:
    
        if (r0 != r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x034c, code lost:
    
        if (r0 != r14) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x0496. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1048575;
        if (this.zzi) {
            if (!this.zzh) {
                int length = this.zzc.length;
                for (int i15 = 0; i15 < length; i15 += 3) {
                    int zzy = zzy(i15);
                    int i16 = this.zzc[i15];
                    switch (zzx(zzy)) {
                        case 0:
                            if (zzP(obj, i15)) {
                                zzocVar.zzf(i16, zznu.zza(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzP(obj, i15)) {
                                zzocVar.zzo(i16, zznu.zzb(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzP(obj, i15)) {
                                zzocVar.zzt(i16, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzP(obj, i15)) {
                                zzocVar.zzJ(i16, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzP(obj, i15)) {
                                zzocVar.zzr(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzP(obj, i15)) {
                                zzocVar.zzm(i16, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzP(obj, i15)) {
                                zzocVar.zzk(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzP(obj, i15)) {
                                zzocVar.zzb(i16, zznu.zzw(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzP(obj, i15)) {
                                zzV(i16, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzP(obj, i15)) {
                                zzocVar.zzv(i16, zznu.zzf(obj, zzy & 1048575), zzB(i15));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzP(obj, i15)) {
                                zzocVar.zzd(i16, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzP(obj, i15)) {
                                zzocVar.zzH(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzP(obj, i15)) {
                                zzocVar.zzi(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzP(obj, i15)) {
                                zzocVar.zzw(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzP(obj, i15)) {
                                zzocVar.zzy(i16, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzP(obj, i15)) {
                                zzocVar.zzA(i16, zznu.zzc(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzP(obj, i15)) {
                                zzocVar.zzC(i16, zznu.zzd(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzP(obj, i15)) {
                                zzocVar.zzq(i16, zznu.zzf(obj, zzy & 1048575), zzB(i15));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzmv.zzF(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 19:
                            zzmv.zzJ(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 20:
                            zzmv.zzM(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 21:
                            zzmv.zzU(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 22:
                            zzmv.zzL(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 23:
                            zzmv.zzI(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 24:
                            zzmv.zzH(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 25:
                            zzmv.zzD(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 26:
                            zzmv.zzS(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 27:
                            zzmv.zzN(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i15));
                            break;
                        case 28:
                            zzmv.zzE(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        case 29:
                            zzmv.zzT(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 30:
                            zzmv.zzG(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 31:
                            zzmv.zzO(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 32:
                            zzmv.zzP(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 33:
                            zzmv.zzQ(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 34:
                            zzmv.zzR(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                            break;
                        case 35:
                            zzmv.zzF(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 36:
                            zzmv.zzJ(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 37:
                            zzmv.zzM(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 38:
                            zzmv.zzU(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 39:
                            zzmv.zzL(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 40:
                            zzmv.zzI(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 41:
                            zzmv.zzH(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 42:
                            zzmv.zzD(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 43:
                            zzmv.zzT(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 44:
                            zzmv.zzG(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 45:
                            zzmv.zzO(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 46:
                            zzmv.zzP(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 47:
                            zzmv.zzQ(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 48:
                            zzmv.zzR(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                            break;
                        case 49:
                            zzmv.zzK(i16, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i15));
                            break;
                        case 50:
                            zzN(zzocVar, i16, zznu.zzf(obj, zzy & 1048575), i15);
                            break;
                        case 51:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzf(i16, zzm(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzo(i16, zzn(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzt(i16, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzJ(i16, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzr(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzm(i16, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzk(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzb(i16, zzU(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(obj, i16, i15)) {
                                zzV(i16, zznu.zzf(obj, zzy & 1048575), zzocVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzv(i16, zznu.zzf(obj, zzy & 1048575), zzB(i15));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzd(i16, (zzka) zznu.zzf(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzH(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzi(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzw(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzy(i16, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzA(i16, zzp(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzC(i16, zzz(obj, zzy & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(obj, i16, i15)) {
                                zzocVar.zzq(i16, zznu.zzf(obj, zzy & 1048575), zzB(i15));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zznk zznkVar = this.zzn;
                zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
                return;
            }
            this.zzo.zza(obj);
            throw null;
        }
        if (!this.zzh) {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1048575;
            while (i17 < length2) {
                int zzy2 = zzy(i17);
                int[] iArr = this.zzc;
                int i20 = iArr[i17];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i21 = iArr[i17 + 2];
                    int i22 = i21 & i14;
                    if (i22 != i19) {
                        i18 = unsafe.getInt(obj, i22);
                        i19 = i22;
                    }
                    i10 = 1 << (i21 >>> 20);
                } else {
                    i10 = i13;
                }
                long j10 = zzy2 & i14;
                switch (zzx) {
                    case 0:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzf(i20, zznu.zza(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzo(i20, zznu.zzb(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzt(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzJ(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzr(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzm(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzk(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzb(i20, zznu.zzw(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzV(i20, unsafe.getObject(obj, j10), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzv(i20, unsafe.getObject(obj, j10), zzB(i17));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzd(i20, (zzka) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzH(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzi(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzw(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzy(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzA(i20, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzC(i20, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzocVar.zzq(i20, unsafe.getObject(obj, j10), zzB(i17));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i11 = 0;
                        zzmv.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 19:
                        i11 = 0;
                        zzmv.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 20:
                        i11 = 0;
                        zzmv.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 21:
                        i11 = 0;
                        zzmv.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 22:
                        i11 = 0;
                        zzmv.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 23:
                        i11 = 0;
                        zzmv.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 24:
                        i11 = 0;
                        zzmv.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 25:
                        i11 = 0;
                        zzmv.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar);
                        i11 = 0;
                        break;
                    case 27:
                        zzmv.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, zzB(i17));
                        i11 = 0;
                        break;
                    case 28:
                        zzmv.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar);
                        i11 = 0;
                        break;
                    case 29:
                        i12 = 0;
                        zzmv.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 30:
                        i12 = 0;
                        zzmv.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 31:
                        i12 = 0;
                        zzmv.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 32:
                        i12 = 0;
                        zzmv.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 33:
                        i12 = 0;
                        zzmv.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 34:
                        i12 = 0;
                        zzmv.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, false);
                        i11 = i12;
                        break;
                    case 35:
                        zzmv.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 36:
                        zzmv.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 37:
                        zzmv.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 38:
                        zzmv.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 39:
                        zzmv.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 40:
                        zzmv.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 41:
                        zzmv.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 42:
                        zzmv.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 43:
                        zzmv.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 44:
                        zzmv.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 45:
                        zzmv.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 46:
                        zzmv.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 47:
                        zzmv.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 48:
                        zzmv.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, true);
                        i11 = 0;
                        break;
                    case 49:
                        zzmv.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzocVar, zzB(i17));
                        i11 = 0;
                        break;
                    case 50:
                        zzN(zzocVar, i20, unsafe.getObject(obj, j10), i17);
                        i11 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzf(i20, zzm(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzo(i20, zzn(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzt(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzJ(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzr(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzm(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzk(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzb(i20, zzU(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i20, i17)) {
                            zzV(i20, unsafe.getObject(obj, j10), zzocVar);
                        }
                        i11 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzv(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        i11 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzd(i20, (zzka) unsafe.getObject(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzH(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzi(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzw(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzy(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzA(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzC(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i20, i17)) {
                            zzocVar.zzq(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        i11 = 0;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                i17 += 3;
                i13 = i11;
                i14 = 1048575;
            }
            zznk zznkVar2 = this.zzn;
            zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int i15 = this.zzj[i13];
            int i16 = this.zzc[i15];
            int zzy = zzy(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx != 60 && zzx != 68) {
                        if (zzx != 49) {
                            if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i16, i15) && !zzR(obj, zzy, zzB(i15))) {
                        return false;
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzB.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i15, i10, i11, i19) && !zzR(obj, zzy, zzB(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
