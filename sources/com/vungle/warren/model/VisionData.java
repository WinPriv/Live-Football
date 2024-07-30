package com.vungle.warren.model;

/* loaded from: classes2.dex */
public class VisionData {
    public String advertiser;
    public String campaign;
    public String creative;
    public long timestamp;

    public VisionData(long j10, String str, String str2, String str3) {
        this.timestamp = j10;
        this.creative = str;
        this.campaign = str2;
        this.advertiser = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisionData visionData = (VisionData) obj;
        if (this.timestamp != visionData.timestamp) {
            return false;
        }
        String str = this.creative;
        if (str == null ? visionData.creative != null : !str.equals(visionData.creative)) {
            return false;
        }
        String str2 = this.campaign;
        if (str2 == null ? visionData.campaign != null : !str2.equals(visionData.campaign)) {
            return false;
        }
        String str3 = this.advertiser;
        String str4 = visionData.advertiser;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        long j10 = this.timestamp;
        int i12 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.creative;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.campaign;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.advertiser;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return i15 + i13;
    }
}
