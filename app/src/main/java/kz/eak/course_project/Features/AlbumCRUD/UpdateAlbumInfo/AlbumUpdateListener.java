package kz.eak.course_project.Features.AlbumCRUD.UpdateAlbumInfo;

import kz.eak.course_project.Features.AlbumCRUD.CreateAlbum.Album;

public interface AlbumUpdateListener {
    void onAlbumInfoUpdate(Album album, int position);
}
