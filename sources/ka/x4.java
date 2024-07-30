package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.AnalysisEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ClickEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecordV3;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ImpEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.MgtCertRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateStyleRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ThirdPartyEventRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.UserCloseRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class x4 extends y6.m {
    public x4(v4 v4Var) {
        super(v4Var);
    }

    @Override // y6.m
    public final void a() {
        Object obj = this.f36805b;
        ((List) obj).add(new EventRecord());
        ((List) obj).add(new ContentRecord());
        ((List) obj).add(new ThirdPartyEventRecord());
        ((List) obj).add(new TemplateRecord());
        ((List) obj).add(new UserCloseRecord());
        ((List) obj).add(new AppDownloadRecord());
        ((List) obj).add(new AnalysisEventRecord());
        ((List) obj).add(new ClickEventRecord());
        ((List) obj).add(new ImpEventRecord());
        ((List) obj).add(new ContentResource());
        ((List) obj).add(new EventMonitorRecord());
        ((List) obj).add(new MgtCertRecord());
        ((List) obj).add(new ContentTemplateRecord());
        ((List) obj).add(new TemplateStyleRecord());
        ((List) obj).add(new ContentRecordV3());
        Object obj2 = this.f36806c;
        ((List) obj2).add(new EventRecord());
        ((List) obj2).add(new ContentRecord());
        ((List) obj2).add(new ThirdPartyEventRecord());
        ((List) obj2).add(new TemplateRecord());
        ((List) obj2).add(new UserCloseRecord());
        ((List) obj2).add(new AppDownloadRecord());
        ((List) obj2).add(new AnalysisEventRecord());
        ((List) obj2).add(new ClickEventRecord());
        ((List) obj2).add(new ImpEventRecord());
        ((List) obj2).add(new ContentResource());
        ((List) obj2).add(new EventMonitorRecord());
        ((List) obj2).add(new MgtCertRecord());
        ((List) obj2).add(new ContentTemplateRecord());
        ((List) obj2).add(new TemplateStyleRecord());
        ((List) obj2).add(new ContentRecordV3());
    }

    @Override // y6.m
    public final String b() {
        return "DbUpdateHelper";
    }
}
