package com.google.android.exoplayer2.ui;

import android.text.Html;
import com.applovin.exoplayer2.j.l;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f20344a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f20345a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f20346b;

        public a(String str, Map map) {
            this.f20345a = str;
            this.f20346b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final com.applovin.exoplayer2.g.f.e f20347e = new com.applovin.exoplayer2.g.f.e(6);
        public static final l f = new l(5);

        /* renamed from: a, reason: collision with root package name */
        public final int f20348a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20349b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20350c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20351d;

        public b(int i10, int i11, String str, String str2) {
            this.f20348a = i10;
            this.f20349b = i11;
            this.f20350c = str;
            this.f20351d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20352a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f20353b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f20344a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
