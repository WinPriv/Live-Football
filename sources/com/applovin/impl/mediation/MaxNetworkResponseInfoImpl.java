package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f17501a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f17502b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f17503c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17504d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17505e;
    private final MaxError f;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17506a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f17506a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17506a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j10, MaxError maxError) {
        this.f17501a = adLoadState;
        this.f17502b = maxMediatedNetworkInfo;
        this.f17503c = bundle;
        this.f17504d = z10;
        this.f17505e = j10;
        this.f = maxError;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        if (error != null ? error.equals(error2) : error2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f17501a;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f17503c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxError getError() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f17505e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f17502b;
    }

    public int hashCode() {
        int i10;
        int hashCode;
        int hashCode2;
        int hashCode3;
        if (isBidding()) {
            i10 = 79;
        } else {
            i10 = 97;
        }
        long latencyMillis = getLatencyMillis();
        int i11 = ((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i12 = i11 * 59;
        int i13 = 43;
        if (adLoadState == null) {
            hashCode = 43;
        } else {
            hashCode = adLoadState.hashCode();
        }
        int i14 = i12 + hashCode;
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int i15 = i14 * 59;
        if (mediatedNetwork == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = mediatedNetwork.hashCode();
        }
        int i16 = i15 + hashCode2;
        Bundle credentials = getCredentials();
        int i17 = i16 * 59;
        if (credentials == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = credentials.hashCode();
        }
        int i18 = i17 + hashCode3;
        MaxError error = getError();
        int i19 = i18 * 59;
        if (error != null) {
            i13 = error.hashCode();
        }
        return i19 + i13;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f17504d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r1 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.<init>(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f17501a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r3.f17502b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r3.f17503c
            r1.append(r2)
            java.lang.String r2 = ", isBidding="
            r1.append(r2)
            boolean r2 = r3.f17504d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.AnonymousClass1.f17506a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f17501a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L44
            r2 = 2
            if (r1 == r2) goto L4e
            goto L58
        L44:
            java.lang.String r1 = ", error="
            r0.append(r1)
            com.applovin.mediation.MaxError r1 = r3.f
            r0.append(r1)
        L4e:
            java.lang.String r1 = ", latencyMillis="
            r0.append(r1)
            long r1 = r3.f17505e
            r0.append(r1)
        L58:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
