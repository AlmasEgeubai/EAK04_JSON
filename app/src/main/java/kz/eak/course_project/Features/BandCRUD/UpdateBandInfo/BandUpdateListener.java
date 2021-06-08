package kz.eak.course_project.Features.BandCRUD.UpdateBandInfo;

import kz.eak.course_project.Features.BandCRUD.CreateBand.Band;

public interface BandUpdateListener {
    void onBandInfoUpdated(Band band, int position);
}
