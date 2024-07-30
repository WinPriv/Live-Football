package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ij extends ig<kb> implements iv {

    /* renamed from: com.huawei.hms.ads.ij$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ String Code;

        public AnonymousClass1(String str) {
            this.Code = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22075z, this.Code);
                ha.i.e(((ig) ij.this).V).d(com.huawei.openalliance.ad.constant.s.f22113h, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.ij.1.1
                    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                    public void onRemoteCallResult(String str, CallResult<String> callResult) {
                        final String data = callResult.getData();
                        if (!TextUtils.isEmpty(data) && data.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
                            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ij.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((kb) ij.this.I()).Code(data);
                                }
                            });
                        }
                    }
                }, String.class);
            } catch (JSONException unused) {
                ex.Code("PPSVideoViewPresenter", "check video cache jsonEx");
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ij.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((kb) ij.this.I()).Code(AnonymousClass1.this.Code);
                    }
                });
            }
        }
    }

    public ij(Context context, kb kbVar) {
        super(context, kbVar);
    }

    @Override // com.huawei.hms.ads.iv
    public void Code(long j10, long j11, long j12, long j13) {
        jh.Code(((ig) this).V, this.Code, com.huawei.openalliance.ad.constant.ah.Z, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf((int) j12), Integer.valueOf((int) j13));
    }

    @Override // com.huawei.hms.ads.iv
    public void S() {
        jh.Code(((ig) this).V, this.Code, com.huawei.openalliance.ad.constant.ah.B, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    @Override // com.huawei.hms.ads.ig
    public void V(String str) {
        ((kb) I()).B();
        ex.V("PPSVideoViewPresenter", "onMaterialLoaded - begin to load video");
        if (!TextUtils.isEmpty(str) && str.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
            ex.V("PPSVideoViewPresenter", "video is cached.");
            ((kb) I()).Code(str);
        } else {
            ex.V("PPSVideoViewPresenter", "check if video cached.");
            c0.c(new AnonymousClass1(str));
        }
    }

    @Override // com.huawei.hms.ads.iv
    public void Code(boolean z10) {
        AdEventReport Code = jh.Code(this.Code);
        Code.y(z10);
        ha.i.e(((ig) this).V).d(com.huawei.openalliance.ad.constant.s.f22114i, gb.b.p(Code), null, null);
    }
}
