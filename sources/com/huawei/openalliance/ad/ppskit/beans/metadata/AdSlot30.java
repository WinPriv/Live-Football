package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.CachedContentTplate;
import java.util.ArrayList;
import java.util.List;
import ma.a;
import ma.d;

@DataKeep
/* loaded from: classes2.dex */
public class AdSlot30 {

    @d(a = "h")
    private Integer adHeight;

    @d(a = "w")
    private Integer adWidth;
    private int adtype;
    private Integer amttpv;
    private Integer bsrSet;
    private List<CachedContentTplate> cachedContentTplates;
    private List<String> detailedCreativeTypeList;
    private int fcFlag;
    private int height;

    @a
    private List<ImpEX> impEXs;
    private Integer isSmart;
    private Integer linkedMode;
    private Integer maxCount;
    private Integer orientation;
    private String slotid;
    private Integer splashStartMode;
    private Integer splashType;
    private String templateEnginVer;
    private List<String> templateIds;
    private int test;
    private Integer totalDuration;
    private int width;

    public AdSlot30() {
        this.test = 0;
        this.adtype = 1;
        this.fcFlag = 0;
    }

    public final String a() {
        return this.slotid;
    }

    public final void b(Integer num) {
        this.maxCount = num;
    }

    public final void c(List<ImpEX> list) {
        this.impEXs = list;
    }

    public final void d(Integer num) {
        this.isSmart = num;
    }

    public final void e(String str) {
        this.templateEnginVer = str;
    }

    public final void f(List<String> list) {
        this.detailedCreativeTypeList = list;
    }

    public final void g(Integer num) {
        this.adWidth = num;
    }

    public final void h(ArrayList arrayList) {
        this.templateIds = arrayList;
    }

    public final int i() {
        return this.adtype;
    }

    public final void j(Integer num) {
        this.adHeight = num;
    }

    public final void k(ArrayList arrayList) {
        this.cachedContentTplates = arrayList;
    }

    public final void l() {
        this.fcFlag = 1;
    }

    public final void m(Integer num) {
        this.amttpv = num;
    }

    public final Integer n() {
        return this.maxCount;
    }

    public final void o(Integer num) {
        this.totalDuration = num;
    }

    public final void p(Integer num) {
        this.linkedMode = num;
    }

    public final void q(Integer num) {
        this.splashType = num;
    }

    public final void r(Integer num) {
        this.splashStartMode = num;
    }

    public final void s(Integer num) {
        this.orientation = num;
    }

    public final void t(Integer num) {
        this.bsrSet = num;
    }

    public AdSlot30(String str, int i10, int i11, int i12, boolean z10) {
        this.fcFlag = 0;
        this.slotid = str;
        this.width = i10;
        this.height = i11;
        this.test = z10 ? 1 : 0;
        this.adtype = i12;
    }
}
