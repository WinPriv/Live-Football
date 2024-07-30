package d6;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes2.dex */
public final class t extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final u f27371a;

    public t(u uVar) {
        this.f27371a = uVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z10;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        u uVar = this.f27371a;
        if (z10) {
            i10 = 10;
        }
        u.a(uVar, i10);
    }
}
