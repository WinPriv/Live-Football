package com.huawei.hms.ads;

import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
@AllApi
/* loaded from: classes2.dex */
public class AdvertiserInfo implements Serializable, Comparable {
    private static final long serialVersionUID = -3124209648823884395L;
    private String key;
    private Integer seq;
    private String value;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof AdvertiserInfo) || ((AdvertiserInfo) obj).getSeq().intValue() > getSeq().intValue()) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdvertiserInfo)) {
            return false;
        }
        Integer num = this.seq;
        Integer num2 = ((AdvertiserInfo) obj).seq;
        if (num == null) {
            if (num2 != null) {
                return false;
            }
        } else if (!num.equals(num2)) {
            return false;
        }
        return true;
    }

    @AllApi
    public String getKey() {
        return this.key;
    }

    @AllApi
    public Integer getSeq() {
        return this.seq;
    }

    @AllApi
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10;
        Integer num = this.seq;
        if (num != null) {
            i10 = num.hashCode();
        } else {
            i10 = -1;
        }
        return i10 & super.hashCode();
    }
}
