package com.vungle.warren.model;

import com.huawei.openalliance.ad.constant.w;
import com.vungle.warren.model.CacheBustDBAdapter;
import java.util.Arrays;
import java.util.Objects;
import m8.j;
import m8.q;
import n8.b;

/* loaded from: classes2.dex */
public class CacheBust {
    public static final int EVENT_TYPE_CAMPAIGN = 1;
    public static final int EVENT_TYPE_CREATIVE = 2;
    private static final String TAG = "CacheBust";
    String[] eventIds;

    /* renamed from: id, reason: collision with root package name */
    @b("id")
    String f27243id;

    @EventType
    int idType;

    @b("timestamp_bust_end")
    long timeWindowEnd;

    @b(CacheBustDBAdapter.CacheBustColumns.COLUMN_TIMESTAMP_PROCESSED)
    long timestampProcessed;

    /* loaded from: classes2.dex */
    public @interface EventType {
    }

    public static CacheBust fromJson(q qVar) {
        return (CacheBust) new j().a().e(qVar, CacheBust.class);
    }

    public String calculateId() {
        return this.f27243id + w.bE + this.timeWindowEnd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheBust cacheBust = (CacheBust) obj;
        if (this.idType == cacheBust.idType && this.timestampProcessed == cacheBust.timestampProcessed && this.f27243id.equals(cacheBust.f27243id) && this.timeWindowEnd == cacheBust.timeWindowEnd && Arrays.equals(this.eventIds, cacheBust.eventIds)) {
            return true;
        }
        return false;
    }

    public String[] getEventIds() {
        return this.eventIds;
    }

    public String getId() {
        return this.f27243id;
    }

    public int getIdType() {
        return this.idType;
    }

    public long getTimeWindowEnd() {
        return this.timeWindowEnd;
    }

    public long getTimestampProcessed() {
        return this.timestampProcessed;
    }

    public int hashCode() {
        return (Objects.hash(this.f27243id, Long.valueOf(this.timeWindowEnd), Integer.valueOf(this.idType), Long.valueOf(this.timestampProcessed)) * 31) + Arrays.hashCode(this.eventIds);
    }

    public void setEventIds(String[] strArr) {
        this.eventIds = strArr;
    }

    public void setId(String str) {
        this.f27243id = str;
    }

    public void setIdType(int i10) {
        this.idType = i10;
    }

    public void setTimeWindowEnd(long j10) {
        this.timeWindowEnd = j10;
    }

    public void setTimestampProcessed(long j10) {
        this.timestampProcessed = j10;
    }

    public String toString() {
        return "CacheBust{id='" + this.f27243id + "', timeWindowEnd=" + this.timeWindowEnd + ", idType=" + this.idType + ", eventIds=" + Arrays.toString(this.eventIds) + ", timestampProcessed=" + this.timestampProcessed + '}';
    }
}
