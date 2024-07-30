package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import android.text.TextUtils;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Location;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Network;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Options;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SearchInfo;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import ma.a;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class AdContentReq extends ReqBean {

    @a
    @d(a = "gACString")
    private String acString;
    private App app;

    @d(a = "appsdkversion")
    private String appSdkVer;
    private List<String> audIds;
    private List<String> cacheSloganId;
    private List<String> cachecontentid;
    private List<String> cachedTemplates;
    private String clientAdRequestId;

    @a
    private String consent;
    private List<Long> cridDispTime;
    private Device device;

    @a
    private String hwACString;
    private Integer hwDspNpa;

    @a
    @d(a = "geo")
    private Location loc;
    private List<AdSlot30> multislot;
    private Network network;
    private Integer nonPersonalizedAd;

    @d(a = "regs")
    private Options opts;
    private int parentCtrlUser;
    private int pdToOther;

    @a
    private String ppsStore;

    @d(a = "pltm")
    private Integer preloadTriggerMode;
    private List<String> removedContentId;
    private Integer requestType;
    private int scrnReadStat;
    private SearchInfo search;
    private Map<String, String> tag;
    private String templateEnginVer;
    private List<String> templateIds;
    private Integer thirdDspNpa;
    private String version = "3.4";
    private String sdkversion = "3.4.65.300";
    private int reqPurpose = 1;

    @d(a = "rtenv")
    private Integer appRunningStatus = 1;

    public AdContentReq() {
    }

    public final App A() {
        return this.app;
    }

    public final void B(String str) {
        this.hwACString = str;
    }

    public final void C(List<String> list) {
        this.audIds = list;
    }

    public final Device D() {
        return this.device;
    }

    public final List<AdSlot30> E() {
        return this.multislot;
    }

    public final int F() {
        return this.reqPurpose;
    }

    public final String G() {
        return this.clientAdRequestId;
    }

    public final Integer H() {
        return this.nonPersonalizedAd;
    }

    public final Location I() {
        return this.loc;
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "result.ad";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_acd_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/result.ad";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }

    public final Map<String, String> e() {
        return this.tag;
    }

    public final void f(App app) {
        this.app = app;
    }

    public final void g(Device device) {
        this.device = device;
    }

    public final void h(Location location) {
        this.loc = location;
    }

    public final void i(Options options) {
        this.opts = options;
    }

    public final void j(SearchInfo searchInfo) {
        this.search = searchInfo;
    }

    public final void l(Integer num) {
        this.nonPersonalizedAd = num;
    }

    public final void m(Map<String, String> map) {
        this.tag = map;
    }

    public final void n(Integer num) {
        this.hwDspNpa = num;
    }

    public final void o(int i10) {
        this.reqPurpose = i10;
    }

    public final void p(Integer num) {
        this.thirdDspNpa = num;
    }

    public final void q(String str) {
        this.ppsStore = str;
    }

    public final int r() {
        return this.parentCtrlUser;
    }

    public final void s(int i10) {
        this.pdToOther = i10;
    }

    public final void t(String str) {
        this.clientAdRequestId = str;
    }

    public final void u(Integer num) {
        this.preloadTriggerMode = num;
    }

    public final void v(String str) {
        this.appSdkVer = str;
    }

    public final void w(Integer num) {
        this.requestType = num;
    }

    public final void x(String str) {
        this.consent = y1.n(str);
    }

    public final void y(ArrayList arrayList) {
        this.cridDispTime = arrayList;
    }

    public final void z(String str) {
        this.acString = str;
    }

    public AdContentReq(final Context context, ArrayList arrayList, List list, ArrayList arrayList2, int i10, int i11, int i12, boolean z10, final String str) {
        App app;
        Network network;
        Device device;
        ArrayList arrayList3;
        this.multislot = arrayList;
        p2.a(new Runnable() { // from class: com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq.1
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
            
                r2 = r6.importance;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
            
                if (r2 == 100) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            
                if (r2 == 200) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
            
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
            
                r1 = r1.inKeyguardRestrictedInputMode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
            
                if (r2 != false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
            
                if (r1 == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
            
                r2 = false;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq r0 = r2
                    android.content.Context r1 = r1
                    java.lang.String r2 = r3
                    r3 = 1
                    r4 = 0
                    if (r1 != 0) goto Lb
                    goto L5c
                Lb:
                    java.lang.String r5 = "activity"
                    java.lang.Object r5 = r1.getSystemService(r5)     // Catch: java.lang.Throwable -> L54
                    android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Throwable -> L54
                    java.lang.String r6 = "keyguard"
                    java.lang.Object r1 = r1.getSystemService(r6)     // Catch: java.lang.Throwable -> L54
                    android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch: java.lang.Throwable -> L54
                    java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L54
                    boolean r6 = androidx.transition.n.M(r5)     // Catch: java.lang.Throwable -> L54
                    if (r6 == 0) goto L26
                    goto L5c
                L26:
                    java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L54
                L2a:
                    boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L54
                    if (r6 == 0) goto L5c
                    java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L54
                    android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6     // Catch: java.lang.Throwable -> L54
                    java.lang.String r7 = r6.processName     // Catch: java.lang.Throwable -> L54
                    boolean r7 = android.text.TextUtils.equals(r7, r2)     // Catch: java.lang.Throwable -> L54
                    if (r7 == 0) goto L2a
                    int r2 = r6.importance     // Catch: java.lang.Throwable -> L54
                    r5 = 100
                    if (r2 == r5) goto L4a
                    r5 = 200(0xc8, float:2.8E-43)
                    if (r2 == r5) goto L4a
                    r2 = r3
                    goto L4b
                L4a:
                    r2 = r4
                L4b:
                    boolean r1 = r1.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> L54
                    if (r2 != 0) goto L5d
                    if (r1 == 0) goto L5c
                    goto L5d
                L54:
                    r1 = move-exception
                    java.lang.String r2 = "Check app runtime status encounter exception: "
                    java.lang.String r3 = "SystemUtil"
                    e0.i.p(r1, r2, r3)
                L5c:
                    r3 = r4
                L5d:
                    r1 = r3 ^ 1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq.k(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq.AnonymousClass1.run():void");
            }
        }, 2);
        com.huawei.openalliance.ad.ppskit.handlers.d a10 = com.huawei.openalliance.ad.ppskit.handlers.d.a(context);
        synchronized (a10.f22516a) {
            app = a10.f22518c;
        }
        if (app == null || !TextUtils.equals(app.e(), str)) {
            this.app = new App(context, str);
        } else {
            this.app = app;
        }
        synchronized (a10.f22516a) {
            network = a10.f22517b;
        }
        if (network != null) {
            this.network = network;
        } else {
            this.network = new Network(context, z10);
        }
        synchronized (a10.f22516a) {
            a10.f22517b = null;
        }
        synchronized (a10.f22516a) {
            device = a10.f22519d;
        }
        if (device != null) {
            this.device = device;
            device.l(context, i10, i11, i12);
        } else {
            this.device = new Device(context, i10, i11, i12, z10);
        }
        Device device2 = this.device;
        l d10 = l.d(context);
        synchronized (d10.f22585a) {
            String string = d10.G(str).getString("app_list", "");
            if (!TextUtils.isEmpty(string)) {
                HashSet hashSet = new HashSet();
                String[] split = string.split(",");
                int length = split.length;
                if (length > 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        if (!TextUtils.isEmpty(split[i13])) {
                            App app2 = new App(d10.f22587c, split[i13]);
                            if (!TextUtils.isEmpty(app2.a())) {
                                hashSet.add(app2);
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    arrayList3 = new ArrayList();
                    arrayList3.addAll(hashSet);
                }
            }
            arrayList3 = null;
        }
        device2.o(arrayList3);
        this.cachecontentid = list;
        this.cacheSloganId = null;
        this.cachedTemplates = arrayList2;
        this.parentCtrlUser = i2.j(context, false);
        this.scrnReadStat = i2.x(context);
    }
}
