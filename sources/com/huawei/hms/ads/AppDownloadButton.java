package com.huawei.hms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hms.ads.AppDownloadButtonStyle;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.s;

@GlobalApi
/* loaded from: classes2.dex */
public class AppDownloadButton extends com.huawei.openalliance.ad.views.AppDownloadButton implements IAppDownloadButton, AppDownloadButton.q, AppDownloadButton.r {
    private OnNonWifiDownloadListener B;
    private OnDownloadStatusChangedListener I;

    /* renamed from: com.huawei.hms.ads.AppDownloadButton$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[da.n.values().length];
            Code = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Code[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Code[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Code[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Code[9] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Code[10] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Code[0] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @GlobalApi
    /* loaded from: classes2.dex */
    public interface OnDownloadStatusChangedListener {
        void onStatusChanged(AppDownloadStatus appDownloadStatus);

        void onUserCancel(String str, String str2);
    }

    @GlobalApi
    /* loaded from: classes2.dex */
    public interface OnNonWifiDownloadListener {
        boolean onNonWifiDownload(long j10);
    }

    /* loaded from: classes2.dex */
    public class a extends com.huawei.openalliance.ad.views.s {
        private AppDownloadButtonStyle C;
        private s.b S;

        public a(Context context, AppDownloadButtonStyle appDownloadButtonStyle) {
            super(context);
            this.S = new s.b();
            this.C = appDownloadButtonStyle;
            Code(this.V, appDownloadButtonStyle.normalStyle);
            Code(this.I, this.C.processingStyle);
            Code(this.Z, this.C.installingStyle);
        }

        @Override // com.huawei.openalliance.ad.views.s
        public s.b Code(Context context, da.n nVar) {
            AppDownloadButtonStyle.Style style = this.C.getStyle(context, AppDownloadButton.this.I(nVar));
            AppDownloadButtonStyle appDownloadButtonStyle = this.C;
            if (style == appDownloadButtonStyle.processingStyle) {
                return this.I;
            }
            if (style == appDownloadButtonStyle.installingStyle) {
                return this.Z;
            }
            if (style == appDownloadButtonStyle.normalStyle) {
                return this.V;
            }
            Code(this.S, style);
            return this.S;
        }

        private void Code(s.b bVar, AppDownloadButtonStyle.Style style) {
            bVar.f24156a = style.getBackground();
            bVar.f24157b = style.getTextColor();
            style.getTextSize();
            style.getTypeface();
        }
    }

    @GlobalApi
    public AppDownloadButton(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AppDownloadStatus I(da.n nVar) {
        if (nVar == null) {
            return AppDownloadStatus.DOWNLOAD;
        }
        switch (AnonymousClass1.Code[nVar.ordinal()]) {
            case 1:
                return AppDownloadStatus.WAITING;
            case 2:
                return AppDownloadStatus.DOWNLOADING;
            case 3:
                return AppDownloadStatus.PAUSE;
            case 4:
                return AppDownloadStatus.RESUME;
            case 5:
                return AppDownloadStatus.DOWNLOADED;
            case 6:
                return AppDownloadStatus.DOWNLOADFAILED;
            case 7:
                return AppDownloadStatus.INSTALLING;
            case 8:
                return AppDownloadStatus.INSTALL;
            case 9:
                return AppDownloadStatus.INSTALLED;
            default:
                return AppDownloadStatus.DOWNLOAD;
        }
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton, com.huawei.hms.ads.js, com.huawei.hms.ads.IAppDownloadButton
    public void cancel() {
        super.cancel();
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton, com.huawei.hms.ads.IAppDownloadButton
    public void continueDownload() {
        super.continueDownload();
    }

    @Override // com.huawei.hms.ads.IAppDownloadButton
    public AppDownloadStatus refreshAppStatus() {
        return I(super.I());
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton, com.huawei.hms.ads.IAppDownloadButton
    public void setAllowedNonWifiNetwork(boolean z10) {
        super.setAllowedNonWifiNetwork(z10);
    }

    @Override // com.huawei.hms.ads.IAppDownloadButton
    public void setAppDownloadButtonStyle(AppDownloadButtonStyle appDownloadButtonStyle) {
        if (appDownloadButtonStyle != null) {
            super.setAppDownloadButtonStyle(new a(getContext(), appDownloadButtonStyle));
        }
    }

    @Override // com.huawei.hms.ads.IAppDownloadButton
    public void setOnDownloadStatusChangedListener(OnDownloadStatusChangedListener onDownloadStatusChangedListener) {
        if (onDownloadStatusChangedListener != null) {
            this.I = onDownloadStatusChangedListener;
            super.setOnDownloadStatusChangedListener(this);
        }
    }

    @Override // com.huawei.hms.ads.IAppDownloadButton
    public void setOnNonWifiDownloadListener(OnNonWifiDownloadListener onNonWifiDownloadListener) {
        if (onNonWifiDownloadListener != null) {
            this.B = onNonWifiDownloadListener;
            super.setOnNonWifiDownloadListener(this);
        }
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton, com.huawei.hms.ads.IAppDownloadButton
    public void setShowPermissionDialog(boolean z10) {
        super.setShowPermissionDialog(z10);
    }

    @GlobalApi
    public AppDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton.q
    public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        OnDownloadStatusChangedListener onDownloadStatusChangedListener = this.I;
        if (onDownloadStatusChangedListener == null || appInfo == null) {
            return;
        }
        onDownloadStatusChangedListener.onUserCancel(appInfo.q(), appInfo.U());
    }

    @GlobalApi
    public AppDownloadButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton.q
    public void Code(da.n nVar) {
        OnDownloadStatusChangedListener onDownloadStatusChangedListener = this.I;
        if (onDownloadStatusChangedListener != null) {
            onDownloadStatusChangedListener.onStatusChanged(I(nVar));
        }
    }

    @GlobalApi
    public AppDownloadButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // com.huawei.openalliance.ad.views.AppDownloadButton.r
    public boolean Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, long j10) {
        OnNonWifiDownloadListener onNonWifiDownloadListener = this.B;
        if (onNonWifiDownloadListener != null) {
            return onNonWifiDownloadListener.onNonWifiDownload(j10);
        }
        return false;
    }
}
