package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f19397a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19398b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f19399c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19400d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19401e;

    private e(Context context) {
        boolean z10;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                y.c("AndroidManifest", "Failed to get meta data.", e10);
            }
            int i10 = 0;
            try {
                XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = openXmlResourceParser.getEventType();
                int i11 = 0;
                z10 = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (openXmlResourceParser.getName().equals(com.anythink.expressad.exoplayer.k.o.f9071d)) {
                                for (int i12 = 0; i12 < openXmlResourceParser.getAttributeCount(); i12++) {
                                    String attributeName = openXmlResourceParser.getAttributeName(i12);
                                    String attributeValue = openXmlResourceParser.getAttributeValue(i12);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        i11 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        z10 = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i10 = i11;
                            try {
                                y.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                this.f19400d = i10;
                                this.f19401e = z10;
                            } catch (Throwable th2) {
                                this.f19400d = i10;
                                this.f19401e = z10;
                                throw th2;
                            }
                        }
                    }
                    eventType = openXmlResourceParser.next();
                } while (eventType != 1);
                this.f19400d = i11;
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            this.f19401e = z10;
        } finally {
            this.f19399c = bundle;
        }
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f19398b) {
            if (f19397a == null) {
                f19397a = new e(context);
            }
            eVar = f19397a;
        }
        return eVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f19399c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f19399c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f19399c;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public boolean a() {
        return this.f19400d != 0;
    }
}
