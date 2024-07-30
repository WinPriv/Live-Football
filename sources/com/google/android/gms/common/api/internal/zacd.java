package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey, long j10, long j11, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i10;
        this.zac = apiKey;
        this.zad = j10;
        this.zae = j11;
    }

    public static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey) {
        boolean z10;
        long j10;
        long j11;
        if (!googleApiManager.zaF()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null) {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z10 = config.getMethodTimingTelemetryEnabled();
            zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i10);
                    if (zab == null) {
                        return null;
                    }
                    zak.zaq();
                    z10 = zab.getMethodTimingTelemetryEnabled();
                }
            }
        } else {
            z10 = true;
        }
        if (z10) {
            j10 = System.currentTimeMillis();
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = SystemClock.elapsedRealtime();
        } else {
            j11 = 0;
        }
        return new zacd<>(googleApiManager, i10, apiKey, j10, j11, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i10) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i10) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i10))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabq zak;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int errorCode;
        int i13;
        long j10;
        long j11;
        int i14;
        if (!this.zaa.zaF()) {
            return;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
            BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
            boolean z11 = true;
            int i15 = 0;
            if (this.zad > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int gCoreServiceId = baseGmsClient.getGCoreServiceId();
            if (config != null) {
                z10 &= config.getMethodTimingTelemetryEnabled();
                int batchPeriodMillis = config.getBatchPeriodMillis();
                int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                i10 = config.getVersion();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                    if (zab == null) {
                        return;
                    }
                    if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                        z11 = false;
                    }
                    maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                    z10 = z11;
                }
                i12 = batchPeriodMillis;
                i11 = maxMethodInvocationsInBatch;
            } else {
                i10 = 0;
                i11 = 100;
                i12 = 5000;
            }
            GoogleApiManager googleApiManager = this.zaa;
            if (task.isSuccessful()) {
                i13 = 0;
            } else {
                if (task.isCanceled()) {
                    i15 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        int statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult == null) {
                            errorCode = -1;
                        } else {
                            errorCode = connectionResult.getErrorCode();
                        }
                        i13 = errorCode;
                        i15 = statusCode;
                    } else {
                        i15 = 101;
                    }
                }
                i13 = -1;
            }
            if (z10) {
                long j12 = this.zad;
                long currentTimeMillis = System.currentTimeMillis();
                i14 = (int) (SystemClock.elapsedRealtime() - this.zae);
                j10 = j12;
                j11 = currentTimeMillis;
            } else {
                j10 = 0;
                j11 = 0;
                i14 = -1;
            }
            googleApiManager.zay(new MethodInvocation(this.zab, i15, i13, j10, j11, null, null, gCoreServiceId, i14), i10, i12, i11);
        }
    }
}
