package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
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

    /* renamed from: com.huawei.openalliance.ad.ppskit.beans.metadata.TextState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus;

        static {
            int[] iArr = new int[AppStatus.values().length];
            $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus = iArr;
            try {
                iArr[AppStatus.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[AppStatus.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[AppStatus.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[AppStatus.INSTALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[AppStatus.INSTALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[AppStatus.INSTALLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int l(AppStatus appStatus) {
        switch (AnonymousClass1.$SwitchMap$com$huawei$openalliance$ad$ppskit$download$app$AppStatus[appStatus.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 6;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return -1;
        }
    }

    public final int b() {
        return this.state;
    }

    public final String c() {
        return this.language;
    }

    public final String d() {
        return this.text;
    }

    public final int k() {
        return this.showPosition;
    }

    public final int p() {
        return this.defaultTextFlag;
    }
}
