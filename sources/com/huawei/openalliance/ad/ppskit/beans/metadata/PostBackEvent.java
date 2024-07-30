package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class PostBackEvent {
    private int adType;
    private String contentId;
    private String eventType;
    private int maxShowRatio;
    private String packageName;
    private String showId;
    private long showTimeDuration;
    private String slotId;
    private long time;

    public final String a() {
        return this.packageName;
    }

    public final void b(int i10) {
        this.maxShowRatio = i10;
    }

    public final void c(long j10) {
        this.showTimeDuration = j10;
    }

    public final void d(String str) {
        this.packageName = str;
    }

    public final String e() {
        return this.slotId;
    }

    public final void f(int i10) {
        this.adType = i10;
    }

    public final void g(long j10) {
        this.time = j10;
    }

    public final void h(String str) {
        this.slotId = str;
    }

    public final String i() {
        return this.contentId;
    }

    public final void j(String str) {
        this.contentId = str;
    }

    public final String k() {
        return this.showId;
    }

    public final void l(String str) {
        this.showId = str;
    }

    public final long m() {
        return this.showTimeDuration;
    }

    public final void n(String str) {
        this.eventType = str;
    }

    public final int o() {
        return this.maxShowRatio;
    }

    public final String p() {
        return this.eventType;
    }

    public final long q() {
        return this.time;
    }
}
