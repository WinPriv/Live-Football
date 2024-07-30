package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import da.n;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class TextState implements Serializable {
    private static final long serialVersionUID = 30420300;
    private int defaultTextFlag;
    private String language;
    private int showPosition;
    private int state;
    private String text;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21962a;

        static {
            int[] iArr = new int[n.values().length];
            f21962a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21962a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21962a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21962a[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21962a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21962a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final int k() {
        return this.defaultTextFlag;
    }

    public final int p() {
        return this.showPosition;
    }

    public final String q() {
        return this.language;
    }

    public final int r() {
        return this.state;
    }

    public final String u() {
        return this.text;
    }
}
