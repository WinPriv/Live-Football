package ka;

import org.json.JSONException;

/* loaded from: classes2.dex */
public final class ra extends oa<Object> {
    @Override // ka.sa
    public final String a() {
        return "application/json";
    }

    @Override // ka.oa
    public final String b(Object obj) {
        try {
            return com.huawei.openalliance.ad.ppskit.utils.y0.c(null, obj);
        } catch (JSONException e10) {
            n7.g("JsonBeanConverter", "convert json JSONException!");
            throw e10;
        }
    }
}
