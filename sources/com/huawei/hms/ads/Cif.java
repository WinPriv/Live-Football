package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import gb.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.ads.if, reason: invalid class name */
/* loaded from: classes2.dex */
public class Cif extends ib<jt> implements is<jt> {
    public Cif(Context context, jt jtVar) {
        Code((Cif) jtVar);
        ((ib) this).V = context;
    }

    private void V(final com.huawei.openalliance.ad.inter.data.h hVar) {
        String str;
        String str2;
        if (hVar == null) {
            return;
        }
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(hVar.f22260s);
        sourceParam.b();
        sourceParam.k(hVar.f22263v);
        sourceParam.l(hVar.f22264w);
        sourceParam.h();
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            str = adContentData.L();
            str2 = this.Code.D();
        } else {
            str = null;
            str2 = null;
        }
        w0.f(((ib) this).V, sourceParam, new gb.j() { // from class: com.huawei.hms.ads.if.2
            @Override // gb.j
            public void Code() {
                ex.I("NativeVideoP", "cover image load fail");
            }

            @Override // gb.j
            public void Code(String str3, final Drawable drawable) {
                com.huawei.openalliance.ad.inter.data.h hVar2 = hVar;
                if (hVar2 == null || !TextUtils.equals(str3, hVar2.f22260s)) {
                    return;
                }
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.if.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((jt) Cif.this.I()).Code(hVar, drawable);
                    }
                });
            }
        }, str, str2);
    }

    @Override // com.huawei.hms.ads.ib
    public String C() {
        return "NativeVideoP";
    }

    @Override // com.huawei.hms.ads.is
    public void Code(com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar == null) {
            return;
        }
        V(hVar);
    }

    @Override // com.huawei.hms.ads.is
    public void Code(com.huawei.openalliance.ad.inter.data.j jVar) {
        this.Code = jVar != null ? jVar.m() : null;
    }

    @Override // com.huawei.hms.ads.is
    public void Code(final com.huawei.openalliance.ad.inter.data.p pVar) {
        String str;
        if (pVar == null) {
            return;
        }
        final boolean z10 = true;
        if (2 != pVar.A && !pVar.E && ((str = pVar.f22303s) == null || !str.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString()))) {
            z10 = false;
        }
        String str2 = pVar.f22303s;
        if (TextUtils.isEmpty(str2) || !str2.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
            ex.V("NativeVideoP", "check if video cached.");
            c0.c(new Runnable() { // from class: com.huawei.hms.ads.if.1
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnable;
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22075z, pVar.f22303s);
                            ha.i.e(((ib) Cif.this).V).d(com.huawei.openalliance.ad.constant.s.f22113h, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.hms.ads.if.1.1
                                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                                public void onRemoteCallResult(String str3, CallResult<String> callResult) {
                                    String data = callResult.getData();
                                    if (!TextUtils.isEmpty(data) && data.startsWith(com.huawei.openalliance.ad.constant.bw.CONTENT.toString())) {
                                        pVar.f22303s = data;
                                    }
                                }
                            }, String.class);
                            runnable = new Runnable() { // from class: com.huawei.hms.ads.if.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ex.Code("NativeVideoP", "video path: %s", pVar.f22303s);
                                    jt jtVar = (jt) Cif.this.I();
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    jtVar.Code(pVar, z10);
                                }
                            };
                        } catch (JSONException unused) {
                            ex.Code("NativeVideoP", "check video cache jsonEx");
                            runnable = new Runnable() { // from class: com.huawei.hms.ads.if.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ex.Code("NativeVideoP", "video path: %s", pVar.f22303s);
                                    jt jtVar = (jt) Cif.this.I();
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    jtVar.Code(pVar, z10);
                                }
                            };
                        }
                        gb.w.b(runnable);
                    } catch (Throwable th) {
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.if.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ex.Code("NativeVideoP", "video path: %s", pVar.f22303s);
                                jt jtVar = (jt) Cif.this.I();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                jtVar.Code(pVar, z10);
                            }
                        });
                        throw th;
                    }
                }
            });
        } else {
            ex.V("NativeVideoP", "video is cached.");
            ((jt) I()).Code(pVar, z10);
        }
    }

    @Override // com.huawei.hms.ads.is
    public void Code(boolean z10) {
        jh.Code(((ib) this).V, this.Code, z10);
    }
}
