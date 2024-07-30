package com.huawei.hms.ads;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class im extends ib<kh> implements iz<kh> {
    public im(Context context, kh khVar) {
        Code((im) khVar);
        ((ib) this).V = context != null ? context.getApplicationContext() : context;
    }

    @Override // com.huawei.hms.ads.ib
    public String C() {
        return "PlacementVideoViewPresenter_" + hashCode();
    }

    @Override // com.huawei.hms.ads.iz
    public void Code(com.huawei.openalliance.ad.inter.data.k kVar) {
        this.Code = kVar != null ? kVar.m() : null;
    }

    @Override // com.huawei.hms.ads.iz
    public void Code(final com.huawei.openalliance.ad.inter.data.l lVar) {
        if (lVar == null) {
            return;
        }
        ex.V(C(), "checkVideoHash");
        c0.c(new Runnable() { // from class: com.huawei.hms.ads.im.1
            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                final boolean k10 = lVar.k();
                String str = lVar.f22283t;
                if (!TextUtils.isEmpty(str) && str.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
                    runnable = new Runnable() { // from class: com.huawei.hms.ads.im.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ex.V(im.this.C(), "video is cached.");
                            ((kh) im.this.I()).Code(lVar, k10);
                        }
                    };
                } else {
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22075z, lVar.f22283t);
                            ha.i.e(((ib) im.this).V).d(com.huawei.openalliance.ad.constant.s.f22113h, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.im.1.2
                                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                                public void onRemoteCallResult(String str2, CallResult<String> callResult) {
                                    String data = callResult.getData();
                                    if (!TextUtils.isEmpty(data) && data.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
                                        ex.V(im.this.C(), "got video cached url");
                                        lVar.B = data;
                                    }
                                }
                            }, String.class);
                            runnable = new Runnable() { // from class: com.huawei.hms.ads.im.1.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    ex.Code(im.this.C(), "video path: %s", lVar.p());
                                    ((kh) im.this.I()).Code(lVar, k10);
                                }
                            };
                        } catch (JSONException unused) {
                            ex.Code(im.this.C(), "check video cache jsonEx");
                            runnable = new Runnable() { // from class: com.huawei.hms.ads.im.1.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    ex.Code(im.this.C(), "video path: %s", lVar.p());
                                    ((kh) im.this.I()).Code(lVar, k10);
                                }
                            };
                        }
                    } catch (Throwable th) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.im.1.3
                            @Override // java.lang.Runnable
                            public void run() {
                                ex.Code(im.this.C(), "video path: %s", lVar.p());
                                ((kh) im.this.I()).Code(lVar, k10);
                            }
                        });
                        throw th;
                    }
                }
                gb.w.b(runnable);
                com.huawei.openalliance.ad.inter.data.l lVar2 = lVar;
                if (2 == lVar2.f22288z || lVar2.k()) {
                    gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.im.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ((kh) im.this.I()).Code(lVar, true);
                        }
                    });
                }
            }
        });
    }
}
