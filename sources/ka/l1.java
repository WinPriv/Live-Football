package ka;

import android.util.LruCache;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;

/* loaded from: classes2.dex */
public final class l1 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache<String, AdSlotParam> f31401c = new LruCache<>(5);

    public l1() {
        super("reqPreInterstitialAd");
    }
}
