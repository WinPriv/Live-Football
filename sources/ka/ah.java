package ka;

import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.ppskit.beans.vast.LinearCreative;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public final class ah extends ug {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f30970a = new HashSet(Arrays.asList("creativeView", "start", cp.V, "midpoint", cp.Z, "complete", "mute", "unmute", com.anythink.expressad.foundation.d.c.f9459cb, "resume", "closeLinear", cp.F, "progress"));

    @Override // ka.ug
    public final HashSet a() {
        return this.f30970a;
    }

    @Override // ka.ug
    public final void b(LinearCreative linearCreative, XmlPullParser xmlPullParser, HashMap hashMap) {
    }
}
