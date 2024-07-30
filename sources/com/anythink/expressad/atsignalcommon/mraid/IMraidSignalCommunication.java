package com.anythink.expressad.atsignalcommon.mraid;

import com.anythink.expressad.foundation.d.c;

/* loaded from: classes.dex */
public interface IMraidSignalCommunication {
    void close();

    void expand(String str, boolean z10);

    c getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z10);
}
