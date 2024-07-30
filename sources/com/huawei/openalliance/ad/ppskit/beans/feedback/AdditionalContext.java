package com.huawei.openalliance.ad.ppskit.beans.feedback;

import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class AdditionalContext {
    private String advertiseTitle = null;
    private String creativeId = "";
    private String slotId = "";
    private String landingPageUrl = null;
    private List<String> imageUrl = null;
    private List<String> videoUrl = null;
    private String advertiseId = null;

    public final void a(String str) {
        this.advertiseTitle = str;
    }

    public final void b(ArrayList arrayList) {
        this.imageUrl = arrayList;
    }

    public final void c(String str) {
        this.creativeId = str;
    }

    public final void d(ArrayList arrayList) {
        this.videoUrl = arrayList;
    }

    public final void e(String str) {
        this.slotId = str;
    }

    public final void f(String str) {
        this.landingPageUrl = str;
    }

    public final void g(String str) {
        this.advertiseId = str;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.advertiseId);
        sb2.append("-");
        sb2.append(this.advertiseTitle);
        sb2.append("-");
        sb2.append(this.creativeId);
        sb2.append("-");
        sb2.append(this.slotId);
        sb2.append("-");
        String str3 = "";
        if (n.M(this.imageUrl)) {
            str = "";
        } else {
            StringBuilder sb3 = new StringBuilder("imageUrl");
            for (String str4 : this.imageUrl) {
                sb3.append("-");
                sb3.append(y1.j(str4));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (n.M(this.videoUrl)) {
            str2 = "";
        } else {
            StringBuilder sb4 = new StringBuilder("videoUrl:");
            for (String str5 : this.videoUrl) {
                sb4.append("-");
                sb4.append(y1.j(str5));
            }
            str2 = sb4.toString();
        }
        sb2.append(str2);
        if (!y1.h(this.landingPageUrl)) {
            str3 = "clickUrl:-" + y1.j(this.landingPageUrl);
        }
        sb2.append(str3);
        return sb2.toString();
    }
}
