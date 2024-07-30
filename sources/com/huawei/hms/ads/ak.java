package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.huawei.hms.ads.base.R;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.r0;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ak extends ag {
    private static final String Z = "JsbFeedBackClick";

    public ak() {
        super(aj.A);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(final Context context, String str, final RemoteCallResultCallback<String> remoteCallResultCallback) {
        ex.Code(Z, "start");
        final JSONObject jSONObject = new JSONObject(str);
        Code(context, str, true, new ac() { // from class: com.huawei.hms.ads.ak.1
            public void Code(final Context context2, AdContentData adContentData, int i10, FeedbackInfo feedbackInfo) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(feedbackInfo);
                    if (i10 != 1) {
                        if (i10 == 2) {
                            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ak.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(context2, R.string.hiad_feedback_had_feedback, 0).show();
                                }
                            });
                            jh.Code(context2, adContentData, arrayList, 2);
                            return;
                        } else if (i10 != 3) {
                            ex.Code(ak.Z, "invalid feedback type");
                            return;
                        }
                    }
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ak.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(context2, R.string.hiad_feedback_reduce_such_content, 0).show();
                        }
                    });
                    if (i10 == 3) {
                        Code(context2, adContentData, feedbackInfo);
                    }
                    jh.Code(context2, adContentData, arrayList, 1);
                } catch (Throwable th) {
                    ex.I(ak.Z, "itemClickAction error: %s", th.getClass().getSimpleName());
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
            @Override // com.huawei.hms.ads.ac
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void Code(com.huawei.openalliance.ad.inter.data.AdContentData r12) {
                /*
                    r11 = this;
                    org.json.JSONObject r0 = r2
                    java.lang.String r1 = "feedbackType"
                    r2 = -111111(0xfffffffffffe4df9, float:NaN)
                    int r0 = r0.optInt(r1, r2)
                    java.lang.String r1 = "JsbFeedBackClick"
                    r2 = 0
                    if (r12 == 0) goto L62
                    org.json.JSONObject r3 = r2
                    java.lang.String r4 = "feedbackInfo"
                    org.json.JSONObject r3 = r3.optJSONObject(r4)
                    java.lang.String r4 = r3.toString()
                    java.lang.Class<com.huawei.openalliance.ad.inter.data.FeedbackInfo> r5 = com.huawei.openalliance.ad.inter.data.FeedbackInfo.class
                    r6 = 0
                    java.lang.Class[] r7 = new java.lang.Class[r6]
                    java.lang.Object r4 = gb.b.o(r5, r4, r7)
                    com.huawei.openalliance.ad.inter.data.FeedbackInfo r4 = (com.huawei.openalliance.ad.inter.data.FeedbackInfo) r4
                    if (r4 == 0) goto L57
                    java.lang.String r5 = "id"
                    java.lang.String r3 = r3.optString(r5)
                    r7 = -111111(0xfffffffffffe4df9, double:NaN)
                    long r9 = gb.p.b(r7, r3)
                    java.lang.Long r3 = java.lang.Long.valueOf(r9)
                    long r9 = r3.longValue()
                    int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r5 == 0) goto L4f
                    long r7 = r3.longValue()
                    r4.m(r7)
                    android.content.Context r1 = r3
                    r11.Code(r1, r12, r0, r4)
                    goto L57
                L4f:
                    java.lang.String r12 = "invalid id"
                    com.huawei.hms.ads.ex.V(r1, r12)
                    r12 = 4001(0xfa1, float:5.607E-42)
                    goto L59
                L57:
                    r12 = 1000(0x3e8, float:1.401E-42)
                L59:
                    r1 = 3
                    if (r0 != r1) goto L69
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                    r2 = r0
                    goto L69
                L62:
                    java.lang.String r12 = "ad not exist"
                    com.huawei.hms.ads.ex.Code(r1, r12)
                    r12 = 3002(0xbba, float:4.207E-42)
                L69:
                    com.huawei.openalliance.ad.ipc.RemoteCallResultCallback r0 = r4
                    com.huawei.hms.ads.ak r1 = com.huawei.hms.ads.ak.this
                    java.lang.String r1 = r1.Code
                    r3 = 1
                    com.huawei.hms.ads.ag.Code(r0, r1, r12, r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.ak.AnonymousClass1.Code(com.huawei.openalliance.ad.inter.data.AdContentData):void");
            }

            private boolean Code(Context context2, AdContentData adContentData, FeedbackInfo feedbackInfo) {
                ex.V(ak.Z, "click complain");
                if (feedbackInfo == null || context2 == null || adContentData == null) {
                    return false;
                }
                try {
                    Intent intent = new Intent();
                    intent.putExtra("package_name", context2.getPackageName());
                    intent.putExtra("slotid", adContentData.D());
                    intent.putExtra("content_id", adContentData.L());
                    intent.putExtra("apiVer", adContentData.f0());
                    intent.putExtra(com.huawei.openalliance.ad.constant.ba.aw, feedbackInfo.k());
                    intent.setAction(com.huawei.openalliance.ad.constant.w.cN);
                    intent.setPackage(r0.n(context2));
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    gb.u.f(context2, intent);
                } catch (Throwable th) {
                    ex.I(ak.Z, "start ac failed: %s", th.getClass().getSimpleName());
                }
                return true;
            }
        });
    }
}
