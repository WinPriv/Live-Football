package ka;

import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class wa extends ua {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32131b;

    public /* synthetic */ wa(int i10) {
        this.f32131b = i10;
    }

    @Override // ka.ua
    public final Object b(String str) {
        String str2;
        switch (this.f32131b) {
            case 0:
                try {
                    return Float.valueOf(Float.parseFloat(str));
                } catch (NumberFormatException unused) {
                    str2 = "convertStringToData NumberFormatException";
                    n7.g("FloatDataConverter", str2);
                    return Float.valueOf(gl.Code);
                } catch (Exception unused2) {
                    str2 = "convertStringToData Exception";
                    n7.g("FloatDataConverter", str2);
                    return Float.valueOf(gl.Code);
                }
            default:
                return str;
        }
    }
}
