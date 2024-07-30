package com.huawei.openalliance.ad.ppskit.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IArSceneView;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.IXrKitFeature;
import com.huawei.featurelayer.sharedfeature.xrkit.sdk.remoteloader.XrKitFeatureFactory;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.handlers.e0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.p1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.v0;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.PPSArView;
import com.vungle.warren.model.Advertisement;
import e0.i;
import j7.r;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import ka.n7;
import ka.p;
import ka.vi;
import la.s;
import la.t;
import la.u;
import va.f;
import va.g;

/* loaded from: classes2.dex */
public class PPSArActivity extends PPSBaseActivity implements f, g {
    public static final String[] G = {"android.permission.CAMERA"};
    public IXrKitFeature A;
    public IArSceneView B;
    public p C;
    public String D;
    public int E;

    /* renamed from: u, reason: collision with root package name */
    public PPSArView f22376u;

    /* renamed from: v, reason: collision with root package name */
    public Context f22377v;

    /* renamed from: w, reason: collision with root package name */
    public Intent f22378w;
    public ContentRecord y;

    /* renamed from: x, reason: collision with root package name */
    public Map<String, String> f22379x = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f22380z = new ArrayList();
    public final a F = new a();

    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }

        public final void a() {
            d2.a(new com.huawei.openalliance.ad.ppskit.activity.b(this));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSArActivity pPSArActivity = PPSArActivity.this;
            ContentRecord contentRecord = pPSArActivity.y;
            n7.e("PPSArActivity", "start to copy ar files");
            boolean z10 = true;
            List<XRInfo> r10 = pPSArActivity.r(true);
            boolean M = n.M(r10);
            a aVar = pPSArActivity.F;
            if (!M) {
                for (XRInfo xRInfo : r10) {
                    ImageInfo k10 = xRInfo.k();
                    if (k10 != null && pPSArActivity.q(xRInfo.q(), true, "xrinfo", 0) && pPSArActivity.q(xRInfo.r(), false, "xrinfo", 1)) {
                        if (pPSArActivity.q(k10, true, "xrinfo" + File.separator + k10.q(), 2)) {
                            List<String> p10 = k10.p();
                            String q10 = k10.q();
                            if (!n.M(p10) && !TextUtils.isEmpty(q10)) {
                                for (String str : p10) {
                                    if (!TextUtils.isEmpty(str)) {
                                        StringBuilder sb2 = new StringBuilder("xrinfo");
                                        String str2 = File.separator;
                                        sb2.append(str2);
                                        sb2.append(str.substring(str.indexOf(q10), str.lastIndexOf(str2)));
                                        String sb3 = sb2.toString();
                                        if (n7.d()) {
                                            n7.c("PPSArActivity", "copy attachment:%s, to subdir:%s", str, sb3);
                                        }
                                        TextUtils.isEmpty(pPSArActivity.l(str, sb3, false));
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (aVar != null) {
                    if (z10) {
                        d2.a(new com.huawei.openalliance.ad.ppskit.activity.a(aVar, contentRecord));
                        return;
                    }
                } else {
                    return;
                }
            }
            aVar.a();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<ContentRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22383a;

        public c(String str) {
            this.f22383a = str;
        }

        @Override // java.util.concurrent.Callable
        public final ContentRecord call() {
            PPSArActivity pPSArActivity = PPSArActivity.this;
            return r.o(pPSArActivity, pPSArActivity.D, this.f22383a, pPSArActivity.f22378w);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ContentRecord f22385s;

        public d(ContentRecord contentRecord) {
            this.f22385s = contentRecord;
        }

        @Override // java.lang.Runnable
        public final void run() {
            new e0(PPSArActivity.this).r(this.f22385s);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        setRequestedOrientation(1);
        z1.q(this, 14);
        setContentView(R.layout.hiad_activity_ar);
        this.f22387s = (ViewGroup) findViewById(R.id.hiad_ar_layout);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public String d() {
        return "PPSArActivity";
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void e() {
        ViewGroup viewGroup = this.f22387s;
        if (viewGroup != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(this.f22387s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:30:0x0096, B:31:0x00a5, B:33:0x00a9), top: B:29:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.activity.PPSArActivity.g():void");
    }

    public final String l(String str, String str2, boolean z10) {
        String trim;
        if (!x.A(str) && !x.A(str2)) {
            try {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(str)) {
                    trim = null;
                } else {
                    trim = str.substring(str.lastIndexOf("/") + 1).trim();
                }
                if (n7.d()) {
                    n7.c("PPSArActivity", "file name:%s", trim);
                }
                String c10 = x.c(this.f22377v, parse, trim, str2);
                if (n7.d()) {
                    n7.c("PPSArActivity", "path:%s", c10);
                }
                if (!TextUtils.isEmpty(c10)) {
                    if (z10) {
                        return Advertisement.FILE_SCHEME + c10;
                    }
                    return c10;
                }
            } catch (Throwable unused) {
                n7.g("PPSArActivity", "copy image error");
            }
            return null;
        }
        n7.e("PPSArActivity", "file name is invalid");
        return null;
    }

    public final void m(String str) {
        if (str.equals("1")) {
            n7.e("PPSArActivity", "onChangeDisplayModel: change to 3D");
            p pVar = this.C;
            if (pVar != null) {
                pVar.u(this.y, this.D, "ar3dOpen");
                return;
            }
            return;
        }
        if (str.equals("2")) {
            n7.e("PPSArActivity", "onChangeDisplayModel: change to AR");
            p pVar2 = this.C;
            if (pVar2 != null) {
                pVar2.u(this.y, this.D, "arCameraOpen");
            }
            String[] strArr = G;
            if (!p1.b(this, strArr)) {
                requestPermissions(strArr, 1);
                return;
            }
            return;
        }
        n7.e("PPSArActivity", "onChangeDisplayModel: other");
    }

    public final void o(Map<String, String> map, ContentRecord contentRecord) {
        String orDefault;
        if (!a0.a.e0(map) && (orDefault = map.getOrDefault("fatsdk_open_ar", null)) != null && y1.o(orDefault, "1")) {
            n7.b("PPSArActivity", "insert fat content");
            p2.a(new t(this), 1);
            p2.a(new u(this), 0);
            p2.a(new d(contentRecord), 0);
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        n7.b("PPSArActivity", "onBackPressed");
        p2.a(new s(this), 0);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        n7.b("PPSArActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        if (this.B != null) {
            n7.e("PPSArActivity", "sceneView destroy");
            this.B.destroy();
        }
        s(true);
        if (this.B != null) {
            n7.e("PPSArActivity", "sceneView resume");
            this.B.resume();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.E = bundle.getInt("cardIndex");
        }
        n7.e("PPSArActivity", "cardIndex:" + this.E);
        try {
            g();
        } catch (Throwable th) {
            i.p(th, "onCreate error:", "PPSArActivity");
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n7.e("PPSArActivity", "onDestroy");
        if (this.B != null) {
            n7.e("PPSArActivity", "sceneView destroy");
            this.B.destroy();
        }
        IXrKitFeature iXrKitFeature = this.A;
        if (iXrKitFeature != null) {
            XrKitFeatureFactory.releaseFeature(iXrKitFeature);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        n7.e("PPSArActivity", "onPause");
        if (this.B != null) {
            n7.e("PPSArActivity", "sceneView pause");
            this.B.pause();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        n7.e("PPSArActivity", "requestCode:" + i10);
        if (1 == i10) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
            n7.e("PPSArActivity", "onRequestPermissionsResult counts: " + strArr.length + ':' + iArr.length);
            boolean z10 = false;
            for (int i11 = 0; i11 < iArr.length; i11++) {
                if (iArr[i11] != 0 && !shouldShowRequestPermissionRationale(strArr[i11])) {
                    z10 = true;
                }
            }
            if (z10) {
                vi viVar = new vi(this);
                viVar.f32037v = this;
                viVar.show();
                n7.e("PPSArActivity", "handlePermissionsRefuse");
            }
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        n7.e("PPSArActivity", "onResume");
        if (this.B != null) {
            n7.e("PPSArActivity", "sceneView resume");
            this.B.resume();
        }
    }

    @Override // com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putInt("cardIndex", this.f22376u.getmCurrentIndex());
        }
    }

    public final void p(boolean z10) {
        Drawable drawable;
        List<XRInfo> r10 = r(z10);
        if (!n.M(r10)) {
            n7.e("PPSArActivity", "size:" + r10.size());
            ArrayList arrayList = this.f22380z;
            arrayList.clear();
            for (int i10 = 0; i10 < r10.size(); i10++) {
                XRInfo xRInfo = r10.get(i10);
                String str = "1";
                na.a aVar = null;
                try {
                    String g6 = xRInfo.k().g();
                    ImageInfo r11 = xRInfo.r();
                    if (r11 != null && !TextUtils.isEmpty(r11.g())) {
                        drawable = (Drawable) v0.d(this, r11.g(), com.anythink.expressad.video.dynview.a.a.f11377aa).first;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = getResources().getDrawable(R.drawable.hiad_default_app_icon);
                    }
                    Drawable drawable2 = drawable;
                    String str2 = "file:///android_asset/ar/sceneBackground.png";
                    ImageInfo q10 = xRInfo.q();
                    if (q10 != null && !TextUtils.isEmpty(q10.g())) {
                        str2 = q10.g();
                    }
                    String str3 = str2;
                    ContentRecord contentRecord = this.y;
                    if (contentRecord != null) {
                        Uri.parse(contentRecord.p3());
                    }
                    na.a aVar2 = new na.a(g6, drawable2, str3, y1.p(xRInfo.u()), y1.p(xRInfo.v()));
                    if (!"1".equals(xRInfo.c())) {
                        str = "0";
                    }
                    aVar2.f = str;
                    aVar = aVar2;
                } catch (Throwable th) {
                    i.p(th, "Exception setCardItem:", "PPSArActivity");
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return;
        }
        n7.g("PPSArActivity", "there is no ar");
    }

    public final boolean q(ImageInfo imageInfo, boolean z10, String str, int i10) {
        if (imageInfo == null) {
            return true;
        }
        String g6 = imageInfo.g();
        if (TextUtils.isEmpty(g6)) {
            return true;
        }
        if (n7.d()) {
            n7.c("PPSArActivity", "try to copy file:%s", g6);
        }
        String l10 = l(g6, str, z10);
        if (TextUtils.isEmpty(l10)) {
            if (i10 == 0) {
                l10 = "file:///android_asset/ar/sceneBackground.png";
            } else {
                if (i10 != 1) {
                    return false;
                }
                l10 = null;
            }
        }
        imageInfo.h(l10);
        return true;
    }

    public final List<XRInfo> r(boolean z10) {
        List<XRInfo> q10;
        String str;
        ContentRecord contentRecord = this.y;
        if (contentRecord == null) {
            str = "there is no adLandingPageData";
        } else if (contentRecord.X1() == null) {
            str = "there is no MetaData";
        } else {
            if (z10) {
                q10 = this.y.z1();
                if (n.M(q10)) {
                    return null;
                }
            } else {
                q10 = this.y.X1().q();
                if (n.M(q10)) {
                    return null;
                }
                i2.k(this.f22377v, q10);
            }
            return q10;
        }
        n7.g("PPSArActivity", str);
        return null;
    }

    public final void s(boolean z10) {
        if (this.f22376u != null) {
            this.f22376u = null;
        }
        this.f22376u = (PPSArView) findViewById(R.id.pps_ar_view);
        this.A = XrKitFeatureFactory.createXrKitFeature(this.f22377v);
        n7.e("PPSArActivity", "create ar sceneView");
        this.B = this.A.createArSceneView(this.f22377v);
        this.f22376u.setOnArViewLitener(this);
        this.f22376u.s(this.y, this.B, this.f22380z, this.E, this.f22379x, z10);
    }
}
