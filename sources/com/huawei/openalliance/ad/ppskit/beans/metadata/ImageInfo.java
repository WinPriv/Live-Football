package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.List;
import ma.a;
import ma.e;

@DataKeep
/* loaded from: classes2.dex */
public class ImageInfo {

    @e
    private List<String> attachments;
    private int checkSha256Flag;

    @e
    private String fileKey;

    @a
    private String origUrl;
    private String sha256;

    @a
    private String url;
    private int width = 0;
    private int height = 0;
    private String imageType = bd.Code;
    private int fileSize = 0;

    public final String a() {
        return this.sha256;
    }

    public final void b(int i10) {
        this.width = i10;
    }

    public final void c(String str) {
        this.sha256 = str;
    }

    public final String d() {
        return this.imageType;
    }

    public final void e(int i10) {
        this.height = i10;
    }

    public final void f(String str) {
        this.imageType = str;
    }

    public final String g() {
        return this.url;
    }

    public final void h(String str) {
        this.url = str;
    }

    public final String i() {
        return this.origUrl;
    }

    public final void j(int i10) {
        this.checkSha256Flag = i10;
    }

    public final void k(String str) {
        this.origUrl = str;
    }

    public final int l() {
        return this.width;
    }

    public final int m() {
        return this.height;
    }

    public final int n() {
        return this.fileSize;
    }

    public final int o() {
        return this.checkSha256Flag;
    }

    public final List<String> p() {
        return this.attachments;
    }

    public final String q() {
        return this.fileKey;
    }
}
