package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;

/* loaded from: classes2.dex */
public class bg extends as {
    public bg() {
        super(aj.S);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, final String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.bg.1
            @Override // com.huawei.hms.ads.ac
            public void Code(AdContentData adContentData) {
                RemoteCallResultCallback remoteCallResultCallback2;
                String str2;
                int i10;
                if (adContentData != null) {
                    final com.huawei.openalliance.ad.inter.data.o oVar = new com.huawei.openalliance.ad.inter.data.o(adContentData);
                    if (bg.this.Code(adContentData)) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.bg.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                int b10 = bg.this.V(context, str).b(context, oVar);
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                ag.Code(remoteCallResultCallback, bg.this.Code, 1000, Integer.valueOf(b10), true);
                            }
                        });
                        return;
                    } else {
                        remoteCallResultCallback2 = remoteCallResultCallback;
                        str2 = bg.this.Code;
                        i10 = br.f;
                    }
                } else {
                    remoteCallResultCallback2 = remoteCallResultCallback;
                    str2 = bg.this.Code;
                    i10 = 3002;
                }
                ag.Code(remoteCallResultCallback2, str2, i10, null, true);
            }
        });
    }
}
