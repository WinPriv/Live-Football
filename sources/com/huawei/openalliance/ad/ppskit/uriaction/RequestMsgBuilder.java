package com.huawei.openalliance.ad.ppskit.uriaction;

import android.text.TextUtils;
import com.huawei.hag.abilitykit.entities.CallerInfo;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.fadata.PPSAbilityData;
import com.huawei.openalliance.ad.ppskit.fadata.PPSAbilityDataContent;
import com.huawei.openalliance.ad.ppskit.fadata.PPSAbilityResult;
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
        public String f22797a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f22798b = null;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f22799c = new ArrayList(1);

        public final RequestMsgBuilder a() {
            if (!TextUtils.isEmpty(this.f22797a) && !TextUtils.isEmpty(this.f22798b)) {
                if (((PPSAbilityResult) this.f22799c.get(0)).c() != null) {
                    return new RequestMsgBuilder(this);
                }
                throw new IllegalArgumentException("AbilityData is missing.");
            }
            throw new IllegalArgumentException("The input parameter is missing.");
        }

        public final void c(PPSAbilityDataContent pPSAbilityDataContent) {
            PPSAbilityData pPSAbilityData = new PPSAbilityData();
            pPSAbilityData.a();
            pPSAbilityData.b(new ArrayList(Arrays.asList(pPSAbilityDataContent)));
            PPSAbilityResult pPSAbilityResult = new PPSAbilityResult();
            pPSAbilityResult.a();
            pPSAbilityResult.b(new ArrayList<>(Arrays.asList(pPSAbilityData)));
            this.f22799c.add(0, pPSAbilityResult);
        }

        public final void d(String str) {
            this.f22797a = str;
        }

        public final void f() {
            this.f22798b = w.cC;
        }
    }

    public RequestMsgBuilder(a aVar) {
        CallerInfo callerInfo = new CallerInfo();
        this.version = FA_VERSION;
        callerInfo.setPackageName(aVar.f22797a);
        callerInfo.setBusinessPkgName(aVar.f22798b);
        this.callerInfo = callerInfo;
        this.abilityInfos = aVar.f22799c;
    }
}
