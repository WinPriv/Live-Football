package ka;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class ed implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31135s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f31136t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31137u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ad f31138v;

    public ed(ad adVar, List list, boolean z10, String str) {
        this.f31138v = adVar;
        this.f31135s = list;
        this.f31136t = z10;
        this.f31137u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        List<String> list = this.f31135s;
        if (list != null && list.size() != 0) {
            if (this.f31136t) {
                valueOf = String.valueOf(2);
            } else {
                valueOf = String.valueOf(1);
            }
            for (String str : list) {
                Context context = this.f31138v.f30934a;
                String str2 = this.f31137u;
                n7.c("AnalyticsKitUtils", "ana_tag_kit broadcastEvent sourcePkg = %s", str2);
                Intent intent = new Intent("com.huawei.hms.analytics.pps.event");
                intent.setPackage(context.getPackageName());
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str2);
                bundle.putString("event_type", "$RequestAd");
                bundle.putString("sub_type", valueOf);
                bundle.putString("slot_id", str);
                bundle.putString("activity_name", "");
                intent.putExtra("event_detail", bundle);
                context.sendBroadcast(intent);
                n7.c("AnalyticsKitUtils", "sendBroadcast intent extra: %s", bundle.toString());
                n7.b("AnalyticsKitUtils", "ana_tag sendBroadcast successfully!");
            }
            return;
        }
        int i10 = ad.f30933i;
        n7.i("ad", "slotIds is empty");
    }
}
