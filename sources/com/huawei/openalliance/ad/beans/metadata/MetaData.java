package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class MetaData implements Serializable {
    private static final long serialVersionUID = 5884097861234973073L;
    private String adSign;
    private List<AdSource> adSources;
    private ApkInfo apkInfo;
    private String appPromotionChannel;
    private String cta;
    private String description;
    private List<ImageInfo> icon;
    private List<ImageInfo> imageInfo;
    private String intent;
    private String label;
    private String marketAppId;
    private MediaFile mediaFile;
    private List<MediaFile> mediaFiles;
    private String privacyUrl;
    private PromoteInfo promoteInfo;
    private Integer showAppElement;
    private List<TextState> textStateList;
    private String title;
    private VideoInfo videoInfo;
    private long minEffectiveShowTime = 500;
    private int minEffectiveShowRatio = 50;
    private long duration = 0;

    public final String A() {
        return this.title;
    }

    public final String C() {
        return this.intent;
    }

    public final String D() {
        return this.label;
    }

    public final List<ImageInfo> E() {
        return this.imageInfo;
    }

    public final ApkInfo F() {
        return this.apkInfo;
    }

    public final PromoteInfo G() {
        return this.promoteInfo;
    }

    public final String H() {
        return this.adSign;
    }

    public final MediaFile K() {
        return this.mediaFile;
    }

    public final String L() {
        return this.appPromotionChannel;
    }

    public final List<TextState> O() {
        return this.textStateList;
    }

    public final long U() {
        return this.duration;
    }

    public final List<AdSource> W() {
        return this.adSources;
    }

    public final boolean X() {
        Integer num = this.showAppElement;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final String a() {
        return this.marketAppId;
    }

    public final String k() {
        return this.description;
    }

    public final List<ImageInfo> p() {
        return this.icon;
    }

    public final String q() {
        return this.cta;
    }

    public final int r() {
        return this.minEffectiveShowRatio;
    }

    public final String u() {
        return this.privacyUrl;
    }

    public final long v() {
        return this.minEffectiveShowTime;
    }

    public final VideoInfo x() {
        return this.videoInfo;
    }
}
