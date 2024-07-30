package com.huawei.openalliance.ad.ppskit.utils;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.huawei.openalliance.ad.constant.bd;
import com.huawei.openalliance.ad.constant.be;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f22846a = Pattern.compile("\\S*[?]\\S*");

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList<String> f22847b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f22848c;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f22847b = arrayList;
        HashMap hashMap = new HashMap();
        f22848c = hashMap;
        arrayList.add("html");
        arrayList.add("js");
        arrayList.add("png");
        arrayList.add("jpg");
        arrayList.add("svg");
        arrayList.add(bd.V);
        arrayList.add("css");
        hashMap.put("html", "text/html");
        hashMap.put("js", "application/x-javascript");
        hashMap.put("png", be.Z);
        hashMap.put("jpg", "application/octet-stream");
        hashMap.put("svg", "image/svg+xml");
        hashMap.put(bd.V, be.B);
        hashMap.put("css", "text/css");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static void a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(false);
        settings.setCacheMode(-1);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
    }

    public static boolean b(String str) {
        return f22847b.contains(c(str).toLowerCase(Locale.ENGLISH));
    }

    public static String c(String str) {
        Matcher matcher = f22846a.matcher(str);
        String[] split = str.split("/");
        String str2 = split[split.length - 1];
        if (matcher.find()) {
            str2 = str2.split("\\?")[0];
        }
        String[] split2 = str2.split("\\.");
        if (split2.length == 1) {
            return "";
        }
        return split2[split2.length - 1];
    }
}
