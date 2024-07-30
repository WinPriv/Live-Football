package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class vd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f32007s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f32008t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ xd f32009u;

    public vd(xd xdVar, List list, String str) {
        this.f32009u = xdVar;
        this.f32007s = list;
        this.f32008t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MetaData X1;
        for (String str : this.f32007s) {
            xd xdVar = this.f32009u;
            com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = xdVar.f32188a;
            Class<? extends pa.a> B = e0Var.B();
            String str2 = this.f32008t;
            ArrayList h10 = e0Var.h(B, null, 6, new String[]{str2, str}, null, null);
            if (androidx.transition.n.M(h10)) {
                return;
            }
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                ContentRecord contentRecord = (ContentRecord) it.next();
                if (contentRecord != null && (X1 = contentRecord.X1()) != null) {
                    MediaFile o02 = X1.o0();
                    Context context = xdVar.f32189b;
                    if (o02 != null) {
                        y4.a(context, "normal").o(context, d5.f(o02.p()));
                    }
                    List<MediaFile> q02 = X1.q0();
                    if (!androidx.transition.n.M(q02)) {
                        for (MediaFile mediaFile : q02) {
                            if (mediaFile != null) {
                                y4.a(context, "normal").o(context, d5.f(mediaFile.p()));
                            }
                        }
                    }
                }
            }
            com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var2 = xdVar.f32188a;
            e0Var2.getClass();
            n7.f("e0", "deleteContentById appPkgName: %s id: %s reason: %s", str2, str, "deleteInValidContent");
            e0Var2.j(e0Var2.B(), 6, new String[]{str2, str});
        }
    }
}
