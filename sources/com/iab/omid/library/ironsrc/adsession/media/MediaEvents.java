package com.iab.omid.library.ironsrc.adsession.media;

import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.cp;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f > gl.Code) {
        } else {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f >= gl.Code && f <= 1.0f) {
        } else {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        a aVar = (a) adSession;
        g.a(adSession, "AdSession is null");
        g.f(aVar);
        g.c(aVar);
        g.b(aVar);
        g.h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        g.a(interactionType, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public final void bufferStart() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public final void complete() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    public final void firstQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(cp.V);
    }

    public final void midpoint() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public final void pause() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(com.anythink.expressad.foundation.d.c.f9459cb);
    }

    public final void playerStateChange(PlayerState playerState) {
        g.a(playerState, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public final void resume() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public final void skipped() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public final void start(float f, float f10) {
        confirmValidDuration(f);
        confirmValidVolume(f10);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "duration", Float.valueOf(f));
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject);
    }

    public final void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(cp.Z);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
