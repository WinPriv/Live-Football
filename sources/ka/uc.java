package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class uc extends ce {
    public uc(Context context, List<ContentRecord> list, boolean z10, int i10) {
        super(context, list, z10, i10);
        int i11;
        Object[] objArr = new Object[2];
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        objArr[0] = Integer.valueOf(i11);
        objArr[1] = Boolean.valueOf(z10);
        n7.f("ARContentProcessor", "ARContentProcessor - content records size: %d isPreContent: %s", objArr);
    }

    @Override // ka.ce
    public final void j(ContentRecord contentRecord, long j10, byte[] bArr, int i10) {
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var;
        if (contentRecord.X1() != null && !androidx.transition.n.M(contentRecord.X1().q())) {
            int a12 = contentRecord.a1();
            Context context = this.f31054h;
            if (a12 != -1 && contentRecord.a1() != 2) {
                if (contentRecord.a1() == 3) {
                    e0Var = com.huawei.openalliance.ad.ppskit.handlers.f0.E(context);
                } else {
                    n7.g("ARContentProcessor", "api ver can not be identified");
                    return;
                }
            } else {
                e0Var = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
            }
            this.f31052e = e0Var;
            String h10 = contentRecord.h();
            boolean t10 = t(contentRecord);
            boolean z10 = this.f31051d;
            n7.f("ARContentProcessor", "downloadOneArContent: %s xrfile isExist: %s isPreContent: %s", h10, Boolean.valueOf(t10), Boolean.valueOf(z10));
            if (!z10) {
                if (t(contentRecord)) {
                    com.huawei.openalliance.ad.ppskit.utils.i2.k(context, contentRecord.z1());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ContentRecord.XRINFOLIST);
                    this.f31052e.s(contentRecord, contentRecord.h(), arrayList);
                    m(h10, contentRecord.v1(), com.anythink.expressad.video.dynview.a.a.f11377aa);
                    return;
                }
                contentRecord.x2(null);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ContentRecord.XRINFOLIST);
                this.f31052e.s(contentRecord, contentRecord.h(), arrayList2);
                return;
            }
            if (t(contentRecord) && this.f31050c != 60) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add("updateTime");
                this.f31052e.s(contentRecord, h10, arrayList3);
                m(h10, contentRecord.v1(), com.anythink.expressad.video.dynview.a.a.f11377aa);
            }
            if (r(contentRecord, j10, bArr, i10) && t(contentRecord)) {
                n7.b("ARContentProcessor", "down load ar xrfile success");
                if (this.f31050c != 60) {
                    com.huawei.openalliance.ad.ppskit.utils.i2.k(context, contentRecord.z1());
                    this.f31052e.r(contentRecord);
                    n7.b("ARContentProcessor", "ar xrfile insert Or Update Content");
                    return;
                }
                return;
            }
            return;
        }
        n7.b("ARContentProcessor", "XRInfoList is null, is not ar ad");
    }

    public final boolean t(ContentRecord contentRecord) {
        boolean z10;
        String simpleName;
        String str;
        String concat;
        String str2;
        File file;
        String str3;
        if (contentRecord.X1() == null) {
            return false;
        }
        List<XRInfo> q10 = contentRecord.X1().q();
        if (androidx.transition.n.M(q10)) {
            n7.e("ARContentProcessor", "xRInfos is empty");
            return false;
        }
        Iterator<XRInfo> it = q10.iterator();
        do {
            z10 = true;
            if (!it.hasNext()) {
                return true;
            }
            XRInfo next = it.next();
            ImageInfo k10 = next.k();
            if (k10 == null) {
                n7.b("ARContentProcessor", "xrFile Path not exist");
            } else {
                File a10 = d5.a(this.f31054h, com.anythink.expressad.video.dynview.a.a.f11377aa);
                try {
                    str2 = a10.getCanonicalPath() + File.separator + "arzip" + com.huawei.openalliance.ad.ppskit.utils.x.x(k10.g());
                    file = new File(str2);
                } catch (IOException e10) {
                    simpleName = e10.getClass().getSimpleName();
                    str = "IOException ar content is not prepared:";
                    concat = str.concat(simpleName);
                    n7.e("ARContentProcessor", concat);
                    z10 = false;
                } catch (Exception e11) {
                    simpleName = e11.getClass().getSimpleName();
                    str = "Exception ar content is not prepared:";
                    concat = str.concat(simpleName);
                    n7.e("ARContentProcessor", concat);
                    z10 = false;
                }
                if (file.exists() && file.isDirectory()) {
                    if (androidx.transition.n.N(file.listFiles())) {
                        str3 = "unzip file dir is empty";
                        n7.e("ARContentProcessor", str3);
                    } else if (!TextUtils.isEmpty(ce.f(next, str2))) {
                        if (!o(next.q(), false)) {
                            concat = "checkbgFil false";
                            n7.e("ARContentProcessor", concat);
                        } else if (o(next.r(), true)) {
                        }
                    }
                }
                str3 = "unzip file not exist or is not directory";
                n7.e("ARContentProcessor", str3);
            }
            z10 = false;
        } while (z10);
        return false;
    }
}
