package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import gb.p;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class InteractCfg implements Serializable {
    private static final int DEFAULT_TWIST_ACC = 15;
    private static final int MIN_TWIST_ACC = 10;
    private static final long serialVersionUID = 9151867350505964337L;
    private Integer splashAdTagClickableType;
    private Integer splashInteractCfg;
    private String splashRedirectTxt;
    private String swipeClkTxt;
    private Integer swipeDirection;
    private Integer swipeDp;
    private String swipeTxt;
    private Integer twistAcc;
    private String twistClkTxt;
    private Integer twistDegree;
    private String twistTxt;

    public final Integer A() {
        return this.twistDegree;
    }

    public final String D() {
        return p.j(this.swipeClkTxt);
    }

    public final String L() {
        return p.j(this.twistClkTxt);
    }

    public final String a() {
        return p.j(this.splashRedirectTxt);
    }

    public final Integer k() {
        return this.splashAdTagClickableType;
    }

    public final Integer p() {
        Integer num = this.swipeDirection;
        if (num != null && (num.intValue() == 0 || this.swipeDirection.intValue() == 1)) {
            return this.swipeDirection;
        }
        return 0;
    }

    public final Integer q() {
        Integer num = this.splashInteractCfg;
        if (num != null && (num.intValue() < 0 || this.splashInteractCfg.intValue() > 4)) {
            return 0;
        }
        return this.splashInteractCfg;
    }

    public final String r() {
        return p.j(this.twistTxt);
    }

    public final Integer u() {
        Integer num = this.twistAcc;
        if (num == null) {
            return 15;
        }
        if (10 > num.intValue()) {
            return 10;
        }
        return this.twistAcc;
    }

    public final String v() {
        return p.j(this.swipeTxt);
    }

    public final Integer x() {
        return this.swipeDp;
    }
}
