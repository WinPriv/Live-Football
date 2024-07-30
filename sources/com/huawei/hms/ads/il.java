package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import gb.m;
import gb.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class il extends fz<kd> implements iy<kd> {
    private Context I;

    public il(Context context, kd kdVar) {
        Code((il) kdVar);
        this.I = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(final com.huawei.openalliance.ad.inter.data.l lVar) {
        if (lVar == null) {
            return;
        }
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(lVar.p());
        sourceParam.b();
        sourceParam.k(lVar.f22286w);
        sourceParam.l(lVar.k());
        sourceParam.h();
        w0.e(this.I, sourceParam, new gb.j() { // from class: com.huawei.hms.ads.il.3
            @Override // gb.j
            public void Code() {
                ex.I("PlacementImageViewPresenter", "placement image load failed");
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.il.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        il.this.I().Code(null, null);
                    }
                });
            }

            @Override // gb.j
            public void Code(String str, final Drawable drawable) {
                com.huawei.openalliance.ad.inter.data.l lVar2 = lVar;
                if (lVar2 == null || !TextUtils.equals(str, lVar2.p())) {
                    return;
                }
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.il.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        il.this.I().Code(lVar, drawable);
                    }
                });
            }
        });
    }

    @Override // com.huawei.hms.ads.iy
    public void Code(final com.huawei.openalliance.ad.inter.data.k kVar) {
        final com.huawei.openalliance.ad.inter.data.l S;
        if (kVar == null || (S = kVar.S()) == null) {
            return;
        }
        String str = S.f22283t;
        if (str == null) {
            Code((com.huawei.openalliance.ad.inter.data.l) null);
        } else if (str.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
            Code(str, S);
        } else {
            c0.d(new Runnable() { // from class: com.huawei.hms.ads.il.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z10;
                    Integer num;
                    Integer num2;
                    SourceParam sourceParam = new SourceParam();
                    sourceParam.i(S.f22283t);
                    sourceParam.k(S.f22286w);
                    sourceParam.e("placement");
                    if (S.y == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sourceParam.l(z10);
                    sourceParam.h();
                    gb.m b10 = gb.m.b(il.this.I);
                    synchronized (b10.f28595b) {
                        b10.g();
                        m.b bVar = b10.f28596c;
                        num = null;
                        if (bVar != null && (num2 = bVar.C) != null) {
                            num = num2;
                        }
                    }
                    if (num != null) {
                        sourceParam.j(num.intValue());
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("content_id", kVar.L());
                        jSONObject.put("slotid", kVar.n());
                        jSONObject.put("content", gb.b.p(sourceParam));
                        ha.i.e(il.this.I).d(com.huawei.openalliance.ad.constant.s.L, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.il.2.1
                            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                            public void onRemoteCallResult(String str2, CallResult<String> callResult) {
                                String data = callResult.getData();
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                il.this.Code(data, S);
                            }
                        }, String.class);
                    } catch (JSONException unused) {
                        ex.I("PlacementImageViewPresenter", "loadImageInfo jsonex");
                    }
                }
            });
        }
    }

    public void Code(final com.huawei.openalliance.ad.inter.data.l lVar) {
        if (lVar == null) {
            I().Code(null, null);
        } else {
            c0.c(new Runnable() { // from class: com.huawei.hms.ads.il.1
                @Override // java.lang.Runnable
                public void run() {
                    if (lVar.k()) {
                        il.this.V(lVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(String str, com.huawei.openalliance.ad.inter.data.l lVar) {
        if (str == null) {
            Code((com.huawei.openalliance.ad.inter.data.l) null);
        } else {
            lVar.B = str;
            Code(lVar);
        }
    }
}
