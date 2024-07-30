package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class ContentResource extends a {
    public static final String CACHE_TYPE = "cacheType";
    public static final String CONTENT_ID = "contentId";
    public static final String FILE_NAME = "fileName";
    public static final String PRIORITY = "priority";
    public static final String SLOT_ID = "slotId";
    public static final String UPDATE_TIME = "updateTime";
    private int adType;
    private String cacheType;
    private String contentId;
    private int downloadSource;
    private String fileName;
    private int isPreload;
    private int priority;
    private String resType;
    private String slotId;
    private int unzipStatus;
    private long updateTime;
    private int useCount;

    public ContentResource() {
        this.adType = -1;
        this.downloadSource = 2;
    }

    public final void A(String str) {
        this.fileName = str;
    }

    public final String C() {
        return this.slotId;
    }

    public final void D(int i10) {
        this.priority = i10;
    }

    public final void E(String str) {
        this.slotId = str;
    }

    public final void F(int i10) {
        this.isPreload = i10;
    }

    public final void G(String str) {
        this.contentId = str;
    }

    public final int H() {
        return this.adType;
    }

    public final void I(int i10) {
        this.useCount = i10;
    }

    public final void J(String str) {
        this.resType = str;
    }

    public final int K() {
        return this.priority;
    }

    public final void L(int i10) {
        this.unzipStatus = i10;
    }

    public final void M(String str) {
        this.cacheType = str;
    }

    public final void N(int i10) {
        this.downloadSource = i10;
    }

    public final int O() {
        return this.isPreload;
    }

    public final int U() {
        return this.useCount;
    }

    public final int W() {
        return this.unzipStatus;
    }

    public final String X() {
        return this.cacheType;
    }

    public final int Y() {
        return this.downloadSource;
    }

    public final String a() {
        return this.fileName;
    }

    public final String c() {
        return this.contentId;
    }

    public final long f() {
        return this.updateTime;
    }

    public final String i() {
        return this.resType;
    }

    public final void z(long j10) {
        this.updateTime = j10;
    }

    public ContentResource(ContentRecord contentRecord) {
        this.adType = -1;
        this.downloadSource = 2;
        this.contentId = contentRecord.h();
        this.slotId = contentRecord.p2();
        this.adType = contentRecord.z0();
    }

    public final void a(int i10) {
        this.adType = i10;
    }
}
