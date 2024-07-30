package gb;

import android.content.Context;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x implements Callable<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdContentData f28644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f28647d = String.class;

    public x(int i10, Context context, AdContentData adContentData) {
        this.f28644a = adContentData;
        this.f28645b = i10;
        this.f28646c = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdContentData adContentData = this.f28644a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content_id", adContentData.L());
            jSONObject.put("templateId", adContentData.e0());
            jSONObject.put("slotid", adContentData.D());
            jSONObject.put("apiVer", adContentData.f0());
            jSONObject.put(ba.R, this.f28645b);
            jSONObject.put(ba.X, a0.a.m(adContentData));
            return ha.c.c(this.f28646c).b(this.f28647d, "handleUriAction", jSONObject.toString(), false).getData();
        } catch (Throwable unused) {
            ex.I("HUAApi", "handle harmony service enter action fail");
            return null;
        }
    }
}
