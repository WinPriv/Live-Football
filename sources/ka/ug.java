package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.vast.ClickThrough;
import com.huawei.openalliance.ad.ppskit.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.ppskit.beans.vast.Tracking;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastMediaFile;
import com.huawei.openalliance.ad.ppskit.beans.vast.VideoClicks;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import ka.eh;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public abstract class ug {

    /* loaded from: classes2.dex */
    public static class a implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final LinearCreative f31967a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31968b;

        public a(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f31967a = linearCreative;
            this.f31968b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            LinearCreative linearCreative = this.f31967a;
            if (linearCreative != null) {
                String a10 = eh.a(this.f31968b);
                String str = null;
                if (a10 == null) {
                    n7.i("ParseUtil", "Parse time failed, source is empty");
                } else {
                    try {
                        try {
                            str = String.valueOf(eh.c(true).parse(a10).getTime());
                        } catch (ParseException unused) {
                            str = String.valueOf(eh.c(false).parse(a10).getTime());
                        }
                    } catch (ParseException e10) {
                        n7.j("ParseUtil", "Parse time failed , time format is invalid", e10);
                    }
                }
                linearCreative.b(com.huawei.openalliance.ad.ppskit.utils.y1.l(0, str));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final List<VastMediaFile> f31969a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31970b;

        public b(ArrayList arrayList, XmlPullParser xmlPullParser) {
            this.f31969a = arrayList;
            this.f31970b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            List<VastMediaFile> list = this.f31969a;
            if (list != null) {
                XmlPullParser xmlPullParser = this.f31970b;
                VastMediaFile vastMediaFile = null;
                if (xmlPullParser != null) {
                    n7.b("BaseLinearParser", "start read media file");
                    xmlPullParser.require(2, null, "MediaFile");
                    VastMediaFile vastMediaFile2 = new VastMediaFile();
                    vastMediaFile2.d(xmlPullParser.getAttributeValue(null, "delivery"));
                    String attributeValue = xmlPullParser.getAttributeValue(null, ContentRecord.HEIGHT);
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, ContentRecord.WIDTH);
                    if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(attributeValue2)) {
                        int l10 = com.huawei.openalliance.ad.ppskit.utils.y1.l(0, attributeValue);
                        int l11 = com.huawei.openalliance.ad.ppskit.utils.y1.l(0, attributeValue2);
                        if (l10 != 0 && l11 != 0) {
                            vastMediaFile2.c(l10);
                            vastMediaFile2.a(l11);
                            vastMediaFile2.b(xmlPullParser.getAttributeValue(null, "id"));
                            vastMediaFile2.f(eh.b(xmlPullParser, "type"));
                            String a10 = eh.a(xmlPullParser);
                            if (!TextUtils.isEmpty(a10) && !a10.trim().isEmpty()) {
                                vastMediaFile2.h(a10);
                                vastMediaFile = vastMediaFile2;
                            } else {
                                n7.i("BaseLinearParser", "media file url not be empty");
                            }
                        } else {
                            n7.b("BaseLinearParser", "media file height or width is invalid.");
                        }
                    } else {
                        n7.e("BaseLinearParser", "media file missing required attribute");
                    }
                }
                list.add(vastMediaFile);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final LinearCreative f31971a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31972b;

        /* loaded from: classes2.dex */
        public static class a implements eh.a {

            /* renamed from: a, reason: collision with root package name */
            public final XmlPullParser f31973a;

            /* renamed from: b, reason: collision with root package name */
            public final Map<String, List<Tracking>> f31974b;

            public a(XmlPullParser xmlPullParser, HashMap hashMap) {
                this.f31973a = xmlPullParser;
                this.f31974b = hashMap;
            }

            @Override // ka.eh.a
            public final void a() {
                Map<String, List<Tracking>> map;
                XmlPullParser xmlPullParser = this.f31973a;
                if (xmlPullParser != null && (map = this.f31974b) != null) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "event");
                    String a10 = eh.a(xmlPullParser);
                    if (((ug) fh.f31193c.get(fh.f31191a)).a().contains(attributeValue)) {
                        if (map.get(attributeValue) == null) {
                            map.put(attributeValue, new ArrayList());
                        }
                        map.get(attributeValue).add(new Tracking(a10, attributeValue));
                    }
                }
            }
        }

        public c(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f31971a = linearCreative;
            this.f31972b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            LinearCreative linearCreative = this.f31971a;
            if (linearCreative != null) {
                XmlPullParser xmlPullParser = this.f31972b;
                HashMap hashMap = null;
                if (xmlPullParser != null) {
                    n7.b("BaseLinearParser", "start read tracking events");
                    xmlPullParser.require(2, null, "TrackingEvents");
                    hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("Tracking", new a(xmlPullParser, hashMap));
                    eh.e(Collections.emptyList(), hashMap2, xmlPullParser);
                    n7.c("BaseLinearParser", "read tracking events finish, tracking events: %s", hashMap);
                }
                linearCreative.e(hashMap);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f31975a;

        /* renamed from: b, reason: collision with root package name */
        public final LinearCreative f31976b;

        public d(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f31975a = xmlPullParser;
            this.f31976b = linearCreative;
        }

        @Override // ka.eh.a
        public final void a() {
            LinearCreative linearCreative;
            XmlPullParser xmlPullParser = this.f31975a;
            if (xmlPullParser != null && (linearCreative = this.f31976b) != null) {
                xmlPullParser.require(2, null, "MediaFiles");
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                hashMap.put("MediaFile", new b(arrayList, xmlPullParser));
                eh.e(Collections.singletonList("MediaFile"), hashMap, xmlPullParser);
                linearCreative.d(arrayList);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final VideoClicks f31977a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31978b;

        public e(VideoClicks videoClicks, XmlPullParser xmlPullParser) {
            this.f31977a = videoClicks;
            this.f31978b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            VideoClicks videoClicks = this.f31977a;
            if (videoClicks != null) {
                XmlPullParser xmlPullParser = this.f31978b;
                ClickThrough clickThrough = null;
                if (xmlPullParser != null) {
                    n7.b("BaseLinearParser", "start read click through");
                    xmlPullParser.require(2, null, "ClickThrough");
                    ClickThrough clickThrough2 = new ClickThrough();
                    clickThrough2.a(xmlPullParser.getAttributeValue(null, "id"));
                    clickThrough2.c(eh.a(xmlPullParser));
                    n7.c("BaseLinearParser", "finish read click trough: %s", clickThrough2);
                    clickThrough = clickThrough2;
                }
                videoClicks.b(clickThrough);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements eh.a {

        /* renamed from: a, reason: collision with root package name */
        public final LinearCreative f31979a;

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f31980b;

        /* loaded from: classes2.dex */
        public static class a implements eh.a {

            /* renamed from: a, reason: collision with root package name */
            public final XmlPullParser f31981a;

            /* renamed from: b, reason: collision with root package name */
            public final List<Tracking> f31982b;

            public a(ArrayList arrayList, XmlPullParser xmlPullParser) {
                this.f31981a = xmlPullParser;
                this.f31982b = arrayList;
            }

            @Override // ka.eh.a
            public final void a() {
                List<Tracking> list;
                XmlPullParser xmlPullParser = this.f31981a;
                if (xmlPullParser != null && (list = this.f31982b) != null) {
                    list.add(new Tracking(eh.a(xmlPullParser), xmlPullParser.getAttributeValue(null, "id")));
                }
            }
        }

        public f(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f31979a = linearCreative;
            this.f31980b = xmlPullParser;
        }

        @Override // ka.eh.a
        public final void a() {
            LinearCreative linearCreative = this.f31979a;
            if (linearCreative != null) {
                XmlPullParser xmlPullParser = this.f31980b;
                VideoClicks videoClicks = null;
                if (xmlPullParser != null) {
                    n7.b("BaseLinearParser", "start read video clicks");
                    xmlPullParser.require(2, null, "VideoClicks");
                    videoClicks = new VideoClicks();
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("ClickThrough", new e(videoClicks, xmlPullParser));
                    hashMap.put("ClickTracking", new a(arrayList, xmlPullParser));
                    eh.e(Collections.emptyList(), hashMap, xmlPullParser);
                    videoClicks.d(arrayList);
                    n7.c("BaseLinearParser", "finish read video clicks, video clicks: %s", videoClicks);
                }
                linearCreative.c(videoClicks);
            }
        }
    }

    public abstract HashSet a();

    public abstract void b(LinearCreative linearCreative, XmlPullParser xmlPullParser, HashMap hashMap);
}
