package com.huawei.openalliance.ad.uriaction;

import com.huawei.hag.abilitykit.entities.CallerInfo;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.fadata.PPSAbilityData;
import com.huawei.openalliance.ad.fadata.PPSAbilityDataContent;
import com.huawei.openalliance.ad.fadata.PPSAbilityResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class RequestMsgBuilder {
    private static final String FA_VERSION = "2.0";
    private List<PPSAbilityResult> abilityInfos;
    private CallerInfo callerInfo;
    private String version;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f23621a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f23622b = null;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f23623c = new ArrayList(1);

        public final RequestMsgBuilder a() {
            return new RequestMsgBuilder(this);
        }

        public final void c(PPSAbilityDataContent pPSAbilityDataContent) {
            PPSAbilityData pPSAbilityData = new PPSAbilityData();
            pPSAbilityData.a();
            pPSAbilityData.b(new ArrayList(Arrays.asList(pPSAbilityDataContent)));
            PPSAbilityResult pPSAbilityResult = new PPSAbilityResult();
            pPSAbilityResult.a();
            pPSAbilityResult.b(new ArrayList<>(Arrays.asList(pPSAbilityData)));
            this.f23623c.add(0, pPSAbilityResult);
        }

        public final void d(String str) {
            this.f23621a = str;
        }

        public final void g() {
            this.f23622b = w.cC;
        }
    }

    public RequestMsgBuilder(a aVar) {
        CallerInfo callerInfo = new CallerInfo();
        this.version = FA_VERSION;
        callerInfo.setPackageName(aVar.f23621a);
        callerInfo.setBusinessPkgName(aVar.f23622b);
        this.callerInfo = callerInfo;
        this.abilityInfos = aVar.f23623c;
    }
}
