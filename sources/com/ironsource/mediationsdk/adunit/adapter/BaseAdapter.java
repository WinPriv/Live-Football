package com.ironsource.mediationsdk.adunit.adapter;

import android.content.Context;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseAdapter implements AdapterDebugInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public abstract /* synthetic */ String getAdapterVersion();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return LoadWhileShowSupportState.NONE;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public abstract /* synthetic */ String getNetworkSDKVersion();

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public abstract /* synthetic */ void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener);

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
    }
}
