package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ka.af;

/* loaded from: classes2.dex */
public final class rg implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31769s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdContentData f31770t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f31771u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ af.a f31772v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31773w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ tg f31774x;

    public rg(tg tgVar, ContentRecord contentRecord, AdContentData adContentData, long j10, af.a aVar, String str) {
        this.f31774x = tgVar;
        this.f31769s = contentRecord;
        this.f31770t = adContentData;
        this.f31771u = j10;
        this.f31772v = aVar;
        this.f31773w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        tg tgVar = this.f31774x;
        ContentRecord contentRecord = this.f31769s;
        tg.a(tgVar, contentRecord);
        if (tg.c(this.f31774x, this.f31769s, this.f31770t, this.f31771u, this.f31772v)) {
            tgVar.f31904d.a(contentRecord, contentRecord.b1(), contentRecord.c1());
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList(1);
            AtomicInteger atomicInteger = tgVar.f31910k;
            atomicInteger.getAndIncrement();
            int intValue = atomicInteger.intValue();
            int i10 = tgVar.f31909j;
            if (i10 == intValue) {
                z10 = true;
            } else {
                z10 = false;
            }
            AdContentData adContentData = this.f31770t;
            adContentData.w(z10);
            arrayList.add(adContentData);
            String str = this.f31773w;
            if (!TextUtils.isEmpty(str) && !arrayList.isEmpty()) {
                List list = (List) hashMap.get(str);
                int size = arrayList.size();
                atomicInteger.getAndAdd(size);
                if (i10 == atomicInteger.intValue()) {
                    ((AdContentData) arrayList.get(size - 1)).w(true);
                }
                if (list != null) {
                    list.addAll(arrayList);
                } else {
                    hashMap.put(str, arrayList);
                }
            }
            this.f31772v.a(hashMap);
        }
    }
}
