package com.google.ar.core.examples.java.helloar.rendering;

import com.google.ar.core.Anchor;
import com.google.ar.core.Pose;

/**
 * Created by liuzhenhui on 2017/9/1.
 */

public class FrameAttachment implements Attachment {
    private final Anchor mAnchor;

    // Allocate temporary storage to avoid multiple allocations per frame.
    private final float[] mPoseTranslation = new float[3];
    private final float[] mPoseRotation = new float[4];

    public FrameAttachment(Anchor anchor) {
        mAnchor = anchor;
    }

    public boolean isTracking() {
        return /*true if*/
                mAnchor.getTrackingState() == Anchor.TrackingState.TRACKING;
    }

    public Pose getPose() {
        Pose pose = mAnchor.getPose();
        pose.getTranslation(mPoseTranslation, 0);
        pose.getRotationQuaternion(mPoseRotation, 0);
        mPoseTranslation[1] = mAnchor.getPose().ty();
        return new Pose(mPoseTranslation, mPoseRotation);
    }

    public Anchor getAnchor() {
        return mAnchor;
    }
}

