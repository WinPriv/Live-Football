package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c extends a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f18844a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinAdLoadListener f18845b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.v f18846c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<Character> f18847d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f18848e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18849i;

    public c(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, pVar);
        if (eVar != null) {
            this.f18844a = eVar;
            this.f18845b = appLovinAdLoadListener;
            this.f18846c = pVar.W();
            this.f18847d = j();
            this.f18848e = new com.applovin.impl.sdk.d.e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f.a(com.applovin.impl.sdk.c.b.bz)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    public boolean b() {
        return this.f18849i;
    }

    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Caching mute images...");
        }
        Uri a10 = a(this.f18844a.aE(), "mute");
        if (a10 != null) {
            this.f18844a.e(a10);
        }
        Uri a11 = a(this.f18844a.aF(), "unmute");
        if (a11 != null) {
            this.f18844a.f(a11);
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Ad updated with muteImageFilename = " + this.f18844a.aE() + ", unmuteImageFilename = " + this.f18844a.aF());
        }
    }

    public void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f18845b;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f18845b = null;
        }
    }

    public void i() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Rendered new ad:" + this.f18844a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f18845b != null) {
                    c.this.f18845b.adReceived(c.this.f18844a);
                    c.this.f18845b = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f18844a.M()) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Subscribing to timeout events...");
            }
            this.f.ar().a(this);
        }
    }

    public Uri b(String str) {
        return b(str, this.f18844a.I(), true);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.g().equalsIgnoreCase(this.f18844a.N())) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.e(this.f18838g, "Updating flag for timeout...");
            }
            this.f18849i = true;
        }
        this.f.ar().b(this);
    }

    public Uri b(String str, List<String> list, boolean z10) {
        try {
            String a10 = this.f18846c.a(f(), str, this.f18844a.L(), list, z10, this.f18844a.shouldUrlEncodeResourcePath(), this.f18848e);
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f18846c.a(a10, f());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f18839h.e(this.f18838g, "Unable to extract Uri from image file");
                    }
                } else if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "Unable to retrieve File from cached image filename = " + a10);
                }
            }
            return null;
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f18839h.b(this.f18838g, "Failed to cache image at url = " + str, th);
            return null;
        }
    }

    public void a() {
        this.f.ar().b(this);
    }

    public String c(String str, List<String> list, boolean z10) {
        Throwable th;
        InputStream inputStream;
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, "Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = Utils.getFileName(parse);
            if (z10) {
                fileName = StringUtils.encodeUriString(fileName);
            }
            int intValue = ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bE)).intValue();
            int length = StringUtils.emptyIfNull(this.f18844a.L()).length() + StringUtils.emptyIfNull(fileName).length();
            if (length > intValue && StringUtils.isValidString(fileName)) {
                fileName = fileName.substring(length - intValue);
            }
            if (StringUtils.isValidString(this.f18844a.L())) {
                fileName = this.f18844a.L() + fileName;
            }
            try {
                File a10 = this.f18846c.a(fileName, f());
                if (a10 != null && a10.exists()) {
                    return this.f18846c.a(a10);
                }
                try {
                    inputStream = this.f18846c.a(str, list, true, this.f18848e);
                    if (inputStream != null) {
                        try {
                            this.f18846c.b(inputStream, a10);
                        } catch (Throwable th2) {
                            th = th2;
                            Utils.close(inputStream, this.f);
                            throw th;
                        }
                    }
                    Utils.close(inputStream, this.f);
                    return this.f18846c.a(a10);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, a3.k.l("Resource at ", str, " failed to load."), th4);
                }
            }
        }
        return null;
    }

    public Uri a(String str) {
        return a(str, this.f18844a.I(), true);
    }

    public Uri a(String str, List<String> list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Caching video " + str + "...");
        }
        String a10 = this.f18846c.a(f(), str, this.f18844a.L(), list, z10, this.f18844a.shouldUrlEncodeResourcePath(), this.f18848e);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f18846c.a(a10, f());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f18839h.b(this.f18838g, "Finish caching video for ad #" + this.f18844a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                    }
                    return fromFile;
                }
                if (!com.applovin.impl.sdk.y.a()) {
                    return null;
                }
                this.f18839h.e(this.f18838g, "Unable to create URI from cached video file = " + a11);
                return null;
            }
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.f18839h.e(this.f18838g, "Unable to cache video = " + str + "Video file was missing or null");
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Failed to cache video");
        }
        h();
        return null;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "No " + str + " image to cache");
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Caching " + str + " image...");
        }
        return b(uri2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r13, java.util.List<java.lang.String> r14, com.applovin.impl.sdk.ad.e r15) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.e):java.lang.String");
    }

    public String c(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.applovin.impl.sdk.network.c a10 = com.applovin.impl.sdk.network.c.a(this.f).a(str).b("GET").a((c.a) "").a(0).a();
        final AtomicReference atomicReference = new AtomicReference(null);
        this.f.O().a(a10, new b.a(), new b.c<String>() { // from class: com.applovin.impl.sdk.e.c.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(String str2, int i10) {
                atomicReference.set(str2);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str2, String str3) {
                com.applovin.impl.sdk.y yVar = c.this.f18839h;
                if (com.applovin.impl.sdk.y.a()) {
                    c cVar = c.this;
                    cVar.f18839h.e(cVar.f18838g, "Failed to load resource from '" + str + "'");
                }
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f18848e.a(str2.length());
        }
        return str2;
    }

    public void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.f18848e, appLovinAdBase, this.f);
    }

    private Uri a(String str, String str2) {
        String replace = str2.replace("/", "_");
        String L = this.f18844a.L();
        if (StringUtils.isValidString(L)) {
            replace = com.ironsource.adapters.facebook.a.h(L, replace);
        }
        File a10 = this.f18846c.a(replace, com.applovin.impl.sdk.p.y());
        if (a10 == null) {
            return null;
        }
        if (a10.exists()) {
            this.f18848e.b(a10.length());
            return Uri.parse(Advertisement.FILE_SCHEME + a10.getAbsolutePath());
        }
        if (!this.f18846c.a(a10, com.ironsource.adapters.facebook.a.h(str, str2), Arrays.asList(str), this.f18848e)) {
            return null;
        }
        return Uri.parse(Advertisement.FILE_SCHEME + a10.getAbsolutePath());
    }
}
