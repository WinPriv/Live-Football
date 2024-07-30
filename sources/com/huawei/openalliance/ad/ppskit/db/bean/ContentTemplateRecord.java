package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateData;
import java.io.Serializable;
import java.util.List;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class ContentTemplateRecord extends a implements Serializable {
    public static final String APP_PKG_NAME = "appPkgName";
    public static final String ASSETS = "assets";
    public static final String CONTENT_ID = "contentId";
    public static final String MOTIONS = "motions";
    public static final String MOTION_DATA = "motionData";
    public static final String TEMPLATE_CONTEXT = "templateContext";
    public static final String TEMPLATE_ID = "templateId";
    private static final long serialVersionUID = 1999006876326113126L;
    private String appPkgName;
    private List<Asset> assets;
    private String contentId;
    private List<MotionData> motionData;
    private String motions;
    private String templateContext;
    private String templateId;
    private String templateUrl;

    public ContentTemplateRecord() {
    }

    public ContentTemplateRecord(String str, String str2, String str3, List<Asset> list, TemplateData templateData) {
        this.appPkgName = str;
        this.contentId = str2;
        this.templateId = str3;
        this.assets = list;
        if (templateData != null) {
            this.templateContext = templateData.a();
            this.motions = templateData.k();
            this.motionData = templateData.p();
        }
    }

    public final String A() {
        return this.contentId;
    }

    public final List<Asset> C() {
        return this.assets;
    }

    public final String E() {
        return this.templateContext;
    }

    public final String F() {
        return this.motions;
    }

    public final void G(String str) {
        this.templateUrl = str;
    }

    public final List<MotionData> H() {
        return this.motionData;
    }

    public final String a() {
        return this.appPkgName;
    }

    public final String c() {
        return this.templateId;
    }
}
