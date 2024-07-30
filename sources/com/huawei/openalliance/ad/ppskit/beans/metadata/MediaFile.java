package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.be;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class MediaFile implements Serializable {
    private static final long serialVersionUID = 30422300;
    private long fileSize;
    private int height;
    private String sha256;

    @a
    private String url;
    private int width;
    private String mime = "video/mp4";
    private int checkSha256Flag = 0;
    private int downloadNetwork = 0;
    private int playMode = 1;

    public final boolean A() {
        if (!TextUtils.isEmpty(this.mime)) {
            return "video/mp4".equals(this.mime);
        }
        return false;
    }

    public final int C() {
        if (!be.V.equals(this.mime) && !be.I.equals(this.mime) && !be.Z.equals(this.mime)) {
            if (be.B.equals(this.mime)) {
                return 4;
            }
            return 100;
        }
        return 2;
    }

    public final String a() {
        return this.mime;
    }

    public final void b(int i10) {
        this.height = i10;
    }

    public final void c(String str) {
        this.url = str;
    }

    public final void e() {
        this.playMode = 2;
    }

    public final long k() {
        return this.fileSize;
    }

    public final String p() {
        return this.url;
    }

    public final String q() {
        return this.sha256;
    }

    public final int r() {
        return this.checkSha256Flag;
    }

    public final int u() {
        return this.downloadNetwork;
    }

    public final int v() {
        return this.playMode;
    }

    public final boolean x() {
        if (TextUtils.isEmpty(this.mime)) {
            return false;
        }
        if (!be.V.equals(this.mime) && !be.I.equals(this.mime) && !be.Z.equals(this.mime) && !be.B.equals(this.mime)) {
            return false;
        }
        return true;
    }

    public final void a(int i10) {
        this.width = i10;
    }
}
