package com.huawei.openalliance.ad.ppskit.net.http;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f22768a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22770c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22771d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22772e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22773g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22774h;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f22775a;

        /* renamed from: b, reason: collision with root package name */
        public String f22776b;

        /* renamed from: c, reason: collision with root package name */
        public int f22777c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f22778d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f22779e;
        public String f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f22780g;

        /* renamed from: h, reason: collision with root package name */
        public String f22781h;

        public a() {
            this.f22778d = new ArrayList();
            this.f22779e = new ArrayList();
            this.f22780g = false;
        }

        public final void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f22781h = str;
            Uri parse = Uri.parse(str);
            this.f22775a = parse.getScheme();
            this.f22776b = parse.getHost();
            this.f22777c = parse.getPort();
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments != null) {
                this.f22778d.addAll(pathSegments);
            }
            String encodedQuery = parse.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                for (String str2 : encodedQuery.split(ContainerUtils.FIELD_DELIMITER)) {
                    this.f22779e.add(str2);
                }
            }
            this.f = parse.getEncodedFragment();
        }

        public a(boolean z10) {
            this.f22778d = new ArrayList();
            this.f22779e = new ArrayList();
            this.f22780g = z10;
        }
    }

    public e(a aVar) {
        this.f22768a = aVar.f22775a;
        this.f22769b = aVar.f22776b;
        this.f22770c = aVar.f22777c;
        this.f22771d = aVar.f22778d;
        this.f22772e = aVar.f22779e;
        this.f = aVar.f;
        this.f22773g = aVar.f22780g;
        this.f22774h = aVar.f22781h;
    }

    public final String a() {
        int size;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22768a);
        sb2.append("://");
        sb2.append(this.f22769b);
        int i10 = this.f22770c;
        if (i10 > 0) {
            sb2.append(':');
            sb2.append(i10);
        }
        sb2.append('/');
        ArrayList arrayList = this.f22771d;
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                sb2.append((String) arrayList.get(i11));
                sb2.append('/');
            }
        }
        y1.g(sb2, '/');
        ArrayList arrayList2 = this.f22772e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            sb2.append('?');
            for (int i12 = 0; i12 < size; i12++) {
                sb2.append((String) arrayList2.get(i12));
                sb2.append('&');
            }
            y1.g(sb2, '&');
        }
        String str = this.f;
        if (!TextUtils.isEmpty(str)) {
            sb2.append('#');
            sb2.append(str);
        }
        return sb2.toString();
    }
}
