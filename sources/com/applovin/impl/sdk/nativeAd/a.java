package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import java.io.File;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f19046a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdImpl f19047b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0220a f19048c;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0220a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, InterfaceC0220a interfaceC0220a) {
        super("TaskCacheNativeAd", pVar);
        this.f19046a = new com.applovin.impl.sdk.d.e();
        this.f19047b = appLovinNativeAdImpl;
        this.f19048c = interfaceC0220a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Attempting to cache resource: " + uri);
        }
        String a10 = this.f.W().a(f(), uri.toString(), this.f19047b.getCachePrefix(), Collections.emptyList(), false, true, this.f19046a);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f.W().a(a10, f());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    return fromFile;
                }
                if (y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to extract Uri from image file");
                }
            } else if (y.a()) {
                this.f18839h.e(this.f18838g, "Unable to retrieve File from cached image filename = " + a10);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Begin caching ad #" + this.f19047b.getAdIdNumber() + "...");
        }
        Uri a10 = a(this.f19047b.getIconUri());
        if (a10 != null) {
            this.f19047b.setIconUri(a10);
        }
        Uri a11 = a(this.f19047b.getMainImageUri());
        if (a11 != null) {
            this.f19047b.setMainImageUri(a11);
        }
        Uri a12 = a(this.f19047b.getPrivacyIconUri());
        if (a12 != null) {
            this.f19047b.setPrivacyIconUri(a12);
        }
        if (y.a()) {
            this.f18839h.b(this.f18838g, "Finished caching ad #" + this.f19047b.getAdIdNumber());
        }
        this.f19048c.a(this.f19047b);
    }
}
