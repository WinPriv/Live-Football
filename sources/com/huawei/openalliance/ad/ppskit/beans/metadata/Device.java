package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.content.Context;
import android.os.Build;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ka.Cif;
import ka.l;
import ka.n7;
import ma.a;
import ma.g;

@DataKeep
/* loaded from: classes2.dex */
public class Device {
    private static final String TAG = "Device";

    @a
    private String aaid;
    private Integer adEncodingMode;
    private Integer adsLoc;
    private String agCountryCode;

    @g
    private String agcAaid;

    @a
    private String androidid;
    private List<App> appList;
    private String belongCountry;
    private String brand;
    private String brandCust;
    private String buildVersion;
    private String clientTime;
    private int dpi;
    private Integer emuiSdkInt;
    private String emuiVer;
    private Integer encodingMode;
    private Long freeDiskSize;
    private Long freeSdcardSize;

    @g
    private String gaid;
    private String gaidTrackingEnabled;
    private Integer gpsOn;

    @a
    private String groupId;
    private int height;
    private Integer hmSdkInt;
    private String hmVer;
    private Integer hmftype;
    private Integer hmsGpsOn;

    @a
    private List<String> insApps;
    private boolean isChinaROM;
    private String isTrackingEnabled;
    private String language;
    private String localeCountry;
    private String magicUIVer;
    private String maker;
    private String model;

    @g
    private String oaid;
    private String partnerChannel;
    private float pxratio;
    private Integer reqSource;
    private String roLocale;
    private String roLocaleCountry;
    private String routerCountry;
    private String script;
    private Integer sdkType;
    private String simCountryIso;
    private Long totalDiskSize;
    private Long totalSdcardSize;
    private String tvModel;

    @g
    private String udid;
    private String useragent;

    @g
    private String uuid;
    private String vendor;
    private String vendorCountry;
    private String verCodeOfAG;
    private String verCodeOfHms;
    private String verCodeOfHsf;
    private String version;
    private int width;
    private int type = 4;
    private String os = "android";
    private DeviceExt ext = new DeviceExt();

    public Device() {
    }

    public final void A(String str) {
        this.oaid = str;
    }

    public final void B(String str) {
        this.isTrackingEnabled = str;
    }

    public final String C() {
        return this.oaid;
    }

    public final String D() {
        return this.isTrackingEnabled;
    }

    public final void E(String str) {
        this.belongCountry = str;
    }

    public final void F(String str) {
        this.gaid = str;
    }

    public final void G(String str) {
        this.gaidTrackingEnabled = str;
    }

    public final void H() {
        this.uuid = null;
    }

    public final String I() {
        return this.localeCountry;
    }

    public final void a(String str) {
        this.routerCountry = str;
    }

    public final String b() {
        return this.gaid;
    }

    public final String c() {
        return this.gaidTrackingEnabled;
    }

    public final void d(String str) {
        this.agCountryCode = str;
    }

    public final void e() {
        this.aaid = null;
    }

    public final Long f() {
        return this.freeDiskSize;
    }

    public final void g(String str) {
        this.agcAaid = str;
    }

    public final void h(String str) {
        this.groupId = str;
    }

    public final Long i() {
        return this.freeSdcardSize;
    }

    public final void j() {
        this.aaid = null;
        this.udid = null;
        this.uuid = null;
        this.appList = null;
    }

    public final void k(Context context) {
        this.version = Build.VERSION.RELEASE;
        this.maker = z1.c(context);
        this.brand = z1.d(context);
        this.model = z1.e(context);
        this.language = i2.c();
        this.script = Locale.getDefault().getScript();
        l a10 = Cif.a(context);
        this.emuiVer = a10.e();
        this.emuiSdkInt = a10.h();
        this.magicUIVer = a10.i();
        this.verCodeOfHsf = i2.n(context);
        this.verCodeOfHms = i2.p(context);
        this.verCodeOfAG = i2.r(context);
        this.agCountryCode = i2.s(context);
        this.localeCountry = z1.x();
        this.simCountryIso = z1.O(context);
        this.roLocaleCountry = y1.v(z1.o(CountryCodeBean.LOCALE_REGION_COUNTRYSYSTEMPROP));
        this.roLocale = y1.v(z1.o(CountryCodeBean.LOCALE_COUNTRYSYSTEMPROP));
        this.vendorCountry = y1.v(a10.l());
        this.vendor = y1.v(a10.k());
        this.type = m.a(context);
        this.sdkType = i2.F(context);
        s(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.content.Context r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            r2.width = r4
            r2.height = r5
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.i2.c()
            r2.language = r4
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getScript()
            r2.script = r4
            r2.type = r6
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r4)
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.text.SimpleDateFormat r4 = com.huawei.openalliance.ad.ppskit.utils.d0.e(r4)
            java.lang.String r4 = r4.format(r6)
            r2.clientTime = r4
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.z1.x()
            r2.localeCountry = r4
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.z1.O(r3)
            r2.simCountryIso = r4
            com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean r4 = new com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean
            r4.<init>(r3)
            java.lang.String r4 = r4.a()
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.y1.v(r4)
            r2.routerCountry = r4
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.d0.m(r3)
            if (r4 == 0) goto L56
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.c1.g(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.hmsGpsOn = r4
        L56:
            com.huawei.openalliance.ad.ppskit.utils.q1 r3 = com.huawei.openalliance.ad.ppskit.utils.q1.m(r3)
            com.huawei.openalliance.ad.ppskit.beans.metadata.DeviceExt r4 = r2.ext
            java.util.List r3 = r3.h()
            r4.b(r3)
            boolean r3 = r2.isChinaROM
            if (r3 == 0) goto Lbb
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r3 < r4) goto Lae
            java.lang.String r3 = "/data/data"
            android.system.StructStat r3 = android.system.Os.stat(r3)     // Catch: java.lang.Throwable -> L98
            android.system.StructTimespec r4 = com.huawei.openalliance.ad.ppskit.utils.i.b(r3)     // Catch: java.lang.Throwable -> L98
            long r4 = com.huawei.openalliance.ad.ppskit.utils.j.a(r4)     // Catch: java.lang.Throwable -> L98
            android.system.StructTimespec r3 = com.huawei.openalliance.ad.ppskit.utils.i.b(r3)     // Catch: java.lang.Throwable -> L98
            long r0 = com.huawei.openalliance.ad.ppskit.utils.i.a(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            r3.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "."
            r3.append(r6)     // Catch: java.lang.Throwable -> L98
            r3.append(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L98
            goto Lb0
        L98:
            r3 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "DeviceUtil"
            java.lang.String r5 = "get update mark exception: %s"
            ka.n7.j(r3, r5, r4)
        Lae:
            java.lang.String r3 = ""
        Lb0:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lbb
            com.huawei.openalliance.ad.ppskit.beans.metadata.DeviceExt r4 = r2.ext
            r4.c(r3)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.beans.metadata.Device.l(android.content.Context, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.content.Context r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.beans.metadata.Device.m(android.content.Context, boolean):void");
    }

    public final void n(Integer num) {
        this.gpsOn = num;
    }

    public final void o(ArrayList arrayList) {
        this.appList = arrayList;
    }

    public final String p() {
        return this.hmVer;
    }

    public final Integer q() {
        return this.hmSdkInt;
    }

    public final int r() {
        return this.type;
    }

    public final void s(Context context) {
        this.hmVer = m.u(context);
        String o = z1.o("hw_sc.build.os.enable");
        if (n7.d()) {
            n7.c("HarmonyUtils", "hmftype: %s", o);
        }
        if (Boolean.parseBoolean(o)) {
            this.hmftype = 1;
            this.os = "harmonyos,android";
        }
        String o6 = z1.o("hw_sc.build.os.apiversion");
        if (n7.d()) {
            n7.c("HarmonyUtils", "hmSdkInt: %s", o6);
        }
        this.hmSdkInt = y1.q(o6);
    }

    public final void t(Integer num) {
        this.adsLoc = num;
    }

    public final void u(ArrayList arrayList) {
        this.insApps = arrayList;
    }

    public final void v(Integer num) {
        this.encodingMode = num;
    }

    public final void w() {
        this.androidid = null;
    }

    public final void x(Integer num) {
        this.sdkType = num;
    }

    public final void y() {
        this.udid = null;
    }

    public final void z(Integer num) {
        this.reqSource = num;
    }

    public Device(Context context, int i10, int i11, int i12, boolean z10) {
        this.isChinaROM = Cif.a(context).d();
        m(context, z10);
        l(context, i10, i11, i12);
    }

    public Device(Context context, boolean z10) {
        this.isChinaROM = Cif.a(context).d();
        m(context, z10);
    }
}
