package businessLogic;

import models.MediaFolder;
import models.MediaItem;
import models.MediaLogs;

import java.util.List;

public interface JavaAppManager {
    MediaFolder GetMediaFolder(String url);
    List<MediaItem> GetItems(MediaFolder folder);
    List<MediaItem> SearchForItems(String itemName, MediaFolder folder, boolean caseSensitive);

    void AddItemLog(MediaItem item, MediaLogs logs);
}