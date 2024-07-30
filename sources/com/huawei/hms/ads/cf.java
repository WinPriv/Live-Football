package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.jg;
import com.huawei.hms.ads.template.downloadbuttonstyle.RemoteButtonStyleAttr;
import com.huawei.hms.ads.template.downloadbuttonstyle.d;
import com.huawei.hms.ads.uiengine.c;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.views.PPSNativeView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class cf extends c.b {

    /* renamed from: l, reason: collision with root package name */
    private Context f21578l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<Context> f21579m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<PPSNativeView> f21580n;
    private AdContentData o;

    /* renamed from: p, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.j f21581p;

    public cf(Context context, PPSNativeView pPSNativeView, com.huawei.openalliance.ad.inter.data.j jVar) {
        AdContentData adContentData;
        this.f21578l = context.getApplicationContext();
        this.f21579m = new WeakReference<>(context);
        this.f21580n = new WeakReference<>(pPSNativeView);
        this.f21581p = jVar;
        if (jVar != null) {
            adContentData = jVar.m();
        } else {
            adContentData = null;
        }
        this.o = adContentData;
    }

    private RemoteButtonStyleAttr Code(Bundle bundle) {
        RemoteButtonStyleAttr remoteButtonStyleAttr = (RemoteButtonStyleAttr) gb.b.o(RemoteButtonStyleAttr.class, bundle.getString(bj.a.V), new Class[0]);
        if (remoteButtonStyleAttr != null) {
            IObjectWrapper binder = bundle.getBinder(bj.a.I);
            if (binder != null) {
                remoteButtonStyleAttr.Code((Drawable) ObjectWrapper.unwrap(binder));
            }
            IObjectWrapper binder2 = bundle.getBinder(bj.a.Z);
            if (binder2 != null) {
                remoteButtonStyleAttr.V((Drawable) ObjectWrapper.unwrap(binder2));
            }
            IObjectWrapper binder3 = bundle.getBinder(bj.a.B);
            if (binder3 != null) {
                remoteButtonStyleAttr.I((Drawable) ObjectWrapper.unwrap(binder3));
            }
            IObjectWrapper binder4 = bundle.getBinder(bj.a.C);
            if (binder4 != null) {
                remoteButtonStyleAttr.Z((Drawable) ObjectWrapper.unwrap(binder4));
            }
            IObjectWrapper binder5 = bundle.getBinder(bj.a.S);
            if (binder5 != null) {
                remoteButtonStyleAttr.B((Drawable) ObjectWrapper.unwrap(binder5));
            }
            IObjectWrapper binder6 = bundle.getBinder(bj.a.F);
            if (binder6 != null) {
                remoteButtonStyleAttr.C((Drawable) ObjectWrapper.unwrap(binder6));
            }
            IObjectWrapper binder7 = bundle.getBinder(bj.a.D);
            if (binder7 != null) {
                remoteButtonStyleAttr.S((Drawable) ObjectWrapper.unwrap(binder7));
            }
            IObjectWrapper binder8 = bundle.getBinder(bj.a.L);
            if (binder8 != null) {
                remoteButtonStyleAttr.F((Drawable) ObjectWrapper.unwrap(binder8));
            }
        }
        return remoteButtonStyleAttr;
    }

    private boolean Z() {
        if (this.f21581p.j_() != 2 && this.f21581p.j_() != 5 && this.f21581p.j_() != 4 && this.f21581p.j_() != 8) {
            return false;
        }
        return true;
    }

    private com.huawei.hms.ads.template.downloadbuttonstyle.a Code(int i10, com.huawei.openalliance.ad.views.AppDownloadButton appDownloadButton, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        ex.Code("NativeProxy", "btnStyle: %s", Integer.valueOf(i10));
        return 1 == i10 ? new d(this.f21578l, appDownloadButton) : 2 == i10 ? new com.huawei.hms.ads.template.downloadbuttonstyle.c(this.f21578l, appDownloadButton) : 3 == i10 ? new com.huawei.hms.ads.template.downloadbuttonstyle.e(this.f21578l, appDownloadButton, remoteButtonStyleAttr) : new com.huawei.hms.ads.template.downloadbuttonstyle.b(this.f21578l, appDownloadButton);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void V(String str, long j10, long j11, int i10, int i11) {
        jh.Code(this.f21578l, this.o, com.huawei.openalliance.ad.constant.ah.f, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11), str);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public boolean V() {
        try {
            boolean booleanValue = ((Boolean) gb.q.a(new Callable<Boolean>() { // from class: com.huawei.hms.ads.cf.1
                @Override // java.util.concurrent.Callable
                /* renamed from: Code, reason: merged with bridge method [inline-methods] */
                public Boolean call() {
                    if (cf.this.o == null) {
                        return Boolean.FALSE;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("apiVer", cf.this.o.f0());
                        jSONObject.put("content_id", cf.this.o.L());
                        jSONObject.put("templateId", cf.this.o.e0());
                        jSONObject.put("slotid", cf.this.o.D());
                    } catch (Throwable th) {
                        ex.V("NativeProxy", "construct json err: %s", th.getClass().getSimpleName());
                    }
                    return Boolean.valueOf(Boolean.TRUE.toString().equals(ha.c.c(cf.this.f21578l).b(String.class, com.huawei.openalliance.ad.constant.s.y, jSONObject.toString(), false).getData()));
                }
            }, Boolean.FALSE)).booleanValue();
            ex.Code("NativeProxy", "result = %s", Boolean.valueOf(booleanValue));
            return booleanValue;
        } catch (Throwable th) {
            ex.V("NativeProxy", "downloadVideos err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    private boolean V(String str) {
        return this.f21581p.w() != null && (this.f21581p.j_() == 4 || this.f21581p.j_() == 8) && !TextUtils.isEmpty(str);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(int i10) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.f21581p;
        if (jVar == null || jVar.w() == null) {
            return;
        }
        if (i10 == 0) {
            ex.V("NativeProxy", " decouple's AIDL: onAdClickSixElementsBtn: DESC");
            Context context = this.f21579m.get();
            if (context == null) {
                ex.V("NativeProxy", "jump context is null.");
                return;
            } else {
                this.f21581p.V(context);
                return;
            }
        }
        if (i10 == 1) {
            ex.V("NativeProxy", " decouple's AIDL: onAdClickSixElementsBtn: Privacy");
            this.f21581p.w().Code(this.f21578l);
        } else {
            if (i10 != 2) {
                return;
            }
            ex.V("NativeProxy", " decouple's AIDL: onAdClickSixElementsBtn: Permission");
            if (!TextUtils.isEmpty(this.f21581p.w().g0())) {
                this.f21581p.w().F(this.f21578l);
                return;
            }
            PPSNativeView pPSNativeView = this.f21580n.get();
            if (pPSNativeView != null) {
                da.m.a(pPSNativeView.getContext(), this.f21581p.w(), null);
            }
        }
    }

    public void Code(long j10) {
        ex.Code("NativeProxy", "updateStartShowTime: %s", Long.valueOf(j10));
        com.huawei.openalliance.ad.inter.data.j jVar = this.f21581p;
        if (jVar != null) {
            jVar.Code(j10);
        }
        AdContentData adContentData = this.o;
        if (adContentData == null) {
            return;
        }
        adContentData.b0(j10);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(long j10, long j11) {
        cz.Code(this.f21578l, this.o, j10, j11);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            PPSNativeView pPSNativeView = this.f21580n.get();
            if (view == null || pPSNativeView == null) {
                return;
            }
            pPSNativeView.showFeedback(view);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(IObjectWrapper iObjectWrapper, int i10) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            PPSNativeView pPSNativeView = this.f21580n.get();
            if (pPSNativeView != null) {
                pPSNativeView.Code(view, i10);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(IObjectWrapper iObjectWrapper, Bundle bundle) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            PPSNativeView pPSNativeView = this.f21580n.get();
            int i10 = bundle.getInt(bj.c.Code);
            MaterialClickInfo materialClickInfo = (MaterialClickInfo) gb.b.o(MaterialClickInfo.class, bundle.getString(bj.c.V), new Class[0]);
            if (pPSNativeView != null) {
                pPSNativeView.setMaterialClickInfo(materialClickInfo);
                pPSNativeView.Code(view, i10);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(IObjectWrapper iObjectWrapper, String str) {
        Code(iObjectWrapper, str, 0, null);
    }

    private void Code(IObjectWrapper iObjectWrapper, String str, int i10, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        if (iObjectWrapper != null) {
            View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
            if (view instanceof com.huawei.openalliance.ad.views.AppDownloadButton) {
                ex.V("NativeProxy", "registerDownloadBtn");
                final com.huawei.openalliance.ad.views.AppDownloadButton appDownloadButton = (com.huawei.openalliance.ad.views.AppDownloadButton) view;
                final PPSNativeView pPSNativeView = this.f21580n.get();
                com.huawei.hms.ads.template.downloadbuttonstyle.a Code = Code(i10, appDownloadButton, remoteButtonStyleAttr);
                if (pPSNativeView != null) {
                    if (!Z()) {
                        if (this.f21581p.j_() != 0) {
                            ex.Code("NativeProxy", "show btn");
                            appDownloadButton.Code(new View.OnClickListener() { // from class: com.huawei.hms.ads.cf.2
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view2) {
                                    PPSNativeView pPSNativeView2 = pPSNativeView;
                                    if (pPSNativeView2 != null) {
                                        pPSNativeView2.Code(appDownloadButton, 1);
                                    }
                                }
                            });
                            Code.Code(str);
                            appDownloadButton.I();
                            return;
                        }
                        view.setVisibility(8);
                    }
                    if (pPSNativeView.Code((js) appDownloadButton)) {
                        ex.Code("NativeProxy", "register succ");
                        if (V(str)) {
                            appDownloadButton.setAfDlBtnText(str);
                        }
                        appDownloadButton.setNeedAppendProgress(true);
                        Code.Code(this.f21578l);
                        appDownloadButton.I();
                        return;
                    }
                    view.setVisibility(8);
                }
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(IObjectWrapper iObjectWrapper, String str, Bundle bundle) {
        int i10 = bundle.getInt(bj.a.Code);
        if (3 == i10) {
            RemoteButtonStyleAttr Code = Code(bundle);
            if (Code != null) {
                Code(iObjectWrapper, str, i10, Code);
                return;
            }
            i10 = 2;
        }
        Code(iObjectWrapper, str, i10, null);
    }

    public void Code(String str) {
        ex.Code("NativeProxy", "updateContent: %s", str);
        com.huawei.openalliance.ad.inter.data.j jVar = this.f21581p;
        if (jVar != null) {
            jVar.l(str);
        }
        AdContentData adContentData = this.o;
        if (adContentData == null) {
            return;
        }
        adContentData.y(str);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(String str, int i10) {
        PPSNativeView pPSNativeView = this.f21580n.get();
        if (!com.huawei.openalliance.ad.constant.ah.f22018e.equals(str)) {
            if (pPSNativeView != null) {
                pPSNativeView.Code(Integer.valueOf(i10), false);
                return;
            }
            return;
        }
        jg.a aVar = new jg.a();
        aVar.V(Integer.valueOf(i10));
        String c10 = gb.u.c(pPSNativeView);
        com.huawei.openalliance.ad.inter.data.j jVar = this.f21581p;
        if (jVar != null) {
            ex.Code("NativeProxy", "slotId: %s, contentId: %s, slot pos: %s", jVar.n(), this.f21581p.L(), c10);
        }
        if (!gb.p.f(c10)) {
            aVar.I(c10);
        }
        if (pPSNativeView != null) {
            aVar.Code(a0.a.l(pPSNativeView));
        }
        jh.Code(this.f21578l, this.o, aVar.Code(), com.huawei.openalliance.ad.constant.ah.f22018e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x003e. Please report as an issue. */
    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(String str, long j10, long j11, int i10, int i11) {
        Context context;
        AdContentData adContentData;
        String str2;
        Context context2;
        AdContentData adContentData2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1891923166:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.C)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1888605810:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.B)) {
                    c10 = 1;
                    break;
                }
                break;
            case -493598457:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.Z)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540819073:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.S)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                context = this.f21578l;
                adContentData = this.o;
                str2 = com.huawei.openalliance.ad.constant.ah.C;
                jh.Code(context, adContentData, str2, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            case 1:
                context2 = this.f21578l;
                adContentData2 = this.o;
                str3 = com.huawei.openalliance.ad.constant.ah.B;
                jh.Code(context2, adContentData2, str3, (Long) null, (Long) null, (Integer) null, (Integer) null);
                return;
            case 2:
                context = this.f21578l;
                adContentData = this.o;
                str2 = com.huawei.openalliance.ad.constant.ah.Z;
                jh.Code(context, adContentData, str2, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            case 3:
                context2 = this.f21578l;
                adContentData2 = this.o;
                str3 = com.huawei.openalliance.ad.constant.ah.S;
                jh.Code(context2, adContentData2, str3, (Long) null, (Long) null, (Integer) null, (Integer) null);
                return;
            default:
                return;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public void Code(boolean z10) {
        jh.Code(this.f21578l, this.o, z10);
    }

    @Override // com.huawei.hms.ads.uiengine.c
    public boolean Code() {
        return this.f21581p.A;
    }
}
