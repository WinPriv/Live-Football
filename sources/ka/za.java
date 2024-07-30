package ka;

import org.json.JSONException;

/* loaded from: classes2.dex */
public final class za<R> extends ua<R> {

    /* renamed from: b, reason: collision with root package name */
    public final Class<R> f32245b;

    public za(Class<R> cls) {
        this.f32245b = cls;
    }

    @Override // ka.ua
    public final R b(String str) {
        try {
            return (R) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str, this.f32245b, new Class[0]);
        } catch (JSONException e10) {
            n7.g("JsonObjDataConverter", "convertStringToData json JSONException");
            throw e10;
        }
    }
}
