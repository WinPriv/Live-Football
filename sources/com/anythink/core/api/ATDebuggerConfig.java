package com.anythink.core.api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATDebuggerConfig {
    private int mBannerType;
    private int mInterstitialType;
    private int mNativeType;
    private int mNetworkFirmId;
    private int mRewarderVideoType;
    private int mSplashType;

    /* loaded from: classes.dex */
    public static class Builder {
        private int mBannerType;
        private int mInterstitialType;
        private int mNativeType;
        private int mNetworkFirmId;
        private int mRewarderVideoType;
        private int mSplashType;

        public Builder(int i10) {
            this.mNetworkFirmId = i10;
            fillDefaultType(i10);
        }

        private void fillDefaultType(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 6) {
                        if (i10 != 8) {
                            if (i10 != 15) {
                                if (i10 != 28) {
                                    if (i10 != 39) {
                                        if (i10 != 59) {
                                            if (i10 != 66) {
                                                if (i10 != 22) {
                                                    if (i10 == 23) {
                                                        this.mInterstitialType = 1;
                                                        return;
                                                    }
                                                    return;
                                                } else {
                                                    this.mNativeType = 1;
                                                    this.mInterstitialType = 2;
                                                    return;
                                                }
                                            }
                                        } else {
                                            this.mBannerType = 1;
                                            return;
                                        }
                                    } else {
                                        this.mNativeType = 1;
                                    }
                                } else {
                                    this.mNativeType = 101;
                                    return;
                                }
                            } else {
                                this.mNativeType = 101;
                                this.mInterstitialType = 3;
                                return;
                            }
                        } else {
                            this.mNativeType = 1;
                        }
                    } else {
                        this.mNativeType = 1;
                    }
                } else {
                    this.mNativeType = 1;
                }
                this.mInterstitialType = 1;
                return;
            }
            this.mNativeType = 1;
        }

        public ATDebuggerConfig build() {
            ATDebuggerConfig aTDebuggerConfig = new ATDebuggerConfig();
            aTDebuggerConfig.mNetworkFirmId = this.mNetworkFirmId;
            aTDebuggerConfig.mNativeType = this.mNativeType;
            aTDebuggerConfig.mBannerType = this.mBannerType;
            aTDebuggerConfig.mSplashType = this.mSplashType;
            aTDebuggerConfig.mInterstitialType = this.mInterstitialType;
            aTDebuggerConfig.mRewarderVideoType = this.mRewarderVideoType;
            return aTDebuggerConfig;
        }

        public Builder setBannerType(int i10) {
            this.mBannerType = i10;
            return this;
        }

        public Builder setInterstitial(int i10) {
            this.mInterstitialType = i10;
            return this;
        }

        public Builder setNativeType(int i10) {
            this.mNativeType = i10;
            return this;
        }

        public Builder setRewardedVideoType(int i10) {
            this.mRewarderVideoType = i10;
            return this;
        }

        public Builder setSplashType(int i10) {
            this.mSplashType = i10;
            return this;
        }
    }

    public void fillRequestParam(JSONObject jSONObject) {
        try {
            jSONObject.put("is_test", 1);
            jSONObject.put("test_nw_firm", this.mNetworkFirmId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", this.mNativeType);
            jSONObject2.put("2", this.mBannerType);
            jSONObject2.put("1", this.mRewarderVideoType);
            jSONObject2.put("3", this.mInterstitialType);
            jSONObject2.put("4", this.mSplashType);
            if (jSONObject2.length() > 0) {
                jSONObject.put("test_format_sub", jSONObject2);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public int getBannerType() {
        return this.mBannerType;
    }

    public int getInterstitialType() {
        return this.mInterstitialType;
    }

    public int getNativeType() {
        return this.mNativeType;
    }

    public int getNetworkFirmId() {
        return this.mNetworkFirmId;
    }

    public int getRewarderVideoType() {
        return this.mRewarderVideoType;
    }

    public int getSplashType() {
        return this.mSplashType;
    }
}
