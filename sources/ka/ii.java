package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public abstract class ii {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31307a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentRecord f31308b;

    /* renamed from: c, reason: collision with root package name */
    public String f31309c = null;

    /* renamed from: d, reason: collision with root package name */
    public ii f31310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31311e;

    public ii() {
    }

    public abstract boolean a();

    public final void b() {
        this.f31309c = com.huawei.openalliance.ad.constant.v.I;
    }

    public final boolean c() {
        ii iiVar = this.f31310d;
        if (iiVar != null) {
            return iiVar.a();
        }
        return false;
    }

    public final String d() {
        ii iiVar;
        String str = this.f31309c;
        if (str == null && (iiVar = this.f31310d) != null) {
            return iiVar.d();
        }
        return str;
    }

    public ii(Context context, ContentRecord contentRecord) {
        this.f31307a = context;
        this.f31308b = contentRecord;
    }
}
