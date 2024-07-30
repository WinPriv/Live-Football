package p7;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f34480b;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f34481a;

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f34481a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // p7.a
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r8, android.os.Bundle r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzja r0 = q7.a.f34707b
            java.lang.String r1 = "fcm"
            boolean r0 = r0.contains(r1)
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != 0) goto Ld
            return
        Ld:
            com.google.android.gms.internal.measurement.zzja r0 = q7.a.f34706a
            boolean r0 = r0.contains(r8)
            r3 = 0
            if (r0 == 0) goto L17
            goto L2e
        L17:
            com.google.android.gms.internal.measurement.zzja r0 = q7.a.f34708c
            int r4 = r0.size()
            r5 = r3
        L1e:
            if (r5 >= r4) goto L30
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r9.containsKey(r6)
            int r5 = r5 + 1
            if (r6 == 0) goto L1e
        L2e:
            r0 = r3
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 != 0) goto L34
            return
        L34:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L3d
            goto L67
        L3d:
            com.google.android.gms.internal.measurement.zzja r0 = q7.a.f34707b
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto L47
            goto L5e
        L47:
            com.google.android.gms.internal.measurement.zzja r0 = q7.a.f34708c
            int r4 = r0.size()
            r5 = r3
        L4e:
            if (r5 >= r4) goto L60
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r9.containsKey(r6)
            int r5 = r5 + 1
            if (r6 == 0) goto L4e
        L5e:
            r2 = r3
            goto L67
        L60:
            java.lang.String r0 = "fcm_integration"
            java.lang.String r3 = "_cis"
            r9.putString(r3, r0)
        L67:
            if (r2 == 0) goto L6e
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r7.f34481a
            r0.logEvent(r1, r8, r9)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.b.a(java.lang.String, android.os.Bundle):void");
    }

    @Override // p7.a
    @KeepForSdk
    public final void b(String str) {
        if (!(!q7.a.f34707b.contains(AppMeasurement.FCM_ORIGIN))) {
            return;
        }
        this.f34481a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
    }
}
