package ka;

import android.util.LruCache;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n1 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache<String, AdSlotParam> f31473c = new LruCache<>(5);

    /* loaded from: classes2.dex */
    public static class a implements ng {

        /* renamed from: a, reason: collision with root package name */
        public final String f31474a;

        public a(String str) {
            this.f31474a = str;
        }

        @Override // ka.ng
        public final ArrayList a(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.T(str, this.f31474a, adContentRsp, i10);
        }

        @Override // ka.ng
        public final ArrayList b(String str, AdContentRsp adContentRsp, int i10) {
            return androidx.transition.n.y(str, this.f31474a, adContentRsp, i10);
        }
    }

    public n1() {
        super("reqPreNativeAd");
    }
}
