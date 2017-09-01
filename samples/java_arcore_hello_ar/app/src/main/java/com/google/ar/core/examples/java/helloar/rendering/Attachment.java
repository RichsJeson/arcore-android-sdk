package com.google.ar.core.examples.java.helloar.rendering;

import com.google.ar.core.Anchor;
import com.google.ar.core.Pose;

/**
 * Created by liuzhenhui on 2017/9/1.
 */

public interface Attachment {
    boolean isTracking();

    Pose getPose();

    Anchor getAnchor();
}
