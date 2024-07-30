package m2;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ppskit.handlers.e0;
import com.huawei.openalliance.ad.ppskit.handlers.f0;
import com.huawei.openalliance.ad.ppskit.handlers.p;
import com.huawei.openalliance.ad.ppskit.handlers.q;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import i4.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ka.d5;
import ka.h6;
import ka.n6;
import ka.n7;

/* compiled from: AnimatableTextProperties.java */
/* loaded from: classes.dex */
public final class g implements b4.b {

    /* renamed from: s, reason: collision with root package name */
    public final Object f32645s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f32646t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f32647u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32648v;

    public /* synthetic */ g(Context context) {
        this.f32648v = context.getApplicationContext();
        this.f32645s = f0.E(context);
        this.f32646t = new p(context);
        this.f32647u = new q(context);
    }

    public void a(ContentRecord contentRecord, List list, TemplateData templateData) {
        if (contentRecord == null) {
            return;
        }
        ((e0) ((h6) this.f32645s)).x(contentRecord);
        if (!TextUtils.isEmpty(contentRecord.Z0()) && !n.M(list)) {
            ContentTemplateRecord contentTemplateRecord = new ContentTemplateRecord(contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), list, templateData);
            if (!TextUtils.isEmpty(contentRecord.R1())) {
                contentTemplateRecord.G(contentRecord.R1());
            }
            p pVar = (p) ((n6) this.f32646t);
            pVar.getClass();
            synchronized (p.f22614d) {
                if (pVar.n(contentTemplateRecord.a(), contentTemplateRecord.A(), contentTemplateRecord.c()) != null) {
                    pVar.l(ContentTemplateRecord.class, contentTemplateRecord.l(pVar.f22513b), 57, new String[]{contentTemplateRecord.a(), contentTemplateRecord.A(), contentTemplateRecord.c()});
                } else {
                    pVar.d(ContentTemplateRecord.class, contentTemplateRecord.l(pVar.f22513b));
                }
            }
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        String[] split;
        int length;
        n7.b("TContentRecordManager", "deleteTptRecordByIds");
        p pVar = (p) ((n6) this.f32646t);
        ContentTemplateRecord n10 = pVar.n(str, str2, str3);
        if (n10 != null) {
            List<Asset> C = n10.C();
            if (!n.M(C)) {
                for (Asset asset : C) {
                    if (asset != null) {
                        String r10 = asset.r();
                        if (!y1.h(r10)) {
                            if (r10.startsWith("content://") && (length = (split = r10.split(File.separator)).length) != 0) {
                                String str5 = split[length - 1];
                                if (!y1.h(str5)) {
                                    r10 = s.f.b("diskcache://", str5);
                                }
                            }
                            x.f((Context) this.f32648v, r10, "tplate");
                        }
                    }
                }
            }
            List<MotionData> H = n10.H();
            if (!n.M(H)) {
                for (MotionData motionData : H) {
                    if (motionData != null) {
                        x.f((Context) this.f32648v, d5.f(motionData.k()), "tplate");
                    }
                }
            }
            pVar.o(str, str2, str3, str4);
            return;
        }
        n7.e("TContentRecordManager", "templateRecord is null");
    }

    public void c(ContentRecord contentRecord) {
        n7.f("TContentRecordManager", "deleteContentByIds %s %s because %s", contentRecord.h(), contentRecord.Z0(), "media not valid");
        b(contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), "media not valid");
        ((h6) this.f32645s).a(contentRecord.h1(), contentRecord.h(), contentRecord.Z0(), contentRecord.p2());
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((q.i) this.f32646t).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // tc.a
    public Object get() {
        Context context = (Context) ((tc.a) this.f32645s).get();
        g4.d dVar = (g4.d) ((tc.a) this.f32646t).get();
        f4.d dVar2 = (f4.d) ((tc.a) this.f32647u).get();
        return new f4.c(context, dVar, dVar2);
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f32645s = obj;
        this.f32646t = obj2;
        this.f32647u = obj3;
        this.f32648v = obj4;
    }

    public /* synthetic */ g(tc.a aVar, tc.a aVar2, e4.c cVar) {
        i4.c cVar2 = c.a.f29167a;
        this.f32645s = aVar;
        this.f32646t = aVar2;
        this.f32647u = cVar;
        this.f32648v = cVar2;
    }

    public /* synthetic */ g(int i10) {
        if (i10 != 1) {
            this.f32645s = new s.d(256, 0);
            this.f32646t = new s.d(256, 0);
            this.f32647u = new s.d(256, 0);
            this.f32648v = new s.g[32];
            return;
        }
        this.f32645s = new s.d(10, 1);
        this.f32646t = new q.i();
        this.f32647u = new ArrayList();
        this.f32648v = new HashSet();
    }
}
