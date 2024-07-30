package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import java.io.Serializable;

@OuterVisible
@DataKeep
/* loaded from: classes2.dex */
public class AdvertiserInfo implements Serializable, Comparable {
    private static final long serialVersionUID = 30460300;
    private String key;
    private Integer seq;
    private String value;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (!(obj instanceof AdvertiserInfo) || ((AdvertiserInfo) obj).getSeq().intValue() > getSeq().intValue()) {
            return -1;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
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

    @OuterVisible
    public String getKey() {
        return this.key;
    }

    @OuterVisible
    public Integer getSeq() {
        return this.seq;
    }

    @OuterVisible
    public String getValue() {
        return this.value;
    }

    public final int hashCode() {
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
