package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;

/* loaded from: classes2.dex */
public abstract class rf implements tf {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31768a;

    public rf(Context context) {
        this.f31768a = context.getApplicationContext();
    }

    @Override // ka.tf
    public final boolean a(String str, String str2, String str3, int i10, int i11, Content content) {
        if (n7.d()) {
            n7.c(c(), "filterContents adType: %d contentid: %s requestType: %d", Integer.valueOf(i10), content.p0(), Integer.valueOf(i11));
        }
        boolean d10 = d(content);
        if (d10) {
            n7.f(c(), "contentid %s is discarded", content.p0());
        }
        return d10;
    }

    public abstract String c();

    public abstract boolean d(Content content);
}
