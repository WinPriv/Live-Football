package com.huawei.openalliance.ad.ppskit.db.bean;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TemplateConfig;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.Map;
import ka.n7;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class TemplateStyleRecord extends a {
    public static final String APP_PKG = "appPkg";
    private static final String H5_TEMPLATE_TAG = "js";
    private static final int H5_TEMPLATE_TAG_VALUE = 1;
    public static final String SLOT_ID = "slotId";
    public static final String STYLE = "style";
    public static final String STYLE_VER = "styleVer";
    public static final String TAG = "tag";
    public static final String TEMPLATE_ID = "templateId";
    public static final String TMP_TYPE = "tmpType";
    private String appPkg;
    private String slotId;
    private String style;
    private int styleVer;
    private String tag;
    private String templateId;
    private int tmpType;

    public TemplateStyleRecord() {
    }

    public TemplateStyleRecord(String str, String str2, TemplateConfig templateConfig) {
        this.appPkg = str;
        this.slotId = str2;
        this.templateId = templateConfig.a();
        this.style = templateConfig.c();
        this.styleVer = templateConfig.b();
        this.tag = templateConfig.d();
        String d10 = templateConfig.d();
        if (TextUtils.isEmpty(d10)) {
            return;
        }
        n7.c(TAG, "tag: %s", d10);
        Map map = (Map) y0.o(null, d10, Map.class, Integer.class);
        if (a0.a.e0(map)) {
            n7.b(TAG, "tag is null");
        } else if (map.containsKey(H5_TEMPLATE_TAG) && ((Integer) map.get(H5_TEMPLATE_TAG)).intValue() == 1) {
            this.tmpType = 1;
        }
    }

    public final String A() {
        return this.slotId;
    }

    public final int C() {
        return this.styleVer;
    }

    public final String E() {
        return this.tag;
    }

    public final String c() {
        return this.templateId;
    }

    public final String d() {
        return this.style;
    }

    public TemplateStyleRecord(String str, String str2, TemplateConfig templateConfig, int i10) {
        this.appPkg = str;
        this.slotId = str2;
        this.templateId = templateConfig.a();
        this.style = templateConfig.c();
        this.styleVer = templateConfig.b();
        this.tag = templateConfig.d();
        this.tmpType = 1;
    }
}
