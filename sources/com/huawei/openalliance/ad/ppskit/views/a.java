package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.d2;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppDownloadButton f23387s;

    /* renamed from: com.huawei.openalliance.ad.ppskit.views.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0299a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AppLocalDownloadTask f23388s;

        public RunnableC0299a(AppLocalDownloadTask appLocalDownloadTask) {
            this.f23388s = appLocalDownloadTask;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            AppDownloadButton appDownloadButton = aVar.f23387s;
            int i10 = AppDownloadButton.f23084o0;
            appDownloadButton.k(this.f23388s);
            aVar.getClass();
        }
    }

    public a(AppDownloadButton appDownloadButton) {
        this.f23387s = appDownloadButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = AppDownloadButton.f23084o0;
        d2.a(new RunnableC0299a(this.f23387s.o()));
    }
}
