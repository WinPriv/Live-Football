package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SlotTemplate;
import java.util.ArrayList;
import java.util.List;
import ma.a;
import ma.g;

@DataKeep
/* loaded from: classes2.dex */
public class AppConfigReq extends ReqBean {
    private App app;
    private String appSdkVerCode;
    private String appSdkVersion;
    private Device device;

    @a
    private String gaid;
    private List<SlotTemplate> jsSlotTemplate;

    @a
    private String oaid;
    private String routerCountry;
    private String sdkVerCode;

    @a
    private String serverStore;

    @g
    private String sha256;
    private List<SlotTemplate> slotTemplate;
    private String slotid;
    private String templateEnginVer;

    @a
    private String udid;
    private String version = "3.4";
    private String sdkversion = "3.4.65.300";

    public AppConfigReq() {
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "query";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_sdk_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/sdkserver/query";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }

    public final void e(App app) {
        this.app = app;
    }

    public final void f(Device device) {
        this.device = device;
    }

    public final void g(ArrayList arrayList) {
        this.slotTemplate = arrayList;
    }

    public final void h(ArrayList arrayList) {
        this.jsSlotTemplate = arrayList;
    }

    public final void i(String str) {
        this.serverStore = str;
    }

    public final void j(String str) {
        this.oaid = str;
    }

    public final void k(String str) {
        this.udid = str;
    }

    public final void l(String str) {
        this.appSdkVersion = str;
    }

    public final void m(String str) {
        this.routerCountry = str;
    }

    public final void n(String str) {
        this.sdkVerCode = str;
    }

    public final void o(String str) {
        this.appSdkVerCode = str;
    }

    public final void p(String str) {
        this.gaid = str;
    }

    public final void q(String str) {
        this.sha256 = str;
    }

    public final void r(String str) {
        this.templateEnginVer = str;
    }

    public AppConfigReq(String str) {
        this.slotid = str;
    }
}
