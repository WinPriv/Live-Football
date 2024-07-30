package com.vungle.warren.model.admarkup;

import com.vungle.warren.model.JsonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m8.j;
import m8.l;
import m8.n;
import m8.q;
import m8.u;

/* loaded from: classes2.dex */
public final class AdMarkupV1 extends AdMarkup {
    private final String eventId;

    private AdMarkupV1(String str, String[] strArr) {
        this.eventId = str;
        this.impressions = strArr;
    }

    public static AdMarkupV1 fromString(String str) {
        ArrayList arrayList;
        String[] strArr = null;
        if (str == null) {
            return null;
        }
        try {
            q qVar = (q) new j().a().b(q.class, str);
            if (qVar == null) {
                return null;
            }
            if (JsonUtil.hasNonNull(qVar, "impression")) {
                l t10 = qVar.t("impression");
                t10.getClass();
                arrayList = new ArrayList();
                Iterator<n> it = t10.i().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m());
                }
            } else {
                arrayList = null;
            }
            String asString = JsonUtil.getAsString(qVar, "event_id", null);
            if (arrayList != null) {
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            return new AdMarkupV1(asString, strArr);
        } catch (u unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdMarkupV1.class != obj.getClass()) {
            return false;
        }
        String str = this.eventId;
        String str2 = ((AdMarkupV1) obj).eventId;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public String getEventId() {
        return this.eventId;
    }

    @Override // com.vungle.warren.model.admarkup.AdMarkup
    public int getVersion() {
        return 1;
    }

    public int hashCode() {
        String str = this.eventId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "    AdMarkup {eventId='" + this.eventId + "', impression=" + Arrays.toString(this.impressions) + '}';
    }
}
