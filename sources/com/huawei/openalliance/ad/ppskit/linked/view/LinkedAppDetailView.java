package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import com.huawei.openalliance.ad.ppskit.views.c1;
import com.huawei.openalliance.ad.ppskit.views.e1;
import com.huawei.openalliance.ad.ppskit.views.f1;
import ka.Cif;
import ka.n7;
import ka.v;
import ka.xi;

/* loaded from: classes2.dex */
public class LinkedAppDetailView extends RelativeLayout {
    public v A;
    public boolean B;
    public xi C;
    public va.b D;
    public boolean E;
    public String F;
    public View.OnClickListener G;

    /* renamed from: s, reason: collision with root package name */
    public Context f22652s;

    /* renamed from: t, reason: collision with root package name */
    public AppDownloadButton f22653t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f22654u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f22655v;

    /* renamed from: w, reason: collision with root package name */
    public AppInfo f22656w;

    /* renamed from: x, reason: collision with root package name */
    public l f22657x;
    public ContentRecord y;

    /* renamed from: z, reason: collision with root package name */
    public View f22658z;

    /* loaded from: classes2.dex */
    public class a implements AppDownloadButton.k {
        public a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.k
        public final void a(AppStatus appStatus) {
            LinkedAppDetailView.this.setCancelDownloadButtonVisibility(appStatus);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements AppDownloadButton.i {
        public b() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.i
        public final CharSequence a(String str) {
            LinkedAppDetailView linkedAppDetailView = LinkedAppDetailView.this;
            if (!linkedAppDetailView.B) {
                return linkedAppDetailView.f22652s.getString(R.string.hiad_download_open);
            }
            return str;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements AppDownloadButton.l {
        public c() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.l
        public final boolean a() {
            boolean z10;
            LinkedAppDetailView linkedAppDetailView = LinkedAppDetailView.this;
            va.b bVar = linkedAppDetailView.D;
            if (bVar != null) {
                z10 = PPSRewardActivity.this.C;
            } else {
                z10 = false;
            }
            if (z10) {
                linkedAppDetailView.f22653t.setAllowedNonWifiNetwork(true);
                return true;
            }
            linkedAppDetailView.f22653t.m();
            return false;
        }
    }

    public LinkedAppDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.B = true;
        this.E = false;
        try {
            this.f22652s = context;
            this.f22657x = l.d(context);
            this.A = new v(context);
            ViewConfiguration.get(context).getScaledTouchSlop();
            this.f22658z = View.inflate(context, R.layout.hiad_linked_app_detail, this);
            this.f22654u = (TextView) findViewById(R.id.linked_app_name);
            this.f22655v = (ImageView) findViewById(R.id.linked_app_icon);
            this.f22653t = (AppDownloadButton) findViewById(R.id.linked_app_download_btn);
            if (d0.v(context)) {
                this.f22654u.setTextSize(1, 24.0f);
            }
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            n7.g("LinkedPPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "init error";
            n7.g("LinkedPPSAppDetailView", str);
        }
    }

    public final void b() {
        AppDownloadButton appDownloadButton;
        c1 e1Var;
        String appName = this.f22656w.getAppName();
        int i10 = 0;
        n7.c("LinkedPPSAppDetailView", "appName is %s", appName);
        TextView textView = this.f22654u;
        if (!TextUtils.isEmpty(appName)) {
            textView.setText(appName);
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        ImageView imageView = this.f22655v;
        String iconUrl = this.f22656w.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl) && imageView != null) {
            n7.e("LinkedPPSAppDetailView", "load app icon:" + y1.j(iconUrl));
            p2.c(new wa.b(this, iconUrl, imageView));
        }
        this.f22653t.setContentRecord(this.y);
        this.f22653t.setSource(11);
        this.f22653t.setLinkedCoverClickListener(this.G);
        if (this.B) {
            this.f22653t.setClickActionListener(new wa.a(this));
        }
        this.f22653t.setNeedShowPermision(this.E);
        if (Cif.a(this.f22652s).g()) {
            appDownloadButton = this.f22653t;
            e1Var = new f1(this.f22652s);
        } else {
            appDownloadButton = this.f22653t;
            e1Var = new e1(this.f22652s);
        }
        appDownloadButton.setAppDownloadButtonStyle(e1Var);
        this.f22653t.setOnDownloadStatusChangedListener(new a());
        this.f22653t.setButtonTextWatcher(new b());
        this.f22653t.setOnNonWifiDownloadListener(new c());
        this.f22653t.setSource(11);
        setCancelDownloadButtonVisibility(this.f22653t.l());
    }

    public AppDownloadButton getAppDownloadButton() {
        return this.f22653t;
    }

    public void setAdLandingData(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            return;
        }
        try {
            n7.e("LinkedPPSAppDetailView", "set ad landing data");
            this.y = contentRecord;
            this.f22656w = contentRecord.j0();
            String h12 = contentRecord.h1();
            this.F = h12;
            this.f22653t.setCallerPackageName(h12);
            if (this.f22656w == null) {
                n7.b("LinkedPPSAppDetailView", "appInfo is null, hide appDetailView");
                this.f22658z.setVisibility(8);
            } else {
                b();
            }
        } catch (RuntimeException unused) {
            str = "setAdLandingPageData RuntimeException";
            n7.g("LinkedPPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageData error";
            n7.g("LinkedPPSAppDetailView", str);
        }
    }

    public void setAppDetailClickListener(xi xiVar) {
        this.C = xiVar;
    }

    public void setAppRelated(boolean z10) {
        this.B = z10;
        AppDownloadButton appDownloadButton = this.f22653t;
        if (appDownloadButton != null) {
            appDownloadButton.setClickable(false);
        }
    }

    public void setNeedPerBeforDownload(boolean z10) {
        this.E = z10;
    }

    public void setOnNonWifiDownloadListener(va.b bVar) {
        this.D = bVar;
    }

    public void setVideoCoverClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancelDownloadButtonVisibility(AppStatus appStatus) {
    }
}
