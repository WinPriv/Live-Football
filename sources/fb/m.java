package fb;

import android.content.Context;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28346a;

    /* renamed from: b, reason: collision with root package name */
    public final AdContentData f28347b;

    /* renamed from: c, reason: collision with root package name */
    public String f28348c = null;

    /* renamed from: d, reason: collision with root package name */
    public m f28349d;

    public m() {
    }

    public abstract boolean a();

    public final void b() {
        this.f28348c = v.I;
    }

    public final String c() {
        m mVar;
        String str = this.f28348c;
        if (str == null && (mVar = this.f28349d) != null) {
            return mVar.c();
        }
        return str;
    }

    public final boolean d() {
        m mVar = this.f28349d;
        if (mVar != null) {
            return mVar.a();
        }
        return false;
    }

    public m(Context context, AdContentData adContentData) {
        this.f28346a = context;
        this.f28347b = adContentData;
    }
}
