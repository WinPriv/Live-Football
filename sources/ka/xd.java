package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Precontent;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xd {

    /* renamed from: a, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.e0 f32188a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32189b;

    /* renamed from: c, reason: collision with root package name */
    public final og f32190c;

    /* renamed from: d, reason: collision with root package name */
    public String f32191d;

    /* loaded from: classes2.dex */
    public static class a implements Serializable, Comparator<Content> {
        @Override // java.util.Comparator
        public final int compare(Content content, Content content2) {
            Content content3 = content;
            Content content4 = content2;
            if (content3.G0() > 0 && content3.G0() <= content4.G0()) {
                return 1;
            }
            return -1;
        }
    }

    public xd(Context context, og ogVar) {
        this.f32189b = context;
        this.f32188a = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f32190c = ogVar;
    }

    public final void a(AdContentRsp adContentRsp, String str) {
        if (adContentRsp == null) {
            this.f32190c.a(800);
            return;
        }
        List<String> u2 = adContentRsp.u();
        if (!androidx.transition.n.M(u2)) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new vd(this, u2, str), 0);
        }
        c(adContentRsp, str);
    }

    public final HashMap b(String str, List list) {
        HashMap hashMap = new HashMap(4);
        if (list == null) {
            return hashMap;
        }
        Context context = this.f32189b;
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Precontent precontent = (Precontent) it.next();
            if (precontent != null) {
                String str2 = this.f32191d;
                ContentRecord b10 = bf.b(precontent.a(), new Content(precontent), 60, null, true);
                if (b10 != null) {
                    b10.t3(str);
                    b10.B(str2);
                    b10.E1(0);
                }
                b10.o(h10);
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new wd(this, b10), 0);
                String a10 = precontent.a();
                if (!hashMap.containsKey(a10)) {
                    hashMap.put(a10, new ArrayList(4));
                }
                List list2 = (List) hashMap.get(a10);
                if (new Content(precontent).n0() != null) {
                    list2.add(AdContentData.f(context, b10));
                }
            }
        }
        return hashMap;
    }

    public abstract void c(AdContentRsp adContentRsp, String str);
}
